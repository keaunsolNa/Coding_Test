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
		
		int[][] dp = new int[1001][1001];
		int[][] map = new int[1001][1001];
		for(int i = 1; i <= N; i++) {
			
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(i == 1 && j == 1) dp[i][j] = map[i][j];
			}
		}
		
		for(int y = 1; y <= N; y++) {
			
			for(int x = 1; x <= M; x++) {
				
				if(y == 1 && x == 1) continue;
				
				else if(y == 1) dp[y][x] = Math.max(dp[y][x], dp[y][x - 1]);
				else if (x == 1) dp[y][x] = Math.max(dp[y][x], dp[y-1][x]);
		        else {
		        	dp[y][x] = Math.max(dp[y][x], dp[y-1][x]);
		        	dp[y][x] = Math.max(dp[y][x], dp[y][x-1]);
		        	dp[y][x] = Math.max(dp[y][x], dp[y-1][x-1]);
		        }
			
				dp[y][x] += map[y][x];
			}
		}
		
		System.out.println(dp[N][M]);
	}
}
