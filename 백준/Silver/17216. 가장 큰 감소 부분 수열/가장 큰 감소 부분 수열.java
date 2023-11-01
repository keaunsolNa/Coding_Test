import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    private static Integer[] number;
    private static Integer[] dp;
    public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		number = new Integer[N + 1];
		dp = new Integer[N + 1];
		for(int i = 1; i <= N; i++) {
			number[i] = Integer.parseInt(st.nextToken());
			dp[i] = number[i];
		}
		
		int max = 0;
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j < i; j++) {
				
				if(number[i] < number[j]) dp[i] = Math.max(dp[i], dp[j] + number[i]);
			}
			max = Math.max(max, dp[i]);
		}
		
		System.out.println(max);
				
	}
}