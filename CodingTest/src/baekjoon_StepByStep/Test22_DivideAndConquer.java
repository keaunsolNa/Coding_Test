package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Test22_DivideAndConquer {

	public static void main(String[] args) throws IOException {
		test08();
	}


	private static StringBuilder ans = new StringBuilder();
	
	
	// 이항 계수 3
	private static int MOD = 1000000007;
	
	
	public static long pow(long base, long exponent) {
		
		if(exponent == 1) return base % MOD;
		
		long temp = pow(base, exponent / 2);
		
		if(exponent % 2 == 1) return (temp * temp % MOD) * base % MOD;
		
		return temp * temp % MOD;
		
	}


	// 행렬 제곱
	private static int N;
	private static int MOD2 = 1000;
	
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
	private static long MOD3 = 1000000007;
	private static long[][] origin = {{1, 1} , {1, 0}};
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long[][] A = {{1, 1}, {1, 0}};
		long N = Long.parseLong(br.readLine());
		
		System.out.println(pow(A, N - 1)[0][0]);
		
	}
	
	// 행렬 제곱 분할정복 메소드
	public static long[][] pow(long[][] A, long exp) {
 
		if(exp == 1 || exp == 0) return A;
		
		long[][] ans = pow(A, exp / 2);
		
		ans = multiply(ans, ans);
		
		if(exp % 2 == 1) ans = multiply(ans, origin);
		
		return ans;
	}
	
	
	public static long[][] multiply(long[][] o1, long[][] o2) {
		
		long[][] ret = new long[2][2];
 
		ret[0][0] = ((o1[0][0] * o2[0][0]) + (o1[0][1] * o2[1][0])) % MOD3;
		ret[0][1] = ((o1[0][0] * o2[0][1]) + (o1[0][1] * o2[1][1])) % MOD3;
		ret[1][0] = ((o1[1][0] * o2[0][0]) + (o1[1][1] * o2[1][0])) % MOD3;
		ret[1][1] = ((o1[1][0] * o2[0][1]) + (o1[1][1] * o2[1][1])) % MOD3;
 
		return ret;
	}

	
}
