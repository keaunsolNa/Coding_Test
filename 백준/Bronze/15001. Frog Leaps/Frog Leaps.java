import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   StringBuilder sb = new StringBuilder();
	   int N = Integer.parseInt(br.readLine());
	   
	   long start = Integer.parseInt(br.readLine());
	   N--;
	   
	   long totalD = 0;
	   while(N -- > 0) {
		   
		   long x = Integer.parseInt(br.readLine());
		   
		   totalD += ((x - start) * (x - start));
		   
		   start = x;
	   }
	   
	   System.out.println(totalD);
   }
}
