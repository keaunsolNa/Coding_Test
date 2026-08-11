import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		input = input.replaceAll("[a-z]", "-");
		input += "-";
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < input.length(); i++) {
			
			String temp = "";
			while(input.charAt(i) != '-' && i < input.length() - 1) {
				temp += input.charAt(i);
				i++;
			}
			
			if(!temp.equals(""))
				set.add(Integer.parseInt(temp));
		}
		
		System.out.println(set.size());
	}
}
