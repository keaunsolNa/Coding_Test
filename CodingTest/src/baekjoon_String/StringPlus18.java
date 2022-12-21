package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class StringPlus18 {
	
	public static void main(String[] args) throws IOException {
		test10();
	}

	// 애너그램 만들기
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] alp = new int[26];
		char[] A = br.readLine().toCharArray();
		char[] B = br.readLine().toCharArray();
		int sum = 0;
		
		for (char c : A) alp[c - 97]++;
		for (char c : B) alp[c - 97]--;
		
		for(int i = 0; i < alp.length; i++) {
			alp[i] = Math.abs(alp[i]);
			if(alp[i] != 0) sum += alp[i];
		}
		
		System.out.println(sum);
	}
	
	// 줄임말 만들기 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] text = br.readLine().split(" ");
		String[] ban = {"i" , "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili"};
		StringBuilder sb = new StringBuilder();

		sb.append((text[0].charAt(0)+"").toUpperCase());
		
		for(int i = 1; i < text.length; i++) {
			
			boolean flag = true;
			
			for(int j = 0; j < ban.length; j++) {
				
				if(text[i].equals(ban[j])) {
					
					flag = false;
					break;
					
				}
			}
			
			if(flag) sb.append((text[i].charAt(0)+"").toUpperCase()); 
		}
		
		System.out.println(sb);
	}

	// 팬그램  
	public static void test03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		while(!(input = br.readLine()).equals("*")) {
			Set<Character> set = new HashSet<>();
			input = input.replaceAll(" ", "");
			for(int i = 0; i < input.length(); i++) set.add(input.charAt(i));
			
			if(set.size() == 26) {
				System.out.println("Y");
			} else {
				System.out.println("N");
			}
		}
	}
	
	// Decoder 
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			String input = br.readLine();
			
			for(int i = 0; i < input.length(); i++) {
				
				switch(input.charAt(i)) {
					case 'y' : sb.append('a'); break; 
					case 'Y' : sb.append('A'); break; 
					case 'a' : sb.append('e'); break;
					case 'A' : sb.append('E'); break;
					case 'e' : sb.append('i'); break;
					case 'E' : sb.append('I'); break;
					case 'i' : sb.append('o'); break;
					case 'I' : sb.append('O'); break;
					case 'o' : sb.append('u'); break;
					case 'O' : sb.append('U'); break;
					case 'u' : sb.append('y'); break;
					case 'U' : sb.append('Y'); break;
					default : sb.append(input.charAt(i)); 
				}
			}
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
	}
	
	// Smile with Similes 
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		String[] adjectives = new String[N];
		String[] nouns  = new String[M];
		
		for(int i = 0; i < N; i++) adjectives[i] = br.readLine();
		for(int i = 0; i < M; i++) nouns[i] = br.readLine();
	
		for(int i = 0; i < adjectives.length; i++) {
			
			for(int j = 0; j < nouns.length; j++) {
				sb.append(adjectives[i] + " as " + nouns[j]).append("\n");
			}
		}
		
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
	}
	
    // Easy-to-Pronounce Words
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Character[] vowel = { 'a', 'e', 'i', 'o', 'u'};
		List<Character> vowelList = Arrays.asList(vowel);
		
		boolean chk;
		
		if(vowelList.contains(input.charAt(0))) {
			chk = true;
		} else {
			chk = false;
		}
		
		boolean chk2 = true;
		for(int i = 1; i < input.length(); i++) {
			if(vowelList.contains(input.charAt(i))) {
				if(chk) {
					chk2 = false;
					break;
				}
				chk = true;
			} else {
				if(!chk) {
					chk2 = false;
					break;
				}
				chk = false;
			}
			
		}
		
		if(chk2) System.out.println(1);
		else System.out.println(0);
    }

	// 버그왕 
	public static void test07() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        
        while((input = br.readLine()) != null) {
        	while(input.contains("BUG")) {
        		input = input.replaceAll("BUG", "");
        	}
        	
        	sb.append(input).append("\n");
        }
        
        sb.deleteCharAt(sb.length()-1);
        System.out.print(sb);
	}
	
	// Occupy parking
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int space = Integer.parseInt(br.readLine());
		
		int emptySpace = 0;
		String before = br.readLine();
		String now = br.readLine();
		
		for(int i = 0; i < space; i++) {
			
			if(before.charAt(i) == 'C') {
				
				if(now.charAt(i) == 'C') {
					emptySpace++;
				}
			}
		}
		
		System.out.println(emptySpace);
				
	}
	
	// Password check 
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			boolean flag = false;
			int length = Integer.parseInt(br.readLine());
			String str = br.readLine();
			
			if(length >= 12) {
				
				if(!str.equals(str.toUpperCase())) {
					
					if(!str.equals(str.toLowerCase())) {
						
						if(!str.equals(str.replaceAll("[0-9]", ""))) {
							
							if(!str.equals(str.replaceAll("[+_)(*&^%$#@!./,;{}]", ""))) {
								
								flag = true;
							}
						}
					}
				}
			}
			
			if(flag) {
				System.out.println("valid");
			} else {
				System.out.println("invalid");
			}
		}
	}
	
    // 타노스
	public static void test10() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] arr = new char[s.length()];
        int cnt0 = 0;
        int cnt1 = 0;
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.charAt(i);
            if (arr[i] == '0') cnt0++;
            else cnt1++;
            
        }
        
        cnt0/=2;
        cnt1/=2;

        for (int i = 0; i < s.length() && cnt1!=0; i++) 
            if (arr[i] == '1') {
            	cnt1--;
                arr[i] = 0;
            }

        for (int i = s.length()-1; i >= 0 && cnt0!=0; i--) 
        	if (arr[i] == '0') {
                cnt0--;
                arr[i] = 0;
            }
        	

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++)  if (arr[i] != 0) answer.append(arr[i]);
        
        System.out.println(answer);
	}
	
	
}
