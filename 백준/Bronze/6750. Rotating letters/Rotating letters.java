import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int answer = 0;
		for(int i = 0; i < input.length(); i++) {
			
			switch(input.charAt(i)) {
				case 'I' : break;
				case 'O' : break;
				case 'S' : break;
				case 'H' : break;
				case 'Z' : break;
				case 'X' : break;
				case 'N' : break;
				default : answer = -1; break;
			}
		}
		
		if(answer == -1) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}
