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
        int y = 0;
        int k = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (str.equals("yonsei")) y = i;
            else if (str.equals("korea")) k = i;
        }

        if (y < k) bw.write("Yonsei Won!");
        else bw.write("Yonsei Lost...");

    }



}