import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int pay = 0;
		if(A < B) {
			if(B-A <= 20) {
				pay = 100;
			} else if(B-A <= 30) {
				pay = 270;
			} else {
				pay = 500;
			}
			System.out.println("You are speeding and your fine is $"+pay+".");
		} else {
			System.out.println("Congratulations, you are within the speed limit!");
		}
	}
}
