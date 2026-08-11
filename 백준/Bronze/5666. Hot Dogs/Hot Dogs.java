import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String input = "";
		
		while((input = br.readLine()) != null) {
			st = new StringTokenizer(input, " ");
			double H = Integer.parseInt(st.nextToken());
			double P = Integer.parseInt(st.nextToken());
			double answer = Math.round(H/P * 100) / 100.0;
			System.out.printf("%.2f", answer);
			System.out.println();
		}
	}
}
