import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		for(int i = 1; i < input.length(); i++) {
			
			if(isPalindrome(input.substring(0, i)) && isPalindrome(input.substring(i, input.length()))) {
				System.out.println(input.substring(0, i) + " " + input.substring(i, input.length()));
				return;
			}
		}
		
		System.out.println("NO");
	}

    private static boolean isPalindrome(String word) {
        for (int i = 0; i < (word.length() / 2); i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
