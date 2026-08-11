import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		BigInteger sum = new BigInteger("0");
		for(int i = 0; i < 3; i++) {
			BigInteger temp = new BigInteger(st.nextToken());
			sum = sum.add(temp);
		}
		System.out.println(sum);
	}
}
