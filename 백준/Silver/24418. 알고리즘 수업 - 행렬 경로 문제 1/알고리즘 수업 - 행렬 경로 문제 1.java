import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private static Integer[] dp;

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[][] map = new int[n+1][n+1];
		int[][] dp = new int[31][31];
		
		for(int i = 1; i <= n; i++) {
		
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 1; j <= n; j++) map[i][j] = Integer.parseInt(st.nextToken());
			
		}
		
		for(int i = 0; i < 31; i++) {
			dp[i][0] = 1;
			dp[i][i] = 1;
		}
		
		for(int i = 2; i < 31; i++) {
			for(int j = 1; j < i; j++) dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
		}
		
		System.out.println(2 * dp[2 * n - 1][n] + " " + n * n);
		
	}
}
