import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String number = br.readLine();
		
		number = number.substring(0, 3);

		if(number.equals("555")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
