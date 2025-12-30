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
        int a = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int p = 10 + 2 * (25 - a + t);
        bw.write(String.valueOf(Math.max(0, p)));

    }


}