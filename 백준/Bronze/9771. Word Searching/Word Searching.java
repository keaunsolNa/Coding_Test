import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		int wordLength = word.length();
		
		String input = "";
		
		int count = 0;
		while((input = br.readLine()) != null) {
			
			if(input.contains(word)) {
				
				int inputLength = input.length();
				input = input.replaceAll(word, "");
				count += (inputLength - input.length()) / wordLength;
				
			} else continue;
		}
		
		System.out.println(count);
	}
}
