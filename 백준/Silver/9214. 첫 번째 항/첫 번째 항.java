import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = "";
		int tc = 1;
		while(!(input = br.readLine()).equals("0")) {

			System.out.println("Test " + tc++ + ": " + solve(input));
		}
	}
	
	public static String solve(String text) {
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			for(int i = 0; i < text.length(); i += 2) {
				
				if(text.length() <= i + 1) return text;
				int amount = (int)text.charAt(i) - '0';
				int value = (int)text.charAt(i + 1) - '0';
				while(amount --> 0) sb.append(value);
			
			}
			
			if(text.equals(sb.toString())) return text;
			text = sb.toString();
			sb.setLength(0);
		}
		
	}
}