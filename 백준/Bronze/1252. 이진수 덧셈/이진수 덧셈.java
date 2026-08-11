import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   String A = st.nextToken();
	   String B = st.nextToken();
	   
	   BigInteger A_binary = new BigInteger(A, 2);
	   BigInteger B_binary = new BigInteger(B, 2);  
	   
	   BigInteger sum = A_binary.add(B_binary);
	   String sum_binary = sum.toString(2);
		
	   System.out.println(sum_binary);
   }
}
