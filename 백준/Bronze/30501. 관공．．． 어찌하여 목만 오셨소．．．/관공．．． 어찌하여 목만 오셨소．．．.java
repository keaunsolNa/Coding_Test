import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String input = "";
		for(int i = 0; i < N; i++) {
			
			input = br.readLine();
			if(input.contains("S")) break;
		}
		
		System.out.println(input);
	}
}
