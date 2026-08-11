import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.print(fibonacci(n));
	}

	public static long fibonacci(int n) {
		if(n < 2)return n;
		long f0 = 0, f1 = 1, f2 = 1;
		for(int i = 2; i < n; i++) {
			f0 = f1;
			f1 = f2;
			f2 = f1 + f0;
		}
		return f2;
	}
}
