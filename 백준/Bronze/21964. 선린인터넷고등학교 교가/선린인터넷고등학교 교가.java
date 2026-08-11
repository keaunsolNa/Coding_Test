import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		String str = br.readLine();

		StringBuilder sb = new StringBuilder();
		
		for(int i = 5; i > 0; i--) {
			sb.append(str.charAt(str.length()-i));
		}
		System.out.println(sb);
	}
}
