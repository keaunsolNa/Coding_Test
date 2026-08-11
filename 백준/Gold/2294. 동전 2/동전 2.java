import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());				
		int K = Integer.parseInt(st.nextToken());
		
		int[] token = new int[N];
		for(int i = 0; i < N; i++) 
			token[i] = Integer.parseInt(br.readLine());
		
		int[] dp = new int[K + 1];
		Arrays.fill(dp, 100001);
		dp[0] = 0;
		
		for(int i = 0; i < N; i++) 
			for(int j = token[i]; j<= K; j++) 
				dp[j] = Math.min(dp[j], dp[j - token[i]] + 1);
		
		System.out.println(dp[K] == 100001 ? -1 : dp[K]);
		
	}
}
