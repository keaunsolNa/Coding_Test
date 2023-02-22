package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class StringPlus31 {
	
	public static void main(String[] args) throws IOException {
		test10();
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
	
	// 9253번 - 스페셜 저지
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		String B = br.readLine();
		String C = br.readLine();
		
		if(A.contains(C) && B.contains(C)) System.out.println("YES");
		else System.out.println("NO");
	}
	
	// 17176번 - 암호해독기
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		char[] cryptogram = new char[N];
		for(int i = 0; i < N; i++) {
			int temp = Integer.parseInt(st.nextToken());
			
			if(temp > 26) cryptogram[i] = ((char)(temp + 70));
			else if(temp > 0) cryptogram[i] = ((char)(temp + 64)) ;
			else cryptogram[i] = ' ';
		}
		
		Arrays.sort(cryptogram);
		
		char[] plainText = br.readLine().toCharArray();
		Arrays.sort(plainText);
		
		for(int i = 0; i < N; i++) {
			if(plainText[i] != cryptogram[i]) {
				System.out.println("n");
				return;
			}
		}
		
		System.out.println("y");
	}
	
	// 4446번 - ROT13
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = "";
		Integer[] lowerVowels = new Integer[] {97, 105, 121, 101, 111, 117};
		Integer[] lowerConsonant = new Integer[] {98, 107, 120, 122, 110, 104, 100, 99, 119, 103, 112, 118, 106, 113, 116, 115, 114, 108, 109, 102};
		Integer[] upperVowels = new Integer[] {65, 73, 89, 69, 79, 85};
		Integer[] upperConsonant = new Integer[] {66, 75, 88, 90, 78, 72, 68, 67, 87, 71, 80, 86, 74, 81, 84, 83, 82, 76, 77, 70};
		
		List<Integer> LV = new ArrayList<Integer>(Arrays.asList(lowerVowels)); 
		List<Integer> LC = new ArrayList<Integer>(Arrays.asList(lowerConsonant)); 
		List<Integer> UV = new ArrayList<Integer>(Arrays.asList(upperVowels)); 
		List<Integer> UC = new ArrayList<Integer>(Arrays.asList(upperConsonant)); 
		
		while((input = br.readLine()) != null) {
			
			for(int i = 0; i < input.length(); i++) {
				
				int temp = (int)input.charAt(i);
				if(temp > 96 && temp < 123) {
					
					if(temp == 97 || temp == 101 || temp == 105 || temp == 111 || temp == 117 || temp == 121) {
						int index = LV.indexOf(temp);
						
						if(index - 3 < 0) sb.append((char)(int)LV.get(index + 3));
						else sb.append((char)(int)LV.get(index - 3));
					}
					
					else {
						
						int index = LC.indexOf(temp);
						
						if(index - 10 < 0) sb.append((char)(int)LC.get(index + LC.size() - 10));
						else sb.append((char)(int)LC.get(index - 10));
					}
				}
				
				else if(temp > 64 && temp < 91){
					
					if(temp == 65 || temp == 73 || temp == 89 || temp == 69 || temp == 79 || temp == 85) {
						int index = UV.indexOf(temp);
						
						if(index - 3 < 0) sb.append((char)(int)UV.get(index + 3));
						else sb.append((char)(int)UV.get(index - 3));
					}
					
					else {
						
						int index = UC.indexOf(temp);
						
						if(index - 10 < 0) sb.append((char)(int)UC.get(index + UC.size() - 10));
						else sb.append((char)(int)UC.get(index - 10));
					}
				}
				
				else sb.append(input.charAt(i));
				
			}
		
			sb.append("\n");
		}		
		
		System.out.println(sb);
	}
	
	// 5426 - 비밀 편지
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
	
		for(int i = 0; i < T; i++) {
			String input = br.readLine();
			int length = input.length();
			length = (int)Math.sqrt(length);
			char[][] map = new char[length][length];

			int idx = 0;
			for(int j = 0; j < length; j++) {
				
				for(int k = 0; k < length; k++) {
					map[j][k] = input.charAt(idx);
					idx++;
				}
			}
			
			char[][] ans = new char[length][length];
			
			for(int j = 0; j < length; j++) {
				
				for(int k = 0; k < length; k++) {
					
					ans[j][k] = map[k][length - j - 1];
				}
			}
			
			for (char[] cs : ans) {
				for (char cs2 : cs) {
					sb.append(cs2);
				}
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	// 2890번 - 카약 
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < x; i++) {
			
			String input = br.readLine();
			for(int j = 0; j < y; j++) {
				
				char temp = input.charAt(j);
				if(temp != 'S' && temp != '.' && temp != 'F') {
					map.put(Character.getNumericValue(temp), y - j);
					break;
				}
			}
		}
		
		Set<Integer> set = new HashSet<>();
		for (int key : map.keySet()) set.add(map.get(key));
		
		List<Integer> sortList = new ArrayList<>(set);
		Collections.sort(sortList);
		
		for (Integer key : map.keySet()) System.out.println(sortList.indexOf(map.get(key)) + 1);
	}
	
	// 25193번 - 곰곰이의 식단 관리
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();

		int C = (int)countChar(input, 'C');

		System.out.println(C / (N - C + 1) + (C % (N - C + 1) != 0 ? 1 : 0));
	}
	
	 
	public static long countChar(String str, char ch) {
		return str.chars()
				.filter(c -> c == ch)
				.count();
	}
	
}
