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

        st = new StringTokenizer(br.readLine());
        int P = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE;
        int now;
        for (int p = 1; p <= P; p++)
        {
            for (int m = 1; m <= M; m++)
            {
                for (int c = 1; c <= C; c++)
                {
                    now = Math.abs((p + m) * (m + c) - X);
                    min = Math.min(min, now);
                }
            }
        }

        bw.write(String.valueOf(min));


    }



}