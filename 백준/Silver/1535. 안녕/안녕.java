import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] input = new int[n + 1][2];
        int[] dp = new int[100];

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i = 1; i <= n; i++) {

            int lose = Integer.parseInt(st.nextToken());
            int get = Integer.parseInt(st2.nextToken());

            input[i][0] = lose;
            input[i][1] = get;
        }

        for(int i = 1; i <= n; i++) {

            int lose = input[i][0];
            int get = input[i][1];

            for(int j = 99; j >= input[i][0]; j--) {

                dp[j] = Math.max(dp[j - lose] + get, dp[j]);
            }
        }

        System.out.print(dp[99]);
    }

}