import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
      
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   double percent = Double.parseDouble(br.readLine());
	   System.out.printf("%.10f", (100/percent));
	   System.out.println();
	   System.out.printf("%.10f", (100/(100-percent)));
   }
}
