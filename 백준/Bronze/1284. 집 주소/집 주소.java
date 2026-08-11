import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		while(!(input = br.readLine()).equals("0")) {
			int totalD = 0;
			totalD += input.length() - 1;
			totalD += 2;
			
			long zeroCount = input.chars()
	                .filter(c -> c == '0')
	                .count();
			
			long oneCount = input.chars()
	                .filter(c -> c == '1')
	                .count();
			
			totalD += zeroCount*4;
			totalD += oneCount*2;
			
			totalD += (input.length() - zeroCount - oneCount) * 3;
			System.out.println(totalD);
		}
	}
}
