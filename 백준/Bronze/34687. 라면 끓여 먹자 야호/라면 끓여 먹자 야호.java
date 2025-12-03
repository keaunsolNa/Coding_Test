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

        st =  new StringTokenizer(br.readLine());
        double n = Integer.parseInt(st.nextToken()) ;
        double m = Integer.parseInt(st.nextToken()) * 100;

        double p81 = n * 81;

        bw.write(p81 <= m ? "yaho" : "no");

    }


}