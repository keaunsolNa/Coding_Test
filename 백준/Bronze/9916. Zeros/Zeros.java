import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String fac = String.valueOf(factorial(N));
		
		int ans = 0;
		for(int i = 0; i < fac.length(); i++) {
			if(fac.charAt(i) == '0') ans++;
		}
		
		System.out.println(ans);
        
	}

   private static BigInteger factorial(int n) {
	   
	    if(n == 0 || n == 1) return BigInteger.ONE;
	    
	    BigInteger result = BigInteger.valueOf(n);
	    for(int i = n; i >= 2; i--)  result = result.multiply(BigInteger.valueOf(i - 1));
	    return result;
	}
}
