import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

   private static int n;
   private static int[][] map;
   private static boolean[][] checked;
   private static int[] dx = {1, 0, -1, 0};
   private static int[] dy = {0,- 1, 0, 1};

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   n = Integer.parseInt(br.readLine());
	   
	   map = new int[n][n];
	   checked = new boolean[n][n];
	   int maxRow = 0;
	   for(int i = 0; i < n; i++) {
		   
		   st = new StringTokenizer(br.readLine());
		   for(int j = 0; j < n; j++) {
			
			   int idx = Integer.parseInt(st.nextToken());
			   map[i][j] = idx;
			   maxRow = Math.max(maxRow, idx);
		   }
	   }
	   
	   int max = 0;
	   for(int h = 0; h < maxRow + 1; h++) {
		
		   checked = new boolean[n][n];
		   int cnt = 0;
			
		   for(int i = 0; i < n; i++) {
			
			   for(int j = 0; j < n; j++) {

				   if(!checked[i][j] && map[i][j] > h)
					   cnt+=mapCheck(i, j, h); 
			   }
		   }
		   max = Math.max(max, cnt);
	   }
	   
	   System.out.println(max);
	   
   }

   private static int mapCheck(int x, int y, int H) {
	   checked[x][y] = true;
	   for(int i = 0; i < 4; i++) {
		   
		   int nx = x + dx[i];
		   int ny = y + dy[i];
		   
			if(nx < 0 || ny < 0 || nx > n - 1 || ny > n - 1) continue;

			if(checked[nx][ny]) continue;
			
			if(map[nx][ny] > H) 
				mapCheck(nx, ny, H);

	   }
	   
	   return 1;
   }
}
