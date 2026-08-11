import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] dp = new long[91];
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 2;
		dp[4] = 3;
		
		for(int i = 2; i < 91; i++) 
			dp[i] = dp[i - 1] + dp[i - 2];
		
		System.out.println(dp[n]);
	}
}
