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
		test10();
	}

	// Vikingahackare
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		Map<String, Character> map = new HashMap<>();
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			char key = st.nextToken().charAt(0);
			String value = st.nextToken();
			
			map.put(value, key);
		}
		
		String input = br.readLine();
		
		for(int i = 0; i < input.length(); i += 4) {
			
			String part = input.substring(i, i+4);
			
			if(map.containsKey(part)) sb.append(map.get(part));
			else sb.append("?");
			
		}
		
		System.out.println(sb);
		
	
	}
	
	// Bridž
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		int point = 0;
		while(N --> 0) {
			
			String input = br.readLine();
			
			for(int i = 0; i < input.length(); i++) {
				
				switch(input.charAt(i)) {
					
					case 'A' : point += 4; break;
					case 'K' : point += 3; break;
					case 'Q' : point += 2; break;
					case 'J' : point += 1; break;
				}
			}
			
		}
		
		System.out.println(point);
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
	
	// DNA 해독
	public static void test05() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        char before = ' ';
        char after = ' ';
        after = str.charAt(str.length() - 1);

        for (int i = N - 1; i >= 0; i--) {
            before = str.charAt(i);
            after = decode(before, after);
        }
        
        System.out.print(after);
	}
	
    private static char decode(char A, char B) {
    	char result = ' ';
        
    	if (A == 'A') {
    		
            if (B == 'A')  result = 'A';
            else if (B == 'G') result = 'C';
            else if (B == 'C') result = 'A';
            else if (B == 'T') result = 'G';
            
        } else if (A == 'G') {
        	
            if (B == 'A') result = 'C';
            else if (B == 'G')  result = 'G';
            else if (B == 'C') result = 'T';
            else if (B == 'T') result = 'A';
            
        } else if (A == 'C') {
        	
            if (B == 'A') result = 'A';
            else if (B == 'G') result = 'T';
            else if (B == 'C') result = 'C';
            else if (B == 'T') result = 'G';
            
        } else if (A == 'T') {
        	
            if (B == 'A') result = 'G';
            else if (B == 'G') result = 'A';
            else if (B == 'C') result = 'G';
            else if (B == 'T') result = 'T';
            
        }
    	
        return result;
    }

    // Liczenie punktów 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		int cnt = 0;
		
		for(int i = 0; i < T; i += (T / 10)) {
			boolean chk = true;
			for(int j = i; j < i + (T / 10); j++) {
				if(input.charAt(j) != 'T') chk = false;
			}
			
			if(chk) cnt++;
		}
		
		System.out.println(cnt);
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
	
	// Thai Lottery Checking
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		Map<String, Integer> map = new HashMap<>();
		String[] number = new String[6];
		long[] money = new long[6];
		for(int i = 0; i < 6; i++) {
			st = new StringTokenizer(br.readLine());
			
			number[i] = st.nextToken();
			money[i] = Long.parseLong(st.nextToken());
			
		}
		
		String input = "0";
		
		while(!(input = br.readLine()).equals("-1")) {
			
			long price = 0;
			
			String front = input.substring(0, 3);
			String back = input.substring(3, 6);
			String back2 = input.substring(4, 6);
			
			if(number[0].equals(input)) price += money[0];
			if(number[1].equals(front)) price += money[1];
			if(number[2].equals(front)) price += money[2];
			if(number[3].equals(back)) price += money[3];
			if(number[4].equals(back)) price += money[4];
			if(number[5].equals(back2)) price += money[5];
			
			sb.append(price + "\n");
		}
		
		System.out.print(sb);
	}
	
	// Cryptographer’s Conundrum
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		
		int cnt = 0;
		for(int i = 0; i < input.length(); i += 3) {
			
			if(input.charAt(i) != 'P') cnt++;
			if(input.charAt(i + 1) != 'E') cnt++;
			if(input.charAt(i + 2) != 'R') cnt++;
		}
		
		System.out.println(cnt);
	}
	
	
}
