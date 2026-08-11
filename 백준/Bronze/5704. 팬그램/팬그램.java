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
		test03();
	}

	public static void test03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		while(!(input = br.readLine()).equals("*")) {
			Set<Character> set = new HashSet<>();
			input = input.replaceAll(" ", "");
			for(int i = 0; i < input.length(); i++) set.add(input.charAt(i));
			
			if(set.size() == 26) {
				System.out.println("Y");
			} else {
				System.out.println("N");
			}
		}
	}
}
