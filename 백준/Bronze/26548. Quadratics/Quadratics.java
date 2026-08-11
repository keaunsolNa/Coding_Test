import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   
		   st = new StringTokenizer(br.readLine());
		   double a = Double.parseDouble(st.nextToken());
		   double b = Double.parseDouble(st.nextToken());
		   double c = Double.parseDouble(st.nextToken());
		   
		   double x = ((b * -1) + Math.sqrt(b * b - (4 * a * c))) / (2 * a);
		   double y = ((b * -1) - Math.sqrt(b * b - (4 * a * c))) / (2 * a);
		   
		   System.out.printf("%.3f", x);
		   System.out.print(", ");
		   System.out.printf("%.3f", y);
		   System.out.println();
	   }
   }
}
