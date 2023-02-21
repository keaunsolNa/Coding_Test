package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class StringPlus31 {
	
	public static void main(String[] args) throws IOException {
		test04();
	}

	// 22351번 - 수학은 체육과목 입니다 3
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		int n = 1;
		if(str.length() < 4) {
			
			char c = str.charAt(0);
			while(n < str.length())
				if(str.charAt(n) != c) break;
				else n++;
			
		}
		
		if(n == str.length()) sb.append(str + " " + str);
		
		else {
			
			for(int i = 1; i <= 999; i++) {
				
				if(str.startsWith(Integer.toString(i))) {
					String s = str;
					
					for(int j = i; j <= 999; j++) {
						
						if(s.startsWith(Integer.toString(j))) s = s.substring(Integer.toString(j).length());
						else break;

						if(s.length() == 0) {
							sb.append(i + " " + j);
							break;
						}
						
					}
					
					if(sb.length() != 0) break;
				}
			}
		}
		
		System.out.print(sb);
		
	}
	
	// 4659번 - 비밀번호 발음하기
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input = "";
		while(!(input = br.readLine()).equals("end")) {
			
			boolean chk = true;
			if(!(input.contains("a") || input.contains("e") || input.contains("i") || input.contains("o") || input.contains("u"))) 
				chk = false;
			
			if(chk) {
				
				for(int i = 0; i < input.length() - 1; i++) {
					
					if(input.charAt(i) == input.charAt(i + 1)) {
						
						if((input.charAt(i) != 'e' && input.charAt(i) != 'o')) {
							chk = false;
							break;
						}
					}
						
				}
			}
			
			if(chk) {
				
				int chk2 = 0;
				int chk3 = 0;
				for(int i = 0; i < input.length(); i++) {
					
					if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
						chk2++;
						chk3 = 0;
					}
					else {
						chk2 = 0;
						chk3++;
					}
					
					if(chk2 == 3 || chk3 == 3) {
						chk = false;
						break;
					}
				}
			}
			
			if(chk) sb.append("<" + input + "> is acceptable.");
			else sb.append("<" + input + "> is not acceptable.");
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	// 1380번 - 귀걸이
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int idx = 1;
		while(true) {
			
			int T = Integer.parseInt(br.readLine());
			
			if(T == 0) break;
			
			String[] name = new String[T];
			for(int i = 0; i < T; i++) name[i] = br.readLine();
			
			int[] arr = new int[T];
			for(int i = 0; i < 2 * T - 1; i++) {
				
				st = new StringTokenizer(br.readLine());
				arr[Integer.parseInt(st.nextToken()) - 1] ++;
				
			}
			
			for(int i = 0; i < T; i++) 
				if(arr[i] != 2) sb.append(idx + " " + name[i] + "\n");
			
			idx++;
		}
		
		System.out.print(sb);
	}
	
	// 25206번 - 너의 평점은
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		double totalPoint = 0;
		double sum = 0;
		for(int i = 0; i < 20; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			String name = st.nextToken();
			double point = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			
			double gradePoint = ("A+".equals(grade)) ? 4.5 : ("A0".equals(grade)) ? 4.0 : ("B+".equals(grade)) ? 3.5 :
								("B0".equals(grade)) ? 3.0 : ("C+".equals(grade)) ? 2.5 : ("C0".equals(grade)) ? 2.0 :
								("D+".equals(grade)) ? 1.5 : ("D0".equals(grade)) ? 1.0 : 0.0;
			
			if(!grade.equals("P")) 
				totalPoint += point;
			
			sum += (point * gradePoint);
		}
		
		System.out.printf("%.6f", sum / totalPoint);
	}
	
	
	//
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
	}
	
	
	//
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
	}
	
	
	//
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
	}
	
	
	//
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
	}
	
	
	//
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
	}
	
	
	//
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
	}
	
	
}
