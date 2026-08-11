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
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   
	   int K = Integer.parseInt(br.readLine());
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   double D1 = Integer.parseInt(st.nextToken());
	   double D2 = Integer.parseInt(st.nextToken());
	   
	   double x = K * K - ((D2 - D1) / 2) * ((D2 - D1) / 2);
	   
	   System.out.println(x);
   }
}
