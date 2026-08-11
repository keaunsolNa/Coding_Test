package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class StringPlus28 {
	
	public static void main(String[] args) throws IOException {
		test03();
	}

	
	// Magic Trick 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		
		Set<Character> set = new HashSet<>();
		for(int i = 0; i < input.length(); i++) set.add(input.charAt(i));
		
		if(input.length() != set.size()) System.out.println(0);
		else System.out.println(1);
	}
	
	// Шахматная доска
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		switch(N % 8) {
		
			case 0 : sb.append("h"); break;
			case 1 : sb.append("a"); break;
			case 2 : sb.append("b"); break;
			case 3 : sb.append("c"); break;
			case 4 : sb.append("d"); break;
			case 5 : sb.append("e"); break;
			case 6 : sb.append("f"); break;
			case 7 : sb.append("g"); break;
		}
		
		switch((N-1) / 8) {
	
			case 0 : sb.append(1); break;
			case 1 : sb.append(2); break;
			case 2 : sb.append(3); break;
			case 3 : sb.append(4); break;
			case 4 : sb.append(5); break;
			case 5 : sb.append(6); break;
			case 6 : sb.append(7); break;
			case 7 : sb.append(8); break;
			
		}
		
		System.out.println(sb);
	}
	
	
	// Poker Hand
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			Map<Character, Integer> map = new HashMap<>();
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < 5; i++) {
				char key = st.nextToken().charAt(0);
				map.put(key, map.getOrDefault(key, 0) + 1);
			}

			int max = 0;
			for(char key : map.keySet()) if(max < map.get(key)) max = map.get(key);
			
			System.out.println(max);
		}
	}
	
	// Square 
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			String input = br.readLine();
			int length = input.length();
			
			for(int i = 0; i < length; i++) {
				sb.append(input.charAt(i));
				if(i == 0) 
					for(int j = i + 1; j < length; j++) sb.append(input.charAt(j));
				
				
				if(i != 0 && i != length -1) {
					for(int j = 1; j < length - 1; j++) sb.append(" ");
					sb.append(input.charAt(length - i - 1));
				}
				
				if(i == length -1) 
					for(int j = length - 2; j >= 0; j--) sb.append(input.charAt(j));
				
				sb.append("\n");
			}
			
			
		}
		
		System.out.println(sb);
	}
	
	
}
