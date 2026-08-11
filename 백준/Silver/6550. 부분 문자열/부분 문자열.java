import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String input = "";
		
		while((input = br.readLine()) != null) {
			st = new StringTokenizer(input);
			
			String s = st.nextToken();
			String t = st.nextToken();
			int idx = 0;
			
			for (int i = 0; i < t.length(); i++) {
				if (s.charAt(idx) == t.charAt(i)) idx++;
				if (idx == s.length()) break;
			}
			
			if(idx == s.length()) System.out.println("Yes");
			else System.out.println("No");
		}
	}
}
