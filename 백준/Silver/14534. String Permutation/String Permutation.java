import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {

	private static int N;
	private static boolean visited[];
	private static StringBuilder sb = new StringBuilder();
	private static Character[] str;
	private static String input;

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i < T + 1; i++) {
			input = br.readLine();
			
			N = input.length();
			str = new Character[input.length()];
			visited = new boolean[input.length()];
			sb = new StringBuilder();
			
			sb.append("Case # " + i + ":" +"\n");
			dfs10(0);
			System.out.print(sb);
		}
	}

	private static void dfs10(int depth) {
		
		if(depth == N) {
			for(int i = 0; i < N; i++)
				sb.append(str[i]);
			
			sb.append("\n");
		}
		
		for(int i = 0; i < N; i++) {
			if(visited[i]) continue;
			
			str[depth] = input.charAt(i);
			visited[i] = true;
			dfs10(depth + 1);
			visited[i] = false;
		}
	}
}
