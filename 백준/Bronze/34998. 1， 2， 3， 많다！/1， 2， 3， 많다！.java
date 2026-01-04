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
        while (n --> 0)
        {

            int x = Integer.parseInt(br.readLine()) + 1;
            String input = br.readLine().replaceAll("\\+ ", "");

            st = new StringTokenizer(input);
            int hab = 0;
            boolean over = false;
            while(x --> 0)
            {
                String t = st.nextToken();

                if (t.equals("!"))
                {
                    bw.write("!\n");
                    over = true;
                    break;
                }
                hab += Integer.parseInt(t);

                if (hab > 9) {
                    bw.write("!\n");
                    over = true;
                    break;
                }
            }

            if (!over) bw.write(hab + "\n");
        }

    }


}