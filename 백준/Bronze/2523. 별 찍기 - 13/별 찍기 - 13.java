import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int star = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < 2*star - 1; i++) {

			if(i < star) {
				
				for(int j = i+1; j > 0; j--) {
					System.out.print("*");
				}
				
			} else {
				
				for(int j = i; j < 2*star - 1; j++) {
					System.out.print("*");
				}
			}
			
			System.out.println();
			
		}
	}
}
