package baekjoon_GraphTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class GraphTheory02 {
	public static void main(String[] args) throws IOException {
		test03();
	}
	
	public static class Node{
        int x, y;
        
        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
        
    }
	
	public static class Location {
		
		int z;
		int y;
		int x;

		Location(int z, int y, int x) {
			this.z = z;
			this.y = y;
			this.x = x;
		}
	}
	
	// 2644번 - 촌수계산
	private static List<Integer>[] BT;
	private static boolean[] visited;
	private static int res = -1;
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		BT = new ArrayList[n + 1];
		visited = new boolean[n + 1];
		for(int i = 1; i <= n; i++) BT[i] = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		
		int p1 = Integer.parseInt(st.nextToken());
		int p2 = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < m; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int prev = Integer.parseInt(st.nextToken());
			int next = Integer.parseInt(st.nextToken());
			
			BT[prev].add(next);
			BT[next].add(prev);
			
		}

		dfs(p1, p2, 0);
		
		System.out.println(res);
	}
	
	private static void dfs(int start, int end, int cnt) {
		
		if(start == end) {
			res = cnt;
			return; 
		}
		
		visited[start] = true;
		for(int i = 0; i < BT[start].size(); i++) { 
			
			int next = BT[start].get(i);
			if(!visited[next]) dfs(next, end, cnt + 1);
			
		}
		
	}
	
	// 2178번 - 미로 탐색
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
	
	// 7569번 - 토마토
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
        int[] dz = { 0, 0, 0, 0, -1, 1 };
        int[] dy = { 0, 0, -1, 1, 0, 0 };
        int[] dx = { -1, 1, 0, 0, 0, 0 };
        
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        
        int[][][] tomato = new int[H][N][M];
        int cnt = 0;
		int days = 0;
        
		Queue<Location> que = new LinkedList<>();
		
        for (int h = 0; h < H; h++) {

        	for (int n = 0; n < N; n++) {

        		st = new StringTokenizer(br.readLine());
        		
        		for(int m = 0; m < M; m++) {
        			
        			tomato[h][n][m] = Integer.parseInt(st.nextToken());
	        		if (tomato[h][n][m] == 0) cnt++;
	        		else if (tomato[h][n][m] == 1) que.add(new Location(h, n, m));

        		}        		
        	}
        }
        	
        while (cnt > 0 && !que.isEmpty()) {

        	int size = que.size();
        	
        	for (int i = 0; i < size; i++) {
        
        		Location cur = que.remove();

        		for (int k = 0; k < 6; k++) {
                	
                    int nz = cur.z + dz[k];
                    int ny = cur.y + dy[k];
                    int nx = cur.x + dx[k];
                    
                    if (nz < 0 || ny < 0 || nx < 0 || nz >= H || ny >= N || nx >= M || tomato[nz][ny][nx] != 0) continue;
                    
                    cnt--;
                    tomato[nz][ny][nx] = 1;
                    que.add(new Location(nz, ny, nx));
                }
            }
            days++;
        }
        System.out.println(cnt == 0 ? days : -1);

	}
	
	//
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
	}
	
	// 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
	}
	
	// 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
	}
	
	
}
