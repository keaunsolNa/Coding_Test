import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

   public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		
		if(A.compareTo(BigInteger.ZERO) == -1 && B.compareTo(BigInteger.ZERO) == -1) {
			
			System.out.println((A.divide(B)).add(BigInteger.ONE));
			System.out.println((A.remainder(B)).subtract(B));
			
		} else if(A.compareTo(BigInteger.ZERO) == -1 && B.compareTo(BigInteger.ZERO) == 1){
			
			System.out.println((A.divide(B)).subtract(BigInteger.ONE));
			System.out.println((A.remainder(B)).add(B));
			
		} else {
			
			System.out.println(A.divide(B));
			System.out.println(A.remainder(B));
			
		}
   }
}
