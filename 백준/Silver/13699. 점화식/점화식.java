import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    static BigInteger[] dp;

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] dp = new long[36];
		dp[0] = 1;
		dp[1] = 1;
		
		for(int i = 2; i < 36; i++) {
			for(int j = 0; j < i; j++) {
				dp[i] += (dp[j] * dp[i - 1 - j]);
			}
		}
		
		System.out.println(dp[N]);
	}
}
