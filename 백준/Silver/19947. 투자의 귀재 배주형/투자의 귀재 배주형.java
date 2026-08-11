import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    static BigInteger[] dp;

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int H = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		long dp[] = new long[Y+1];
		
		dp[0] = H;
		
		for(int i = 1; i <= Y; i++) {
			dp[i] = (long)Math.floor(dp[i - 1] * 1.05);
			
			if(i >= 3) dp[i] = Math.max((long) Math.floor(dp[i-3] * 1.20), dp[i]);
			if(i >= 5) dp[i] = Math.max((long) Math.floor(dp[i-5] * 1.35), dp[i]);
		}

		System.out.println(dp[Y]);
	}
}
