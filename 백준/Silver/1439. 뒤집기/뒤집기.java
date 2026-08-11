import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test02();
	}

	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		char start = input.charAt(0);
		int cnt = 0;
		for(int i = 1; i < input.length(); i++) {
			
			if(input.charAt(i) != start) {
				start = input.charAt(i);
				cnt++;
			}
		}
		
		System.out.println((cnt + 1)/2);
	}
}
