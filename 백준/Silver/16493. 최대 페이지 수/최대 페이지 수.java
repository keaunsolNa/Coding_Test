import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] input = new int[m + 1][2];
        int[][] dp = new int[m + 1][n + 1];

        for(int i = 1; i <= m; i++) {

            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());

            input[i][0] = d;
            input[i][1] = p;

        }

        for(int i = 1; i <= m; i++) {

            int d = input[i][0];
            int p = input[i][1];

            for (int j = 1; j <= n; j++) {

                dp[i][j] = dp[i-1][j];

                if ((j - d) >= 0)
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j - d] + p);
            }
        }

        System.out.print(dp[m][n]);
    }

}