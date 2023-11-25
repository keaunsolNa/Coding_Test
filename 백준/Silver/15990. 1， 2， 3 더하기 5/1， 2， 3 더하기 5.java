import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long[][] dp = new long[100001][4];
		dp[1][1] = dp[2][2] = dp[3][1] = dp[3][2] = dp[3][3] = 1;
		

		for(int i = 4; i <= 100000; i++) {
			

			dp[i][1] = (dp[i - 1][2] + dp[i - 1][3]) % 1000000009;
			dp[i][2] = (dp[i - 2][1] + dp[i - 2][3]) % 1000000009;
			dp[i][3] = (dp[i - 3][1] + dp[i - 3][2]) % 1000000009;
		}
		
		
		int T = Integer.parseInt(br.readLine());
		while(T --> 0) {
			
			int n = Integer.parseInt(br.readLine());
			
			System.out.println((dp[n][1] + dp[n][2] + dp[n][3]) % 1000000009);
		}
	}
}
