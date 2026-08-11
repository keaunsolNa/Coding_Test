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
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		char[] plainText = br.readLine().toCharArray();
		char[] key = br.readLine().toCharArray();

		for(int i = 0; i < plainText.length; i++) {
			
			if(plainText[i] == ' ') {
				sb.append(" ");
				continue;
			}
			int move = key[i % key.length] - 'a' + 1;
			int plain = plainText[i];

			if(plain - move < 97) {
				sb.append((char)(plain - move + 26));
			} else sb.append((char)(plain - move));
		}
		
		System.out.println(sb);
	}
}
