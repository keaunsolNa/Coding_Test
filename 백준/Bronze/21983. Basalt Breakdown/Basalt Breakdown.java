import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      float N = Float.parseFloat(br.readLine());
      double X = Math.sqrt((2 * N) / (3 * Math.sqrt(3)));
      
      System.out.printf("%.8f", X * 6);
   }
}
