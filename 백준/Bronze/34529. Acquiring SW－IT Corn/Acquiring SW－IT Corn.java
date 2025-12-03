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
        long x = Integer.parseInt(st.nextToken());
        long y = Integer.parseInt(st.nextToken());
        long z = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long u = Integer.parseInt(st.nextToken()) / 100;
        long v = Integer.parseInt(st.nextToken()) / 50;
        long w = Integer.parseInt(st.nextToken()) / 20;

        long answer = (x * u) + (y * v) + (z * w);
        bw.write(String.valueOf(answer));
    }

}