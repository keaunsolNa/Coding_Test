import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int answer = 1;
		for(int i = 0; i < input.length(); i++) {
			
			switch(input.charAt(i)) {
			
				case 'A' :
					if(answer == 1) answer = 2;
					else if (answer == 2) answer = 1;
					break;
				case 'B' :
					if(answer == 2) answer = 3;
					else if (answer == 3) answer = 2;
					break;
				case 'C' :
					if(answer == 3) answer = 1;
					else if (answer == 1) answer = 3;
			}
		}
		System.out.println(answer);
    }
}
