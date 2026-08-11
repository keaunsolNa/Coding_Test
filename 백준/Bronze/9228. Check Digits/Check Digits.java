import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			
			String input = br.readLine();
			if(input.equals("#")) break;
			
			int digit = 2;
			long total = 0;

			for(int i = 0; i < input.length(); i++) {
				total += Character.getNumericValue(input.charAt(input.length() - (i + 1))) * digit;
				digit++;
			}
			
			total %= 11;
			total = 11 - total;
			
			if(total >= 1 && total <=9) 
				System.out.println(input + " -> " + total);
			else if ( total == 10)
				System.out.println(input + " -> Rejected");
			else if ( total == 11)
				System.out.println(input + " -> " + 0);
			
		}
		
	}
}
