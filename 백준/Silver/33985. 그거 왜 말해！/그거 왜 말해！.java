import java.io.*;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        bw.write(solve());
        bw.flush();
        bw.close();
        br.close();

    }

    private static String solve() throws IOException {

        int n = Integer.parseInt(br.readLine());
        char[] s = br.readLine().toCharArray();

        if (s[0] == 'A' && s[n - 1] == 'B') return "Yes";
        else return "No";

    }

}