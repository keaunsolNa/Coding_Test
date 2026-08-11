import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = "";
		
		while(!(input = br.readLine()).equals("#")) {
			String innerInput = "";
			int length = input.length();
			String prev = input;
			String answer = "Correct";
			
			while(!(innerInput = br.readLine()).equals("#")) {
				

				if(length != innerInput.length()) {
					
					answer = "Incorrect";
					
				} else {
					
					int disCorrect = 0;
					for(int i = 0; i < prev.length(); i++) {
						
						if(prev.charAt(i) != innerInput.charAt(i)) disCorrect++;
						if(disCorrect > 1) answer = "Incorrect";
						
					}
					
					if(disCorrect != 1) answer = "Incorrect";
					prev = innerInput;
				}
				
				
			}
			sb.append(answer);
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
				
	}
}
