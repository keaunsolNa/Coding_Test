import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		while(N --> 0) {
			
			String number = br.readLine();
			long num = Long.parseLong(number);
			
			int digit = 1;
			double rnd = 1.0;
			while(number.length() >= digit) {
				
				num = (long) (Math.round(num / rnd) * rnd);
				rnd *= 10;
				digit++;
			}
			
		
			System.out.println(num);
		}
	}
}
