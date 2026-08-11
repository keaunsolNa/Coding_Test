package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Test17_DynamicProgramming {
	public static void main(String[] args) throws IOException {
		test16();
	}
	
	// 알고리즘 수업 - 피보나치 수 1 
	private static int cnt;
	public static void test01() throws IOException {
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
	
    // 신나는 함수 실행
    private static int[][][] dp = new int[21][21][21];
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = "";
		
		while(!(input = br.readLine()).equals("-1 -1 -1")) {
			int[] arr = new int[3];

			arr[0] = Integer.parseInt(input.split(" ")[0]);
			arr[1] = Integer.parseInt(input.split(" ")[1]);
			arr[2] = Integer.parseInt(input.split(" ")[2]);
			
			
			sb.append("w(").append(arr[0] + ", " + arr[1] + ", " + arr[2] + ") = ").append(recur(arr[0], arr[1], arr[2]));
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
	private static int recur(int a, int b, int c) {
		
		if(check(a, b, c) && dp[a][b][c] != 0) return dp[a][b][c];
		
		if(a <= 0 || b <= 0 || c <= 0) return 1;
		
		if(a > 20 || b > 20 || c > 20) return dp[20][20][20] = recur(20, 20, 20);
		
		if(a < b && b < c) return dp[a][b][c] = recur(a, b, c - 1) + recur(a, b - 1, c - 1) - recur(a, b - 1, c);
		
		return dp[a][b][c] = recur(a - 1, b, c) + recur(a - 1, b - 1, c) + recur(a - 1, b, c - 1) - recur(a - 1, b - 1, c - 1);
		
	}
	
	private static boolean check(int a, int b, int c) {
		return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20; 
	}
	

	// 파도반 수열
	public static void test04() throws IOException{
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

	// 연속합
    private static Integer[] dp2;
	private static int max;
	private static int[] arr;
	public static void test05() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		arr = new int[n];
		dp2 = new Integer[n];
		
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		dp2[0] = arr[0];
		max = arr[0];
		
		recursion(n - 1);
		
		System.out.println(max);
		
	}
    private static int recursion(int n) {
		
		if(dp2[n] == null) {
			dp2[n] = Math.max(recursion(n - 1) + arr[n], arr[n]);
 
			max = Math.max(dp2[n], max);
		}
		
		return dp2[n];
	}
	
	
	// 정수 삼각형 
	private static int n;
	private static int[][] map;
	private static Integer[][] dp3;

	// 정수 삼각형 재귀 method
	private static int recur(int depth, int idx) {
		
		// 깊이가 최상단에 올라오면 return
		if(depth == n - 1) return dp3[depth][idx];
		
		// 탐색하지 않은 값일 때
		if(dp3[depth][idx] == null) {
		
			// dp값은 바로 아래 값과 오른쪽 대각선 값 중 하나를 더한 값 중 max 값.
			dp3[depth][idx] = Math.max(recur(depth + 1, idx), recur(depth + 1, idx + 1)) + map[depth][idx];
			
		}
		
		return dp3[depth][idx];
	}
	
	// 게단 오르기
    private static Integer[] point;
    private static int stair[];
	public static void test08() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		point = new Integer[T + 1];
		
		stair = new int[T + 1];
		for(int i = 1; i <= T; i++) stair[i] = Integer.parseInt(br.readLine());
		
		point[0] = stair[0];
		point[1] = stair[1];
		
		if(T >= 2) {
			point[2] = stair[1] + stair[2];
		}
		System.out.println(totalStair(T));
	}

    public static int totalStair(int n) {
        if(point[n] == null) {
			point[n] = Math.max(totalStair(n-2), totalStair(n-3) + stair[n-1]) + stair[n];
		}
		
		return point[n];
	}
    
	// 1로 만들기
	public static void test09() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(recursion(N, 0));

	}
	
	// 1로 만들기 재귀 Method
    private static int recursion(int N, int count) {
		 
		if (N < 2) 
			return count;
		
		return Math.min(recursion(N / 2, count + 1 + (N % 2)), 
						recursion(N / 3, count + 1 + (N % 3)));
	}

	
	//전깃줄
	private static Integer[] dp6;
	private static int[][] wire;
	public static void test14() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		wire = new int[N][2];
		dp6 = new Integer[N];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			wire[i][0] = Integer.parseInt(st.nextToken());
			wire[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(wire, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
 
		});
		
		int max = 0;
		for(int i = 0; i < N; i++) max = Math.max(max, lts2(i));
		
		
		System.out.println(N - max);
		
		
	}
	
	private static int lts2 (int n) {
		
		if(dp6[n] == null) {
			dp6[n] = 1;
			
			for(int i = n + 1; i < dp6.length; i++) {
				if(wire[n][1] < wire[i][1]) dp6[n] = Math.max(dp6[n], lts2(i) + 1);
			}
		}
		
		return dp6[n];
	}
	
	
	// 평범한 배낭
	public static void test16() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());				// 물품의 수
		int K = Integer.parseInt(st.nextToken());				// 물품의 최대 무게
		int[][] back = new int[N + 1][2];						// 가방에 담을 물건 2차원 배열
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			back[i][0] = Integer.parseInt(st.nextToken());		// 물품의 무게
			back[i][1] = Integer.parseInt(st.nextToken());		// 물품의 가치
		}
		
		int[] dp = new int[K + 1];								// 최대 가치 누적 dp 배열
		int max = 0;											// 최대 값을 찾기 위한 변수 선언
		
		// 물품의 수 0개 부터 N개까지 고려
		for(int n = 0; n < N; n++) {
			
			// 물품의 무게 최대치부터 0개까지 고려
			for(int k = K; k >= back[n][0]; k--) {
				
				// 무게 k(현재 탐색 행)까지의 최적해와 k - 현재 행 중 최대값을 dp 배열에 넣기
				dp[k] = Math.max(dp[k], dp[k - back[n][0]] + back[n][1]);
				
				// 탐색 값 중 최고값 = max
				if(dp[k] > max) max = dp[k];
			}
		}
		
		System.out.println(max);
	}
	
}