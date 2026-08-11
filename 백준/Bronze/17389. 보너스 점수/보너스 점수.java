import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		int totalP = 0;
		int bonus = 0;
		for(int i = 0; i < input.length(); i++) {
			
			if(input.charAt(i) == 'O') {
				totalP += (i + 1);
				totalP += bonus;
				bonus++;
			} else bonus = 0;
			
		}
		
		System.out.println(totalP);
	}
}
