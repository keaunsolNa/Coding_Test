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
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k =  Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[m];
        int[] wait = new int[n];
        for (int i = 0; i < n; i++) {
            wait[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                int tempMin = Integer.MAX_VALUE;
                for (int t : arr) tempMin = Math.min(tempMin, t);

                if (tempMin >= arr[j])
                {
                    arr[j] = wait[i] + arr[j];
                    break;
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for (int a : arr) min =  Math.min(a, min);

        if (min > k) bw.write("GO");
        else bw.write("WAIT");

    }


}