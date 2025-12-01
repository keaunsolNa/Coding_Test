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

        int q = Integer.parseInt(br.readLine());
        while (q --> 0)
        {
            st = new StringTokenizer(br.readLine());
            int grade = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (grade >= 3) {
                bw.write("NO\n");
                continue;
            }

            if (c < 50) {
                bw.write("NO\n");
                continue;
            }

            int pointA = a * 3 < (grade == 1 ? 100 : 90) ? 1 : 0;
            int pointB = b * 3 < (grade == 1 ? 100 : 90) ? 1 : 0;
            int pointC = c * 3 < (grade == 1 ? 100 : 90) ? 1 : 0;
            int pointABC = pointA + pointB + pointC;

            int pointD = Math.min(Math.min(a, b), c) <= 21 ? 1 : 0;

            if (pointABC >= 2 || pointD == 1) bw.write("YES");
            else bw.write("NO");

            bw.write("\n");
        }

    }

}