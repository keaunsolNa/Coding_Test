import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String A = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		for(int i = A.length()-1; i >= 0; i--) {
			if(cnt%3 == 0 && i != A.length()-1) {
				sb.append(",").append(A.charAt(i));
			} else {
				sb.append(A.charAt(i));
			}
			cnt++;
		}

		System.out.println(sb.reverse());
	}
}
