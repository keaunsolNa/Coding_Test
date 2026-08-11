import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for(int i = 1; i <= 2*N-1; i++) {
			if(i <= N) {
				for(int j = 1 ; j <= i; j++) {
					System.out.print("*");
				}
				for(int j = 1; j <= 2 * N - 2  * i; j++) {
					System.out.print(" ");
				}
				for(int j = 1 ; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= N - (i % N); j++) {
					System.out.print("*");
				}
				for(int j = 1; j <= 2 * (i % N); j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= N - (i % N); j++) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}
}
