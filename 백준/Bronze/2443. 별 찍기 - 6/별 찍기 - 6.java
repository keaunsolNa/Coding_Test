import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int star = Integer.parseInt(br.readLine());

		for(int i = 1; i <= 2*star-1; i++) {
			for(int j = 1 ; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2 * star - 1 - 2  * (i - 1); j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
