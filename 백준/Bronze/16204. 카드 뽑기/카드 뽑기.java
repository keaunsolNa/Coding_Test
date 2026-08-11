import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());

      int N = Integer.parseInt(st.nextToken());
      int O = Integer.parseInt(st.nextToken());
      int X = N - O;
      int O2 = Integer.parseInt(st.nextToken());
      int X2 = N - O2;
      
      int O3 = Math.min(O, O2);
      int X3 = Math.min(X, X2);
      
      System.out.print( O3+X3);
      
   }
}
