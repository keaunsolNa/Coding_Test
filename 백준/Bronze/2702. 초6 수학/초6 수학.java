import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		while(T --> 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			int gcdX = x;
			int gcdY = y;
			while(gcdX != gcdY) {
				if(gcdX > gcdY) 
					gcdX = gcdX - gcdY;
				else gcdY = gcdY - gcdX;
			} 
			
			int result = x * y;
			
			while(x != y) {
				if(x > y)
					x = x - y;
				else y = y - x;
			}
			
			int result2 = y;
			
			System.out.println(result/result2 + " " + gcdY);
		}
	}
}
