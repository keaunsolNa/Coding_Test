import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[N][M];
		int[][][] dp = new int[N][M][3];
		
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) 
				map[i][j] = Integer.parseInt(st.nextToken());
		}

		for(int i = 0; i < M; i++) {
			dp[0][i][0] = map[0][i];
			dp[0][i][1] = map [0][i];
			dp[0][i][2] = map [0][i];
		}
		
		for(int i = 1; i < N; i++) {
			
			dp[i][0][0] = Integer.MAX_VALUE;
			dp[i][M - 1][2] = Integer.MAX_VALUE;
			
			for(int j = 0; j < M; j++) {
				
				if(!(j - 1 < 0 || j - 1 >= M) && (j + 1 < 0 || j + 1 >= M)) {
					
					dp[i][j][0] = Math.min(dp[i - 1][j - 1][1], dp[i - 1][j - 1][2]) + map[i][j];
					dp[i][j][1] = Math.min(dp[i - 1][j][0], dp[i - 1][j][2]) + map[i][j];
					
				}
				
				else if(!(j - 1 < 0 || j - 1 >= M) && !(j + 1 < 0 || j + 1 >= M)) {
					
					dp[i][j][0] = Math.min(dp[i - 1][j - 1][1], dp[i - 1][j - 1][2]) + map[i][j];
					dp[i][j][1] = Math.min(dp[i - 1][j][0], dp[i - 1][j][2]) + map[i][j];
					dp[i][j][2] = Math.min(dp[i - 1][j + 1][0], dp[i - 1][j + 1][1]) + map[i][j];
					
				} 
				
				else if ((j - 1 < 0 || j - 1 >= M) && !(j + 1 < 0 || j + 1 >= M)) {
					
					dp[i][j][1] = Math.min(dp[i - 1][j][0], dp[i - 1][j][2]) + map[i][j];
					dp[i][j][2] = Math.min(dp[i - 1][j + 1][0], dp[i - 1][j + 1][1]) + map[i][j];
					
				}
			}
		}
		
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < M; i++) 
			for(int j = 0; j < 3; j++) 
				min = Math.min(min, dp[N - 1][i][j]);
			
		System.out.println(min);
	}
}
