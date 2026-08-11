import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   double pre = Double.parseDouble(br.readLine());
	   double input = 0;
	   while((input = Double.parseDouble(br.readLine())) != 999) {
		   System.out.printf("%.2f", input - pre);
		   System.out.println();
		   pre = input;
	   }
   }
}
