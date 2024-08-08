import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        bw.write(solve(x1, x2, n) ? "YES" : "NO");
        bw.flush();
        bw.close();

    }

    private static boolean solve(int x1, int x2, int n)
    {
        x1 -= x2;
        if (x1 < 0) return false;
        if (x1 == 0) return n == 0;
        if (x1 / 2 < n) return false;
        if (x1 % 2 != 0) return false;
        return n > 0;
    }

}
