package baekjoon_DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DynamicProgramming04 {
	public static void main(String[] args) throws IOException {
		test03();
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
	
	// 
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
	}
	
}