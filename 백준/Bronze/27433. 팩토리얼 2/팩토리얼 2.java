import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   long N = Integer.parseInt(br.readLine());
	   
	   System.out.println(factorial(N));
   }

   public static long factorial(long n) {
		
	   if(n < 2) return 1;
	   return n * factorial(n - 1);
	
   }
}
