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
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long total = 0;
        for (int i = 0; i < n; i++) {
            total += Long.parseLong(st.nextToken());
        }
        long evr = total / n;
        int cnt = 0;
        while (evr < x)
        {
            n++;
            cnt++;
            total += 100;
            evr = total / n;
        }

        bw.write(cnt + "\n");
    }

}