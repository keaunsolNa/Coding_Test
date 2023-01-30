package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringPlus29 {
	
	public static void main(String[] args) throws IOException {
		test03();
	}

	// 회문
	private static String input;
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			input = br.readLine();
			
			int start = 0;
			int end = input.length() - 1;
			int cnt = 0; 
		
			System.out.println(palindrome(start, end, cnt));
			
		}
	
	}
	
	private static int palindrome(int start, int end, int cnt) {
		
		while(start < end) {
			
			
			if(input.charAt(start) == input.charAt(end)) {
				start++;
				end--;
				continue;
			}
			
			if(cnt != 0) 
				return 2;
			
			cnt++; 
			
			int leftOrRight = palindrome(start, end-1, cnt);
			
            if (leftOrRight == 1) {
                end--;
                continue;
            }
            
            leftOrRight = palindrome(start+1, end, cnt);
            
            if (leftOrRight == 1) {
                start++;
                continue;
            }
            
		}
		
		return cnt;
	}
	
	
	// Decimal XOR 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String A = br.readLine();
		String B = br.readLine();
		
		while(A.length() != B.length()) {
			if(A.length() < B.length()) A = "0" + A;
			else B = "0" + B;
		}

		for(int i = 0; i < A.length(); i++) {
			
			if(A.charAt(i) - '0' <= 2 && B.charAt(i) - '0' <= 2) sb.append("0");
			
			else if(A.charAt(i) - '0' >= 7 && B.charAt(i) - '0' >= 7) sb.append("0");
			
			else sb.append("9");
			
		}
		
		System.out.println(sb);
		
	}
	
	// IOIOI 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		String str = "";
		for(int i = 0; i < N + 1; i++) str += "IO";
		str = str.substring(0, str.length() - 1);
		
		String S = br.readLine();
		
		int cnt = 0;
		for(int i = 0; i <= M - str.length(); i++) {

			if(S.substring(i, i + str.length()).equals(str)) cnt++;
		}
		
		System.out.println(cnt);
		
		
	}
	
	// 
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		
	}
	
	// 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		
	}
	
	// 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		
	}
	
	// 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		
	}
	
	// 
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		
	}
	
	// 
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		
	}
	
	// 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		
	}
	
	
	
}
