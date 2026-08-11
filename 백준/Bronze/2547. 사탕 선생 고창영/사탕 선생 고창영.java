import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   br.readLine();
		   int N = Integer.parseInt(br.readLine());
		   BigInteger sum = new BigInteger("0");
		   BigInteger zero = new BigInteger("0");
		   BigInteger BN = new BigInteger(N+"");
		   for(int i = 0; i < N; i++) sum = sum.add(new BigInteger(br.readLine()));
		   BigInteger compare = sum.remainder(BN);
		   if(compare.compareTo(zero) == 0) System.out.println("YES");
		   else System.out.println("NO");
	   }
   }
}
