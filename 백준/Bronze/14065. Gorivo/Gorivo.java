import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      double mile = Double.parseDouble(br.readLine());
      
      double A = 100.00 / ((1.609344 / 3.785411784) * mile);

      System.out.println(A);
   }
}
