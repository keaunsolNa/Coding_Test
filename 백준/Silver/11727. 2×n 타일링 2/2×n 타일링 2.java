import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private static Integer[] dp;

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[1001];
		dp[1] = 1;
		dp[2] = 3;
		for(int i = 3; i <= N; i++) dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007;
		
		System.out.println(dp[N]);
			
	}
}
