import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();

		long u = countChar(input, 'u');
		long o = countChar(input, 'o');
		long s = countChar(input, 's');
		long p = countChar(input, 'p');
		long c = countChar(input, 'c');
		
		System.out.println(Math.min(u, Math.min(o, Math.min(s, Math.min(p, c)))));
		
	}
	

	public static long countChar(String str, char ch) {
		return str.chars()
				.filter(c -> c == ch)
				.count();
	}
}