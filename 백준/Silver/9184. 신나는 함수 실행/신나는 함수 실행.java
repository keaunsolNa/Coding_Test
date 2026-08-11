import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    private static int[][][] dp = new int[21][21][21];

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = "";
		
		while(!(input = br.readLine()).equals("-1 -1 -1")) {
			int[] arr = new int[3];

			arr[0] = Integer.parseInt(input.split(" ")[0]);
			arr[1] = Integer.parseInt(input.split(" ")[1]);
			arr[2] = Integer.parseInt(input.split(" ")[2]);
			
			sb.append("w(").append(arr[0] + ", " + arr[1] + ", " + arr[2] + ") = ").append(recur(arr[0], arr[1], arr[2]));
			sb.append("\n");
		}
		System.out.println(sb);
	}

	private static int recur(int a, int b, int c) {
		
		if(check(a, b, c) && dp[a][b][c] != 0) return dp[a][b][c];
		
		if(a <= 0 || b <= 0 || c <= 0) return 1;
		
		if(a > 20 || b > 20 || c > 20) return dp[20][20][20] = recur(20, 20, 20);
		
		if(a < b && b < c) return dp[a][b][c] = recur(a, b, c - 1) + recur(a, b - 1, c - 1) - recur(a, b - 1, c);
		
		return dp[a][b][c] = recur(a - 1, b, c) + recur(a - 1, b - 1, c) + recur(a - 1, b, c - 1) - recur(a - 1, b - 1, c - 1);
		
	}

	private static boolean check(int a, int b, int c) {
		return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20; 
	}

}
