import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {


    private static Integer[] house;
	private static Integer[] dp;
    public static void main(String[] args) throws IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 0; t < T; t++) {
			
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			house = new Integer[N];
			dp = new Integer[N];
			for(int i = 0; i < N; i++) house[i] = Integer.parseInt(st.nextToken());
			
			for(int i = 0; i < N; i++) solve(i);
			
			int ans = Integer.MIN_VALUE;
			for(int i : dp) if(ans < i) ans = i;
			
			System.out.println("Case #" + (t + 1) + ": " + (N - ans));
				
		}
	}

	private static int solve(int n) {
		
		if(dp[n] == null) {
			
			dp[n] = 1;
			
			for(int i = n - 1; i >= 0; i--) 
				if(house[i] < house[n]) dp[n] = Math.max(dp[n], solve(i) + 1);
				
		}
		
		return dp[n];
	}
}