import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Character[] vowel = { 'a', 'e', 'i', 'o', 'u'};
		List<Character> vowelList = Arrays.asList(vowel);
		
		boolean chk;
		
		if(vowelList.contains(input.charAt(0))) {
			chk = true;
		} else {
			chk = false;
		}
		
		boolean chk2 = true;
		for(int i = 1; i < input.length(); i++) {
			if(vowelList.contains(input.charAt(i))) {
				if(chk) {
					chk2 = false;
					break;
				}
				chk = true;
			} else {
				if(!chk) {
					chk2 = false;
					break;
				}
				chk = false;
			}
			
		}
		
		if(chk2) System.out.println(1);
		else System.out.println(0);
    }
}
