package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Test06_StringPlus3 {
	
	// 학점 계산
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String C = br.readLine();
		
		switch(C){
			case "A+" : System.out.println(4.3);break; 
			case "A0" : System.out.println(4.0);break; 
			case "A-" : System.out.println(3.7);break; 
			case "B+" : System.out.println(3.3);break; 
			case "B0" : System.out.println(3.0);break; 
			case "B-" : System.out.println(2.7);break; 
			case "C+" : System.out.println(2.3);break; 
			case "C0" : System.out.println(2.0);break; 
			case "C-" : System.out.println(1.7);break; 
			case "D+" : System.out.println(1.3);break; 
			case "D0" : System.out.println(1.0);break; 
			case "D-" : System.out.println(0.7);break; 
			case "F" : System.out.println(0.0);break; 
		}
	}

	// 문자열
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			String temp = br.readLine();
			System.out.println(temp.charAt(0)+""+temp.charAt(temp.length()-1));
		}
	}

	// 아!
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String can = br.readLine();
		String doctor = br.readLine();
		
		if(can.length() >= doctor.length()) {
			System.out.println("go");
		} else {
			System.out.println("no");
		}
	}
	
	// 성택이의 은밀한 비밀번호
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		for(int i = 0; i < testCase; i++) {
			String password = br.readLine();
			if(password.length() >= 6 && password.length() <= 9) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
	
	// Zadanie próbne
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer W = new StringBuffer(br.readLine());
		System.out.println(W.reverse());
	}
	
	// 대소문자 바꾸기
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = br.readLine();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < temp.length(); i++) {
			if(temp.charAt(i) >= 97 && temp.charAt(i) <= 122) {
				sb.append((char)(temp.charAt(i) - 32));
			} else {
				sb.append((char)(temp.charAt(i) + 32));
			}
		}
		System.out.println(sb);
	}

	// !밀비 급일
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = "";
		while(!(temp = br.readLine()).equals("END")) {
			StringBuffer sb = new StringBuffer(temp);
			System.out.println(sb.reverse());
		}
	}
	
	// 모음의 개수
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = "";
		String[] vowel = {"a", "e", "i", "o", "u"};
		while(!(temp = br.readLine()).equals("#")) {
			int answer = 0;
			for(int i = 0; i < temp.length(); i++) {
				if(Arrays.asList(vowel).contains(temp.toLowerCase().charAt(i)+"")) {
					answer++;
				}
			}
			System.out.println(answer);
		}
	}
	
	// 뜨거운 붕어빵
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		int testCase = Integer.parseInt(st.nextToken());

		for(int i = 0; i < testCase; i++) {
			sb = new StringBuilder(br.readLine());
			System.out.println(sb.reverse());
		}
	}
	
	// 한글 2
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br.readLine().charAt(0)-44031);
	}
	
}
