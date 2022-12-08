package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class StringPlus15 {
	
	public static void main(String[] args) throws IOException {
		test10();
	}
	
    public static long countChar(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }
    
	// Кондиционер 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int room = Integer.parseInt(st.nextToken());
		int cond = Integer.parseInt(st.nextToken());
		
		String mod = br.readLine();
		
		switch(mod) {
			case "freeze" : 
				if(room <= cond) {
					System.out.println(room);
				} else {
					System.out.println(cond);
				}
				break;
			case "heat"   :
				if(room <= cond) {
					System.out.println(cond);
				} else {
					System.out.println(room);
				}
				break;
			case "auto"   :
				System.out.println(cond);
				break;
			case "fan"    :
				System.out.println(room);
				break;
		}
	}
	
	// 창영이의 일기장
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = br.readLine().split("");
		List<String> strList = new ArrayList<>(Arrays.asList(strArr));
		

		for(int i = 0; i < strList.size(); i++) {
			String strTemp = strList.get(i);
			if(strTemp.equals("a") || strTemp.equals("e") || strTemp.equals("i") || 
					strTemp.equals("o") || strTemp.equals("u")) {
				strList.remove(i);
				strList.remove(i);
			}
			
		}
		
		StringBuilder sb = new StringBuilder();
		for (String string : strList) {
			sb.append(string);
		}
		
		System.out.println(sb);
		
	}

	// 알파벳 전부 쓰기
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			String str = br.readLine();
			StringBuilder sb = new StringBuilder();
			boolean ispangram = true;
			for(int j = 97; j < 123; j++) {
				long chk = countChar(str.toLowerCase(), (char)j);
				
				if(chk < 1) {
					sb.append((char)j);
					ispangram = false;
				}
			}
			
			if(ispangram) {
				System.out.println("pangram");
			} else {
				sb.insert(0, "missing ");
				System.out.println(sb);
			}
		}
		
	}
	
	// Quicksum
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input ="";
		while(!(input = br.readLine()).equals("#")) {
			long total = 0;
			for(int i = 0; i < input.length(); i++) {
				char strChar = input.charAt(i);
				
				for(int j = 1; j < 27; j++) {
					if((int)(strChar - 'A') + 1 == j) {
						total += (i+1) * j;
					}
				}
			}
			System.out.println(total);
		}
	}
	
	// 도깨비말 
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		while(!(input = br.readLine()).equals("#")) {

			for(int i = 0; i < input.length(); i++) {
				boolean flag = false;
				char temp = input.charAt(0);
				input = input.substring(1);
				switch(temp) {	
					case 'a' : 
						input = temp + input; 
						flag = true;
						break;
					case 'e' : 
						input = temp + input; 
						flag = true;
						break;
					case 'i' : 
						input = temp + input ; 
						flag = true;
						break;
					case 'o' : 
						input = temp + input; 
						flag = true;
						break;
					case 'u' : 
						input = temp + input; 
						flag = true;
						break;
					default : input = input +temp; break;
				}
			
				if(flag) break;
			}
			System.out.println(input + "ay");
		}
		
	}
	
    // Java Bitecode
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		input = input.replaceAll("A", "");
		input = input.replaceAll("J", "");
		input = input.replaceAll("V", "");
		
		if(input.length() == 0) {
			System.out.println("nojava");
		} else {
			System.out.println(input);
		}
		
    }

	// Caesar Cipher
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int k = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		String S = br.readLine();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s; i++) {
			int alp = (int)S.charAt(i);
			
			if(alp > 96 && alp < 123) {
				alp += k%26;
				if(alp < 123) {
					sb.append((char)alp);
				} else {
					alp = alp - 26;
					sb.append((char)alp);
				}
			} else if(alp > 64 && alp < 91) {
				alp += k%26;
				if(alp < 91) {
					sb.append((char)alp);
				} else {
					alp = alp - 26;
					sb.append((char)alp);
				}
			} else {
				sb.append((char)alp);
			}
		}
		
		System.out.println(sb);
		
	}
	
	// 이상한 나라의 암호
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		int idx = 2;
		StringBuilder sb = new StringBuilder();
		while(!(input = br.readLine()).equals("Was it a cat I saw?")) {
			for(int i = 0; i < input.length(); i += idx) {
				sb.append(input.charAt(i));
			}
			idx++;
			
			sb.append("\n");
		}
		
		System.out.print(sb.deleteCharAt(sb.length()-1));
	}
	
	// Count Me In 
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		String[] vowel = {"a", "e", "i", "o", "u"};
		for(int i = 0; i < T; i++) {
			String str = br.readLine().toLowerCase().replaceAll(" ", "");

			long vowelLength = countArrChar(str, vowel);
			
			System.out.println(str.length() - vowelLength + " " + vowelLength);
		}
	}
	
    public static long countArrChar(String str, String[] ch) {
    	long temp = 0;
    	
    	for(int i = 0; i < ch.length; i++) {
    		char cr = ch[i].charAt(0);
    		temp += str.chars()
    				.filter(c -> c == cr)
    				.count();
    	}
    	
    	return temp;
    }

    // 나는 친구가 적다 (Large)
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		S = S.replaceAll("[0-9]", "");
		String K = br.readLine();
		
		if(kmp(S, K)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}
	
	private static boolean kmp(String S, String K) {
		int[] table = makeTable(K);
		
		int n1 = S.length();
		int n2 = K.length();
		
		int idx = 0;
		for(int i = 0; i < n1; i++) {
			while(idx > 0 && S.charAt(i) != K.charAt(idx)) {
				idx = table[idx-1];
			}
			
			if(S.charAt(i) == K.charAt(idx)) {
				if(idx == n2 - 1) {
					idx = table[idx];
					return true;
				}else {
					idx++;
				}
			}
		}
		return false;
	}
	
	private static int[] makeTable(String K) {
		int n = K.length();
		int[] table = new int[n];
		
		int idx = 0;
		for(int i = 1; i < n; i++) {
		
			while(idx > 0 && K.charAt(i) != K.charAt(idx)) {
				idx = table[idx-1];
			}
			
			if(K.charAt(i) == K.charAt(idx)) {
				idx ++;
				table[i] = idx;
			}
		}
		
		return table;
				
	}
	
}
