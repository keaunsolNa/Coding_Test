import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		String B = br.readLine();
		
		Long a = Long.parseLong(A, 2);
		Long b = Long.parseLong(B, 2);
		
		String sum = Long.toBinaryString(a*b);
		
		System.out.println(sum);
	}
}
