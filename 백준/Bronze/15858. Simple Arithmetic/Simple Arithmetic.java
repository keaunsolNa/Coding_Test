import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	
	   BigDecimal A = new BigDecimal(st.nextToken());
	   BigDecimal B = new BigDecimal(st.nextToken());
	   BigDecimal C = new BigDecimal(st.nextToken());
	   
	   System.out.print(A.multiply(B).divide(C, MathContext.DECIMAL128));
   }
}
