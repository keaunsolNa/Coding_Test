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
		test01();
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
	
	
	// 10026번 - 적록색약
    private static int[] dy = {-1, 1, 0, 0};
    private static int[] dx = {0, 0, -1, 1};
    private static int N;
    private static char[][] map;
	
	private static void dfs(int y, int x, boolean[][] visit, char ch) {
		
		visit[y][x] = true;

		for (int k = 0; k < 4; k++) {
	    
			int ny = y + dy[k];
			int nx = x + dx[k];

			if (ny < 0 || nx < 0 || ny >= N || nx >= N || visit[ny][nx] || map[ny][nx] != ch) continue;

			dfs(ny, nx, visit, ch);
	        
		}
	    
	}
	
	
	// 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
	}
	
	
}
