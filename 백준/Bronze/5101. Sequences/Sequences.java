import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   while(true) {
		   st = new StringTokenizer(br.readLine());
		   
		   double a = Double.parseDouble(st.nextToken());
		   double b = Double.parseDouble(st.nextToken());
		   double c = Double.parseDouble(st.nextToken());
		   
		   if(a == 0 && b == 0 && c == 0) break;
			
		   if((c - a) % b == 0 && (c - a) / b >= 0) {
			   System.out.println((int)(Math.abs((c - a) / b) + 1)); 
			   continue;
		   }

		   else System.out.println("X");
	   }
   }
}
