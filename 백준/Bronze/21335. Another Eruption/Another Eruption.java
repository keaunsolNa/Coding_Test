import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

   public static void test09() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      double S = Double.parseDouble(br.readLine());
      double perimeter = (double) Math.round(Math.sqrt(S * Math.PI) * 2 * 1000000000) / 1000000000;
      System.out.println(perimeter);
   }
}
