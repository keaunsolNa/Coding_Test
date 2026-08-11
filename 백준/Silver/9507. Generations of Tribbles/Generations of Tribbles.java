import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private static Integer[] dp;

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T  = Integer.parseInt(br.readLine());
		
		while(T -- > 0) {
			int n = Integer.parseInt(br.readLine());
			
			if(n <= 3) {
				if(n < 2) System.out.println(1);
				else if(n == 2) System.out.println(2);
				else if(n == 3) System.out.println(4);
			} else {
				long dp[] = new long[n + 1];
				dp[0] = 1;
				dp[1] = 1;
				dp[2] = 2;
				dp[3] = 4;
				for(int i = 4; i <= n; i++) dp[i] = dp[i-1] + dp[i-2] + dp[i-3] + dp[i-4];

				System.out.println(dp[n]);
			}
		}
		
	}
}
