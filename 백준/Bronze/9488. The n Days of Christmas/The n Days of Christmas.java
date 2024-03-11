import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long[] increase = new long[1000001];
        increase[1] = 1;
        increase[2] = 3;
        increase[3] = 6;
        increase[4] = 10;

        long[] dp = new long[1000001];
        dp[1] = 1;
        dp[2] = 4;
        dp[3] = 10;
        dp[4] = 20;

        for (int i = 1; i <= 1000000; i++) {
            increase[i] = increase[i - 1] + i;
            dp[i] = dp[i - 1] + increase[i];
        }

        while (true) {

            int t = Integer.parseInt(br.readLine());

            if (t == 0) break;

             sb.append(dp[t]).append("\n");
        }

        System.out.println(sb);

    }

}
