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
		test10();
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
	
	// Divisionals Spelling
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int answer = 0;

		for(int i = 0; i < N; i++) {
			
			String quizStr = br.readLine();
			Set<Character> charHash = new HashSet<>();
			
			for(int j = 0; j < quizStr.length(); j++) {
				if(((int)quizStr.charAt(j))-64 > M) {
					break;
				} else
				charHash.add(quizStr.charAt(j));
			}
			
			if(quizStr.length() == charHash.size()) {
				answer++;
			}
		}
		
		System.out.println(answer);
	}
	
	// Jazz Enthusiast
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int totalPlayTime = 0;
		for(int i = 0; i < N; i++) {
			String[] time = br.readLine().split(":");
			totalPlayTime += Integer.parseInt(time[0])*60 + Integer.parseInt(time[1]); 
		}
		int playTime = totalPlayTime - ((N-1)*C);
		String pH = playTime/3600 + "";
		String pM = playTime%3600/60 + "";
		String pS = playTime%60 + "";
		
		if(pH.length() == 1) {
			pH = "0" + pH;
		}
		if(pM.length() == 1) {
			pM = "0" + pM;
		}
		if(pS.length() == 1) {
			pS = "0" + pS;
		}
		
		System.out.println(pH + ":" + pM + ":" + pS);
	}
	
	// 소수 단어
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		int number = 0;
		
		for(int i = 0; i < word.length(); i++) {
			char tempChar = word.charAt(i);
			
			if((int)tempChar <= 90) {
				number += ((int)tempChar) - 38;
				System.out.println(((int)tempChar) - 38);
			} else {
				number += ((int)tempChar) - 96;
				System.out.println(((int)tempChar) - 96);
			}
		}
		
		if(number == 1) {
			System.out.println("It is a prime word.");
		} 
		else
		if(isPrime(number)) {
			System.out.println("It is a prime word.");
		} else {
			System.out.println("It is not a prime word.");
		}
		
	}
	
    public static boolean isPrime(long n) {
		
        if(n == 1 || n == 0) return false;

        for(long i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) return false;
        }

        return true;
        
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
	
	// NN
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			sb.append(N);
		}
		
		if(sb.length() > M) {
			System.out.print(sb.toString().substring(0, M));
		} else {
			System.out.println(sb);
		}
	}
	
	// 한다 안한다
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String str = br.readLine();
			if(str.charAt(str.length()/2 - 1) == str.charAt(str.length()/2)){
				System.out.println("Do-it");
			} else {
				System.out.println("Do-it-Not");
			}
			
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
