import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		char now = 'A';
		int answer = 0;
		
		for(int i = 0; i < input.length(); i++) {
			char cTemp = input.charAt(i);
			int temp = Math.abs(cTemp - now);
			answer += Math.min(temp, 26 - temp);
			
			now = cTemp;
		}
		
		System.out.println(answer);
	}
}
