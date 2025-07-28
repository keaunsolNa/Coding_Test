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
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        sb.append(st.nextToken()).append("DORO");
        while (st.hasMoreTokens()) {

            String token = st.nextToken();
            sb.append(" ").append(token).append("DORO");
        }

        bw.write(sb.toString());
    }



}