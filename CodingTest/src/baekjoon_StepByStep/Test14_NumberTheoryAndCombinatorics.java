package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Test14_NumberTheoryAndCombinatorics {

	static int[][] dp;
	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}
	
	// 배수와 약수
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String temp = br.readLine();
			if(temp.equals("0 0")) {
				break;
			}
			int A = Integer.parseInt(temp.split(" ")[0]);
			int B = Integer.parseInt(temp.split(" ")[1]);
			
			if(B%A == 0) {
				System.out.println("factor");
			} else if(A%B == 0) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}
		}
	}
	
	// 약수
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);
		if(arr.length != 1) {
			System.out.println(arr[0]*arr[arr.length - 1]);
		} else {
			System.out.println(arr[0]*arr[0]);
		}
	}
	
	// 최대공약수와 최소공배수
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int gcdX = x;
		int gcdY = y;
		while(gcdX!=gcdY) {
			if(gcdX>gcdY) 
				gcdX = gcdX-gcdY;
			else gcdY = gcdY-gcdX;
		} 
		System.out.println(gcdY);
		
		int result = x*y;
		
		while(x!=y) {
			if(x>y)
				x = x-y;
			else y = y-x;
		}
		
		int result2 = y;
		
		System.out.println(result/result2);
	}
	
	// 최소공배수
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			int result = x*y;
			
			while(x!=y) {
				if(x>y)
					x = x-y;
				else y = y-x;
			}
			
			int result2 = y;
			
			System.out.println(result/result2);
		}
	}

	// 검문
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int arr[] = new int[testCase];
		for(int i = 0; i < testCase; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int gcdVal = arr[1] - arr[0];
		
		for(int i = 2; i < testCase; i++) {
			gcdVal = gcd(gcdVal, arr[i] - arr[i-1]);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 2; i <= gcdVal; i++) {
			
			if(gcdVal % i == 0) {
				sb.append(i).append(" ");
			}
		}
		
		System.out.println(sb);
	}
	
	// 검문 최대공약수 메서드
	public static int gcd(int a, int b) {
		while(b != 0) {
			int c = a % b;
			a = b;
			b = c;
		}
		
		return a;
	}
	
	// 링
	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		List<Integer> arr = new ArrayList<>();
		for(int i = 0; i < N; i++){
			arr.add(Integer.parseInt(st.nextToken()));
		}

		int firstRing = arr.get(0);
	
		
		for(int i = 1; i < N; i++) {
			int gcd = GCD(arr.get(i), firstRing);
			int LCD = firstRing*arr.get(i)/gcd;
			System.out.println(LCD/arr.get(i)+"/"+LCD/firstRing);
		}
	}
	
	// 링 GCD 계산기
    static int GCD(int a, int b){ 
    	if (a%b == 0) {
    		return b;
    	}
    	return GCD(b, a % b);
    }
    
    // 이항 계수 1
    public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		System.out.println(binomial(N, K));
    }
    
    // 이항 계수 계산기
    public static int binomial(int n, int r) {
		if(r == 0 || n == r) 
			return 1;
		return binomial(n - 1, r - 1) + binomial(n - 1, r);
	}
    
    // 이항 계수 2
    public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		dp = new int[N+1][K+1];
		System.out.println(dp(N, K));
    }
    
    // 이항 계수 동적 계획법 모듈러 연산
    public static int dp(int n, int k) {
    	
    	if (dp[n][k] > 0) return dp[n][k];
		
 
		if (k == 0 || n == k) {
			return dp[n][k] = 1;
		}
 
		return dp[n][k] = (dp(n - 1, k - 1) + dp(n - 1, k)) % 10007;
    }
    
    // 다리 놓기
    public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			dp = new int[30][30];
			System.out.println(dp2(M, N));;
		}
    }
    
    // 다리 놓기 동적 계획법
    public static int dp2(int n, int r) {
		
		if(dp[n][r] > 0) {
			return dp[n][r]; 
		}
		
		if(n == r || r == 0) {
			return dp[n][r] = 1;
		}
		
		return dp[n][r] = dp(n - 1, r - 1) + dp(n - 1, r);
	}
    
}
