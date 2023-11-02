import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long[][] dp = new long[1001][1001];
		dp[1][1] = 1;
		dp[2][1] = 1;
		dp[2][2] = 1;
		dp[3][1] = 1;
		dp[3][2] = 2;
		dp[3][3] = 1;
		
		for(int i = 4; i <= 1000; i++) {
			
			for(int j = 2; j < i; j++) 
				dp[i][j] = (dp[i - 1][j - 1] + dp[i - 2][j - 1] + dp[i - 3][j - 1]) % 1000000009;
			
			dp[i][i] = 1;
		}

		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			long sum = 0;
			
			for(int j = 1; j <= m; j++) sum = (sum + dp[n][j]) % 1000000009;
			System.out.println(sum);
		}
   }
}