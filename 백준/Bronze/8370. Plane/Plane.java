import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N1 = Integer.parseInt(st.nextToken());
		int K1 = Integer.parseInt(st.nextToken());
		int N2 = Integer.parseInt(st.nextToken());
		int K2 = Integer.parseInt(st.nextToken());
		
		System.out.println((N1*K1) + (N2*K2));
	}
}
