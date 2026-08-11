import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int aSum = 0;
		int bSum = 0;
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == 'A') {
				aSum = aSum + Character.getNumericValue(str.charAt(i+1));
				i++;
			} else {
				bSum = bSum + Character.getNumericValue(str.charAt(i+1));
				i++;
			}
		}
		
		if(aSum > bSum) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
	}
}
