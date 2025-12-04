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

        st = new StringTokenizer(br.readLine(), ":");
        int start = (Integer.parseInt(st.nextToken()) * 3600) + (Integer.parseInt(st.nextToken()) * 60) + Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), ":");
        int end = (Integer.parseInt(st.nextToken()) * 3600) + (Integer.parseInt(st.nextToken()) * 60) + Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        if (start > end)
        {
            bw.write("0");
            return;
        }
        int t = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int time = t * (100 - k) / 100;
        bw.write(end - start >= time ? "1" : "0");
    }


}