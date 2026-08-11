import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	private static long[] dp;
	private static int n;

	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		if(n == 1) {
			System.out.println(0);
			System.exit(0);
		}
		dp = new long[n+1];
		
		System.out.println(solution2());
		
	}

    private static long solution2() {
    	
        dp[2] = 2;
        for (int i = 3; i <= n; i++) dp[i] = (dp[i-1] * 3) % 1000000009;
        return dp[n];
    }
}
