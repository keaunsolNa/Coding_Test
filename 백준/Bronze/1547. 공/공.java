import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int ball = 1;
		
		for(int i = 0; i < N; i++) {
			String[] temp = br.readLine().split(" ");
			int one = Integer.parseInt(temp[0]);
			int two = Integer.parseInt(temp[1]);
			if(ball == one) {
				ball = two;
			} else if(ball == two) {
				ball = one;
			}
		}
		
		System.out.println(ball);
	}
}
