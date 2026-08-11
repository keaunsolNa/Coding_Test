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

	public static void main(String[] args) throws IOException {
		test02();
	}

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
}
