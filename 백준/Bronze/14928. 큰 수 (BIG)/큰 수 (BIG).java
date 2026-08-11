import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		long temp = 0;
        for (int i = 0; i < N.length(); i++) {
            temp = (temp * 10 + (N.charAt(i) - '0')) % 20000303;
        }
		
        System.out.println(temp);
	}
}
