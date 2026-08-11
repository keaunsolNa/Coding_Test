import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		if(A >= 3 && B <= 4) {
			System.out.println("TroyMartian");
		}
		if(A <= 6 && B >= 2) {
			System.out.println("VladSaturnian");
		}
		if(A <= 2 && B <= 3) {
			System.out.println("GraemeMercurian");
		}
	}
}
