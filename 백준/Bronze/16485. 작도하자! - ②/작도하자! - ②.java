import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      double c = Double.parseDouble(st.nextToken());
      double b = Double.parseDouble(st.nextToken());
      
      if(c%b == 0) System.out.println((int)c/b);
      else System.out.printf("%.10f", c/b);
      
   }
}
