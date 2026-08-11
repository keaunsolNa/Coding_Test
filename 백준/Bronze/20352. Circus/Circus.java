import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       BigDecimal tentArea = new BigDecimal(br.readLine());

       double tentPerimeter = tentArea
               .multiply(BigDecimal.valueOf(Math.PI))
               .multiply(BigDecimal.valueOf(4))
               .sqrt(new MathContext(12)).doubleValue();

       System.out.println(tentPerimeter);
       
   }
}
