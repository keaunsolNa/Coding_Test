import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		int C = Integer.parseInt(br.readLine());
		String pattern = "[a-z]";
		
		int max = 0;
		for(int i = 0; i < C; i++) {
			String input = br.readLine();
			input = input.replaceAll("for", "0");
			input = input.replaceAll("while", "0");
			input = input.replaceAll(pattern, "");
			
			if(max < input.length()) {
				max = input.length();
			}
		}
		
		System.out.print(max);
	}
}
