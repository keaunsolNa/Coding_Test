package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus2 {

	private static int[][] dp = new int[30][30];
	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 최소 공배수
	public static void test01() throws IOException {
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
	
	// 이항 계수
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		System.out.println(binomial(N, K));
	}
	
	// 이항 계수 재귀 메서드
	public static int binomial(int n, int r) {
		if(r == 0 || n == r) 
			return 1;
		return binomial(n - 1, r - 1) + binomial(n - 1, r);
	}
	
	// 약수
	public static void test03() throws NumberFormatException, IOException {
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
	
	// 상근날드
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] hamburger = new int[3];
		int[] drink = new int[2]; 
		hamburger[0] = Integer.parseInt(br.readLine()); 
		hamburger[1] = Integer.parseInt(br.readLine()); 
		hamburger[2] = Integer.parseInt(br.readLine()); 
		drink[0] = Integer.parseInt(br.readLine()); 
		drink[1] = Integer.parseInt(br.readLine()); 
		
		Arrays.sort(hamburger);
		Arrays.sort(drink);
		
		System.out.println(hamburger[0] + drink[0] - 50);
	}

	// R2
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int R1 = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		
		System.out.println(2*S - R1);
	}

	// 초콜릿 자르기
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		System.out.println(N*M - 1);
	}
	
	// 다리 놓기
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			System.out.println(dp(M, N));;
		}
	}
	
	// 다리 놓기 동적 계획법
	public static int dp(int n, int r) {
		
		if(dp[n][r] > 0) {
			return dp[n][r]; 
		}
		
		if(n == r || r == 0) {
			return dp[n][r] = 1;
		}
		
		return dp[n][r] = dp(n - 1, r - 1) + dp(n - 1, r);
	}

	// 시험 감독
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int[] people = new int[testCase];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < testCase; i++) {
			people[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		int chiefSupervisor = Integer.parseInt(st.nextToken());
		int subSupervisor = Integer.parseInt(st.nextToken());
		
		long sum = testCase;
		for(int i = 0; i < people.length; i++) {
			people[i] -= chiefSupervisor;
			if(people[i] > 0) {
				if(people[i]%subSupervisor > 0) {
					sum += people[i]/subSupervisor + 1;
				} else {
					sum += people[i]/subSupervisor;
				}
			}
		}
		System.out.println(sum);
	}
	
	// 지능형 기차
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] people = new int[4];
		for(int i = 0; i < 4; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int out = Integer.parseInt(st.nextToken());
			int in = Integer.parseInt(st.nextToken());
			if(i > 0) {
				people[i] = people[i-1] + (in - out);
			} else {
				people[i] =  in - out;
			}
		}
		
		Arrays.sort(people);
		System.out.println(people[people.length - 1]);
	}
	
	// 분산처리
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken())%4 + 4;
			long result = a;
			for(int j = 2; j <= b; j++) {
				result = (result*a)%10;
			}
			if(result == 0) System.out.println(10);
			else System.out.println(result);
		}
	}
	
}
