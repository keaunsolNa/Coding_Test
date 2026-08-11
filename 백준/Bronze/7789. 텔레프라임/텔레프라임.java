import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int origin = Integer.parseInt(st.nextToken());
	   int plus = Integer.parseInt(st.nextToken());
	   
	   if(isPrime(origin)) {
		   
		   int newPhone = Integer.parseInt((plus + "" +origin));
		   
		   if(isPrime(newPhone)){
			   System.out.println("Yes");
			   return;
		   }
	   }
	   
	   System.out.println("No");
   }

   private static boolean isPrime(long n) {
		
       if(n == 1 || n == 0) return false;

       for(long i = 2; i <= Math.sqrt(n); i++) if(n % i == 0) return false;

       return true;
       
   }
}
