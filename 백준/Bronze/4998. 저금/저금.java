import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   String input = "";
	   
	   while((input = br.readLine()) != null) {
		   st = new StringTokenizer(input);
		   
		   double n = Double.parseDouble(st.nextToken());
		   double b = Double.parseDouble(st.nextToken());
		   double m = Double.parseDouble(st.nextToken());
		   
		   int year = 0;
		   
		   while(n <= m) {
			   n += (n * (b / 100)) ;
			   year++;
		   }
		   
		   System.out.println(year);
	   }
   }
}
