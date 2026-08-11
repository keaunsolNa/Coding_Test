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
		test02();
	}

   public static void test02() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      double H = Double.parseDouble(st.nextToken());
      double W = Double.parseDouble(st.nextToken());
      double N = Double.parseDouble(st.nextToken());
      double M = Double.parseDouble(st.nextToken());
      double col = Math.ceil(H / (N + 1));
      double row = Math.ceil(W / (M + 1));
      System.out.println((int) (col * row));
   }
}
