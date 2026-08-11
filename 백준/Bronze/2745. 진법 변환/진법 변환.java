import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String input = st.nextToken();
		int binary = Integer.parseInt(st.nextToken());
		
		System.out.println(binaryParse(input, binary));
	}

	public static String binaryParse(String input, int binary) {
		
		return new BigInteger(input, binary).toString();
	}
}
