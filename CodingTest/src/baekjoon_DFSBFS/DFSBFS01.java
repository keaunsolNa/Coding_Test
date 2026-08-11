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
		test01();
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
	
    private static boolean visited[];
	
      
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

	private static int[] visit;

    
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
