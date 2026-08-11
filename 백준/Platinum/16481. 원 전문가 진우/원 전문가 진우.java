import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long r1 = Long.parseLong(st.nextToken());
		long r2 = Long.parseLong(st.nextToken());
		long r3 = Long.parseLong(st.nextToken());
		
		System.out.printf("%.10f", (double)(r1 * r2 * r3) / (r1 * r2 + r2 * r3 + r1 * r3));
	}
}
