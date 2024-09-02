import java.io.*;
import java.util.*;

public class Main {

    private static int n;
    private static int m;
    private static PriorityQueue<Customer> customers;
    private static PriorityQueue<Integer> susis;
    private static int[] answer;

    public static class Customer implements Comparable<Customer> {
        int susi;
        int number;

        Customer(int susi, int number) {
            this.susi = susi;
            this.number = number;
        }

        public int compareTo(Customer customer) {
            if (this.susi == customer.susi) {
                return this.number - customer.number;
            }
            return this.susi - customer.susi;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        customers = new PriorityQueue<>();

        for (int i = 0; i < n; i++)
        {
            st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());

            while(number --> 0)
            {
                int susi = Integer.parseInt(st.nextToken());
                customers.add(new Customer(susi, i));
            }

        }

        answer = new int[n];

        st = new StringTokenizer(br.readLine());
        susis = new PriorityQueue<>();
        while (m --> 0)
        {
            susis.add(Integer.parseInt(st.nextToken()));
        }

        while (!susis.isEmpty())
        {

            int susi = susis.poll();
            while (!customers.isEmpty() && customers.peek().susi < susi)
            {
                customers.poll();
            }

            if (!customers.isEmpty() && customers.peek().susi == susi)
            {
                Customer c = customers.poll();
                answer[c.number] += 1;
            }
        }

        for (int i = 0; i < n; i++)
        {
            bw.write(answer[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
