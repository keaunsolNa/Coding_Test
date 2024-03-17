import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n + 1];
        int[] dp = new int[1101];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = Integer.MAX_VALUE;
        }

        dp[1] = 0;

        for (int i = 1; i <= n; i++) {

            if (dp[i] >= Integer.MAX_VALUE) continue;

            for (int j = 1; j <= arr[i]; j++) dp[i + j] = Math.min(dp[i + j], dp[i] + 1);
        }

        if (dp[n] >= Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(dp[n]);

    }
}
