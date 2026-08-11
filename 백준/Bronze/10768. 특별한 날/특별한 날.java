import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		if(A > 2) {
			System.out.println("After");
		} else if(A == 2 && B == 18) {
			System.out.println("Special");
		} else if(A == 1) {
			System.out.println("Before");
		} else if(B > 18){
			System.out.println("After");
		} else {
			System.out.println("Before");
		}
	}
}
