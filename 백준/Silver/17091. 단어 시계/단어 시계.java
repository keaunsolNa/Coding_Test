import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int h = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		String[] min = {" ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", 
						"thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", 
						"twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", 
						"twenty nine", "half" };
        
		String[] hour = {" ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen"}; 
		
		
		if(m == 0) {
			
			sb.append(hour[h]);
			sb.append(" o' clock");
			
		} else if(m <= 30) {
			sb.append(min[m]);
			
			if(m != 1) {
				if(m != 15 && m != 30 && m!= 45)
				sb.append(" minutes");
			} else {
				if(m != 15 && m != 30 && m!= 45)
				sb.append(" minute");
			}
			sb.append(" past ");
			sb.append(hour[h]);
			
		} else {
			
			m = 60 - m;
			sb.append(min[m]);
			
			if(m != 1) {
				if(m != 15 && m!= 30 && m != 45) {
					sb.append(" minute to ");
				} else {
					sb.append( " to " );
				}
			} else {
				if(m != 15 && m != 30 && m!= 45) {
					sb.append(" minutes to ");
				} else {
					sb.append(" to ");
				}
			}
			
			if(h != 12) {
				sb.append(hour[h + 1]);
			} else {
				sb.append(hour[1]);
			}
			
		}
		
		System.out.println(sb);
	}
}
