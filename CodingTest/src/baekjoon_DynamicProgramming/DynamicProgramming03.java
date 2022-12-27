package baekjoon_DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DynamicProgramming03 {
	public static void main(String[] args) throws IOException {
		test07();
	}
	
	// 연속부분최대곱
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double[] arr = new double[n + 1];
        double[] dp = new double[n + 1];
        double max = 0;
        
        for (int i = 1; i <= n; i++) {
            arr[i] = Double.parseDouble(br.readLine());
            dp[i] = Math.max(arr[i], dp[i-1] * arr[i]);
            max = Math.max(max, dp[i]);
        }
		
        System.out.printf("%.3f", max);
		
	}
	
	// 수열
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n + 1];
		int[] dp = new int[n + 1];
		
		int pCnt = 1;
		int mCnt = 1;
		int max = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(i > 0) {
				if(arr[i] > arr[i-1]) {
					pCnt++;
					mCnt = 1;
				}
				else if(arr[i] < arr[i-1]) {
					mCnt++;
					pCnt = 1;
				}
				else {
					pCnt++; mCnt++;
				}
			}
			
			if(max < pCnt) max = pCnt;
			else if(max < mCnt) max = mCnt;
		}
		
		System.out.println(max);
		
	}
	
	// Maximum Subarray
	public static void test03() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		while(T --> 0) {
			
			int max = Integer.MIN_VALUE;;
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), " ");
			int arr[] = new int[N + 1];
			int dp[] = new int[N + 1];
		
			for(int i = 1; i <= N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				dp[i] = dp[i-1] + arr[i];
				max = Math.max(max, Math.max(arr[i], dp[i]));
			}
            
			for (int i = 1; i <= N; i++) for (int j = N; j > i; j--) max = Math.max(max, dp[j] - dp[i]);
			
			System.out.println(max);
		}
		
	}

	// Generations of Tribbles 
	public static void test04() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T  = Integer.parseInt(br.readLine());
		
		while(T -- > 0) {
			int n = Integer.parseInt(br.readLine());
			
			if(n <= 3) {
				if(n < 2) System.out.println(1);
				else if(n == 2) System.out.println(2);
				else if(n == 3) System.out.println(4);
			} else {
				long dp[] = new long[n + 1];
				dp[0] = 1;
				dp[1] = 1;
				dp[2] = 2;
				dp[3] = 4;
				for(int i = 4; i <= n; i++) dp[i] = dp[i-1] + dp[i-2] + dp[i-3] + dp[i-4];

				System.out.println(dp[n]);
			}
		}
		
	}
	
	// 거스름돈
	public static void test05() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int five = 0;
		int two = 0;
		for(int i = N/5; i >= 0; i--) {
			if(N - (5*i) == 0) {
				five = i;
				two = 0;
				break;
			} else if((N - (5*i)) % 2 == 0) {
				five = i;
				two = (N - (5*i))/2;
				break;
			}
			
			if(i == 0) {
				if(N%2 == 0) {
					System.out.println(N/2);
				}
			}
		}
		if(N == 2) System.out.println(1); 
		else if(N == 4) System.out.println(2);
		else if(five == 0 && two == 0) System.out.println(-1);
		else System.out.println(five + two);
	}
	
	// 타일 장식물
	public static void test06() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] dp = new long[N+1];
		
		dp[0] = 2;
		dp[1] = 4;
		
		for(int i = 2; i <= N; i++) dp[i] = dp[i-1] + dp[i-2];
				
		System.out.println(dp[N]);
	}
	
	// 파도반 수열
	public static void test07() throws IOException{
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        while(T --> 0) {
	        int N = Integer.parseInt(br.readLine());
	        long dp[] = new long[101];
	        
	        dp[0] = 1;
	        dp[1] = 1;
	        dp[2] = 1;
	        
	        for(int i = 3; i <= N; i++) {
	        	dp[i] = dp[i-2] + dp[i-3];
	        }
	        		
	        System.out.println(dp[N-1]);
        }
        		
	}

	// 
	public static void test08() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String input = "";
			
	}

	// 
	public static void test09() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		
	}

	// 
	public static void test10() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
	}
}