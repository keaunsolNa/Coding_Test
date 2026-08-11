import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int money = Integer.parseInt(br.readLine());
		
		if(N < 5) {
		} else if (N < 10) {
			money = money-500;
		} else if (N < 15) {
			money = Math.min((money/100)*90, money-500);
		} else if (N < 20) {
			money = Math.min((money/100)*90, money-2000);
		} else {
			money = Math.min((money/100)*75, money-2000);
		}

		if(money > 0) {
			System.out.println(money);
		} else {
			System.out.println(0);
		}
	}
}
