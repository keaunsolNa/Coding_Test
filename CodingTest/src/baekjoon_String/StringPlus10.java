package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class StringPlus10 {
	
	public static void main(String[] args) throws IOException {
		test01();
	}
	
	// 부분 문자열
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		String P = br.readLine();
		
		System.out.println(KMP(S, P));
	}
	
	// KMP 알고리즘
	static int KMP(String parent, String pattern) {
		int[] table = makeTable(pattern);
		int n1 = parent.length();
		int n2 = pattern.length();
		
		int idx = 0;
		for(int i = 0; i < n1; i++) {
			while(idx > 0 && parent.charAt(i) != pattern.charAt(idx)) {
				idx = table[idx-1];
			}
			
			if(parent.charAt(i) == pattern.charAt(idx)) {
				if(idx == n2 - 1) {
					idx = table[idx];
					return 1; 
				}else {
					idx += 1;
				}
			}
		}
		 
		return 0; 
		
	}
	
	// 테이블 생성
	static int[] makeTable(String pattern) {
		int n = pattern.length();
		int[] table = new int[n];
		
		int idx = 0;
		for(int i = 1; i < n; i++) {
			while(idx > 0 && pattern.charAt(i) != pattern.charAt(idx)) {
				idx = table[idx - 1];
			}
			
			if(pattern.charAt(i) == pattern.charAt(idx)) {
				idx += 1;
				table[i] = idx;  
			}
		}
		
		return table;
 	}


	// 닉네임에 갓 붙이기
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			StringBuilder sb = new StringBuilder();
			String[] nickName = br.readLine().split(" ");
			sb.append("god");
			
			for(int j = 1; j < nickName.length; j++) {
				sb.append(nickName[j]);
			}
			
			sb.append("\n");
			System.out.print(sb);
			
		}
	}
	
	
	// 사칙연산
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String[] str = br.readLine().split(" ");
			String answer = "";
			long a = Long.parseLong(str[0]);
			long b = Long.parseLong(str[2]);
			long ans = Long.parseLong(str[4]);
			
			switch(str[1]) {
				case "+" : 
					if(a + b == ans) { 
						answer = "correct";
					} else {
						answer ="wrong answer";
					}
					break;
					
				case "-" : 
					if(a - b == ans) {
						answer = "correct";
					} else {
						answer ="wrong answer";
					}
					break;
					
				case "*" : 
					if(a * b == ans) {
						answer = "correct";
					} else {
						answer ="wrong answer";
					}
					break;
					
				case "/" : 
					if(a / b == ans) {
						answer = "correct";
					} else {
						answer ="wrong answer";
					}
					break;
			}
			
			System.out.println(answer);
			
		}
	
	}
	
}
