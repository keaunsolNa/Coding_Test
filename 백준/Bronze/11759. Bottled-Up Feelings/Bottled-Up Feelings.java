import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int s = Integer.parseInt(st.nextToken());
	   int v1 = Integer.parseInt(st.nextToken());
	   int v2 = Integer.parseInt(st.nextToken());
	
	   for(int i = s / v1; i >= 0; i--) {
		   
		   if((s - (v1 * i)) % v2 == 0) {
			   System.out.println(i + " " + ((s - (v1 * i)) / v2));
			   return;
		   }
	   }
	   
	   System.out.println("Impossible");
   }
}
