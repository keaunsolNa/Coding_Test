import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		for(int i = 0; i < input.length(); i++) {
			String number = (int)input.charAt(i) +"";
			
			int round = 0;
			for(int j = 0; j < number.length(); j++) {
				round += Character.getNumericValue(number.charAt(j));
			}
			
			for(int j = 0; j < round; j++) {
				System.out.print(input.charAt(i));
			}
			if(i != input.length() - 1) {
				System.out.println();
			}
		}
	}
}
