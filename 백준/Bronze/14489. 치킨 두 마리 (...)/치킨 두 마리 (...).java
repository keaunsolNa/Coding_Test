import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int money = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
		int chicken = Integer.parseInt(br.readLine());
		
		if(money >= chicken*2) {
			System.out.println(money - chicken*2);
		} else {
			System.out.println(money);
		}
	}
}
