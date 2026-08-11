import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int[] dy = {-1, 1, 0, 0};
    private static int[] dx = {0, 0, -1, 1};
    private static int N;
    private static char[][] map;

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		boolean[][] map = new boolean[N][M];
		int[][] dist = new int[N][M];
		
		for(int i = 0; i < N; i++) {

			String input = br.readLine();
			for(int j = 0; j < M; j++) {
				map[i][j] = input.charAt(j) == '1' ? true : false;
				dist[i][j] = -1;
			}
		}
		
		int[] dx = {1, 0 , -1, 0};       
		int[] dy = {0, 1, 0, -1}; 
		Queue<Node> qu = new LinkedList<>();

		qu.offer(new Node(0,0));
		dist[0][0] = 0; 
	      
		while(!qu.isEmpty()){
			Node p = qu.poll();
	          
			for(int i = 0; i < 4; i++){
				
				int nX = p.x + dx[i];
				int nY = p.y + dy[i];
	            
				if(nX < 0 || nX >= N || nY < 0 || nY >= M) continue;
	            
				if(!map[nX][nY]|| dist[nX][nY] != -1) continue;
	            
	            qu.offer(new Node(nX, nY));
	            dist[nX][nY] = dist[p.x][p.y] + 1;
	
			}
	          
		}
		System.out.print(dist[N - 1][M - 1] + 1);
	}

	public static class Node{
        int x, y;
        
        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
        
    }
}
