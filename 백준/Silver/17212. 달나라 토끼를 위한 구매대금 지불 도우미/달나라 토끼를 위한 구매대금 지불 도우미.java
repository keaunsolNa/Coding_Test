import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test02();
	}

	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[N + 1];
		int[] coin = new int[] {1, 2, 5, 7};
		Arrays.fill(dp, 100001);
		
		dp[0] = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < 4; j++) {
            	
                if (i - coin[j] < 0) continue;
                dp[i] = Math.min(dp[i], dp[i - coin[j]] + 1);
                
            }
        }
        
        System.out.print(dp[N]);
		
	}
}
