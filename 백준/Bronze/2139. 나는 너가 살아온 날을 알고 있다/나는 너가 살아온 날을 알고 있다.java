import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		while(true) {
			
			st = new StringTokenizer(br.readLine());
			
			int day = Integer.parseInt(st.nextToken());
			int month = Integer.parseInt(st.nextToken());
			int year = Integer.parseInt(st.nextToken());
			int ans = 0;
			
			if(day == 0 && month == 0 && year == 0) break;
			
			if(month > 2) {
				
				
				switch(month) {
				
					case 3 : ans += 59; break;
					case 4 : ans += 90; break;
					case 5 : ans += 120; break;
					case 6 : ans += 151; break;
					case 7 : ans += 181; break;
					case 8 : ans += 212; break;
					case 9 : ans += 243; break;
					case 10 : ans += 273; break;
					case 11 : ans += 304; break;
					case 12 : ans += 334; break;
					
				}
				
				if(isLeapYear(year)) ans++;
				
			} else if(month == 2) ans += 31;
			
			ans += day;
			
			sb.append(ans + "\n");
		}
		
		System.out.println(sb);
	}

	private static boolean isLeapYear(int year) {
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) return true;
		
		return false;
	}
}
