import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int prev = Integer.parseInt(st.nextToken());
        int genesis = Integer.parseInt(st.nextToken());
        long money = Integer.parseInt(st.nextToken());

        if (money < 0)
        {
            System.out.println("NO MONEY");
            return;
        }
        if (genesis != 0)
        {
            System.out.println("INVALID");
            return;
        }
        n--;

        while (n --> 0)
        {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int parent = Integer.parseInt(st.nextToken());
            int out = Integer.parseInt(st.nextToken());

            if (parent != prev)
            {
                System.out.println("INVALID");
                return;
            }

            money += out;
            if (money < 0)
            {
                System.out.println("NO_MONEY");
                return;
            }

            prev = num;
        }

        bw.write(String.valueOf(money));
        bw.flush();
        bw.close();
        br.close();

    }

}
