import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int a = 1;
		int b = 1;
		int sum = 2;

		if(n <= 1) {
			System.out.println(1);
		} else {
			for(int i = 3; i <= n; i++) {
				a = b;
				b = sum;
				sum = a + b;
			}
			
			sum %= 10;
			
			System.out.println(Math.abs(sum));
		}
		
	}
}
