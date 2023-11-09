import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static int[][] ways = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
	private static int[][][] polyomino = {
			{{-1, 0}, {1, 0}, {0, 1}},
			{{0, -1}, {0, 1}, {1, 0}},
			{{0, -1}, {-1, 0}, {1, 0}},
			{{0, -1}, {-1, 0}, {0, 1}}
	};
    private static boolean[][] visited;
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[N][M];
		visited = new boolean[N][M];
		
		for(int i = 0; i < N; i++ ) {
			
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) map[i][j] = Integer.parseInt(st.nextToken());
		}
		
		int result = 0;
		
		for(int i = 0; i < N; i++) 
			for(int j = 0; j < M; j++) 
				result = Math.max(result, solve(map, i, j));
		
		System.out.println(result);
	}
	
	public static int solve(int[][] map, int x, int y) {
		
		visited[x][y] = true;
		int result = dfs(map, x, y, 0, visited);
		visited[x][y] = false;
		
		for(int[][] ways : polyomino) {
			
			int val = map[x][y];
			boolean target = false;
			
			for(int[] way : ways) {
				
				int nextX = x + way[0];
				int nextY = y + way[1];
				
				if(nextX >= 0 && nextX < map.length && nextY >= 0 && nextY < map[0].length) 
					val += map[nextX][nextY];

				else {
					target = true;
					break;
				}
			}
			if(target) continue;
			
			result = Math.max(result, val);
		}
		
		return result;
		
	}
	
	public static int dfs(int[][] map, int x, int y, int depths, boolean[][] visited) {
		
		int res = 0;
		if(depths == 3) return map[x][y];
		
		for(int i = 0; i < ways.length; i++) {
			
			int nextX = x + ways[i][0];
			int nextY = y + ways[i][1];
			
			if(nextX >= 0 && nextX < map.length && nextY >= 0 && nextY < map[0].length) {
				
				if(!visited[nextX][nextY]) {
					
					visited[nextX][nextY] = true;
					res = Math.max(res, dfs(map, nextX, nextY, depths + 1, visited));
					visited[nextX][nextY] = false;
				}
			}
		}
		
		return map[x][y] + res;
	}
	
}