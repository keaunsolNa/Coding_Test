import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {

	private static int N;
	private static int M;
	private static Integer arr[];
	private static int ans[];
	private static boolean visited[];
	private static StringBuilder sb = new StringBuilder();
	private static LinkedHashSet<String> ans2;

	public static void main(String[] args) throws IOException {
		test06();
	}

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
}
