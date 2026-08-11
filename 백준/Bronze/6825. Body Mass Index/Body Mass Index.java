import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   double w = Double.parseDouble(br.readLine());
	   double h = Double.parseDouble(br.readLine());
	   
	   double bmi = w/(h*h);
	   
	   if(bmi > 25) {
		   System.out.println("Overweight");
	   } else if(bmi > 18.5) {
		   System.out.println("Normal weight");
	   } else {
		   System.out.println("Underweight");
	   }
	   	
   }
}
