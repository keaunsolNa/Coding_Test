import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

   public static void test05() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int T = Integer.parseInt(br.readLine());
	   long max = 4000000007L;
	   
	   while(T --> 0) {

		   long test = Long.parseLong(br.readLine());
		   for(long i = test; i <= max; i++) {
			   
			   if(isPrime(i)) {
				   System.out.println(i);
				   break;
			   }
		   }
	   }
   }

   public static boolean isPrime(long n) {
		
	   if(n == 1 || n == 0) return false;

	   for(long i = 2; i <= Math.sqrt(n); i++) 
		   if(n%i == 0) return false;

	   return true;
        
   }
}
