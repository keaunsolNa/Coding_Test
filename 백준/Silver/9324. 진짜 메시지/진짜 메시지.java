import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			String input = br.readLine();
			boolean chk = true;
			int cnt[] = new int[26];
			
			for(int i = 0; i < input.length(); i++) {
				
				int idx = input.charAt(i) - 'A';
				cnt[idx] ++;
				
				if(cnt[idx] == 3) {
					
					if(i == input.length() - 1 || input.charAt(i + 1) != input.charAt(i)) {
						chk = false;
						break;
					}
					
					cnt[idx] = 0;
					i++;
				}
			
			}
			
			if(chk) System.out.println("OK");
			else System.out.println("FAKE");
		}
		
	}
}
