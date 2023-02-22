package baekjoon_Parsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parsing02 {

	public static void main(String[] args) throws IOException {
		test02();
	}
	
	// 5177번 - 출력 형식이 잘못되었습니다 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder answer = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			
			String A = br.readLine().toLowerCase();
			A = A.replaceAll("\\(|\\{", "[");
			A = A.replaceAll("\\)|\\}" , "]");
			A = A.replaceAll(",", ";");
			A = trim(A);
			A = trim2(A);
			
			String B = br.readLine().toLowerCase();

			B = B.replaceAll("\\(|\\{", "[");
			B = B.replaceAll("\\)|\\}" , "]");
			B = B.replaceAll(",", ";");
			B = trim(B);
			B = trim2(B);
			
			answer.append("Data Set " + (i + 1) + ": ");
			if(A.equals(B)) answer.append("equal");
			else answer.append("not equal");
			
			answer.append("\n");
			answer.append("\n");
			
		}
	
		answer.deleteCharAt(answer.length() - 1);
		answer.deleteCharAt(answer.length() - 1);
		System.out.print(answer);
	}
	
	private static String trim(String str){
	
		StringBuilder sb = new StringBuilder();
		int i;
		int n = str.length();
		char ch;
		
		for(i = 0; i < n;) {
			
			sb.append(ch = str.charAt(i++));
			if(ch==' ') while(i < n && str.charAt(i)==' ') i++; 
			
		}
		
		return sb.toString();
	}
	
	private static String trim2(String str){
		
		StringBuilder sb = new StringBuilder(str);
		int i;
		int idx;
		int n = sb.length();
		char ch;
		
		for(i = 0; i < n; i++) {
			
			ch = sb.charAt(i);
			if(ch == '[' || ch == ']' || ch == ';' || ch == '.' || ch == ':') {

				idx = i - 1;
				
				if((0 <= idx && idx < n) && str.charAt(idx) == ' ') sb.replace(idx, idx + 1, "*");
				
				idx = i + 1;
				
				if((0 <= idx && idx < n) && str.charAt(idx) == ' ') sb.replace(idx, idx + 1, "*");
				
			}
		}
		
		return sb.toString().replaceAll("\\*", ""); 
	}
	
	// 7656번 - 만능 오라클
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] input = br.readLine().split("\\.|\\?");
		
		for(int i = 0; i < input.length; i++) {
			if(input[i].charAt(0) == ' ') input[i] = input[i].replaceFirst(" ", "");
			if(input[i].contains("What is")) {
				input[i] = input[i].replace("What", "Forty-two");
				sb.append(input[i] + ".\n");
			}
			
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	// 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	}
	
	// 
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	}
	
	// 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	}
	
	// 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	}
	
	// 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	}
	
	// 
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	}
	
	// 
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	}
	
	// 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	}

	
}
