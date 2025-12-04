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

        char[] arr = br.readLine().toCharArray();
        int prev = arr[0] - 'a';
        int point = 1;
        int plus = 1;
        for (int i = 1; i < arr.length; i++) {

            int now = arr[i] - 'a';
            if (now > prev)
            {
                plus++;
                point += plus;
            }
            else
            {
                plus = 1;
                point += plus;
            }

            prev = now;

        }

        bw.write(String.valueOf(point));

    }


}