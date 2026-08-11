import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    private static int[][][] dp = new int[21][21][21];

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] dp = new long[1000001];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i = 3; i <= N; i++) dp[i] = (dp[i-1] + dp[i-2]) % 15746;
		
		System.out.println(dp[N]);
				
	}
}
