import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private static Integer[] dp;
	private static int max;
	private static int[] arr;

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		while(T --> 0) {
			
			int max = Integer.MIN_VALUE;;
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), " ");
			int arr[] = new int[N + 1];
			int dp[] = new int[N + 1];
		
			for(int i = 1; i <= N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				dp[i] = dp[i-1] + arr[i];
				max = Math.max(max, Math.max(arr[i], dp[i]));
			}
            
			for (int i = 1; i <= N; i++) for (int j = N; j > i; j--) max = Math.max(max, dp[j] - dp[i]);
			
			System.out.println(max);
		}
		
	}
}
