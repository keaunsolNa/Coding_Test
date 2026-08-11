import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	private static int sum;
	private static String input;

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		sum = 0;

		input = br.readLine();
		remove();
		sum += makeInt(input);
		
		input = br.readLine();
		remove();
		sum += makeInt(input);
		
		System.out.println(sum);
		
		StringBuilder ans = new StringBuilder();
		
		while(sum >= 1000) {
			sum -= 1000;
			ans.append("M");
		}
		
		if(sum >= 900) {
			ans.append("CM");
			sum -= 900;
		}

		if(sum >= 500) {
			ans.append("D");
			sum -= 500;
		}

		if(sum >= 400) {
			ans.append("CD");
			sum -= 400;
		}
		
		
		while(sum >= 100) {
			ans.append("C");
			sum -= 100;
		}

		if(sum >= 90) {
			ans.append("XC");
			sum -= 90;
		}

		if(sum >= 50) {
			ans.append("L");
			sum -= 50;
		}

		if(sum >= 40) {
			ans.append("XL");
			sum -= 40;
		}
		
		while(sum >= 10) {
			ans.append("X");
			sum -= 10;
		}

		if(sum >= 9) {
			ans.append("IX");
			sum -= 9;
		}

		if(sum >= 5) {
			ans.append("V");
			sum -= 5;
		}
		
		if(sum >= 4) {
			ans.append("IV");
			sum -= 4;
		}
		
		while(sum >= 1) {
			ans.append("I");
			sum -= 1;
		}
		
		System.out.println(ans);
	}

	private static void remove() {
		
		input = input.replaceAll("IV", "A");
		input = input.replaceAll("IX", "B");
		input = input.replaceAll("XL", "E");
		input = input.replaceAll("XC", "F");
		input = input.replaceAll("CD", "G");
		input = input.replaceAll("CM", "H");
		
	}

	private static int makeInt(String input) {
		
		int num = 0;
		
		for(int i = 0; i < input.length(); i++) {
			
			if(input.charAt(i) == 'I') num += 1;
			else if(input.charAt(i) == 'V') num += 5;
			else if(input.charAt(i) == 'X') num += 10;
			else if(input.charAt(i) == 'L') num += 50;
			else if(input.charAt(i) == 'C') num += 100;
			else if(input.charAt(i) == 'D') num += 500;
			else if(input.charAt(i) == 'M') num += 1000;
			else if(input.charAt(i) == 'A') num += 4;
			else if(input.charAt(i) == 'B') num += 9;
			else if(input.charAt(i) == 'E') num += 40;
			else if(input.charAt(i) == 'F') num += 90;
			else if(input.charAt(i) == 'G') num += 400;
			else if(input.charAt(i) == 'H') num += 900;
		}
		
		return num;
	}
}
