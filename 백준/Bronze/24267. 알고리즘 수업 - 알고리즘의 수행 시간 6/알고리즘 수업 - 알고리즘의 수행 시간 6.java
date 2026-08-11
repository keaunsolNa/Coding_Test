import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long N = Long.parseLong(br.readLine());
		
		System.out.println(((N - 2) * (N - 1) * (2 * N - 3) + 3 * (N - 1) * (N - 2)) / 12);
		System.out.println(3);
	}
}
