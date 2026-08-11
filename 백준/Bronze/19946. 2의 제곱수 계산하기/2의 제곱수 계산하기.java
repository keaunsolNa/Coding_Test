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
	   
	   float bigNumber = Float.parseFloat(br.readLine());
	   int cnt = 0;
	   while(bigNumber % 2 == 0) {
		   
		   bigNumber = (bigNumber)/2;
		   cnt++;
	   }
	   
	   System.out.println(cnt);
   }
}
