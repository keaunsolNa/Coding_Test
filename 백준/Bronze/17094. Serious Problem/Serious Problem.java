import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		String s = br.readLine();
		int two = 0;
		int e = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'e') {
				e++;
			} else {
				two++;
			}
		}
		
		System.out.println("E : " + e);
		System.out.println("TWO : " + two);
		if(e == two) {
			System.out.println("yee");
		} else if(e > two) {
			System.out.println("e");
		} else {
			System.out.println("2");
		}
	}
}
