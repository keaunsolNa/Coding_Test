package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Test17_DynamicProgramming {
	public static void main(String[] args) throws IOException {
		test02();
	}
	
	// 알고리즘 수업 - 피보나치 수 1 
	private static int cnt;
	
    public static int recur(int N) {
		
		if(N == 1 || N == 2) {
			cnt++;
			return 1;
		} else {
			return recur(N-1) + recur(N-2);
		}
		
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
    
	
	// 1로 만들기 재귀 Method
    private static int recursion(int N, int count) {
		 
		if (N < 2) 
			return count;
		
		return Math.min(recursion(N / 2, count + 1 + (N % 2)), 
						recursion(N / 3, count + 1 + (N % 3)));
	}

	
}