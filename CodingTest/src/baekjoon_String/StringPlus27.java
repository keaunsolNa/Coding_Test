package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class StringPlus27 {
	
	public static void main(String[] args) throws IOException {
		test10();
	}

	// Battle Simulation 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		input = input.replaceAll("RBL|RLB|BRL|BLR|LRB|LBR", "C");
		for(int i = 0; i < input.length(); i++) {
			
			switch(input.charAt(i)) {
				case 'R' : sb.append("S"); break;
				case 'B' : sb.append("K"); break;
				case 'L' : sb.append("H"); break;
				default : sb.append("C"); break;
			}
		}
		
		System.out.print(sb);
	}
	
	// Silent Auction 
	public static void test02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        String winner = "";
        
        for(int i = 0; i < N; i++) {
        	String name = br.readLine();
        	int money = Integer.parseInt(br.readLine());
        	
        	if(money > max) {
        		max = money;
        		winner = name;
        	}
        }
        
        System.out.println(winner);
	}
	   
	// Count Vowels 
	public static void test03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        while(T --> 0) {

        	String text = br.readLine();
        	sb.append("The number of vowels in " + text + " is ");
        	long count = 0;
        	count += countChar(text, 'a');
        	count += countChar(text, 'e');
        	count += countChar(text, 'i');
        	count += countChar(text, 'o');
        	count += countChar(text, 'u');
        	
        	sb.append(count + "." + "\n");
        	
        }
        
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
	}
	
	// countChar 알고리즘
	public static long countChar(String str, char ch) {
    
		return str.chars()
				  .filter(c -> c == ch)
				  .count();
	}
	
	// Vowel Count
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			String text = br.readLine();
			sb.append(text + "\n");
			
			
			long vowel = 0;
			vowel += countChar(text, 'a');
			vowel += countChar(text, 'e');
			vowel += countChar(text, 'i');
			vowel += countChar(text, 'o');
			vowel += countChar(text, 'u');
			
			long consonant  = text.length() - vowel;
			
			if(vowel > consonant) sb.append(1 + "\n");
			else sb.append(0 + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
		
	}
	
	// Billing 
	public static void test05() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        
        double total = 0;
        while(!(input = br.readLine()).equals("EOI")) {
        	
        	switch(input) {
        		case "Paper" : total += 57.99; break;
        		case "Printer" : total += 120.50; break;
        		case "Planners" : total += 31.25; break;
        		case "Binders" : total += 22.50; break;
        		case "Calendar" : total += 10.95; break;
        		case "Notebooks" : total += 11.20; break;
        		case "Ink" : total += 66.95; break;
        	}
        }
        
        System.out.println("$"+total);
	}
	
    // 巻物 (Scroll)
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		char[] T = br.readLine().toCharArray();
		
		for(int i = 0; i < N; i++) {
			if(i < K - 1) sb.append(T[i]);
			else {
				if(T[i] < 91) {
					sb.append((char)((int)T[i] + 32));
				} else {
					sb.append((char)((int)T[i] - 32));
				}
			}
		}
		
		System.out.println(sb);
	}

	// 이상한 암호코드
	public static void test07() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        String S = st.nextToken().toLowerCase() + ' ';
        int K = Integer.parseInt(st.nextToken());
        
		boolean[] alpha = new boolean[26];
		char c = S.charAt(0);
		int count = 1;
		
		for(char ch : S.toCharArray()) {
			if(ch == c) count++;
			else {
				if(!alpha[c - 'a']) {
					sb.append(count >= K ? 1 : 0);
					alpha[c - 'a'] = true;
				}
				
				c = ch;
				count = 1;
			}
		}
   
		System.out.println(sb);
	}
	
	// 머신 코드 
	public static void test08() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        int c = 0;
        
        for (int i = 0; i < input.length(); i++) {
            while (Character.isUpperCase(input.charAt(i)) && (i + c) % 4 != 0) {
                c++;
            }
        }
        
        System.out.println(c);
	}
	
	// JOI ソート (JOI Sort) 
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int length = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		long J = countChar(input, 'J');
		long O = countChar(input, 'O');
		long I = countChar(input, 'I');
		
		for(int i = 0; i < J; i++) sb.append("J");
		for(int i = 0; i < O; i++) sb.append("O");
		for(int i = 0; i < I; i++) sb.append("I");
		
		System.out.println(sb);
	}
	
    // 한국이 그리울 땐 서버에 접속하지
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        String base = br.readLine();

        int si = base.indexOf("*");

        String bs = base.substring(0, si);
        String be = base.substring(si + 1);

        int bsl = bs.length();
        int bel = be.length();

        int base_length = base.length() - 1;

        for(int i = 0; i < num; i++){
        	
            String temp = br.readLine();
            int tl = temp.length();

            if(tl < base_length) sb.append("NE" + "\n");
            
            else {
            	
                String ts = temp.substring(0, bsl);
                String te = temp.substring(tl - bel);

                if(ts.equals(bs) && te.equals(be)) sb.append("DA" + "\n");
                else sb.append("NE" + "\n");
            }


        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
        
	
	}
	
	
}
