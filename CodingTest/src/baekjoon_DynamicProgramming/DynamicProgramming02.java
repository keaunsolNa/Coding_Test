package baekjoon_DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class DynamicProgramming02 {
	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 2 * n 타일링
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[1001];
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i = 3; i <= n; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
		}
		
		System.out.println(dp[n]);
		
		
	}
	
	// 투자의 귀재 배주형
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
	
	// 피보나치 비스무리한 수열
	public static void test03() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long dp[] = new long[117];
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		
		for(int i = 4; i <= N; i++) {
			dp[i] = dp[i - 1] + dp[i - 3];
		}
		
		System.out.println(dp[N]);
	}

	// 알고리즘 수업 - 피보나치 수 2
	public static void test04() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N  = Integer.parseInt(br.readLine());
		
		int z;
		int x = 1; 
		int y = 1;
		
		for(int i = 3; i <= N; i++) {
			z = y;
			y = (x+y) % 1000000007; 
			x = z;
		}
		
		System.out.println(y + " " + (N - 2));
		
	}
	
	// 피보나치는 지겨웡~
	public static void test05() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		long[] dp = new long[51];
		dp[0] = 1;
		dp[1] = 1;
		for(int i = 2; i <= N; i++) {
			dp[i] = (1 + dp[i-2] + dp[i - 1]) % 1000000007;
		}
		
		System.out.println(dp[N]);
		
	}
	
	// 점화식
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
	

	// 피보나치
    static BigInteger[] dp;
    static BigInteger zero = new BigInteger("0");
	public static void test07() throws IOException{
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] ps = new int[t+1];
        BigInteger[] qs = new BigInteger[t+1];
        int max = 0;
        StringTokenizer st;
        
        for (int i = 1; i <= t; i++) {
        	
            st = new StringTokenizer(br.readLine());
            ps[i] = Integer.parseInt(st.nextToken());
            qs[i] = new BigInteger(st.nextToken());
            max = Math.max(max,ps[i]);
            
        }
        
        dp = new BigInteger[10001];
        dp[1] = new BigInteger("1");
        dp[2] = new BigInteger("1");
        
        for (int i = 3; i <= max; i++) {
        	
            dp[i] = dp[i-1].add(dp[i-2]);
            
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= t; i++) {
        	
            sb.append("Case #" + i + ": " + dp[ps[i]].remainder(qs[i]) + "\n");
            
        }
        
        System.out.print(sb);
	}

	// 피보나치 수의 개수
	public static void test08() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String input = "";
		
		dp = new BigInteger[1001];
		dp[1] = new BigInteger("1");
		dp[2] = new BigInteger("2");
		
		
		while(!(input = br.readLine()).equals("0 0")) {
			st = new StringTokenizer(input, " ");
			
			String a = st.nextToken();
			String b = st.nextToken();
			int chk = 0;
			int i = 3;
			while(true) {
				
				dp[i] = dp[i-1].add(dp[i-2]);
				if(dp[i].compareTo(new BigInteger(a)) == 0 || dp[i].compareTo(new BigInteger(a)) > 0) {
					chk++;
				}
				
				if(dp[i].compareTo(new BigInteger(b)) > 0) {
					chk--;
					break;
				}
				i++;
			}
			
			if(a.equals("0") && b.equals("2")) {
				System.out.println(2);
			} else if(new BigInteger(a).compareTo(new BigInteger(b)) > 0) {
				System.out.println(0);
			} else {
				System.out.println(chk);
			}
		}
		
			
	}

	// 악수
	public static void test09() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int a = 1;
		int b = 1;
		int sum = 2;

		if(n <= 1) {
			System.out.println(1);
		} else {
			for(int i = 3; i <= n; i++) {
				a = b;
				b = sum;
				sum = a + b;
			}
			
			sum %= 10;
			
			System.out.println(Math.abs(sum));
		}
		
	}

	// BABBA 
	public static void test10() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
        int[][] dp = new int[2][46];
        dp[0][2] = 1;
        dp[1][1] = 1;
        dp[1][2] = 1;
        
        for(int i = 3; i <=  K; i++) {
        	dp[0][i] = dp[0][i-2] + dp[0][i-1];
            dp[1][i] = dp[1][i-2] + dp[1][i-1];
        }
        
        System.out.println(dp[0][K] + " " + dp[1][K]);
	}
}