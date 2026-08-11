import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	private static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String A = br.readLine();
		String B = br.readLine();
		
		while(A.length() != B.length()) {
			if(A.length() < B.length()) A = "0" + A;
			else B = "0" + B;
		}

		for(int i = 0; i < A.length(); i++) {
			
			if(A.charAt(i) - '0' <= 2 && B.charAt(i) - '0' <= 2) sb.append("0");
			
			else if(A.charAt(i) - '0' >= 7 && B.charAt(i) - '0' >= 7) sb.append("0");
			
			else sb.append("9");
			
		}
		
		System.out.println(sb);
		
	}
}
