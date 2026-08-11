import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   boolean[] prime = new boolean[1000001];

	   if(N <= 3) {
		   System.out.println(6);
		   System.exit(0);
	   }
	   
	   for(int i = 2; i < prime.length; i++) {
		   if(isPrime(i)) prime[i] = true;
	   }
	   
	   for(int i = 2; i < N; i++) {
		   
		   if(!prime[i]) continue;
		   for(int j = i + 1; j < N; j++) {
			   
			   if(!prime[j]) continue;
			   
			   if(i * j <= N) break;
			   
			   System.out.println(i * j);
			   return;
		   }
	   }
   }

   private static boolean isPrime(long n) {
		
       if(n == 1 || n == 0) return false;

       for(long i = 2; i <= Math.sqrt(n); i++) if(n % i == 0) return false;

       return true;
       
   }
}
