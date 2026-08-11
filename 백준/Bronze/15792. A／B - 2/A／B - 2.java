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
		test03();
	}

   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String[] num = br.readLine().split(" ", -1);
	   System.out.println(new BigDecimal(num[0]).divide(new BigDecimal(num[1]), 1000, BigDecimal.ROUND_HALF_UP));
   }
}
