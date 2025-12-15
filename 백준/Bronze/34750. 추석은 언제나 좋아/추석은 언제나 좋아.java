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
        if (n >= 1000000) bw.write((int)(n * 0.2) + " " + (int)(n - (n * 0.2)));
        else if (n >= 500000) bw.write((int)(n * 0.15) + " " + (int)(n - (n * 0.15)));
        else if (n >= 100000) bw.write((int)(n * 0.10) + " " + (int)(n - (n * 0.10)));
        else bw.write((int)(n * 0.05) + " " + (int)(n - (n * 0.05)));


    }


}