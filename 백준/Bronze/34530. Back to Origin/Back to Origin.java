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

        int d = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(360 / gcd(360, d)));
    }

    private static int gcd(int a, int b) {
        if(b == 0) return a;

        return gcd(b, a % b);
    }

}