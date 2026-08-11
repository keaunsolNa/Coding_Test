import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	private static long C;
	private static int N;

	public static void main(String[] args) throws IOException {
		test06();
	}

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
}
