import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		while(!(input = br.readLine()).contains("#")) {
			if(input.charAt(input.length() - 1) == 'e') {
				if((input.length() - input.replaceAll("1", "").length()) % 2 == 0) {
					System.out.println(input.replace('e', '0'));
				} else {
					System.out.println(input.replace('e', '1'));
				}
			} else {
				if((input.length() - input.replaceAll("1", "").length()) % 2 == 0) {
					System.out.println(input.replace('o', '1'));
				} else {
					System.out.println(input.replace('o', '0'));
				}
			}
		}
	}
}
