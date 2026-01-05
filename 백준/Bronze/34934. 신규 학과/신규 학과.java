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

        int n = Integer.parseInt(br.readLine());
        int max = 0;
        String ans = "";

        while (n --> 0)
        {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int year = Integer.parseInt(st.nextToken());

            if (max < year)
            {
                max = year;
                ans = name;
            }
        }

        bw.write(ans);
    }


}