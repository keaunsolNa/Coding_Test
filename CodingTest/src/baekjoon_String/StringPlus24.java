package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class StringPlus24 {
	
	public static void main(String[] args) throws IOException {
		test09();
	}

	// The Hardest Problem Ever
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		while(!(input = br.readLine()).equals("ENDOFINPUT")) {
			StringBuilder sb = new StringBuilder();
			String text = br.readLine();
			
			for(int i = 0; i < text.length(); i++) {
				
				switch(text.charAt(i)) {
					
					case 'A' : sb.append("V"); break;
					case 'B' : sb.append("W"); break;
					case 'C' : sb.append("X"); break;
					case 'D' : sb.append("Y"); break;
					case 'E' : sb.append("Z"); break;
					case 'F' : sb.append("A"); break;
					case 'G' : sb.append("B"); break;
					case 'H' : sb.append("C"); break;
					case 'I' : sb.append("D"); break;
					case 'J' : sb.append("E"); break;
					case 'K' : sb.append("F"); break;
					case 'L' : sb.append("G"); break;
					case 'M' : sb.append("H"); break;
					case 'N' : sb.append("I"); break;
					case 'O' : sb.append("J"); break;
					case 'P' : sb.append("K"); break;
					case 'Q' : sb.append("L"); break;
					case 'R' : sb.append("M"); break;
					case 'S' : sb.append("N"); break;
					case 'T' : sb.append("O"); break;
					case 'U' : sb.append("P"); break;
					case 'V' : sb.append("Q"); break;
					case 'W' : sb.append("R"); break;
					case 'X' : sb.append("S"); break;
					case 'Y' : sb.append("T"); break;
					case 'Z' : sb.append("U"); break;
					default : sb.append(text.charAt(i)); 
				}
			}
			br.readLine();
			
			System.out.println(sb);
		}
	}
	
	// Words
	public static void test02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        
        while(!(input = br.readLine()).equals("#")) {
        	String[] inputArr = input.split(" ");
        	for(int i = 0; i < inputArr.length; i++) {
        		sb.append(new StringBuilder(inputArr[i]).reverse()).append(" ");
        	}
        	
        	sb.deleteCharAt(sb.length() - 1);
        	sb.append("\n");
        }
        
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
        
	}
	   

	// Centauri Prime (Small1) 
	public static void test03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
        	
        	String input = br.readLine();
        	sb.append("Case #").append(i + 1).append(": ").append(input).append(" is ruled by ");
        	char last = input.toLowerCase().charAt(input.length() - 1);
        	switch(input.toLowerCase().charAt(input.length() - 1)) {

        		case 'y' : sb.append("nobody."); break;
        		case 'a' : sb.append("a queen."); break;
        		case 'e' : sb.append("a queen."); break;
        		case 'i' : sb.append("a queen."); break;
        		case 'o' : sb.append("a queen."); break;
        		case 'u' : sb.append("a queen."); break;
        		default : sb.append("a king."); break;
        	}
        	
        	sb.append("\n");
        }
        
        sb.deleteCharAt(sb.length() - 1);
        
        System.out.print(sb);
	}
	
	// SciComLove (2022) 
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int SN = N % 10;
		StringBuilder text = new StringBuilder("SciComLove");
		
		while(SN --> 0) {
			char temp = text.charAt(0);
			text.append(text.charAt(0));
			text.deleteCharAt(0);
		}
		
		System.out.println(text);
	}
	
	// Reverse Text
	public static void test05() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
    
        while(T --> 0) {
        	StringBuilder sb = new StringBuilder(br.readLine());
        	System.out.println(sb.reverse());
        }
	}
	
    // Cypher
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String input = "";
		while(!(input = br.readLine()).equals("0 0 0")) {
			st = new StringTokenizer(input);
			int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			int cypher = sum % 25 + 1;
			
			String text = br.readLine();
			
			for(int i = 0; i < text.length(); i++) {
				int charInt = (int)text.charAt(i);
				if(charInt < 123 && charInt > 96) {	
					
					if(charInt - cypher < 123 && charInt - cypher > 96) {
						
						sb.append((char)(charInt - cypher));
						continue;
						
					} else {
						
						sb.append((char)(26 + charInt - cypher));
						continue;
					}
				}  else {
					sb.append(text.charAt(i));
				}
				
			}
			
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
    }

	// Joke
	public static void test07() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        int cnt = 0;
        while((input = br.readLine()) != null) {
        	cnt += (input.length() - input.replaceAll("joke", "").length())/4;
        }
        
        System.out.println(cnt);
	}
	
	// 유니대전 퀴즈쇼
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		String winner = st.nextToken();
		
		Map<String, String> map = new LinkedHashMap<>();
		String answer = "";
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String ans = st.nextToken();
			map.put(name, ans);
			
			if(name.equals(winner)) answer = ans;
		}
		
		int cnt = 0;
		for(String key : map.keySet()) {
			if(key.equals(winner)) break;
			if(map.get(key).equals(answer)) cnt++;
				
		}
		
		System.out.println(cnt);
		
	}
	
	// 준살 프로그래밍 대회 
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		for(int i = 0; i < T; i++) {
			sb.append("Scenario #").append(i+1).append(":").append("\n");
			int m = Integer.parseInt(br.readLine());
			String[] word = new String[m];
			for(int j = 0; j < m; j++) word[j] = br.readLine();
			
			int n = Integer.parseInt(br.readLine());
			
			for(int z = 0; z < n; z++) {
				
				st = new StringTokenizer(br.readLine());
				int k = Integer.parseInt(st.nextToken());
				
				for(int q = 0; q < k; q++) {
					int idx = Integer.parseInt(st.nextToken());
					sb.append(word[idx]);
				}
				sb.append("\n");
			}
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
    // 경로당펑크 2077
	public static void test10() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input01 = br.readLine();
        String input02 = br.readLine();
        System.out.print(solve(input02));
	}
	
    private static String solve(String input02) {
        return !chk(input02.charAt(input02.length() - 1)) ? "1" : "0";
    }
    
    private static boolean chk(char lastChar) {
        boolean chk = false;
        switch (lastChar){
            case 'y':
            case 'u':
            case 'i':
            case 'o':
            case 'p':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'b':
            case 'n':
            case 'm':
                chk = true;
                break;
            default:
                break;
        }
        return chk;
    }
}
