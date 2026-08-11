import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			String str = br.readLine();
			StringBuilder sb = new StringBuilder();
			boolean ispangram = true;
			for(int j = 97; j < 123; j++) {
				long chk = countChar(str.toLowerCase(), (char)j);
				
				if(chk < 1) {
					sb.append((char)j);
					ispangram = false;
				}
			}
			
			if(ispangram) {
				System.out.println("pangram");
			} else {
				sb.insert(0, "missing ");
				System.out.println(sb);
			}
		}
		
	}

    public static long countChar(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }
}
