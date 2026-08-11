import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		for(int i = 0; i < testCase; i++) {
			System.out.println("String #" + (i+1));
			String str = br.readLine();
			
			for(int j = 0; j < str.length(); j++) {
				if((int)str.charAt(j) == 90) {
					System.out.print((char)'A');
				} else {
					System.out.print((char)((int)str.charAt(j)+1));
				}

			}
			System.out.println();
			System.out.println();
		}
	}
}
