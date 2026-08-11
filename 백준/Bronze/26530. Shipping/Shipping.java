import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   int x = Integer.parseInt(br.readLine());
		   
		   Double sum = 0.0;
		   while(x --> 0) {
			   String[] input = br.readLine().split(" ");
			   
			   Double amount = Double.parseDouble(input[1]);
			   Double price = Double.parseDouble(input[2]);
			   
			   sum += amount * price;
		   }
		   
    	  System.out.print("$");
    	  System.out.printf("%.2f", sum);
    	  System.out.println();
	   }
   }
}
