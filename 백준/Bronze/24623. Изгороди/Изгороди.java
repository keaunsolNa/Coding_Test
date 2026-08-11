import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      double A = Integer.parseInt(br.readLine());
      
      double D1 = (180 - A) / 2;
      double D2 = A / 2;
      System.out.println(Math.round(D1 + D2));
   }
}
