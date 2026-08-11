import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String input = "";
       
       while(!(input = br.readLine()).equals("0")) {
    	   int sum = 0;
    	   for(int i = 0; i < input.length(); i++)  sum += Character.getNumericValue(input.charAt(i)) * factorial(input.length() - i);
    	   System.out.println(sum);
       }
       
       
   }

   public static int factorial(int n) {
		
	   if(n < 2) return 1;
	   return n*factorial(n-1);
   }
}
