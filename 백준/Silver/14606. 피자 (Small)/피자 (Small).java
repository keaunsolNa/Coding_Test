import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[11];
		
		dp[0] = 0;
		dp[1] = 0;
		dp[2] = 1;
		dp[3] = 3;
		dp[4] = 6;
		
		if(n < 4) {
			System.out.println(dp[n]);
			return;
		}
		
		for(int i = 4; i <= n; i++) 
			dp[i] = i - 1 + dp[i - 1];
		
		System.out.println(dp[n]);
	}
}
