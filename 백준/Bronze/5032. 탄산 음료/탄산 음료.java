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
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		

		int[] arr = new int[3];

		for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(st.nextToken());

		int sum = 0;
		int num = arr[0] + arr[1]; 
		while (num >= arr[2]) {
			
			sum += num / arr[2];
			num = num / arr[2] + num % arr[2];
			
		}
		
		System.out.println(sum);
		
	}
}
