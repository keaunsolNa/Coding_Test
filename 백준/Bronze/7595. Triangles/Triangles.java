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
		int input = -1;
		
		while((input = Integer.parseInt(br.readLine())) != 0) {
			
			for(int i = 0; i < input; i++) {
				for(int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
	}
}
