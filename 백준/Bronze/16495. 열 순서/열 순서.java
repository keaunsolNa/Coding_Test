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

	   String input = br.readLine();
	   long ans = 0;
	   for(int i = 0; i < input.length(); i++) {
		   
		   ans *= 26;
		   ans += input.charAt(i) - 'A' + 1;
	   }
	   
	   System.out.println(ans);
   }
}
