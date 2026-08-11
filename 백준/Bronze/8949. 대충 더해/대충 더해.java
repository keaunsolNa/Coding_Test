import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String A = st.nextToken();
		String B = st.nextToken();
		
		while(A.length() != B.length()) {
			
			if(A.length() > B.length()) {
				B = "0" + B;
			} else {
				A = "0" + A;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = A.length() - 1; i >= 0; i--) {
			sb.insert(0, Character.getNumericValue(A.charAt(i)) + Character.getNumericValue(B.charAt(i)));
		}
		
		System.out.println(sb);
	}
}
