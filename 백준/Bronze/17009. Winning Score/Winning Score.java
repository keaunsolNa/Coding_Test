import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int A1 = Integer.parseInt(br.readLine());
		int A2 = Integer.parseInt(br.readLine());
		int A3 = Integer.parseInt(br.readLine());

		int aSum = (A1*3) + (A2*2) + (A3*1);
		
		int B1 = Integer.parseInt(br.readLine());
		int B2 = Integer.parseInt(br.readLine());
		int B3 = Integer.parseInt(br.readLine());
		
		int bSum = (B1*3) + (B2*2) + (B3*1);
		
		if(aSum > bSum) {
			System.out.println("A");
		} else if(aSum < bSum) {
			System.out.println("B");
		} else {
			System.out.println("T");
		}
	}
}
