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
		test07();
	}

   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String input = "";
	   BigDecimal sum = new BigDecimal("0.0");
	   while((input = br.readLine()) != null) {
		   sum = sum.add(new BigDecimal(input));
	   }
	   System.out.printf("%.2f", sum);
   }
}
