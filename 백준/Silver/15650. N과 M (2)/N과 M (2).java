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
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		dfs2(1, 0);
		
		System.out.println(sb);
		
	}

	public static void dfs2(int sortTarget, int depth) {
		
		if (depth == M) {
			for (int val : arr) {
				sb.append(val).append(" ");
			}
			
			sb.append("\n");
			return;
		}
 
		for (int i = sortTarget; i <= N; i++) {
			
			arr[depth] = i;
			dfs2(i + 1, depth + 1);
		}
	}
}
