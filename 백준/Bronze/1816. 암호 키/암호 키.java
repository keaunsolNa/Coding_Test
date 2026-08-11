import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   private static boolean[] isPrime;

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());	   
	   sieve(1000001);
	   
	   for(int i = 0; i < N; i++) {
		   
		   long S = Long.parseLong(br.readLine());
		   boolean chk = true;
		   
		   for(int j = 2; j < 1000001; j++) {
			   if(isPrime[j] && S % j == 0) {
				   chk = false;
			   }
		   }
		   
		   System.out.println(chk ? "YES" : "NO");
	   }
   }

   private static void sieve(int N) {
		
	   isPrime = new boolean[N + 1];
	   Arrays.fill(isPrime, true);
	   isPrime[0] = false;
	   isPrime[1] = false;

	   for (int i = 2; i * i <= N; i++) {
		   if (isPrime[i]) {
			   for (int j = 2 * i; j < N + 1; j += i) {
				   isPrime[j] = false;
			   }
		   }
	   }
   }
}
