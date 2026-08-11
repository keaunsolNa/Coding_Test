import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	private static int round = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		test03();
	}

	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String S = br.readLine();
			int result = isPalindrome(S);
			System.out.println(result + " " + round);
			round = 0;
		}
	}

	public static int isPalindrome(String S) {
		return recursion(S, 0, S.length()-1);
	}

	public static int recursion(String s, int len, int r) {
		round++;
		if(len >= r) return 1;
		else if(s.charAt(len) != s.charAt(r)) return 0;
		else return recursion(s, len+1, r-1);
	}
}
