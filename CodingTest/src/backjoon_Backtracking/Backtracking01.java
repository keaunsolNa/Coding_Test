package backjoon_Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Backtracking01 {
	
	public static void main(String[] args) throws IOException {
		test08();
	}
	
	// N과 M (5) (15654)
	private static int N;
	private static int M;
	private static Integer arr[];
	private static int ans[];
	private static boolean visited[];
	private static StringBuilder sb = new StringBuilder();
	private static LinkedHashSet<String> ans2;
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new Integer[N];
        ans = new int[N];
        visited = new boolean[N];
        
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		dfs(0);
		System.out.println(sb);
		
	}
	
	// N과 M(5) DFS Method
    public static void dfs(int depth) {
    	
        if (depth == M) {
            for (int i = 0; i < M; i++) sb.append(ans[i] + " ");
            sb.append("\n");
            return;
        }
        
        for (int i = 0; i < N; i++){
        	
            if (!visited[i]) {
            	
                visited[i] = true;
                ans[depth] = arr[i];
                dfs(depth + 1);
                visited[i] = false;
                
            }
        }
    }
	
	// N과 M (6)  (15655)
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new Integer[N];
        ans = new int[M];
        visited = new boolean[N + 1];
        
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		dfs2(0, 0);
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
		
	}
	
	// N과 M(6) DFS Method
    public static void dfs2(int start, int depth) {
    	
        if (depth == M) {
        	
            for (int i = 0; i < M; i++) sb.append(ans[i] + " ");
            sb.append("\n");
            
        } else {
        	
        	for (int i = start; i < N; i++){
        		
        		if (!visited[i]) {
        			
        			visited[i] = true;
        			ans[depth] = arr[i];
        			dfs2(i + 1, depth + 1);
        			visited[i] = false;
        			
        		}
        	}
        }
        
    }
    
	// N과 M (7) (15656)
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new Integer[N];
        ans = new int[N];
        visited = new boolean[N];
        
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		dfs3(0);
		System.out.println(sb);
	}	
	
	// N과 M(7) DFS Method
    public static void dfs3(int depth) {
    	
        if (depth == M) {
            for (int i = 0; i < M; i++) sb.append(ans[i] + " ");
            sb.append("\n");
            return;
        }
        
        for (int i = 0; i < N; i++){
    			
			ans[depth] = arr[i];
			dfs3(depth + 1);
    			
        }
    }
    
	// N과 M (8) (15657)
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new Integer[N];
        ans = new int[N];
        visited = new boolean[N];
        
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		dfs4(0, 0);
		System.out.println(sb);
	}
	
	// N과 M(8) DFS Method
    public static void dfs4(int start, int depth) {
    	
        if (depth == M) {
        	
            for (int i = 0; i < M; i++) sb.append(ans[i] + " ");
            sb.append("\n");
            return;
        } 
        
    	for (int i = start; i < N; i++){
    		
			ans[depth] = arr[i];
			dfs4(i, depth + 1);
			
    	}
    }
	
	// N과 M (9) (15663)
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new Integer[N];
        ans = new int[M];
        visited = new boolean[N];
        ans2 = new LinkedHashSet<>();
        
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		dfs5(0);
        ans2.forEach(System.out::println);
	}
	
	// N과 M(9) DFS Method
    private static void dfs5(int depth) {
    	
        if (depth == M) {
        	
            sb = new StringBuilder();
            for (int p : ans) sb.append(p).append(" ");
            ans2.add(sb.toString());
            return;
            
        }

        for (int i = 0; i < N; i++) {
        	
            if (visited[i]) continue;
            
            visited[i] = true;
            ans[depth] = arr[i];
            dfs5(depth + 1);
            visited[i] = false;
            
        }
    }
    
	// N과 M (10) (15664)
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new Integer[N];
        ans = new int[M];
        visited = new boolean[N];
        ans2 = new LinkedHashSet<>();
        
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		dfs6(0, 0);
        ans2.forEach(System.out::println);
	}
	
	// N과 M(10) DFS Method
    private static void dfs6(int start, int depth) {
    	
        if (depth == M) {
        	
            sb = new StringBuilder();
            for (int p : ans) sb.append(p).append(" ");
            ans2.add(sb.toString());
            return;
            
        }

        int before = -1;
        for (int i = start; i < N; i++) {
        	
        	int now = arr[i];
            if (before == now || visited[i]) continue;
            else {
            	
            	before = now;
            	visited[i] = true;
            	ans[depth] = arr[i];
            	dfs6(i + 1, depth + 1);
            	visited[i] = false;
            }
            
            
        }
    }
    
	// N과 M (11) (15665) 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new Integer[N];
        ans = new int[M];
        ans2 = new LinkedHashSet<>();
        
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		dfs7(0);
        ans2.forEach(System.out::println);
	}
	
	// N과 M(11) DFS Method 
    private static void dfs7(int depth) {
    	
        if (depth == M) {
        	
            sb = new StringBuilder();
            for (int p : ans) sb.append(p).append(" ");
            ans2.add(sb.toString());
            return;
            
        }

        for (int i = 0; i < N; i++) {
        	
            ans[depth] = arr[i];
            dfs7(depth + 1);
            
        }
    }
    
	//  N과 M (12) (15666)
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new Integer[N];
        ans = new int[M];
        
        st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		dfs8(0, 0);
		System.out.println(sb);
	}
	
	// N과 M(12) DFS Method 
	private static void dfs8(int start, int depth) {
	
        if (depth == M) {
        	
        	for (int i = 0; i < M; i++) 
				sb.append(ans[i] + " ");
            
            sb.append("\n");
            
        }
        
        else {
        	
        	int num = 0;
        	for (int i = start; i < N; i++) {
        		
	    		if (num == arr[i]) continue;
	    		
	    		ans[depth] = arr[i];
	    		dfs8(i, depth + 1);
	    		num = arr[i];
	    		
        	}
        	
    	}
            
	}
	
	//  
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
	}
	
	//  
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
	}
	
	
	
}
