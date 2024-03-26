import java.util.*;
import java.io.*;
import java.util.stream.Stream;

public class Main {

    private static class Payment implements Comparable<Payment> {

        private int employee;
        private int high;

        public Payment(int employee, int high) {
            this.employee = employee;
            this.high = high;
        }

        @Override
        public int compareTo(Payment o) {
            return o.high - this.high;
        }
    }
    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;

       int n = Integer.parseInt(br.readLine());
       PriorityQueue<Payment> pq = new PriorityQueue<>();

       for (int i = 0; i < n; i++) {

           st = new StringTokenizer(br.readLine());
           int employee = Integer.parseInt(st.nextToken());
           Integer[] pay = new Integer[employee];

           for (int j = 0; j < employee; j++) pay[j] = Integer.parseInt(st.nextToken());

           Arrays.sort(pay, Collections.reverseOrder());

           pq.add(new Payment(employee, pay[0]));

       }

       int prevHigh = pq.peek().high;

       long total = 0;
       while (!pq.isEmpty()) {

           Payment payment = pq.poll();
           int term = prevHigh - payment.high;
           total += ((long) term * payment.employee);
       }

        System.out.println(total);
    }
}