import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {

			String input = br.readLine();
			int N = input.length();

			long a = countChar(input, 'a');
			long b = countChar(input, 'b');
		
			sb.append(Math.min(N - a, N - b)).append("\n");
		}
		
		System.out.print(sb);
	}

	public static long countChar(String str, char ch) {
		return str.chars().filter(c -> c == ch).count();
	}
}