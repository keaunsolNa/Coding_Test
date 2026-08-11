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
		String id = br.readLine();
		
		for(int i = 1; i <= 9; i++) {
			if(i%3 == 0) {
				System.out.print(":fan:");
				System.out.println();
			} else if(i == 5) {
				System.out.print(":"+id+":");
			} else {
				System.out.print(":fan:");
			}
		}
	}
}
