import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] A = br.readLine().split(" ");

		int sum = 0;
		for(int i = 0; i < A.length; i++) {
			sum += Integer.parseInt(A[i]);
		}
		
		System.out.println(sum*5);
	}
}
