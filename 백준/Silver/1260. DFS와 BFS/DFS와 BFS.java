import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	private static int N;
	private static int M;
    private static int[][] graph;
    private static boolean visited[];
    private static int V;

	public static void main(String[] args) throws NumberFormatException, IOException {
		test02();
	}

	public static void test02() throws NumberFormatException, IOException {
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

    public static void dfs(int i) {
    	
        visited[i] = true;
        System.out.print(i+" ");
          
        for(int j = 1; j <= N; j++) if(graph[i][j] == 1 && visited[j] == false) dfs(j);
        
    }

    public static void bfs(int i){
  
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
}
