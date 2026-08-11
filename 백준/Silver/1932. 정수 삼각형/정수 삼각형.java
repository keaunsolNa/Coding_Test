import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    private static int[][][] dp = new int[21][21][21];
	private static int max;
	private static int n;
	private static int[][] map;
	private static Integer[][] dp3;

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		dp3 = new Integer[n][n];
		
		for(int i = 0; i < n; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			// 초기 값 셋팅
			for(int j = 0; j < i + 1; j++) map[i][j] = Integer.parseInt(st.nextToken());
			
		}
		
		// 가장 아래쪽 dp 배열 셋팅
		for(int i = 0; i < n; i++) dp3[n-1][i] = map[n-1][i];

		System.out.println(recur(0, 0));
	}

	private static int recur(int depth, int idx) {
		
		// 깊이가 최상단에 올라오면 return
		if(depth == n - 1) return dp3[depth][idx];
		
		// 탐색하지 않은 값일 때
		if(dp3[depth][idx] == null) {
		
			// dp값은 바로 아래 값과 오른쪽 대각선 값 중 하나를 더한 값 중 max 값.
			dp3[depth][idx] = Math.max(recur(depth + 1, idx), recur(depth + 1, idx + 1)) + map[depth][idx];
			
		}
		
		return dp3[depth][idx];
	}
}
