package baekjoon_Class01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Class03 {

	public static void main(String[] args) throws IOException {
		test04();
	}
	
	
    // 1107번 리모콘
    public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());

		boolean[] broken = new boolean[10];
		StringTokenizer st;
		
		if(M != 0) {
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < M; i++) broken[Integer.parseInt(st.nextToken())] = true;
		} 
		
		int result = Math.abs(N - 100);
		
		for(int i = 0; i <= 999999; i++) {
            String str = String.valueOf(i);
            int len = str.length();
            
            boolean chk = false;
            for(int j = 0; j < len; j++) {
            	
                if(broken[str.charAt(j) - '0']) { 
                	chk = true; 
                    break; 
                }
                
            }
            
            if(!chk) {
            	int min = Math.abs(N - i) + len; 
            	result = Math.min(min, result);
            }
            
		}
		
		System.out.println(result);
		 
    }
    
    // 1260번 - DFS와 BFS
    private static int M, N;
    private static int[][] graph;
    private static boolean visited[];
    private static int V;
    public static void test05() throws IOException {
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
          
        bfs(V);
    }

    private static void dfs(int i) {
    	
        visited[i] = true;
        System.out.print(i+" ");
          
        for(int j = 1; j <= N; j++) if(graph[i][j] == 1 && visited[j] == false) dfs(j);
        
    }
    
    private static void bfs(int i){
    	  
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(i);
        visited[i] = true;
        System.out.print(i + " ");
          
        int temp;
        while(!q.isEmpty()) {
        	
            temp = q.poll();
            
            for(int j=0; j<N+1; j++) {
            	
                if(graph[temp][j] == 1 && visited[j] == false) {
                	
                    q.offer(j);
                    visited[j] = true;
                    System.out.print(j+" ");
                    
                }
            }                       
        }
    }
    
    
    // 
    public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
    }

    // 
    public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
    }


}
