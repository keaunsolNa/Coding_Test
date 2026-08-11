import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[][] apart = new int[N][M];
		for(int i = 0; i < N ; i++) {
			
			for(int j = 0; j < M; j++) 
				apart[i][j] = Integer.parseInt(st.nextToken());
		}
		
		long sum = 0;
		for(int i = 1; i < N; i++) {
			
			for(int j = 0; j < M; j++) {
				
				if(apart[i - 1][j] * 2 < apart[i][j]) sum+= a;
			}
		}

		System.out.println(sum);
	}
}
