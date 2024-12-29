import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private static int[] ans;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum1 = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

        int ans = 0;
        for (int i = 0; i < sum1; i++)
        {
            ans++;
            ans = ans % 5 == 0 ? 1 : ans % 5;
        }

        st = new StringTokenizer(br.readLine());
        int sum2 = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

        for (int i = 0; i < sum2 - 1; i++)
        {
            ans++;
            ans = ans % 5 == 0 ? 1 : ans % 5;
        }
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();

    }
}
