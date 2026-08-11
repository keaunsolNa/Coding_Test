import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		long[] dp = new long[100001];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 2;
		dp[4] = 3;
		dp[5] = 3;
		dp[6] = 6;
		
		for(int i = 7; i <= 100000; i++) 
			dp[i] = (dp[i-2] + dp[i-4] + dp[i-6]) % 1000000009;
			
		
		while(T --> 0) {
			int i = Integer.parseInt(br.readLine());
			System.out.println(dp[i]);
		}
		
	}
}
