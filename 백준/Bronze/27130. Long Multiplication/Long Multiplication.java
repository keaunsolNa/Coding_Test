import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   
	   BigInteger A = new BigInteger(br.readLine());
	   String B = br.readLine();
	   
	   sb.append(A + "\n");
	   sb.append(B + "\n");
	   
	   for(int i = B.length() - 1; i >= 0; i--) {
		   
		   sb.append(A.multiply(new BigInteger(B.charAt(i) + "")) + "\n");
	   }
	   
	   sb.append(A.multiply(new BigInteger(B)));
	   System.out.println(sb);
   }
}
