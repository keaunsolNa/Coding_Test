import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      String input = br.readLine();
      int total = 0;
      for(int i = 0; i < input.length(); i++) {
    	  int temp = Character.getNumericValue(input.charAt(i));
    	  
    	  total += Math.pow(temp, 5);
      }
      System.out.println(total);
   }
}
