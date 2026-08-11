import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = "";
		String[] vowel = {"a", "e", "i", "o", "u"};
		while(!(temp = br.readLine()).equals("#")) {
			int answer = 0;
			for(int i = 0; i < temp.length(); i++) {
				if(Arrays.asList(vowel).contains(temp.toLowerCase().charAt(i)+"")) {
					answer++;
				}
			}
			System.out.println(answer);
		}
	}
}
