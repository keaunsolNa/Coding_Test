package baekjoon_Competition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnimeCup {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test01();
	}
	
	// A번 - :chino_shock:
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		long ans = 0;
		long length = input.length();
		long colne = countChar(input, ':');
		long undervar = countChar(input, '_');
		
		ans = length + colne + undervar * 5;
		System.out.println(ans);
	}
	
	   
	public static long countChar(String str, char ch) {
		return str.chars()
				.filter(c -> c == ch)
				.count();
	}
	   
}
