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
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			String[] input = br.readLine().split(",");
			String name = input[0];
			long min = Long.parseLong(input[1]);
			
			int year = (int)min / 525600;
			min = min - (525600 * year);
			int day = (int)min / 1440;
			min = min - (1440 * day);
			int hour = (int)min / 60;
			min = min % 60;
			
			String ans = "";
			if(year > 0) ans += year + " year(s) ";
			if(day > 0) ans += day + " day(s) ";
			if(hour > 0) ans += hour + " hour(s) ";
			if(ans.length() > 0 && ans.charAt(ans.length() - 1) == ' ') ans += (min + " minute(s)");
			else ans += (min + " minute(s)");
			
			System.out.println(name + " - " + ans);
			
		}
		
	}
}
