import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private static int[] arr;
	private static int N;
	private static int M;
	private static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		dfs4(1, 0);
		
		System.out.println(sb);
	}

	public static void dfs4(int sorted, int depth) {
		
		if (depth == M) {
			for (int val : arr) {
				sb.append(val).append(" ");
			}
			
			sb.append("\n");
			return;
		}
 
		for (int i = sorted; i <= N; i++) {
			arr[depth] = i;
			dfs4(i, depth + 1);
		}
	}
}
