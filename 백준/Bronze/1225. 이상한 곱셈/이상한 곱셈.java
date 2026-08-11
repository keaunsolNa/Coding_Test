import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String A  = st.nextToken();
		String B  = st.nextToken();
		
		if(A.length() < B.length()) {
			String temp = A;
			A = B;
			B = temp;
		}

		long sum = 0;
		for(int i = 0; i < A.length(); i++) {
				int tempI = Character.getNumericValue(A.charAt(i));
			for(int j = 0; j < B.length(); j++) {
				int tempJ = Character.getNumericValue(B.charAt(j));
				sum += tempI*tempJ;
			}
		}
		
		System.out.println(sum);
	}
}
