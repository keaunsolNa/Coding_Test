import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	private static int ans;
	private static int list[];
	private static boolean visited[];

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		list = new int[] {1, 5, 10, 50};
		ans = 0;
		visited = new boolean[1001];
		
		dfs(N, 0, 0);
		
		System.out.println(ans);
	}

	private static void dfs(int N, int idx, int sum) {
		
	      
		if(N == 0) {
	            
			if(!visited[sum]) {
				ans++;
				visited[sum] = true;
			}

			return;
	        
		}
	    
		for (int i = idx; i < 4; i++) dfs(N - 1, i, sum + list[i]);

	}
}
