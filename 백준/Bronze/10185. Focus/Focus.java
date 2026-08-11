import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   StringBuilder sb = new StringBuilder();
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   st = new StringTokenizer(br.readLine());
		   double p = Integer.parseInt(st.nextToken());
		   double q = Integer.parseInt(st.nextToken());
		   
		   double c = 1 / (1.0 / p + 1.0 / q);
		   
		   System.out.print("f = ");
		   System.out.printf("%.1f", c);
		   System.out.println();
	   }
   }
}
