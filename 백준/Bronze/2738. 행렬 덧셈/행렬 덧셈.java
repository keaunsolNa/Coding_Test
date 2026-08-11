import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test02();
	}

	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] temp = new int[N][M];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int k = 0; k < M; k++) {
					temp[j][k] += Integer.parseInt(st.nextToken());
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				sb.append(temp[i][j]).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
