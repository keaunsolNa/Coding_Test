package baekjoon_DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSBFS01 {
	private static int N;
	private static int M;
    private static int cnt;
    private static int[] visted;

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}
	
	// 바이러스
	public static void test01() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int node = Integer.parseInt(br.readLine());
        boolean[][] arr = new boolean[node][node];
        boolean[] visit = new boolean[arr.length];
        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++){
        	
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken()) -1;
            int b = Integer.parseInt(st.nextToken()) -1;

            arr[a][b] = true;
            arr[b][a] = true;

        }

        int result = search(arr, visit, 0);

        System.out.println(result -1);
	}
	
	// 바이러스 DFS
    public static int search(boolean[][] arr, boolean[] visit, int start) {
        int result = 1;

        visit[start] = true;
        for (int i = 0 ; i < arr.length ; i++) if(arr[start][i] && !visit[i]) result += search(arr, visit, i);
        
        return result;
    }
	
	// DFS와 BFS
    private static int[][] graph;
    private static boolean visited[];
    private static int V;
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
	
	// DFS와 BFS DFS Method
    public static void dfs(int i) {
    	
        visited[i] = true;
        System.out.print(i+" ");
          
        for(int j = 1; j <= N; j++) if(graph[i][j] == 1 && visited[j] == false) dfs(j);
        
    }
      
    // DFS와 BFS BFS Method
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
	
	// 알고리즘 수업 - 깊이 우선 탐색 1
    private static ArrayList<ArrayList<Integer>> graph2 = new ArrayList<>();
	public static void test03() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int r =Integer.parseInt(st.nextToken());
        
        for(int i = 0; i < N + 1; i++) graph2.add(new ArrayList<Integer>());
        
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph2.get(u).add(v);
            graph2.get(v).add(u);
        }
        
        for(int i = 0; i < graph2.size(); i++) Collections.sort(graph2.get(i));
        cnt = 1;
        visted = new int[N + 1];
        dfs2(r);
        
        for(int i = 1; i < visted.length; i++) System.out.println(visted[i]);
		
	}
	
	// 알고리즘 수업 - 깊이 우선 탐색 DFS Method
    public static void dfs2(int x){
        visted[x] = cnt;
        for(int i = 0; i < graph2.get(x).size(); i++){

        	int y = graph2.get(x).get(i);
            if(visted[y] == 0){
                cnt++;
                dfs2(y);
            }
        }
    }

	// 알고리즘 수업 - 깊이 우선 탐색 2
	public static void test04() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int r =Integer.parseInt(st.nextToken());
        
        for(int i = 0; i < N + 1; i++) graph2.add(new ArrayList<Integer>());
        
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph2.get(u).add(v);
            graph2.get(v).add(u);
        }
        
        for(int i = 0; i < graph2.size(); i++) Collections.sort(graph2.get(i), Collections.reverseOrder());
        
        cnt = 1;
        visted = new int[N + 1];
        dfs2(r);
        
        for(int i = 1; i < visted.length; i++) System.out.println(visted[i]);
		
	}

	// 알고리즘 수업 - 깊이 우선 탐색 4
	private static int[] depth;
	private static int[] visit;
	private static List<Integer> []graph3;
	public static void test05() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int r =Integer.parseInt(st.nextToken());
        
        graph3 = new ArrayList[N+1];
		for(int i = 1; i <= N; i++) graph3[i] = new ArrayList<>();

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph3[u].add(v);
            graph3[v].add(u);
        }
        
		for(int i = 1; i <= N; i++) Collections.sort(graph3[i], Collections.reverseOrder());
		boolean[] visited = new boolean[N + 1];
		visited[r] = true;
		
		depth = new int[N+1];
		for(int i = 1; i <= N; i++) depth[i] = -1;
		depth[r] = 0;
		dfs3(r, visited, 1);
		
		for(int i = 1; i <= N; i++) System.out.println(depth[i]);
        
	}

	// 알고리즘 수업 - 깊이 우선 탐색 DFS Method
    public static void dfs3(int x, boolean []visited, int cnt) {
		if(graph3[x].size() == 0) return;
		for(int i : graph3[x]) {
			if(!visited[i]) {
				visited[i] = true;
				depth[i] = cnt;
				dfs3(i, visited, cnt+1);
			}
		}
    }
    
	// 알고리즘 수업 - 깊이 우선 탐색 3
	public static void test06() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int r =Integer.parseInt(st.nextToken());
        
        graph3 = new ArrayList[N+1];
		for(int i = 1; i <= N; i++) graph3[i] = new ArrayList<>();

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph3[u].add(v);
            graph3[v].add(u);
        }
        
		for(int i = 1; i <= N; i++) Collections.sort(graph3[i]);
		boolean[] visited = new boolean[N + 1];
		visited[r] = true;
		
		depth = new int[N+1];
		for(int i = 1; i <= N; i++) depth[i] = -1;
		depth[r] = 0;
		dfs3(r, visited, 1);
		
		for(int i = 1; i <= N; i++) System.out.println(depth[i]);
		
	}

	// 알고리즘 수업 - 깊이 우선 탐색 5
	private static long[] order;
	private static long[] depth5;
	public static void test07() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int r =Integer.parseInt(st.nextToken());
        
        graph3 = new ArrayList[N+1];
		for(int i = 1; i <= N; i++) graph3[i] = new ArrayList<>();

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph3[u].add(v);
            graph3[v].add(u);
        }
        
		for(int i = 1; i <= N; i++) Collections.sort(graph3[i]);
		boolean[] visited = new boolean[N + 1];
		visited[r] = true;
		
		order = new long[N + 1];
		cnt = 1;
		order[r] = cnt;
		depth5 = new long[N + 1];
		for(int i = 1; i <= N; i++) depth5[i] = -1;
		depth5[r] = 0;
		dfs4(r, visited, 1);
		
		long sum = 0;
		for(int i = 1; i <= N; i++) {
			sum += order[i] * depth5[i];
		}
		System.out.println(sum);
	}

	// 알고리즘 수업 - 깊이 우선 탐색 DFS Method
    public static void dfs4(int x, boolean []visited, int dep) {
		if(graph3[x].size() == 0) return;
		
		for(int i : graph3[x]) {
			if(!visited[i]) {
				visited[i] = true;
				cnt++;
				order[i] = cnt;
				depth5[i] = dep;
				dfs4(i, visited, dep+1);
			}
		}
    }
    
	// 알고리즘 수업 - 깊이 우선 탐색 6
	public static void test08() throws NumberFormatException, IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int r =Integer.parseInt(st.nextToken());
        
        graph3 = new ArrayList[N+1];
		for(int i = 1; i <= N; i++) graph3[i] = new ArrayList<>();

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph3[u].add(v);
            graph3[v].add(u);
        }
        
		for(int i = 1; i <= N; i++) Collections.sort(graph3[i], Collections.reverseOrder());
		boolean[] visited = new boolean[N + 1];
		visited[r] = true;
		
		order = new long[N + 1];
		cnt = 1;
		order[r] = cnt;
		depth5 = new long[N + 1];
		for(int i = 1; i <= N; i++) depth5[i] = -1;
		depth5[r] = 0;
		dfs4(r, visited, 1);
		
		long sum = 0;
		for(int i = 1; i <= N; i++) {
			sum += order[i] * depth5[i];
		}
		System.out.println(sum);
		
	}

	// 연결 요소의 개수
	private static int N9;
	private static int M9;
	private static boolean[][] graph9 = new boolean[1001][1001];
	private static boolean[] visited9 = new boolean[1001];
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		N9 = Integer.parseInt(st.nextToken());
		M9 = Integer.parseInt(st.nextToken());
		
		int a;
		int b;
		
		for(int i = 0; i < M9; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			graph9[a][b] = graph9[b][a] = true;
		}
        
		int result = 0 ;
		
		for(int i = 1; i <= N9; i++) {
			if(visited9[i] == false) { 
				dfs9(i);
				result++;
			}
		}
		
		System.out.println(result);
	}
	
	private static void dfs9(int index) {
		if(visited9[index]) return;
		else {
			visited9[index] = true;
			for(int i = 1; i <= N9; i++) if(graph9[index][i]) dfs9(i);
		}
	}
	
	
    
	// 숨바꼭질
	public static void test10() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        if (n == k) {
            System.out.println(0);
            return;
        }
        
        boolean[] visited = new boolean[100001];
        visited[n] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        int size = q.size();
        int count = 0;
        
        while (true) {
            count++;
            size = q.size();
            for (int i = 0; i < size; i++) {
                int x = q.remove();
                visited[x] = true;
                if (x-1 == k || x+1 == k || x*2 == k) {
                    System.out.println(count);
                    return;
                }
                if (x-1 >= 0 && !visited[x-1]) {
                    visited[x-1] = true;
                    q.add(x-1);
                }
                if (x+1 <= 100000 && !visited[x+1]) {
                    visited[x+1] = true;
                    q.add(x+1);
                }
                if (x*2 <= 100000 && !visited[x*2]) {
                    visited[x*2] = true;
                    q.add(x*2);
                }
            }
        }
	}





}
