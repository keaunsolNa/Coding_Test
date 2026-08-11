import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   long N = Long.parseLong(st.nextToken());
	   long P = Long.parseLong(st.nextToken());
	   
	   System.out.println(factorial(N, P));
	   
   }

   private static long factorial(long N, long P) {
		
	   long result = 1;

	   for (long i = 1; i <= N; i++) {

		   result = result * i;
		   result = result % P;
	   }
	 
	   return result;

   }
}
