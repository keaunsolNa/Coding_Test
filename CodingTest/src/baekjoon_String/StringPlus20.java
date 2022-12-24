package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class StringPlus20 {
	
	public static void main(String[] args) throws IOException {
		test10();
	}

	// Wynik meczu
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int A = 0;
		int B = 0;
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == 'A') A++;
			else B++;
		}
		
		System.out.println(A + " : " + B);
	}
	
	// 탕수육
	public static void test02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T --> 0) {
        	String input = br.readLine();
        	
        	if(input.length() % 2 == 0) {
        		String A = "";
        		String B = "";
        		for(int i = 0; i < input.length(); i++) {
        			if(i % 2 == 0) A += input.charAt(i)+"";
        			else B += input.charAt(i)+"";
        		}
        		System.out.println(A);
        		System.out.println(B);
        	} else {
        		String A = "";
        		String B = "";
        		for(int i = 0; i < input.length(); i++) {
        			if(i % 2 == 0) A += input.charAt(i)+"";
        			else B += input.charAt(i)+"";
        		}
        		for(int i = 0; i < input.length(); i++) {
        			if(i % 2 == 0) B += input.charAt(i)+"";
        			else A += input.charAt(i)+"";
        		}
        		System.out.println(A);
        		System.out.println(B);
        	}
        	
        }
	}

	// Periods
	public static void test03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			String input = br.readLine();
			if(input.charAt(input.length()-1) == '.') System.out.println(input);
			else System.out.println(input+".");
		}
	}
	
	// Tautogram 
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		String input = "";
		
		while(!(input = br.readLine()).equals("*")) {
			
			String[] temp = input.toUpperCase().split(" ");
			
			char target = temp[0].charAt(0);
			String answer = "Y";
			for (String string : temp) 
				if(string.charAt(0) != target) {
					answer = "N";
					break;
				}
			
			System.out.println(answer);
		}
	}
	
	// 해밍 거리
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			String A = br.readLine();
			String B = br.readLine();
			String answer = "Hamming distance is ";
			int chk = 0;
			for(int i = 0; i < A.length(); i++) {
				
				if(A.charAt(i) != B.charAt(i)) chk++;
			}
			
			answer += chk + ".";
			
			System.out.println(answer);
		}
		
	}
	
    // Flat
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int room = Integer.parseInt(st.nextToken());
		double pay = Double.parseDouble(st.nextToken());
		
		Map<String, Double> map = new HashMap<>();
		for(int i = 0; i < room; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			double flat = Integer.parseInt(st.nextToken());
			String roomValue = st.nextToken();
			
			map.put(roomValue, map.getOrDefault(roomValue, 0.0) + flat);
			
		}
		
		double total = 0;
		double bed = 0;
		double bal = 0;
		for (String rv : map.keySet()) {
			total += map.get(rv);
			if(rv.equals("bedroom")) bed += map.get(rv);
			if(rv.equals("balcony")) bal += map.get(rv);
		}
		
		
		System.out.println((int)total);
		System.out.println((int)bed);
		System.out.println(((total - bal + (bal/2)) * pay));
		
    }

	// 複雑な文字列 (Complex String) 
	public static void test07() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        String input = br.readLine();
        Set<Character> set = new HashSet<>();
        
        for(int i = 0; i < input.length(); i++) set.add(input.charAt(i));
        
        if(set.size() >= 3) System.out.println("Yes");
        else System.out.println("No");
	}
	
	// Affine Cipher
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken()) % 26;
			int b = Integer.parseInt(st.nextToken()) % 26;
			
			String S = br.readLine();
			
			for(int i = 0; i < S.length(); i++) {
				int temp = S.charAt(i) - 'A';
				char target = (char)((a*temp + b) % 26);
				sb.append((char)(target + 'A'));
			}
			
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
	}
	
	// driip
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		if(input.length() < 5) {
			System.out.println("not cute");
		} else {
			boolean flag = false;
			if(input.charAt(input.length()-1) == 'p') 
				if(input.charAt(input.length()-2) == 'i')
					if(input.charAt(input.length()-3) == 'i')
						if(input.charAt(input.length()-4) == 'r')
							if(input.charAt(input.length()-5) == 'd') flag = true;
			
			if(flag) System.out.println("cute");
			else System.out.println("not cute");
		}
	}
	
    // Ресторан
	public static void test10() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        for(int i = 0; i < input.length(); i++) {
        	
        	switch(input.charAt(i)) {
        		case 'B' : sb.append("v"); break;
        		case 'E' : sb.append("ye"); break;
        		case 'H' : sb.append("n"); break;
        		case 'P' : sb.append("r"); break;
        		case 'C' : sb.append("s"); break;
        		case 'Y' : sb.append("u"); break;
        		case 'X' : sb.append("h"); break;
        		default : sb.append((char)(input.charAt(i)+32));
        	}
        }
        
        System.out.print(sb);
        
	}
	
	
	
}
