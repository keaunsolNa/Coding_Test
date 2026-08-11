import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private static Integer[] dp;

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException{
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        while(T --> 0) {
	        int N = Integer.parseInt(br.readLine());
	        long dp[] = new long[101];
	        
	        dp[0] = 1;
	        dp[1] = 1;
	        dp[2] = 1;
	        
	        for(int i = 3; i <= N; i++) {
	        	dp[i] = dp[i-2] + dp[i-3];
	        }
	        		
	        System.out.println(dp[N-1]);
        }
        		
	}
}
