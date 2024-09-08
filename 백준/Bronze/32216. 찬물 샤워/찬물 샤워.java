import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int t0 = Integer.parseInt(st.nextToken());

        int now = t0;
        long total = 0;


        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
        {
            int ti = Integer.parseInt(st.nextToken());
            if (now < k)
            {
                now = now + ti + Math.abs(t0 - k);
                total += Math.abs(now - k);
            }
            else
            {
                now  = now + ti - Math.abs(now - k);
                total += Math.abs(now - k);
            }
        }

        System.out.println(total);

        String input = "";



        bw.flush();
        bw.close();
        br.close();
    }

}
