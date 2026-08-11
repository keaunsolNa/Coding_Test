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
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		boolean[] hotel = new boolean[10];
		
		for(int i = 0; i < input.length(); i++) {
			
			if(input.charAt(i) == 'L') {
				
				for(int j = 0; j < 10; j++) {
					
					if(hotel[j] == false) {
						hotel[j] = true;
						break;
					}
				}
				
			} else if(input.charAt(i) == 'R') {
				
				for(int j = 9; j >= 0; j--) {
					
					if(hotel[j] == false) {
						hotel[j] = true;
						break;
					}
				}
			} else {
				hotel[Character.getNumericValue(input.charAt(i))] = false;
			}
		}
		
		for(int i = 0; i < 10; i++) {
			if(hotel[i] == true) System.out.print(1);
			else System.out.print(0);
		}
	}
}
