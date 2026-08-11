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
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   
	   double yard = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
	   
	   double acre = yard / 4840.0;
	   
	   if(acre% 5 == 0) System.out.println((int)acre/5);
	   else System.out.println((int)acre/5 + 1);
   }
}
