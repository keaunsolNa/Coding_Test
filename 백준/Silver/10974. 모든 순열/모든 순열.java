import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {

	private static int N;
	private static Integer arr[];
	private static boolean visited[];
	private static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
        arr = new Integer[N];
        visited = new boolean[N];
        
        dfs9(0);
        
        System.out.println(sb);
	}

	private static void dfs9(int depth) {
		
		if(depth == N) {
			for(int i = 0; i < N; i++)
				sb.append(arr[i] + " ");
			
			sb.append("\n");
		}
		
		for(int i = 0; i < N; i++) {
			if(visited[i]) continue;
			
			arr[depth] = i + 1;
			visited[i] = true;
			dfs9(depth + 1);
			visited[i] = false;
		}
	}
}
