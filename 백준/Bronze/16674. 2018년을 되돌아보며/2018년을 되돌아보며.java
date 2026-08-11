import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		if(input.replaceAll("2|0|1|8", "").length() != 0) {
			System.out.println(0);
		} else {
			
			long A = countChar(input, '2');
			long B = countChar(input, '0');
			long C = countChar(input, '1');
			long D = countChar(input, '8');
			
			if(A == B && A == C && A== D) System.out.println(8);
			else if(A > 0 && B > 0 && C > 0 && D > 0) System.out.println(2);
			else System.out.println(1);
		}
	}

	public static long countChar(String str, char ch) {
		return str.chars()
				.filter(c -> c == ch)
				.count();
	}
}
