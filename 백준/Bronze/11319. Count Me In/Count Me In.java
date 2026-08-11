import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		String[] vowel = {"a", "e", "i", "o", "u"};
		for(int i = 0; i < T; i++) {
			String str = br.readLine().toLowerCase().replaceAll(" ", "");

			long vowelLength = countArrChar(str, vowel);
			
			System.out.println(str.length() - vowelLength + " " + vowelLength);
		}
	}

    public static long countArrChar(String str, String[] ch) {
    	long temp = 0;
    	
    	for(int i = 0; i < ch.length; i++) {
    		char cr = ch[i].charAt(0);
    		temp += str.chars()
    				.filter(c -> c == cr)
    				.count();
    	}
    	
    	return temp;
    }
}
