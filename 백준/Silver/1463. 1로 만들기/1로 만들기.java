import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(recursion(N, 0));
	}

	private static int recursion(int N, int count) {
		 
		if (N < 2) {
			return count;
		}
		return Math.min(recursion(N / 2, count + 1 + (N % 2)), 
						recursion(N / 3, count + 1 + (N % 3)));
	}
}
