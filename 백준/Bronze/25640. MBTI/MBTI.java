import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String zinho = br.readLine();
		int testCase = Integer.parseInt(br.readLine());
		
		int sum = 0;
		for(int i = 0; i < testCase; i++) {
			String other = br.readLine();
			if(other.equals(zinho)) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}
