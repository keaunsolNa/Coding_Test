import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		BigInteger input = new BigInteger("-1");
		BigInteger zero = new BigInteger("0");
		BigInteger mod = new BigInteger("42");
		
		while((input = new BigInteger(br.readLine())).compareTo(zero) != 0) {
			
			if(input.mod(mod).compareTo(zero) == 0) System.out.println("PREMIADO");
			else System.out.println("TENTE NOVAMENTE");
		}
	}
}
