package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringPlus6 {
	
	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// Report Card Time
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			String[] K = br.readLine().split(" ");
			int score = Integer.parseInt(K[1]);
			String grade = "";
			if(score < 60) {
				grade = "F";
			} else if(score < 67) {
				grade = "D";
			} else if(score < 70) {
				grade = "D+";
			} else if(score < 77) {
				grade = "C";
			} else if(score < 80) {
				grade = "C+";
			} else if(score < 87) {
				grade = "B";
			} else if(score < 90) {
				grade = "B+";
			} else if(score < 97) {
				grade = "A";
			} else {
				grade = "A+";
			}
			System.out.println(K[0] + " " + grade);
		}
	}

	// 이 문제는 D2 입니다.
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = br.readLine().toUpperCase();
		
		if(answer.contains("D2")) {
			System.out.println("D2");
		} else {
			System.out.println("unrated");
		}
	}

	// 헤라클레스와 히드라
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			int head = Integer.parseInt(br.readLine());
			String doing = br.readLine();
			
			for(int j = 0; j < doing.length(); j++) {
				if(doing.charAt(j) == 'c') {
					head++;
				} else {
					head--;
				}
			}
			System.out.println("Data Set " + (i+1) + ":");
			System.out.println(head);
			System.out.println();
		}
	}
	
	// 스키테일 암호
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		String S = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < S.length(); i++) {
			if(i % K == 0) {
				sb.append(S.charAt(i));
			}
		}
		
		System.out.println(sb);
		
	}
	
	// 文字列の反転 (Inversion of a String) 
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		String S = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < B-1; i++) {
			sb.append(S.charAt(i));
		}
		int cnt = 1;
		for(int i = B; i <= N; i++) {
			sb.append(S.charAt(N-cnt));
			cnt++;
		}
		
		for(int i = N; i < A; i++) {
			sb.append(S.charAt(i));
		}
		
		System.out.println(sb);
	}
	
	// Quick Estimates 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		for(int i = 0; i < testCase; i++) {
			String a = br.readLine();
			System.out.println(a.length());
		}
	}

	// Serious Problem
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		String s = br.readLine();
		int two = 0;
		int e = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'e') {
				e++;
			} else {
				two++;
			}
		}
		
		System.out.println("E : " + e);
		System.out.println("TWO : " + two);
		if(e == two) {
			System.out.println("yee");
		} else if(e > two) {
			System.out.println("e");
		} else {
			System.out.println("2");
		}
	}
	
	// 2루수 이름이 뭐야
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		int answer = 0;
		for(int i = 0; i < testCase; i++) {
			String str = br.readLine();
			
			if(str.equals("anj")) {
				answer = 1;
				break;
			}
		}

		if(answer == 0) {
			System.out.println("뭐야?");
		} else {
			System.out.println("뭐야;");
		}
	}
	
	// Adding Commas 
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String A = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		for(int i = A.length()-1; i >= 0; i--) {
			if(cnt%3 == 0 && i != A.length()-1) {
				sb.append(",").append(A.charAt(i));
			} else {
				sb.append(A.charAt(i));
			}
			cnt++;
		}

		System.out.println(sb.reverse());
	}
	
	// JavaScript
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		try {
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			System.out.println(A-B);
			
		} catch(java.lang.NumberFormatException e) {
			System.out.println("NaN");
		}
		
	}
	
}
