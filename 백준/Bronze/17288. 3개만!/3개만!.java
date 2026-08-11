import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		int cnt = 0;
		for(int i = 0; i < input.length() - 2; i++) {
			if(Character.getNumericValue(input.charAt(i)) + 1 == Character.getNumericValue(input.charAt(++i))) {
				if(Character.getNumericValue(input.charAt(i)) + 1 == Character.getNumericValue(input.charAt(++i))) {
					cnt++;
					
					if(i != input.length() - 1)
					if(Character.getNumericValue(input.charAt(i)) + 1 == Character.getNumericValue(input.charAt(++i))) {
						cnt--;
					} else i--;
				} else i--;
			} else i--;
		}
		
		System.out.println(cnt);
	}
}
