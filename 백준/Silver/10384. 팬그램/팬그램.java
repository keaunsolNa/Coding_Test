import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			
			sb.append("Case " + i + ": ");
			
			String input = br.readLine().toLowerCase();
			input = input.replaceAll("[^a-z]", "");
			
			long min = Integer.MAX_VALUE;
			
			for(int c = 97; c <= 122; c++) min = Math.min(min, countChar(input, (char)c));
			
			
			if(min < 1) sb.append("Not a pangram");
			else if(min == 1) sb.append("Pangram!");
			else if(min == 2) sb.append("Double pangram!!");
			else sb.append("Triple pangram!!!");
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

	public static long countChar(String str, char ch) {
       return str.chars()
               .filter(c -> c == ch)
               .count();
	}
}
