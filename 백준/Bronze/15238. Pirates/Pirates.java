import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String input = br.readLine();
		long cnt = 0;
		long max = 0;
		char target = ' ';
		for(int i = 0; i < T; i++) {
				
			cnt = countChar(input, input.charAt(i));
			
			if(cnt > max) {
				max = cnt;
				target = input.charAt(i);
			}
		}
		System.out.println(target + " " + max);
	}

    public static long countChar(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }
}
