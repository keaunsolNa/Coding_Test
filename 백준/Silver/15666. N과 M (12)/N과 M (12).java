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
	private static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		test08();
	}

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
}
