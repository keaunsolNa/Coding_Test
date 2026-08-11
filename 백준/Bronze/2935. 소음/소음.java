import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger A = new BigInteger(br.readLine());
		String operator = br.readLine();
		BigInteger B = new BigInteger(br.readLine());
		
		switch(operator){
			case "*" : 
				System.out.println(A.multiply(B));
				break;
			case "+" :
				System.out.println(A.add(B));
				break;
		}
	}
}
