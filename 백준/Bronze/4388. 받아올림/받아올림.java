import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String A;
		String B;
		int carry;
		int totalCarry;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			A = st.nextToken();
			B = st.nextToken();
			
			if(A.equals("0") && B.equals("0")) break;

			totalCarry = 0;
			
			if(A.length() < B.length()) 
				while(A.length() != B.length()) A = "0" + A;
			else while(A.length() != B.length()) B = "0" + B;

			carry = 0;
			for(int i = A.length() - 1; i >= 0; i--) {
				
				if((int)(A.charAt(i) - '0') + (int)(B.charAt(i) - '0') + carry >= 10) {
					carry = 1;
					totalCarry++;
				} else carry = 0;
			}
			
			sb.append(totalCarry + "\n");
		}
		
		System.out.print(sb);
	}
}
