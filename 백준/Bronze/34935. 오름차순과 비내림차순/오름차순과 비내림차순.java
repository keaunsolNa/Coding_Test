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
        long[] arr = new long[n];

        st = new StringTokenizer(br.readLine());
        for (int i =0; i < n; i++) arr[i] = Long.parseLong(st.nextToken());

        boolean flag = false;
        long prev = arr[0];

        for (int i = 1; i < n; i++) {

            if (prev >= arr[i])
            {
                flag = true;
                break;
            }

            prev = arr[i];
        }

        bw.write(flag ? "0" : "1");


    }


}