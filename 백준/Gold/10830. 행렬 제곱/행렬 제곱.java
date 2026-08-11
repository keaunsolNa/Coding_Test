import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	private static int N;
	private static int MOD2 = 1000;

	public static void main(String[] args) throws IOException {
		test07();
	}

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

}
