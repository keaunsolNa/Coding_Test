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
        int w =  Integer.parseInt(br.readLine());
        int point = (n * 10) + (n >= 3 ? 20 : 0) + (n == 5 ? 50 : 0);
        point = Math.max(0, point - (w > 1000 ? 15 : 0));

        bw.write(String.valueOf(point));

    }


}