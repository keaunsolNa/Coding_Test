import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private static int N;
	private static int M;

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[N + 1][N + 1];
		for(int i = 1; i <= N; i++) {
			
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= N; j++) 
				map[i][j] = Integer.parseInt(st.nextToken());
			
		}
		
		for(int i = 1; i <= N; i++) {
			
			for(int j = 1; j <= N; j++) 
				map[i][j] += map[i - 1][j];
			
		}
		
		for(int i = 1; i <= N; i++) {
			
			for(int j = 1; j <= N; j++) 
				map[i][j] += map[i][j - 1];
			
		}

		for(int i = 0; i < M; i++) {
			
			st = new StringTokenizer(br.readLine());

			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
				
			sb.append(
					  map[x2][y2] 					// 0.0 ~ x2.y2 까지의 최대 사각형
				    - map[x1 - 1][y2] 				// - 세로 직사각형
					- map[x2][y1 - 1] 				// - 가로 직사각형 
					+ map[x1 - 1][y1 - 1]);		// + 중복 사각형
			
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
}
