import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) { 
			for(int j = 1; j < 2 * N; j++) {
				if(j > N + i) break; 
				if(i == N - 1) {
					System.out.print("*");
					continue;
				}
				if(j == N - i || j == N + i) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
