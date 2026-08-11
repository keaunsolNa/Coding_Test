import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		if(A <= 50 && B <= 10) {
			System.out.println("White");
		} else if(B > 30) {
			System.out.println("Red");
		} else {
			System.out.println("Yellow");
		}
		 
	}
}
