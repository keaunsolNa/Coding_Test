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
	   StringTokenizer st;	   
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   
		   st = new StringTokenizer(br.readLine());
		   String A = st.nextToken();
		   String B = st.nextToken();
		   
		   BigInteger a = new BigInteger(A, 2);
		   BigInteger b = new BigInteger(B, 2);
		   BigInteger sum = a.add(b);
		   
		   String result = sum.toString(2);
		   System.out.println(result);
	   }
   }
}
