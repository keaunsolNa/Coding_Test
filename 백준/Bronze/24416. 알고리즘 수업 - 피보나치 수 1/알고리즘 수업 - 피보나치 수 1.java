import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {

	static int cnt = 0;

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N  = Integer.parseInt(br.readLine());
		recur(N);
		sb.append(cnt).append(" ");
		cnt = 0;
		dynamic(N);
		sb.append(cnt);
		System.out.println(sb);
	}

	public static int recur(int N) {
		
		if(N == 1 || N == 2) {
			cnt++;
			return 1;
		} else {
			return recur(N-1) + recur(N-2);
		}
		
	}

	public static int dynamic(int N) {
		int[] dp = new int[N+1];
		
		dp[1] = 1;
		dp[2] = 1;
		
		for(int i = 3; i <= N; i++) {
			cnt++;
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[N];
	}
}
