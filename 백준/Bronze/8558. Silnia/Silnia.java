import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   
	   if(N < 4) {
		   System.out.println(factorial(N));
	   } else if(N == 4) {
		   System.out.println(4);
	   } else {
		   System.out.println(0);
	   }
   }

   public static int factorial(int n) {
		
	   if(n < 2) return 1;
	   return n*factorial(n-1);
	
   }
}
