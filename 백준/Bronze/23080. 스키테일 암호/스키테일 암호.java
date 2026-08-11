import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		String S = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < S.length(); i++) {
			if(i % K == 0) {
				sb.append(S.charAt(i));
			}
		}
		
		System.out.println(sb);
		
	}
}
