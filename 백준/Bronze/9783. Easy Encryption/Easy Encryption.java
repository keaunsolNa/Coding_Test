import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input = br.readLine();
		
		for(int i = 0; i < input.length(); i++) {
			int temp = (int)input.charAt(i);
			
			if(temp >= 65 && temp <= 90) {
				
				sb.append(temp - 38);
				
			}
			else if(temp >= 97 && temp <= 122) {
				
				if(temp - 96 < 10) sb.append("0" + (temp - 96));
				else sb.append(temp - 96);
				
			} else if(temp >= 48 && temp <= 57) {
				
				sb.append("#" + (char)temp);
				
			} else {
				
				sb.append((char)temp);
				
			}
		}
		
		System.out.println(sb);
	}
}
