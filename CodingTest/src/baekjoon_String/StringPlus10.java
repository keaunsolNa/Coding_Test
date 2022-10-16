package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class StringPlus10 {
	
	public static void main(String[] args) throws IOException {
		test03();
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

	// 수 뒤집기
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			
			StringBuilder reverseInt = new StringBuilder(br.readLine());
			int originInt = Integer.parseInt(reverseInt.toString());
			reverseInt.reverse();
			
			String combineInt = (originInt + Integer.parseInt(reverseInt.toString()))+"";
			String check = "";
			StringBuilder sb  = new StringBuilder();
			
			for(int j = 0; j < (combineInt.length()/2); j++) { 
				
				char left = combineInt.charAt(j);
				char right = combineInt.charAt(combineInt.length()-j-1);
				
				if(left != right) { 
					check = "PASS";
					break;
				}
				
			}
			
			if(check.equals(""))System.out.println("YES");
			else System.out.println("NO");
		}
	
	}

	// Strfry
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
            List<Character> list1 = new ArrayList<>();
            List<Character> list2 = new ArrayList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for (Character character : st.nextToken().toCharArray()) {
            	list1.add(character);
			}
            
            for (Character character : st.nextToken().toCharArray()) {
            	list2.add(character);
			}
            
            Collections.sort(list1);
            Collections.sort(list2);

            while(! list1.isEmpty() && ! list2.isEmpty()){
                if (list1.remove(0) != list2.get(0)) break;
                list2.remove(0);
            }

            if (list2.isEmpty()) System.out.println("Possible");
            else System.out.println("Impossible");
		}
		
	}
	
	// 지영 공주님의 마법 거울
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
	}
	
	// 농구 경기
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
	}
	
	// 알파벳 거리
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		
	}

	// 가장 많은 글자
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	// 첼시를 도와줘! 
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		
	}
	
	// 연속구간
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	}
	
	// 카이사르 암호
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	}
	
}
