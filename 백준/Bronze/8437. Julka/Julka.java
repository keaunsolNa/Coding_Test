import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger A = new BigInteger(br.readLine());
		BigInteger B = new BigInteger(br.readLine());
		BigInteger two = new BigInteger("2");
		BigInteger C = (A.add(B)).divide(two);
		BigInteger D = (A.subtract(B)).divide(two);
		
		System.out.println(C);
		System.out.println(D);
		
	}
}
