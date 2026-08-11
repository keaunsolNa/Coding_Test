import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      double L = Integer.parseInt(br.readLine());
      
      double area = (Math.sqrt(3) / 4) * Math.pow(L, 2);
      
      System.out.println(area);
      
   }
}
