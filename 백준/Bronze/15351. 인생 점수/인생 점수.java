import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			String str = br.readLine();
			
			int sum = 0;
			for(int j = 0; j < str.length(); j++) {
				
				switch(str.charAt(j)) {
					case 'A' : sum = sum + 1; break;
					case 'B' : sum = sum + 2; break;
					case 'C' : sum = sum + 3; break;
					case 'D' : sum = sum + 4; break;
					case 'E' : sum = sum + 5; break;
					case 'F' : sum = sum + 6; break;
					case 'G' : sum = sum + 7; break;
					case 'H' : sum = sum + 8; break;
					case 'I' : sum = sum + 9; break;
					case 'J' : sum = sum + 10; break;
					case 'K' : sum = sum + 11; break;
					case 'L' : sum = sum + 12; break;
					case 'M' : sum = sum + 13; break;
					case 'N' : sum = sum + 14; break;
					case 'O' : sum = sum + 15; break;
					case 'P' : sum = sum + 16; break;
					case 'Q' : sum = sum + 17; break;
					case 'R' : sum = sum + 18; break;
					case 'S' : sum = sum + 19; break;
					case 'T' : sum = sum + 20; break;
					case 'U' : sum = sum + 21; break;
					case 'V' : sum = sum + 22; break;
					case 'W' : sum = sum + 23; break;
					case 'X' : sum = sum + 24; break;
					case 'Y' : sum = sum + 25; break;
					case 'Z' : sum = sum + 26; break;
				}
			}
			
			if(sum == 100) {
				System.out.println("PERFECT LIFE");
			} else {
				System.out.println(sum);
			}
		}
	}
}
