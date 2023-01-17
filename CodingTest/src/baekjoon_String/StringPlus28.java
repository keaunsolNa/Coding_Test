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
		test05();
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

    // 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
	}
	
	// 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
	}
	
	// 
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
	}
	
	// 
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
	}
	
	// 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
	}
	
	
}
