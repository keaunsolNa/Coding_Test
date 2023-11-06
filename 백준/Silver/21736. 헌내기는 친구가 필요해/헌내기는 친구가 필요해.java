import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    
    private static int N;
	private static int M;
	private static char[][] map;
	private static boolean[][] visit;
	private static int[] dx = { -1, 1, 0, 0 };
	private static int[] dy = { 0, 0, -1, 1 };
	private static int result;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new char[N][M];
		visit = new boolean[N][M];
		
		int x = 0;
		int y = 0;
		
		for(int i = 0; i < N; i++) {
			
			String input = br.readLine();
			for(int j = 0; j < M; j++) {
				
				map[i][j] = input.charAt(j);
				if(input.charAt(j) == 'I') {
					x = i;
					y = j;
				}
			}
		}
		
		dfs(x, y);
		
		if(result == 0) System.out.println("TT");
		else System.out.println(result);
	}
	
	public static void dfs(int x, int y) {
		
		visit[x][y] = true;
		
		if(map[x][y] == 'P') result++;
		
		for(int i = 0; i < 4; i++) {
			
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && ny >= 0 && nx < N && ny < M && !visit[nx][ny]) {
				
				if(map[nx][ny] != 'X') dfs(nx, ny);
			}
		}
	}
}
