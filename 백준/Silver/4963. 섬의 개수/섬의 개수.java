import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	private static int arr[][];
	private static boolean visit[][];
	private static int dirX[] = {0, 0, -1 ,1, -1, 1, -1, 1}; 
	private static int dirY[] = {-1, 1, 0, 0, 1, 1, -1, -1};
	private static int w, h, nowX, nowY;

	public static void main(String[] args) throws NumberFormatException, IOException {
		test02();
	}

	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String input = "";
		
		while(!(input = br.readLine()).equals("0 0")){
			
			st = new StringTokenizer(input);

			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken()); 
			arr = new int[h][w];
			visit = new boolean[h][w];

			for(int i = 0; i < h; i++) {
				
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < w; j++) arr[i][j] = Integer.parseInt(st.nextToken());
				
			}

			int cnt = 0;

			for(int i = 0; i < h; i++) {
				
				for(int j = 0; j < w; j++) {

					if(!visit[i][j] && arr[i][j] == 1) {
						cnt++;
						DFS(i, j);
					}
				}
			} 

			sb.append(cnt).append('\n');
		} 
		
		System.out.println(sb);
			
	}

	private static void DFS(int x, int y) {
		visit[x][y] = true;

		for(int i = 0; i < 8; i++) {
			nowX = dirX[i] + x;
			nowY = dirY[i] + y;
			if(range_check() && !visit[nowX][nowY] && arr[nowX][nowY] == 1) 
				DFS(nowX, nowY);
		}

	} 

	private static boolean range_check() {
		return (nowX >= 0 && nowY >= 0 && nowX < h && nowY < w);
	} 
}
