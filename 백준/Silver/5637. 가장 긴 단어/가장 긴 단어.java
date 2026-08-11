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
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0;
		String ans = "";
		
		while(true) {
			
			String[] str = br.readLine().toLowerCase().split("[^a-z-]");
			boolean chk = false;
			for (String string : str) {
				if(string.equals("e-n-d")) {
					chk = true;
					break;
				}
				
				if(max < string.length()) {
					ans = string;
					max = string.length();
				}
			}
			
			if(chk) {
				System.out.println(ans);
				return;
			}
		}
		
	}
}
