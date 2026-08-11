import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i = 0; i < T; i++) {
			
			String input = br.readLine();
			
			if(input.contains("18") && input.contains("17")) {
				System.out.println(input);
				System.out.println("both");
			} else if(input.contains("18")) {
				System.out.println(input);
				System.out.println("mack");
			} else if(input.contains("17")) {
				System.out.println(input);
				System.out.println("zack");
			} else {
				System.out.println(input);
				System.out.println("none");
			}
			System.out.println();
		}
	}
}
