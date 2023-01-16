package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Test22_DivideAndConquer {

	public static void main(String[] args) throws IOException {
		test07();
	}

	// 색종이 만들기
	private static int[][] board;
	private static int blue = 0;
	private static int white = 0;
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		// 최초의 사각형
		board = new int[N][N];
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) 
				board[i][j] = Integer.parseInt(st.nextToken());
			
		}
		
		// 분할 시작(N사이즈의 0, 0에서 시작)
		divide(0, 0, N);

		System.out.println(white);
		System.out.println(blue);
	}

	// 분할 알고리즘
	private static void divide(int row, int col, int size) {
		
		// 모든 row와 col이 size 안에서 같다면 해당 색++
		if(check(row, col, size)) {
			
			if(board[row][col] == 0) white++;
			else blue++;
			
			return;
		}
		
		// row와 col에 다른 색이 있다면 사이즈 분할
		int newSize = size / 2;	
		
		// 1사분면 재귀호출
		divide(row, col + newSize, newSize);				
		
		// 2사분면 재귀호출
		divide(row, col, newSize);						
		
		// 3사분면 재귀호출
		divide(row + newSize, col, newSize);				
		
		// 4사분면 재귀호출
		divide(row + newSize, col + newSize, newSize);
		
	}
	
	// 주어진 사분면 안에서 row와 col 일치하는지 check
	private static boolean check(int row, int col, int size) {
		
		// 검사의 기준이 될 칸
		int color = board[row][col];	
		
		for(int i = row; i < row + size; i++) {
			
			for(int j = col; j < col + size; j++) {
				
				// 색깔이 기준값과 다르다면 false 반환
				if(board[i][j] != color) return false;
			}
		}
		
		// 검사 시 모든 행, 열이 일치하면 true 반환
		return true;
	}
	
	// 쿼드트리
	private static int[][] board2;
	private static StringBuilder ans = new StringBuilder();
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		board2 = new int[N][N];
		
		for(int i = 0; i < N; i++) {

			String input = br.readLine();
			for(int j = 0; j < N; j++) 
				
				board2[i][j] = Character.getNumericValue(input.charAt(j));
		}
		
		divide2(0, 0, N);
		
		System.out.print(ans);
		
	}
	
	// 분할 알고리즘2
	private static void divide2(int row, int col, int size) {
		
		// 모든 row와 col이 size 안에서 같다면 해당 색++
		if(check2(row, col, size)) return;
		
		
		// row와 col에 다른 색이 있다면 사이즈 분할
		int newSize = size / 2;	
		
		ans.append("(");

		// 1사분면 재귀호출
		divide2(row, col + newSize, newSize);				
		
		// 2사분면 재귀호출
		divide2(row, col, newSize);						
		
		// 3사분면 재귀호출
		divide2(row + newSize, col, newSize);				
		
		// 4사분면 재귀호출
		divide2(row + newSize, col + newSize, newSize);

		ans.append(")");
		
	}
	
	// 주어진 사분면 안에서 row와 col 일치하는지 check
	private static boolean check2(int row, int col, int size) {
		
		// 검사의 기준이 될 칸
		int color = board2[row][col];	
		
		for(int i = row; i < row + size; i++) {
			
			for(int j = col; j < col + size; j++) {
				
				// 색깔이 기준값과 다르다면 false 반환
				if(board2[i][j] != color) return false;
			}
		}
		
		// 검사 시 모든 행, 열이 일치하면 true 반환

		ans.append(color);
		return true;
	}
	
	// 종이의 개수
	private static int[][] board3;
	private static int zero;
	private static int one;
	private static int minusOne;
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		board3 = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) 
				
				board3[i][j] = Integer.parseInt(st.nextToken());
		}
		
		divide3(0, 0, N);
		
		System.out.println(minusOne);
		System.out.println(zero);
		System.out.println(one);
		
	}
	
	// 분할 알고리즘3
	private static void divide3(int row, int col, int size) {
		
		// 모든 row와 col이 size 안에서 같다면 해당 색++
		if(check3(row, col, size)) {
			
			if(board3[row][col] == 0) zero++;
			
			else if(board3[row][col] == 1) one++;
			
			else minusOne++;
			
			return;
		}
		
		// row와 col에 다른 색이 있다면 사이즈 분할
		size /= 3;	
		
		// 1사분면 재귀호출
		divide3(row, col, size);						
		
		// 2사분면 재귀호출
		divide3(row, col + size, size);				
		
		// 3사분면 재귀호출
		divide3(row, col + size + size, size);
		
		// 4사분면 재귀호출
		divide3(row + size, col, size);				
		
		// 5사분면 재귀호출
		divide3(row + size, col + size, size);
		
		// 6사분면 재귀호출
		divide3(row + size, col + size + size, size);
		
		// 7사분면 재귀호출
		divide3(row + size + size, col, size);
		
		// 8 사분면 재귀호출
		divide3(row + size + size, col + size, size);

		// 9 사분면 재귀호출
		divide3(row + size + size, col + size + size, size);

	}
	
	// 주어진 사분면 안에서 row와 col 일치하는지 check
	private static boolean check3(int row, int col, int size) {
		
		// 검사의 기준이 될 칸
		int color = board3[row][col];	
		
		for(int i = row; i < row + size; i++) {
			
			for(int j = col; j < col + size; j++) {
				
				// 색깔이 기준값과 다르다면 false 반환
				if(board3[i][j] != color) return false;
			}
		}
		
		return true;
	}
	
	// 곱셈
	private static long C;
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		C = Long.parseLong(st.nextToken());
	
		System.out.println(DCP(A, B));
	}
	
	public static long DCP(long A, long exponent) {
		
		if(exponent == 1) return A % C;
		
		long temp = DCP(A, exponent / 2);
		
		if(exponent % 2 == 1) return (temp * temp % C) * A % C;
		
		return temp * temp % C;
		
	}
	
	// 이항 계수 3
	private static int MOD = 1000000007;
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long N = Long.parseLong(st.nextToken());
		long K = Long.parseLong(st.nextToken());
		
		long numerator  = factorial(N);
		
		long denominator = factorial(K) * factorial(N - K) % MOD;	
	
		System.out.println(numerator  * pow(denominator, MOD - 2) % MOD);
		
	}
	
	public static long factorial(long N) {
		long fac = 1;
		
		while(N > 1) {
			fac = (fac * N) % MOD;
			N--;
		}
		
		return fac;
	}
	
	public static long pow(long base, long exponent) {
		
		if(exponent == 1) return base % MOD;
		
		long temp = pow(base, exponent / 2);
		
		if(exponent % 2 == 1) return (temp * temp % MOD) * base % MOD;
		
		return temp * temp % MOD;
		
	}

	// 행렬 곱셈
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] A = new int[N][M];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < M; j++) 
				A[i][j] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[][] B = new int[M][K];
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < K; j++) 
				B[i][j] = Integer.parseInt(st.nextToken());
		}
		
		int[][] C = new int[N][K];
		for(int n = 0; n < N; n++) {
			
			for(int k = 0; k < K; k++) {
				
				for(int m = 0; m < M; m++) 
					C[n][k] += A[n][m] * B[m][k];
			}
		}
		
		for (int[] is : C) {
			for (int is2 : is) 
				System.out.print(is2 + " ");
			System.out.println();
		}
	}

	// 행렬 제곱
	private static int N;
	private static int MOD2 = 1000;
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		int[][] arr = new int[N][N];
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) arr[i][j] = Integer.parseInt(st.nextToken()) % MOD2;
		}
		
		int[][] ans = pow(arr, B);
		
			

		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) sb.append(ans[i][j]).append(' ');
			
			sb.append('\n');
		}
		System.out.println(sb);
		
	}
	
	private static int[][] pow(int[][] arr, long exponent){
		
		if(exponent == 1) return arr;
		
		int[][] ret = pow(arr, exponent / 2);
		
		ret = multiply(ret, ret);
		
		if(exponent % 2 == 1) ret = multiply(ret, arr);
		
		return ret;
	}
	
	public static int[][] multiply(int[][] o1, int[][] o2) {
		
		int[][] ret = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				for(int k = 0; k < N; k++) {
					
					ret[i][j] += o1[i][k] * o2[k][j];
					ret[i][j] %= MOD2;	
				}
			}
		}
		return ret;
	}
	
	//
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	}
	
}
