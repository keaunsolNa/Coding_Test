import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] dp = new int[200000];
		int min = 0;
		for(int i = 0; i < N; i++) {
			
			int temp = Integer.parseInt(st.nextToken());
			
			if(i == 0) { dp[0] = 0; min = temp; }
			else  { if(temp < min) min = temp; dp[i] = (temp - min) > dp[i - 1] ? temp - min : dp[i - 1]; }
			
			System.out.print(dp[i] + " ");
		}
	}
}
