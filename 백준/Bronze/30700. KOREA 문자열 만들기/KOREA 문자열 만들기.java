import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		char[] korea = new char[] {'K', 'O', 'R', 'E', 'A'};
		int idx = 0;
		int answer = 0;
		for(int i = 0; i < input.length(); i++) {
			
			if(input.charAt(i) == korea[idx]) { answer++; idx++; }
			if(idx == 5) idx = 0;
		}
		
		System.out.println(answer);
	}
}
