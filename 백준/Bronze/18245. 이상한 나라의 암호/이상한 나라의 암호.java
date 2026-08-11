import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		int idx = 2;
		StringBuilder sb = new StringBuilder();
		while(!(input = br.readLine()).equals("Was it a cat I saw?")) {
			for(int i = 0; i < input.length(); i += idx) {
				sb.append(input.charAt(i));
			}
			idx++;
			
			sb.append("\n");
		}
		
		System.out.print(sb.deleteCharAt(sb.length()-1));
	}
}
