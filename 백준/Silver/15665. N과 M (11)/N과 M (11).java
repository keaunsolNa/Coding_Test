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
	private static LinkedHashSet<String> ans2;

	public static void main(String[] args) throws IOException {
		test07();
	}

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
}
