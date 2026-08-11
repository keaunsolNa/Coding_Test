import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private static Integer[] dp;
	private static int max;
	private static int[] arr;

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		arr = new int[n];
		dp = new Integer[n];
		
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		dp[0] = arr[0];
		max = arr[0];
		
		recursion(n - 1);
		
		System.out.println(max);
	}

	private static int recursion(int n) {
		
		if(dp[n] == null) {
			dp[n] = Math.max(recursion(n - 1) + arr[n], arr[n]);
 
			max = Math.max(dp[n], max);
		}
		
		return dp[n];
	}
}
