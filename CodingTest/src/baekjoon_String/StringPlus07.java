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
	

	// Greetings!
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String hey = br.readLine();
		
		int eLength = hey.substring(1, hey.length()-1).length();

		StringBuilder sb = new StringBuilder();
		sb.append("h");
		for(int i = 0; i < eLength; i++) {
			sb.append("e");
			sb.append("e");
		}
		sb.append("y");
		
		System.out.println(sb);
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
