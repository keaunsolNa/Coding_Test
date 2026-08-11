import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int[][] dp = new int[R + W + 1][R + W + 1];
		dp[1][1] = 1;
		
		for(int i = 2; i <= R + W; i++) 
			for(int j = 1; j <= i; j++) dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
		
		long sum = 0;
		for(int i = 0; i < W; i++)
			for(int j = 0; j <= i; j++)
				sum += dp[R + i][C + j];
		
		System.out.println(sum);
	}
}
