import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] input = br.readLine().toCharArray();
		
		int slope = (input[1] - '0') - (input[0] - '0');
		int upOrDown = (input[1] - '0') - (input[1] - '0');
		
		if(slope <= 0 ) {
			System.out.println("NON ALPSOO");
			System.exit(0);
		}
		
		
		for(int i = 1; i < input.length - 1; i++) {
			
			if(input[i] == input[i + 1]) {
				System.out.println("NON ALPSOO");
				System.exit(0);
			}
			
			upOrDown = ((input[i] - '0') - (input[i - 1] - '0')) * ((input[i + 1] - '0') - (input[i] - '0'));
			
			if(upOrDown > 0) {
				
				if(slope != (input[i + 1] - '0') - (input[i] - '0')) {
					System.out.println("NON ALPSOO");
					System.exit(0);
				}
			}
			
			else {
				slope = (input[i + 1] - '0') - (input[i] - '0');
			}
			
		}
		if(slope < 0) System.out.println("ALPSOO");
		else System.out.println("NON ALPSOO");
		
	}
}
