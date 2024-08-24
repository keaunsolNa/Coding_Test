import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        long min = Long.MAX_VALUE;
        int ans = 0;

        for (int i = 1; i <= n; i++)
        {

            st = new StringTokenizer(br.readLine());
            long p = Integer.parseInt(st.nextToken());
            long k = Integer.parseInt(st.nextToken());
            long c = Integer.parseInt(st.nextToken());
            long cnt = (q - 1) / k;
            long price = p + cnt * (cnt + 1) / 2 * c;

            if (min > price)
            {
                ans = i;
                min = price;
            }

        }

        bw.write(ans + " " + min);
        bw.flush();
        bw.close();
    }
}