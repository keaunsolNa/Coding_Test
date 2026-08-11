import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       double input = -0;
       
       while((input = Double.parseDouble(br.readLine())) != 0) {
    	   System.out.printf("%.2f%n", Math.pow(input, 4) + Math.pow(input, 3) + Math.pow(input, 2) + input + 1);
       }
       
   }
}
