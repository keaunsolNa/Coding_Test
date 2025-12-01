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

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++)
        {
            int cnt = 0;
            int t = Integer.parseInt(br.readLine());
            while (t != 1)
            {
                if (t % 2 == 1)
                {
                    cnt++;
                    t /= 2;
                    t++;
                }
                else t /= 2;
            }
            bw.write(cnt + "\n");
        }
    }

}