package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Test06_StringPlus2 {

	// 명령 프롬프트
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] stringArray = new String[N];
		for(int i = 0; i < N; i++) {
			stringArray[i] = br.readLine();
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < stringArray[0].length(); i++) {
			char temp = stringArray[0].charAt(i);
			int cnt = 0;
			for(int j = 1; j < N; j++) {
				if(temp != stringArray[j].charAt(i)) {
					cnt = -1;
				}
			}
			
			if(cnt == -1) {
				sb.append("?");
			} else {
				sb.append(stringArray[0].charAt(i));
			}
		}
		
		System.out.println(sb);
		
	}

	// 8진수 2진수
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s  = br.readLine();

		StringBuilder sb = new StringBuilder();
		String[] str = {"000","001","010","011","100","101","110","111"};
		
		for(int i = 0; i < s.length(); i++) {
			int a = s.charAt(i)- '0';
			sb.append(str[a]);
		}
		
		if(s.equals("0")) System.out.println(s);
		else {
			while(sb.charAt(0) == '0') {
				sb = new StringBuilder(sb.substring(1));
			}
			System.out.println(sb);
		}
	}

	// 단어 뒤집기
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		StringBuilder answer = new StringBuilder();
		
		for(int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) {
				sb = new StringBuilder(st.nextToken());
				sb.reverse();
				answer.append(sb).append(" ");
			}
			System.out.println(answer);
			answer.delete(0,answer.length());
		}
		
	}
	
	// ROT13
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] S = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int j = 0; j < S.length; j++) {
		
			String temp = S[j];
			for(int i = 0; i < temp.length(); i++) {
				if(temp.charAt(i) >= 65 && temp.charAt(i) <= 90) {
					if(!(temp.charAt(i) + 13 > 90)) {
						sb.append((char)(temp.charAt(i) + 13));
					} else {
						sb.append((char)((temp.charAt(i) + 13) - 26));
					}
				} else if(temp.charAt(i) >= 97 && temp.charAt(i) <= 122) {
					if(!(temp.charAt(i) + 13 > 122)) {
						sb.append((char)(temp.charAt(i) + 13));
					} else {
						sb.append((char)((temp.charAt(i) + 13) - 26));
					}
				} else {
					sb.append((char)temp.charAt(i));
				}
			}
			sb.append(" ");
		}
		System.out.println(sb);
	}
	
	// 네 수
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		long AB = Long.parseLong(temp[0] + temp[1]);
		long CD = Long.parseLong(temp[2] + temp[3]);
		System.out.println(AB + CD);
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

	// 세로읽기
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] charArr = new char[5][15];
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < 5; i++) {
			charArr[i] = br.readLine().toCharArray();
		}

		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 5; j++) {
				if(i < charArr[j].length) {
					sb.append(charArr[j][i]);
				}
			}
		}
		
		System.out.println(sb);
	}
	
	// 듣보잡
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> hashMap = new HashMap<>();
		List<String> arrList = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			hashMap.put(br.readLine(), 1);
		}
		
		for(int i = 0; i < M; i++) {
			String temp = br.readLine();
			hashMap.put(temp, hashMap.getOrDefault(temp, 0) + 1);
			if(hashMap.get(temp) == 2) arrList.add(temp);
		}
		
		Collections.sort(arrList);
		sb.append(arrList.size() + "\n");
		for (String string : arrList) {
			sb.append(string + "\n");
		}
		
		System.out.println(sb);
	}

	// 접미사 배열
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder S = new StringBuilder( br.readLine());
		List<String> SList = new ArrayList<>();

		while(S.length() != 0) {
			SList.add(S.toString());
			S.deleteCharAt(0);
		}

		Collections.sort(SList);
		for (String string : SList) {
			System.out.println(string);
		}
	}
	
	// 문자열 분석
	public static void test10() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
		while((input = br.readLine()) != null) {
			StringBuilder sb = new StringBuilder();
			char[] tempChar = input.toCharArray();
			int space = 0;
			int upperCase = 0;
			int lowerCase = 0;
			int number = 0;
			
			for(int i = 0; i < tempChar.length; i++) {
				char temp = tempChar[i];
				if(temp >= '0' && temp <= '9') {
					number++;
				} else if(temp == 32) {
					space++;
				} else if(temp >= 97 && temp <= 122 ) {
					lowerCase++;
				} else if(temp >= 65 && temp <= 90) {
					upperCase++;
				}
			}
			sb.append(lowerCase + " " + upperCase + " " + number + " " + space);
			System.out.println(sb);
		}
	}
}
