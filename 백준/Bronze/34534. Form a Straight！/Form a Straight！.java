import java.io.*;
import java.util.StringTokenizer;

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

        st =  new StringTokenizer(br.readLine());
        boolean[] arr = new boolean[9];
        while (st.hasMoreTokens()) {
            arr[Integer.parseInt(st.nextToken()) - 1] = true;
        }

        int minMiss = 9;

        for (int i = 0; i <= 4; i++)
        {
            int miss = 0;

            for (int j = i; j <= i + 4; j++)
            {
                if (!arr[j]) miss++;
            }

            minMiss = Math.min(minMiss, miss);
        }

        bw.write(String.valueOf(minMiss));

    }


}