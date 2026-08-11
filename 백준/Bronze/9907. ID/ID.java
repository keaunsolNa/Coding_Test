import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String number = br.readLine();
		
		int total = 0;
		
		total += (number.charAt(0) -'0') * 2;
		total += (number.charAt(1) -'0') * 7;
		total += (number.charAt(2) -'0') * 6;
		total += (number.charAt(3) -'0') * 5;
		total += (number.charAt(4) -'0') * 4;
		total += (number.charAt(5) -'0') * 3;
		total += (number.charAt(6) -'0') * 2;
		
		total %= 11;

		if(total == 0) System.out.println("J");
		else if(total == 10) System.out.println("Z");
		else System.out.println((char)(total + 64));
		
	}
}
