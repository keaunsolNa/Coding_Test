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
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String input = "";
		String answer = "Good";
		int prev = Integer.parseInt(st.nextToken());
		while(st.hasMoreTokens()) {
			int now = Integer.parseInt(st.nextToken());
			if(now < prev) {
				answer = "Bad";
				break;
			} else {
				prev = now;
			}
		}
		
		System.out.println(answer);
		
	}
}
