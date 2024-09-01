import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
        {
            int temp = Integer.parseInt(st.nextToken());
            dp[temp] = dp[temp - 1] + 1;
        }

        Arrays.sort(dp);

        bw.write(String.valueOf(n - dp[n]));
        bw.flush();
        bw.close();
        br.close();
    }
}
