package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class StringPlus26 {
	
	public static void main(String[] args) throws IOException {
		test10();
	}

	// Run-Length Encoding, Run! 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		String EorD = input.split(" ")[0];
		
		if(EorD.equals("E")) {

			String text = input.split(" ")[1];
			
			if(text.length() == 1) {
				System.out.println(text + 1);
				return;
			}
			
			Set<Character> set = new HashSet<>();
			for(int i = 0; i < text.length(); i++) set.add(text.charAt(i));
			if(set.size() == 1) {
				for (Character character : set) {
					sb.append(character).append(text.length());
					System.out.println(sb);
					return;
				}
			}
			
			char prev = text.charAt(0);
			int idx = 1;
			
			for(int i = 1; i < text.length(); i++) {
				
				if(text.charAt(i) == prev) idx++;
				else {
					
					sb.append(prev);
					sb.append(idx);
					prev = text.charAt(i);
					idx = 1;
				}
			}
			
			if(sb.charAt(sb.length() - 1) != prev) sb.append(prev).append(idx);
			
			
		} else {
			
			String text = input.split(" ")[1];
			int idx = 0;
			char prev = ' '	;
			for(int i = 0; i < text.length(); i++) {
				
				switch(text.charAt(i)) {
					case '1' :
					case '2' :
					case '3' :
					case '4' :
					case '5' :
					case '6' :
					case '7' : 
					case '8' :
					case '9' :
						idx = Character.getNumericValue(text.charAt(i)); 
						for(int j = 0; j < idx; j++) sb.append(prev);
						break;
					default : prev = text.charAt(i);
				}
				
			}
			
		}
		System.out.print(sb);
	}
	
	// Censor 
	public static void test02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < N; i++) {
        	String[] input = br.readLine().split(" ");
        	
        	for(int j = 0; j < input.length; j++) {
        		if(input[j].length() != 4) sb.append(input[j] + " ");
        		else sb.append("**** ");
        	}
        	
        	sb.deleteCharAt(sb.length() - 1);
        	sb.append("\n");
        	sb.append("\n");
        }
        
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
	}
	   
	// Tapioka
	public static void test03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        
        for(int i = 0; i < input.length; i++) {
        	if(!input[i].equals("bubble")) {
        		
        		if(!input[i].equals("tapioka")) {
        			sb.append(input[i] + " ");
        		}
        	}
        }
        
        if(sb.length() == 0) {
        	System.out.println("nothing");
        } else {
        	sb.deleteCharAt(sb.length() - 1);
        	System.out.print(sb);
        }
	}
	
	// Voting 
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		String input = "";
		
		while(!(input = br.readLine()).equals("#")) {
			
			int yes = 0;
			int no = 0;
			int enter = 0;
			int total = input.length();
			
			for(int i = 0; i < input.length(); i++) {
				
				switch(input.charAt(i)) {
					case 'Y' : yes++; enter++; break;
					case 'N' : no++; enter++; break;
					case 'P' :enter++; break;
				}
			}
			
			if(total/2 >= enter) System.out.println("need quorum");
			else if(yes > no) System.out.println("yes");
			else if(no > yes) System.out.println("no");
			else System.out.println("tie");
		}
		
	}
	
	// ビ太郎と IOI (Bitaro and IOI) 
	public static void test05() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        boolean firstI = false;
        boolean O = false;
        boolean lastI = false;
        
        for(int i = 0; i < N; i++) {
        	if(input.charAt(i) == 'I') firstI = true;
        	
        	if(firstI) if(input.charAt(i) == 'O') O = true;
        	
        	if(firstI && O) if(input.charAt(i) == 'I') {
        		System.out.println("Yes");
        		return;
        	}
        }
        
        System.out.println("No");
	}
	
    // Pea Soup and Pancakes
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			
			int K = Integer.parseInt(br.readLine());
			String name = br.readLine();
			boolean peasoup = false;
			boolean pancakes = false;

			for(int j = 0; j < K ; j++) {
				String menu = br.readLine();
				
				if(menu.equals("pancakes")) pancakes = true;
				if(menu.equals("pea soup")) peasoup = true;
				
			}
			
			if(pancakes && peasoup) {
				System.out.print(name);
				return;
			}
			
		}
		
		System.out.print("Anywhere is fine I guess");
	}

	// Country Leader (Small) 
	public static void test07() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
        	
        	int N = Integer.parseInt(br.readLine());
        	
        	String winner = "";
        	int maxlength = 0;
        	for(int j = 0; j < N; j++) {
        		
        		String name = br.readLine();
        		Set<Character> nameSet = new HashSet<>();
        		
        		for(int k = 0; k < name.length(); k++) {
        			if(name.charAt(k) != ' ') nameSet.add(name.charAt(k));
        		}
        		
        		if(maxlength < nameSet.size()) {
        			maxlength = nameSet.size();
        			winner = name;
        		} else if(maxlength == nameSet.size()) {
        			if(winner.compareTo(name) > 0) winner = name; 
        		}
        		
        	}
        	
        	sb.append("Case #" + (i+1) + ": " + winner + "\n");
        }
        
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
	}
	
	// Country Leader (Large) 
	public static void test08() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
        	
        	int N = Integer.parseInt(br.readLine());
        	
        	String winner = "";
        	int maxlength = 0;
        	for(int j = 0; j < N; j++) {
        		
        		String name = br.readLine();
        		Set<Character> nameSet = new HashSet<>();
        		
        		for(int k = 0; k < name.length(); k++) {
        			if(name.charAt(k) != ' ') nameSet.add(name.charAt(k));
        		}
        		
        		if(maxlength < nameSet.size()) {
        			maxlength = nameSet.size();
        			winner = name;
        		} else if(maxlength == nameSet.size()) {
        			if(winner.compareTo(name) > 0) winner = name; 
        		}
        		
        	}
        	
        	sb.append("Case #" + (i+1) + ": " + winner + "\n");
        }
        
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
		
	}
	
	// Canadians, eh?
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		
		if(input[input.length - 1].equals("eh?")) System.out.println("Canadian!");
		else System.out.println("Imposter!");
		
	}
	
    // 무한 문자열
	private static String s;
	private static String t;
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		s = br.readLine();
		t = br.readLine();
		int slen = s.length();
		int tlen = t.length();
		
		if(slen == tlen) {
			if(s.equals(t)) System.out.println(1);
			else System.out.println(0);
			return;
		}
		
		int lcm = lcm(slen, tlen);
		
		StringBuilder ss = new StringBuilder(s);
		StringBuilder tt = new StringBuilder(t);
		
		for(int i = 0 ; i < lcm / slen - 1 ; ++i) ss.append(s);
		
		for(int i = 0 ; i < lcm / tlen - 1 ; ++i) tt.append(t);
		
		if(ss.toString().equals(tt.toString())) System.out.println(1);
		else System.out.println(0);
        
        
	}
	
	private static int gcd(int a, int b) {
		if(b == 0) return a;
		
		return gcd(b, a % b);
	}
	
	private static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
	
}
