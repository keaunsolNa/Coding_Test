package baekjoon_DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DynamicProgramming04 {
	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 16395번 - 파스칼의 삼각형
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		System.out.println(binomial(n - 1, k - 1));
		
	}
	
	public static int binomial(int n, int r) {
		
		if(r == 0 || n == r) return 1;
		
		return binomial(n - 1, r - 1) + binomial(n - 1, r);
	}
	
	// 15489번 - 파스칼 삼각형
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
	
	// 1788번 - 피보나치 수의 확장
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()) + 1000000;
        
        long[] dp = new long[2000001];
        
        dp[1000001] = 1;
        
        if (n < 1000000) {
            for (int i = 999999; i >= n; i--) 
                dp[i] = (dp[i + 2] - dp[i + 1]) % 1000000000;
        } else {
            for (int i = 1000002; i <= n; i++) 
                dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000000;
        }
        
        if (dp[n] > 0) System.out.println(1);
        if (dp[n] == 0) System.out.println(0);
        if (dp[n] < 0) System.out.println(-1);
        System.out.print(Math.abs(dp[n]));
	}
	
	// 14606번 - 피자 (Small)
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[11];
		
		dp[0] = 0;
		dp[1] = 0;
		dp[2] = 1;
		dp[3] = 3;
		dp[4] = 6;
		
		if(n < 4) {
			System.out.println(dp[n]);
			return;
		}
		
		for(int i = 4; i <= n; i++) 
			dp[i] = i - 1 + dp[i - 1];
		
		System.out.println(dp[n]);
	}
	
	// 2193번 - 이친수
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
	
	// 14494번 - 다이나믹이 뭐예요?
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] dp = new int[n + 1][m + 1];
		int MOD = 1000000007;
		
		dp[0][0] = 1;
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= m; j++) {
				
			      dp[i][j] = dp[i - 1][j - 1]; 
			      dp[i][j] += dp[i][j - 1]; 
			      dp[i][j] %= MOD; 

			      dp[i][j] += dp[i - 1][j]; 
			      dp[i][j] %= MOD; 
			}
		}
		
		System.out.println(dp[n][m]);
	}
	
	// 14607번 - 피자 (Large)
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger n = new BigInteger(br.readLine());
		BigInteger one = new BigInteger("1");
		BigInteger two = new BigInteger("2");
		
		System.out.println(n.multiply(n.subtract(one)).divide(two));
	}
	
	// 9084번 - 동전
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			int N = Integer.parseInt(br.readLine());				
			int[] token = new int[N];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < N; i++) 
				token[i] = Integer.parseInt(st.nextToken());
			
			int K = Integer.parseInt(br.readLine());
			int[] cache = new int[K + 1];
			cache[0] = 1;
			
			for(int coin : token) 
				for(int j = coin; j <= K; j++) cache[j] += cache[j - coin];
			
			System.out.println(cache[K]);
		}
		
	}
	
	// 2293번 - 동전 1
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());				
		int[] token = new int[N];
		
		int K = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) 
			token[i] = Integer.parseInt(br.readLine());

		int[] cache = new int[K + 1];
		cache[0] = 1;
		
		for(int coin : token) 
			for(int j = coin; j <= K; j++) cache[j] += cache[j - coin];
		
		System.out.println(cache[K]);
		
	}
	
	// 2294번 - 동전 2
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