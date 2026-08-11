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
		test03();
	}

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
}
