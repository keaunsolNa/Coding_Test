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
		int star = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= star; i++) {
			
			for(int j = i; j < star; j++) {
				System.out.print(" ");
			}
			
			System.out.print("*");
			for(int k = i-1;  k > 0; k--) {
				System.out.print("*");
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		 
	}
}
