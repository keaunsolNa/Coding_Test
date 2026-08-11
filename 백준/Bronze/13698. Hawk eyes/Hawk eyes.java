import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int small = 1;
		int big = 4;
				
		for(int i = 0; i < input.length(); i++) {
			
			switch(input.charAt(i)) {
				case 'A' : 
					small = small == 1 ? 2 : small == 2 ? 1 : small;
					big = big == 1 ? 2 : big == 2 ? 1 : big;
					break;
				case 'B' :
					small = small == 1 ? 3 : small == 3 ? 1 : small;
					big = big == 1 ? 3 : big == 3 ? 1 : big;
					break;
				case 'C' : 
					small = small == 1 ? 4 : small == 4 ? 1 : small;
					big = big == 1 ? 4 : big == 4 ? 1 : big;
					break;
				case 'D' : 
					small = small == 2 ? 3 : small == 3 ? 2 : small;
					big = big == 2 ? 3 : big == 3 ? 2 : big;
					break;
				case 'E' :
					small = small == 2 ? 4 : small == 4 ? 2 : small;
					big = big == 2 ? 4 : big == 4 ? 2 : big;
					break;
				case 'F' :
					small = small == 3 ? 4 : small == 4 ? 3 : small;
					big = big == 3 ? 4 : big == 4 ? 3 : big;
					break;
			}
		}
		
		System.out.println(small);
		System.out.println(big);
	}
}
