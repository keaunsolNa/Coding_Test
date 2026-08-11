import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   long A = Long.parseLong(br.readLine());
	   long B = Long.parseLong(br.readLine());
	   
	   if(A == 1 || B == 1) {
		   System.out.println(Math.max(A, B));
	   } else {
		   System.out.println((A * 2) + ((B - 2) * 2));
	   }
   }
}
