import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		
		int[] alpha = new int[26];
		
		for(char ch : input.toCharArray()) alpha[ch - 'A']++;
		
		int n = 0;
		int mid = 0;
		
		for(int i = 0; i < 26; i++) {
			
			if(alpha[i] % 2 == 1) {
				
				mid = i;
				n++;
			}
			
		}
		
		if((input.length() % 2 == 1 && n > 1) || (input.length() % 2 == 0 && n > 0)) {
			System.out.println("I'm Sorry Hansoo");
			return;
		}
		
			
		String answer = "";
		
		for(int i = 0; i < 26; i++) 
			for(int j = 0; j < alpha[i] / 2; j++) answer += (char)(i + 'A');
		
		
		String reverse = new StringBuilder(answer).reverse().toString();
		if(n == 1) answer += (char)(mid + 'A');
		
		
		sb.append(answer + reverse);
		System.out.print(sb);
		
		
		
	
	}
}
