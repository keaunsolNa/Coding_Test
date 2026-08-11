import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test01();
	}

	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger number = new BigInteger(br.readLine());
		BigInteger seven = new BigInteger("7");
		BigInteger zero = new BigInteger("0");
		BigInteger two = new BigInteger("2");
				
		if(number.mod(seven).compareTo(zero) == 0 || number.mod(seven).compareTo(two) == 0) System.out.println("CY");
		else System.out.println("SK");
		
	}
}
