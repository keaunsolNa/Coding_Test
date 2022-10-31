package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class StringPlus11 {
	
	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 디지털 루트
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		while(!(input = br.readLine()).equals("0")) {
			while(input.length() > 1) {
				int number = 0;
				for(int i = 0; i < input.length(); i++) {
					number += Character.getNumericValue(input.charAt(i));
				}
				input = number + "";
			}
			System.out.println(input);
		}
	}
	
	// 도비의 영어 공부
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		while(!(input = br.readLine()).equals("#")) {
			String[] temp = input.split(" ");
			Character target = temp[0].charAt(0);
			String str = "";
			for(int i = 1; i < temp.length; i++) {
				str += temp[i].toLowerCase();
			}
			int cnt = 0;
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == target) {
					cnt++;
				}
			}
			
			System.out.println(target + " " + cnt);
		}
	
	}

	// 팰린드롬
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String input = br.readLine().toLowerCase();
			int answer = 0;
			for(int j = 0; j < input.length()/2; j++) {
				if(input.charAt(j) != input.charAt(input.length() - (j+1))) {
					answer = 1;
					break;
				}
			}
			
			if(answer == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
	
	// 요다
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < T; i++) {
			String[] temp = br.readLine().split(" ");
			
			for(int j = 2; j < temp.length; j++) {
				sb.append(temp[j] + " ");
			}
			sb.append(temp[0] + " " + temp[1]);
			System.out.println(sb);
			sb.setLength(0);
		}
	}
	
	// 비교 연산자
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		int cnt = 1;
		
		while(!(input = br.readLine()).contains("E")) {
			String[] temp = input.split(" ");
			boolean answer = true;
			
			switch(temp[1]) {
				case ">" : 
					answer = Integer.parseInt(temp[0]) > Integer.parseInt(temp[2]) ? true : false;  
					break;
				case ">=" : 
					answer = Integer.parseInt(temp[0]) >= Integer.parseInt(temp[2]) ? true : false;
					break;
				case "<" : 
					answer = Integer.parseInt(temp[0]) < Integer.parseInt(temp[2]) ? true : false;
					break;
				case "<=" : 
					answer = Integer.parseInt(temp[0]) <= Integer.parseInt(temp[2]) ? true : false;
					break;
				case "==" : 
					answer = Integer.parseInt(temp[0]) == Integer.parseInt(temp[2]) ? true : false;
					break;
				case "!=" : 
					answer = Integer.parseInt(temp[0]) != Integer.parseInt(temp[2]) ? true : false;
					break;
			}
			
			System.out.println("Case " + cnt + ": " + answer);
			cnt++;
		}
		
	}
	
	// 너의 이름은 몇 점이니?
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int score = 0;
		String name = br.readLine();
		for(int i = 0; i < name.length(); i++) {
			score += name.charAt(i)-64;
		}
		
		System.out.println(score);
    }

	// 대충 더해 
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String A = st.nextToken();
		String B = st.nextToken();
		
		while(A.length() != B.length()) {
			
			if(A.length() > B.length()) {
				B = "0" + B;
			} else {
				A = "0" + A;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = A.length() - 1; i >= 0; i--) {
			sb.insert(0, Character.getNumericValue(A.charAt(i)) + Character.getNumericValue(B.charAt(i)));
		}
		
		System.out.println(sb);
	}
	
	// 박사 과정 
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String str = br.readLine();
			
			if(str.equals("P=NP")) {
				System.out.println("skipped");
			} else {
				String[] temp = str.split("[+]");
				System.out.println(Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]));
			}
		}
	}
	
	// 문자가 몇갤까
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		Map<Character, Integer> map = new HashMap<>();
		
		while(!(input = br.readLine()).equals("#")) {
			input = input.toLowerCase();
			
			for(int i = 97; i < 123; i++) {
				map.put((char)i, 0);
			}
			
			for(int i = 0; i < input.length(); i++) {
				if(map.containsKey(input.charAt(i))) {
					map.put(input.charAt(i), 1);
				}
			}

			int cnt = 0;
			for(int i = 97; i < 123; i++) {
				
				if(map.get((char)i) == 1) {
					cnt++;
				}
			}
			map.clear();
			
			System.out.println(cnt);
		}
		
	}
	
	// 니모를 찾아서
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		while(!(input = br.readLine()).equals("EOI")) {
			input = input.toLowerCase();
			
			if(input.contains("nemo")) {
				System.out.println("Found");
			} else {
				System.out.println("Missing");
			}
		}
		
	}
	
}
