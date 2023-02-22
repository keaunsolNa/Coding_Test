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
		test01();
	}
	
	// 5177번 - 출력 형식이 잘못되었습니다 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			
			String A = br.readLine().toLowerCase();
			
			StringBuilder sb = new StringBuilder();
			for(int a = 0; a < A.length(); a++) {
				
				if(A.charAt(a) == ' ') {
					sb.append(A.charAt(a));
					while(a == A.length() -1 ||  A.charAt(a) != ' ') a++;
				}
				
				sb.append(A.charAt(a));
				
			}
			
			System.out.println(sb);
			A = A.replaceAll("\\(|\\{", "[");
			A = A.replaceAll("\\)|\\}" , "]");
			A = A.replaceAll(",", ";");
			if(A.charAt(0) == ' ') A.replaceFirst(" ", "");
			
			
			String B = br.readLine().toLowerCase();
			B = B.replaceAll("\\(|\\{", "[");
			B = B.replaceAll("\\)|\\}" , "]");
			B = B.replaceAll(",", ";");
			if(B.charAt(0) == ' ') B.replaceFirst(" ", "");
			
			
		}
		
	}
	
	// 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
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
