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
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   int N = Integer.parseInt(br.readLine());
		   int NLength = (N+"").length();
		   String pow = (int)Math.pow(N, 2) + "";
		   
		   String x = pow.substring(pow.length() - NLength, pow.length());

		   if(x.equals(N+"")) {
			   System.out.println("YES");
		   } else {
			   System.out.println("NO");
		   }
	   }
	   
   }
}
