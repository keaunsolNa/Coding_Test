import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		long input = -1;
		
		while((input = Integer.parseInt(br.readLine())) != 0) {
			
			sb.append(input + " ");
			while(input >= 10) {
				
				long temp = 1;
				String str = input + "";
				
				for(int i = 0; i < str.length(); i++) {
					temp *= Character.getNumericValue(str.charAt(i));
				}
				
				input = temp;
				sb.append(input + " ");
			}
			
			sb.deleteCharAt(sb.length() - 1);
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
}
