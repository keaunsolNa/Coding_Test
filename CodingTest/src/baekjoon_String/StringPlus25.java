package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class StringPlus25 {
	
	public static void main(String[] args) throws IOException {
		test10();
	}

	// Numbersrebmun 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder ans = new StringBuilder();
		while(N --> 0) {
			String input = br.readLine();
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < input.length(); i++) {
				switch(input.toUpperCase().charAt(i)) {
				
					case 'A' : sb.append(2); break;
					case 'B' : sb.append(2); break;
					case 'C' : sb.append(2); break;
					case 'D' : sb.append(3); break;
					case 'E' : sb.append(3); break;
					case 'F' : sb.append(3); break;
					case 'G' : sb.append(4); break;
					case 'H' : sb.append(4); break;
					case 'I' : sb.append(4); break;
					case 'J' : sb.append(5); break;
					case 'K' : sb.append(5); break;
					case 'L' : sb.append(5); break;
					case 'M' : sb.append(6); break;
					case 'N' : sb.append(6); break;
					case 'O' : sb.append(6); break;
					case 'P' : sb.append(7); break;
					case 'Q' : sb.append(7); break;
					case 'R' : sb.append(7); break;
					case 'S' : sb.append(7); break;
					case 'T' : sb.append(8); break;
					case 'U' : sb.append(8); break;
					case 'V' : sb.append(8); break;
					case 'W' : sb.append(9); break;
					case 'X' : sb.append(9); break;
					case 'Y' : sb.append(9); break;
					case 'Z' : sb.append(9); break;
				}
			}
			
			boolean chk = true;
			for(int i = 0; i < sb.length(); i++) {
				
				if(sb.charAt(i) != sb.charAt(sb.length() - i - 1)) {
					chk = false;
					break;
				}
			}
			
			if(chk) ans.append("YES");
			else ans.append("NO");
			ans.append("\n");
		}
		
		ans.deleteCharAt(ans.length() - 1);
		System.out.print(ans);
	}
	
	// Palindromes 
	public static void test02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long sum = 0;

        for(int i = 0; i < N; i++) {
        	int temp = Integer.parseInt(st.nextToken());
    		int reverse = 0;
    		int n = temp;
    		while (n != 0) {
    			int r = n % 10;
    			reverse = reverse * 10 + r;
    			n = n / 10;
    		}
        	
        	if(temp == reverse) sum += temp;
        }
        
        System.out.println(sum);
	}
	   
	// String 
	public static void test03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        StringBuilder sb = new StringBuilder();
        char prev = ' ';
        for(int i = 0; i < input.length(); i++) {
        	
        	if(input.charAt(i) != prev) {
        		sb.append(input.charAt(i));
        		prev = input.charAt(i);
        	}
        }
        
        System.out.println(sb);
        
	}
	
	// Eye of Sauron
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		String input = br.readLine();
		
		boolean turn = false;
		int chk = 0;
		for(int i = 0; i < input.length(); i++) {
			
			
			if(input.charAt(i) == '(') {
				turn = true;
				continue;
			} 
			if(input.charAt(i) == ')') continue;
			
			if(!turn) chk++;
			else chk--;
			
		}
		
		if(chk == 0) System.out.println("correct");
		else System.out.println("fix");
		
	}
	
	// Anno Domini 2022
	public static void test05() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] one = br.readLine().split(" ");
        String[] two = br.readLine().split(" ");
        
        int year1 = 0;
        String ADBC1 = "";
        int year2 = 0;
        String ADBC2 = "";
        
        try {
        	year1 = Integer.parseInt(one[0]);
        	ADBC1 = "BC";
        } catch(java.lang.NumberFormatException e) {
        	ADBC1 = "AD";
        	year1 = Integer.parseInt(one[1]);
        };

        try {
        	year2 = Integer.parseInt(two[0]);
        	ADBC2 = "BC";
        } catch(java.lang.NumberFormatException e) {
        	ADBC2 = "AD";
        	year2 = Integer.parseInt(two[1]);
        };
        
        if(ADBC1.equals("AD") && ADBC2.equals("AD")) {
        	System.out.println(Math.max(year1, year2) - Math.min(year1, year2));
        } else if(ADBC1.equals("AD") && ADBC2.equals("BC")) {
        	System.out.println(year1 + year2 - 1);
        } else if(ADBC1.equals("BC") && ADBC2.equals("AD")) {
        	System.out.println(year1 + year2 - 1);
        } else {
        	System.out.println(Math.max(year1, year2) - Math.min(year1, year2));
        }
        
	}
	
    // Reverse Words (Large) 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			sb.append("Case #").append(i+1).append(": ");
			
			String[] text = br.readLine().split(" ");
			
			for(int j = text.length - 1; j >= 0; j--) sb.append(text[j] + " ");
			
			sb.deleteCharAt(sb.length() - 1);
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
		
	}

	// Centauri Prime (Small2)
	public static void test07() throws NumberFormatException, IOException {
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
	
	// Coin tossing
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String input = "";
		
		while(!(input = br.readLine()).equals("# #")) {
			String one = input.split(" ")[0];
			String two = input.split(" ")[1];
			
			int T = Integer.parseInt(br.readLine());
			
			int win = 0;
			for(int i = 0; i < T; i++) {
				st = new StringTokenizer(br.readLine());
				String guess = st.nextToken();
				String answer = st.nextToken();
				
				if(guess.equals(answer)) win++;
			}
			
			sb.append(one + " " + win + " " + two + " " + (T - win) + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	// Counting Sheep
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			
			st = new StringTokenizer(br.readLine());
			int sheep = 0;
			for(int j = 0; j < N; j++) {
				String target = st.nextToken();
				if(target.equals("sheep")) sheep++;
			}
			
			sb.append("Case " + (i + 1) + ": This list contains " + sheep + " sheep." + "\n" + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
    // Palindromes 
	public static void test10() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        
        while(!(input = br.readLine()).equals("#")) {
        	
        	boolean chk = true;
        	for(int i = 0; i < input.length(); i++) {
        		
        		String text = new StringBuilder(input).deleteCharAt(i).toString();
        		String reverse = new StringBuilder(text).reverse().toString();

        		if(text.equals(reverse)) {
        			sb.append(reverse);
        			chk = false;
        			break;
        		}
        		
        	}
        	
        	if(chk)sb.append("not possible");
        	sb.append("\n");
        	
        }
        
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
	}
	
}
