import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] dp = new int[n + 1][m + 1];
		int MOD = 1000000007;
		
		dp[0][0] = 1;
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= m; j++) {
				
			      dp[i][j] = dp[i - 1][j - 1]; 
			      dp[i][j] += dp[i][j - 1]; 
			      dp[i][j] %= MOD; 

			      dp[i][j] += dp[i - 1][j]; 
			      dp[i][j] %= MOD; 
			}
		}
		
		System.out.println(dp[n][m]);
	}
}
