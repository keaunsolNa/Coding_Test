import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	   int N = Integer.parseInt(br.readLine());
	   
	   int[] dp = new int[20001];
	   dp[0] = 1;
	   dp[1] = 1;
	   dp[2] = 2;
	   dp[3] = 6;
	   dp[4] = 4;
	   
	    
	   for (int i = 5; i <= N; i++) {

		   if (i % 5 == 0) {

			   int q = i / 5;
			   dp[i] = ((int) Math.pow(2, q % 4) * dp[q]) % 10; 

		   } else {

			   int before = (i / 5) * 5; 
			   int total = 1;

			   for (int j = i; j > before; j--) total *= (j % 10);
			   

			   total *= dp[before];
	          
			   dp[i] = total % 10;

		   }

	   }
	   
	   System.out.println(dp[N]);
	   
   }
}
