import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String S = br.readLine();
		
		long h = countChar(S, 'H');
		long i = countChar(S, 'I');
		long a = countChar(S, 'A');
		long r = countChar(S, 'R');
		long c = countChar(S, 'C');
		
		System.out.println(Math.min(Math.min(Math.min(Math.min(h, i), a), r), c));
	}

    public static long countChar(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }
}
