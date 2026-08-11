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
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		long A = Integer.parseInt(br.readLine());
		long B = Integer.parseInt(br.readLine());
		long C = Integer.parseInt(br.readLine());
		
		long total = A * B * C;
		
		System.out.println(countChar(total+"", '0'));
		System.out.println(countChar(total+"", '1'));
		System.out.println(countChar(total+"", '2'));
		System.out.println(countChar(total+"", '3'));
		System.out.println(countChar(total+"", '4'));
		System.out.println(countChar(total+"", '5'));
		System.out.println(countChar(total+"", '6'));
		System.out.println(countChar(total+"", '7'));
		System.out.println(countChar(total+"", '8'));
		System.out.println(countChar(total+"", '9'));
	}

	private static long countChar(String str, char ch) {
		return str.chars()
   				  .filter(c -> c == ch)
   				  .count();
	}
}
