import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    static BigInteger[] dp;

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		long[] dp = new long[51];
		dp[0] = 1;
		dp[1] = 1;
		for(int i = 2; i <= N; i++) {
			dp[i] = (1 + dp[i-2] + dp[i - 1]) % 1000000007;
		}
		
		System.out.println(dp[N]);
		
	}
}
