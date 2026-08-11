package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Test27_Graph {
	public static void main(String[] args) throws IOException {
		test06();
	}
	
	// 24479번 - 알고리즘 수업 - 깊이 우선 탐색 1
    private static int cnt;
    private static int N;
	private static int M;
	
    
    // 1260번 - DFS와 BFS
    private static int[][] graph;
    private static boolean visited[];
    private static int V;
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		graph = new int[1001][1001];
		visited = new boolean[10001];
		 
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			graph[x][y] = graph[y][x] = 1;
		}
		
		dfs(V);
		
        for(int j = 1; j <= N; j++) visited[j] = false;
        
        System.out.println();
          
        bfs2(V);
	}
	
    private static void dfs(int i) {
    	
        visited[i] = true;
        System.out.print(i+" ");
          
        for(int j = 1; j <= N; j++) if(graph[i][j] == 1 && visited[j] == false) dfs(j);
        
    }
      
    private static void bfs2(int i){
  
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(i);
        visited[i] = true;
        System.out.print(i + " ");
          
        int temp;
        while(!q.isEmpty()) {
        	
            temp = q.poll();
            
            for(int j = 0; j< N + 1; j++) {
            	
                if(graph[temp][j] == 1 && visited[j] == false) {
                	
                    q.offer(j);
                    visited[j] = true;
                    System.out.print(j+" ");
                    
                }
            }                       
        }
    }
    
    // 2667번 - 단지번호붙이기
    private static int map[][];
    private static int dirX[] = {0, 0, -1, 1};
	private static int dirY[] = {-1, 1, 0, 0};
	private static boolean visit[][];
	private static int[] aparts = new int[25 * 25];
	private static int count;
	private static int now_x, now_y;

    private static void dfs(int x, int y) {
    
    	visit[x][y] = true;
        aparts[cnt]++;

        for(int i = 0; i < 4; i++) {
            int nx = x + dirX[i];
            int ny = y + dirY[i];

            if(nx >= 0 && ny >=0 && nx < N && ny < N)
                if(map[nx][ny] == 1 && !visit[nx][ny]) dfs(nx,ny);
        }
   
    }
    
    // 1012번 -  유기농 배추
	private static int K;
	public static void test08() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());

			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());

			map = new int[N][M];
			visit = new boolean[N][M];

			for(int j=0; j<K; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				map[y][x] = 1;
			}

			count = 0;
			for(int j=0; j<N; j++) {
				for(int k=0; k<M; k++) {

					if(map[j][k] == 1 && visit[j][k] == false) {
						count++;
						DFS(k, j);
					}
				}
			}
			sb.append(count).append('\n');
		}

		System.out.println(sb);
	}
    
	private static void DFS(int x, int y) {
		visit[y][x] = true;

		for(int i = 0; i < 4; i++) {
			now_x = x + dirX[i];
			now_y = y + dirY[i];
			
			if(Range_check() && visit[now_y][now_x] == false && map[now_y][now_x] == 1) {
				DFS(now_x, now_y);
			}

		}
	}

	private static boolean Range_check() {
		return (now_y < N && now_y >= 0 && now_x < M && now_x >= 0);
	}
	
}
