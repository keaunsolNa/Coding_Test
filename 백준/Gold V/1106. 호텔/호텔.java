import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int c = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] dp = new int[c + 100];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for(int i = 1; i <= n; i++) {

            st = new StringTokenizer(br.readLine());
            int cost = Integer.parseInt(st.nextToken());
            int people = Integer.parseInt(st.nextToken());

            for(int j = people; j < c + 100; j++) {

                if (dp[j - people] != Integer.MAX_VALUE)
                    dp[j] = Math.min(dp[j], dp[j - people] + cost);
            }
        }

        int ans = Integer.MAX_VALUE;
        for(int i = c; i < c + 100; i++) ans = Math.min(ans, dp[i]);

        System.out.println(ans);
    }

}