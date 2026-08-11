import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String input = br.readLine();
	   
	   int sum = 0;
	   
	   sum += countChar(input, 'C')/2;
	   sum += countChar(input, 'B')/2;
	   
	   System.out.println(sum);
   }

   public static long countChar(String str, char ch) {
       return str.chars()
               .filter(c -> c == ch)
               .count();
   }
}
