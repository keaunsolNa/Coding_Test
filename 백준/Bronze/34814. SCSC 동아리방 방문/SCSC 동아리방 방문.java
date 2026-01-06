import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        solve();
        bw.flush();
        bw.close();
        br.close();

    }

    private static void solve() throws IOException {

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] drink = new int[n];
        int most = 0;
        for (int i = 0; i < n; i++) {
            drink[i] = Integer.parseInt(st.nextToken());
            most = Math.max(most, drink[i]);
        }

        for (int i =0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int best = Integer.parseInt(st.nextToken()) - 1;
            int worst = Integer.parseInt(st.nextToken()) - 1;

            if (drink[worst] == most) continue;
            else drink[best]--;

            most = 0;
            for (int j = 0; j < n; j++)
            {
                most = Math.max(most, drink[j]);
            }
        }

        for (int i = 0; i < n; i++)
        {
            bw.write(drink[i] + " ");
        }
    }


}