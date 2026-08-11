package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class StringPlus07 {
	
	public static void main(String[] args) throws IOException {
		test09();
	}
	

	// Dyslexia
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		String A = br.readLine();
		String B = br.readLine();
		
		int answer = 0;
		for(int i = 0; i < length; i++) {
			if(A.charAt(i) == B.charAt(i)) {
				answer++;
			}
		}
		
		System.out.println(answer);
	}
	
	// Dyslexia
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		String A = br.readLine();
		String B = br.readLine();
		
		int answer = 0;
		for(int i = 0; i < length; i++) {
			if(A.charAt(i) != B.charAt(i)) {
				answer++;
			}
		}
		
		System.out.println(answer);
		
	}
	
}
