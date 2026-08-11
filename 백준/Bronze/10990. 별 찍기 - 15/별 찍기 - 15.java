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
		int star = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < star; i++) {
			
			for (int j = star - 1; j > i; j--) {
				System.out.print(" ");
			}
			
			System.out.print("*");
			
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print(" ");
			}
			
			if (i > 0)
				System.out.print("*");

			System.out.println("");
		}
	}
}
