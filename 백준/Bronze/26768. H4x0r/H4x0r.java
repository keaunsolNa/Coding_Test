import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		
		for(int i = 0; i < input.length(); i++) {
			
			switch(input.charAt(i)) {
				case 'a' : sb.append(4); break;
				case 'e' : sb.append(3); break;
				case 'i' : sb.append(1); break;
				case 'o' : sb.append(0); break;
				case 's' : sb.append(5); break;
				default : sb.append(input.charAt(i));
			}
		}
		
		System.out.print(sb);
	}
}
