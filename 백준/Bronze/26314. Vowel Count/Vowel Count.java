import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			String text = br.readLine();
			sb.append(text + "\n");
			
			
			long vowel = 0;
			vowel += countChar(text, 'a');
			vowel += countChar(text, 'e');
			vowel += countChar(text, 'i');
			vowel += countChar(text, 'o');
			vowel += countChar(text, 'u');
			
			long consonant  = text.length() - vowel;
			
			if(vowel > consonant) sb.append(1 + "\n");
			else sb.append(0 + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
		
	}

	public static long countChar(String str, char ch) {
    
		return str.chars()
				  .filter(c -> c == ch)
				  .count();
	}
}
