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
        int[] gradeMon = new int[11];
        for (int i = 0; i < 11; i++)
        {
            gradeMon[i] = Integer.parseInt(st.nextToken());
        }

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            double l =  Double.parseDouble(st.nextToken());
            int s =  Integer.parseInt(st.nextToken());

            if (s >= 17 && l >= 2.0)
            {
               sum += gradeMon[b];
            }
        }

        bw.write(String.valueOf(sum));
    }


}