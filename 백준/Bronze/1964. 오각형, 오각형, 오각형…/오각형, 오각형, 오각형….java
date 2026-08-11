import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   long[] dp = new long[N + 1];
	   
	   dp[0] = 5;
	   dp[1] = 12;
	   dp[2] = 22;
	   dp[3] = 35;
	   
	   int idx = 0;
	   for(int i = 1; i < N; i++) {
		   dp[i] = dp[i - 1] + 7 + idx;
		   idx += 3;
	   }
	   
	   System.out.println(dp[N - 1] % 45678);
   }
}
