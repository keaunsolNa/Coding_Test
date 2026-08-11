import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String input = "";
	   
	   while(!(input = br.readLine()).equals("0")) {
		   while(input.length() != 1) {
			   int num = 0;
			   for(int i = 0; i < input.length(); i++) {
				   num += Character.getNumericValue(input.charAt(i));
			   }
			   input = num+"";
		   }
		   
		   System.out.println(input);
	   }
   }
}
