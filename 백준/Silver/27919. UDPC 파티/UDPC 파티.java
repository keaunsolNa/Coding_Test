import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		long U = countChar(input, 'U');
		long D = countChar(input, 'D');
		long P = countChar(input, 'P');
		long C = countChar(input, 'C');

		String answer = "";
		if(C + U > (D + P + 1) / 2) answer += "U";
		if(D + P > 0) answer += "DP";
		
		System.out.println(answer);
		
	}

	private static long countChar(String str, char ch) {
		return str.chars()
				.filter(c -> c == ch)
				.count();

	}
}
