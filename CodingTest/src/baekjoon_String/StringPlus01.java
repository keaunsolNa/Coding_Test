package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringPlus01 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 그대로 출력하기
	public static void test01() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
	}
	
	//열 개씩 끊어 출력하기
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();
		for(int i = 0; i < text.length(); i++) {
			if(i != 0 && i%10 == 0) {
				System.out.println();
				System.out.print(text.charAt(i));
			} else {
				System.out.print(text.charAt(i));
			}
		}
	}

	// 그대로 출력하기2
	public static void test03() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
	}
	
	// A + B - 6
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), ",");
			System.out.println(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
		}
	}
	
	// 단어 길이 재기
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br.readLine().length());
	}

	// 알파벳 개수
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		StringBuilder sb = new StringBuilder();
		for(int i = 97; i < 123; i++) {
			int answer = 0;
			for(int j = 0; j < S.length(); j++) {
				if(i == S.charAt(j)) {
					answer++;
				}
			}
			if(i != 122) {
				sb.append(answer).append(" ");
			} else {
				sb.append(answer);
			}
		}
		System.out.println(sb);
	}

	// 팰린드롬수 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String temp = br.readLine();
			if(temp.equals("0")) {
				break;
			}
			int answer = 0;
			for(int i = 0; i < temp.length()/2; i++) {
				if(!(temp.charAt(i) == temp.charAt(temp.length() - (i+1)))) answer++;
			}
			if(answer > 0) {
				System.out.println("no");
			} else {
				System.out.println("yes");
			}
		}
	}

	// 하얀 칸
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer = 0;
		int whiteOrBlack = 1;
		for(int i = 1; i < 9; i++) {
			String temp = br.readLine();
			for(int j = 1; j < temp.length() + 1; j++) {
				if(temp.charAt(j - 1) == 'F') {
					if(j%2 == whiteOrBlack) {
						answer++;
					}
				}
			}
			if(whiteOrBlack == 1) {
				whiteOrBlack = 0;
			} else {
				whiteOrBlack = 1;
			}
		}
		
		System.out.println(answer);
	}

	// KMP는 왜 KMP일까?
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken().charAt(0));
		}
	}

	// 팰린드롬인지 확인하기
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = br.readLine();
		int answer = 1;
		for(int i = 0; i < temp.length()/2; i++) {
			if(!(temp.charAt(i) == temp.charAt(temp.length() - (i+1)))) {
				answer = 0;
				break;
			}
		}
		System.out.println(answer);
	}
}
