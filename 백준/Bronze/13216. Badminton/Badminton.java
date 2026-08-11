import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	private static String input;

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		
		int p1 = 0;
		int p2 = 0;
		int p1w = 0;
		int p2w = 0;
		for(int i = 0; i < input.length(); i++) {
			
			if(input.charAt(i) == 'A') p1++;
			else p2++;
			
			if(p1 == 21 || p2 == 21) {
				
				System.out.println(p1+ "-" + p2);
				if(p1 > p2) p1w++;
				else p2w++;
				
				p1 = 0;
				p2 = 0;
			}
			
		}
		
		System.out.println(p1w > p2w ? "A" : "B");
		
	}
}
