import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static int cnt;
    public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i = 1; i <= N; i++) arr[i - 1] = i;
		boolean[] visited = new boolean[N];
		
		comb(arr, visited, 0, N, 5);
		System.out.println(cnt);
		
	}
	
	private static void comb(int[] arr, boolean[] visited, int depth, int n, int r) {
		
		if(r == 0) { cnt++; return; }
		
		if(depth == n) return;
		
		visited[depth] = true;
		comb(arr, visited, depth + 1, n, r- 1);
		
		visited[depth] = false;
		comb(arr, visited, depth + 1, n, r);
		
	}
}