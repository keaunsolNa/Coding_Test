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
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int dd = Integer.parseInt(st.nextToken());
		int mm = Integer.parseInt(st.nextToken());
		
		
		LocalDate date = LocalDate.of(2009, mm, dd);
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL, Locale.US));

		
	}
}
