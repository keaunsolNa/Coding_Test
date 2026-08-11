import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int N = Integer.parseInt(br.readLine());
	   
	   int target = Integer.parseInt(br.readLine());
	   for(int i = 1; i < N; i++) {
		   
		   int number = Integer.parseInt(br.readLine());
		   
		   if(number % target == 0) {
			   sb.append(number + "\n");
			   target = Integer.parseInt(br.readLine());
			   i++;
		   }
		   
	   }
	   
	   System.out.println(sb);
   }
}
