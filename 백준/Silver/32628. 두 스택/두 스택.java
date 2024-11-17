import java.io.*;
        import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Stack<Integer> back1 = new Stack<>();
        Stack<Integer> back2 = new Stack<>();

        st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        long total1 = 0, total2 = 0;

        for (int i = 0; i < n; i++)
        {
            int temp1 = Integer.parseInt(st.nextToken());
            int temp2 = Integer.parseInt(st2.nextToken());

            back1.add(temp1);
            back2.add(temp2);
            total1 += temp1;
            total2 += temp2;
        }

        while (k --> 0)
        {

            if (total1 > total2)
            {
                int temp = back1.pop();
                total1 -= temp;
            }
            else
            {
                int temp = back2.pop();
                total2 -= temp;
            }
        }

        if (total1 > total2)
        {
            bw.write(String.valueOf(total1));
        }
        else
        {
            bw.write(String.valueOf(total2));
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
