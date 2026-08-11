import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int number = 0;
		for(int i = input.length() - 2; i >= 0; i -= 2) {
			
			
			int temp = (input.charAt(i) - '0') * 2;
			
			if(temp >= 10) {
				
				String two = temp +"";
				
				number += (two.charAt(0) - '0') + (two.charAt(1) - '0');
				
			} else number += temp;
			
		}
		
		for(int i = input.length() - 1; i >= 0; i -= 2) {
			
			int temp = (input.charAt(i) - '0');
			
			number += temp;
		}
		
		if(number % 10 == 0) System.out.println("DA");
		else System.out.println("NE");
	}
}
