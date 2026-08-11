import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int N = Integer.parseInt(br.readLine());
	   
	   
	   for(long i = N; ; i++) {
		   if(!isPrime(i)) continue;
		   if(!isPalindrome(i)) continue;
		   
		   
		   System.out.println(i);
		   return;
	   }
   }

   private static boolean isPrime(long n) {
		
       if(n == 1 || n == 0) return false;

       for(long i = 2; i <= Math.sqrt(n); i++) if(n % i == 0) return false;

       return true;
       
   }

   public static boolean isPalindrome(long num) {

	   long n = num;
	   long rev = 0;

       while (n > 0) {
    	   
    	   long r = n % 10;
           rev = rev * 10 + r;
           n = n / 10;
           
       }

       return (num == rev);

   }
}
