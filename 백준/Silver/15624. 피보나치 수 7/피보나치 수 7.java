import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(dynamic2(N));
	}

	public static long dynamic2(int N) {
		long[] dp = new long[1000001];
		
		dp[1] = 1;
		dp[2] = 1;
		for(int i = 3; i <= N; i++) {
			dp[i] = (dp[i-1] + dp[i-2]) % 1000000007;
		}
		
		return dp[N];
	}
}
