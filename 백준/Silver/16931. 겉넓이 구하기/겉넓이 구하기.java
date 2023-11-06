import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] cube = new int[N][M];
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
	
		for(int i = 0;i < N; i++) {
		
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) 
				cube[i][j] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 2 * N * M;
		
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < M; j++) {
				
				for(int k = 0; k < 4; k++) {
					
					int nx = i + dx[k];
					int ny = j + dy[k];
					
					if(nx < 0 || ny < 0 || nx > N - 1 || ny > M - 1) {
						answer += cube[i][j];
						continue;
					}
					
					if(cube[nx][ny] < cube[i][j]) answer += cube[i][j] - cube[nx][ny];
				}
			}
		}
		
		System.out.println(answer);
   }
}