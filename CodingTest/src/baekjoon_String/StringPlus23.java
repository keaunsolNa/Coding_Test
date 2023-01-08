package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class StringPlus23 {
	
	public static void main(String[] args) throws IOException {
		test10();
	}

	// Secret Location
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		sb.append("Latitude ");
		
		for(int i = 0; i < 6; i++) {
			String input = br.readLine();

			int len = 0;
			if(input.charAt(input.length() - 1) == ' ') len = input.length() - 1;
			else len = input.length();	
			
			if(i == 3) {
				sb.append("\n");
				sb.append("Longitude ");
			}
			
			sb.append(len);
			
			if(i != 2 && i != 5) sb.append(":");
		}

		System.out.print(sb);
	}
	
	// Letter Count 
	public static void test02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine().toUpperCase();
        
        for(int i = 65; i <= 90; i++) {
        	sb.append((char)i).append(" | ");
        	
        	long len = countChar(input, (char)i);
        	
        	for(int j = 0; j < len; j++) sb.append("*");
        	
        	sb.append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
	}
	   
	public static long countChar(String str, char ch) {
		return str.chars()
				  .filter(c -> c == ch)
				  .count();
	}

	// Hide those Letters 
	public static void test03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        
        int idx = 1;
        while(!(input = br.readLine()).equals("# #")) {
        	sb.append("Case ").append(idx).append("\n");
        	String[] replace = input.split(" ");
        	
        	int T = Integer.parseInt(br.readLine());
        	
        	for(int i = 0; i < T; i++) {
        		String text = br.readLine();
        		
        		text = text.replaceAll(replace[0], "_");
        		text = text.replaceAll(replace[0].toUpperCase(), "_");
        		text = text.replaceAll(replace[1], "_");
        		text = text.replaceAll(replace[1].toUpperCase(), "_");
        		
        		sb.append(text);
        		
        		if(i != T-1) sb.append("\n");
        	}
        	
        	idx++;
        	sb.append("\n");
        	sb.append("\n");
        }
        
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
	}
	
	// Word Ratios
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		StringBuilder sb = new StringBuilder();
		String input = "";
		while(!(input = br.readLine()).equals("#")) {
			String[] temp = input.split(" ");
			
			String d = "";
			for(int i = 0; i < temp[0].length(); i++) {
				int a = temp[0].charAt(i) - 'a';
				int b = temp[1].charAt(i) - 'a';
				int c = temp[2].charAt(i) - 'a';
				
				int len = b - a;
				if(c + len < 0) {
					d += (char)(c + len + 123);
				} else if(c + len > 25) {
					d += (char)(c + len + 71);
				} else {
					d += (char)(c + len + 97);
				}
				
			}
			
			sb.append(temp[0] + " " + temp[1] + " " + temp[2] + " " + d + "\n");
			
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	// 변수명
	public static void test05() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int Case = Integer.parseInt(st.nextToken());
        String text = st.nextToken();
        String carmel = "";
        String snake = "";
        String pascal = "";
        
        switch(Case) {
        	case 1 : 
        		sb.append(text);
        		sb.append("\n");
        		
        		for(int i = 0; i < text.length(); i++) {
        			
        			if(text.charAt(i) < 97) {
        				snake += "_";
        				snake += (char)(((int)text.charAt(i)) + 32);
        			} else {
        				snake += text.charAt(i);
        			}
        		}
        		
        		sb.append(snake);
        		sb.append("\n");
        		
        		pascal += (char)(((int)text.charAt(0)) - 32);
        		pascal += text.substring(1, text.length());
        		sb.append(pascal);
        		break;
        		
        	case 2 : 
        		
        		for(int i = 0; i < text.length(); i++) {
        			
        			if(text.charAt(i) == '_') {
        				i++;
        				carmel += (char)(((int)text.charAt(i)) - 32);
        			} else {
        				carmel += text.charAt(i);
        			}
        		}
        		
        		sb.append(carmel);
        		sb.append("\n");
        		
        		sb.append(text);
        		sb.append("\n");
        		
        		pascal += (char)(((int)text.charAt(0)) - 32);
        		for(int i = 1; i < text.length(); i++) {
        			
        			if(text.charAt(i) == '_') {
        				i++;
        				pascal += (char)(((int)text.charAt(i)) - 32);
        			} else {
        				pascal += text.charAt(i);
        			}
        		}
        		
        		sb.append(pascal);
        		break;
        	case 3 :

        		carmel += (char)(((int)text.charAt(0)) + 32);
        		carmel += text.substring(1, text.length());
        		sb.append(carmel);
        		sb.append("\n");
        		
        		snake += (char)(((int)text.charAt(0)) + 32);
        		for(int i = 1; i < text.length(); i++) {
        			
        			if((int)text.charAt(i) < 97) {
        				snake += "_";
        				snake += (char)(((int)text.charAt(i)) + 32);
        			} else {
        				snake += text.charAt(i);
        			}
        		}
        		sb.append(snake);
        		sb.append("\n");
        		
        		sb.append(text);
        		break;
        }
        
        System.out.println(sb);

	}
	
    // 문자열 압축 해제
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		Map<String, String> map = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String value = st.nextToken();
			String key = st.nextToken(); 
			
			map.put(key, value);
		}
		
		String input = br.readLine();
		for(int i = 0; i < input.length(); i++) sb.append(map.get(input.charAt(i) + ""));
		
		st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		
		System.out.println(sb.toString().substring(start - 1, end));
		
    }

	// 문자 인식
	public static void test07() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < N; i++) {
        	String input = "";
        	
        	double length = 0;
        	double miss = 0;
        	double R = 0;
        	while(!(input = br.readLine()).equals("")) {
        		
        		length += input.length();
        		miss += countChar(input, '#');
        		R = length - miss;
        		
        	}
        	
        	System.out.print("Efficiency ratio is ");
        	double percent = R / length * 100;
        	double A = Math.round(percent*10) / 10.0;
        	int B = (int)A;
        	
        	if(A == B) System.out.print(B);
        	else System.out.print(A);
        	System.out.println("%.");
        }
        
	}
	
	// 단어 사다리 
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = "";
		
		while(!(input = br.readLine()).equals("#")) {
			String innerInput = "";
			int length = input.length();
			String prev = input;
			String answer = "Correct";
			
			while(!(innerInput = br.readLine()).equals("#")) {
				

				if(length != innerInput.length()) {
					
					answer = "Incorrect";
					
				} else {
					
					int disCorrect = 0;
					for(int i = 0; i < prev.length(); i++) {
						
						if(prev.charAt(i) != innerInput.charAt(i)) disCorrect++;
						if(disCorrect > 1) answer = "Incorrect";
						
					}
					
					if(disCorrect != 1) answer = "Incorrect";
					prev = innerInput;
				}
				
				
			}
			sb.append(answer);
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
				
	}
	
	// 백대열
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int gcd = gcd(Math.min(n, m), Math.max(n, m));
		
		System.out.println(n/gcd + ":" + m/gcd );
	}
	
	private static int gcd(int a, int b) { 
		
		while(b != 0) { 
			int r = a % b;
			a = b;
			b = r;
		}
		
		return a;
	}
	
    // 반지
	public static void test10() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fid = br.readLine();
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		while(N --> 0) {
			String ring = br.readLine();
			ring += ring;
			
			if(ring.replaceAll(fid, "").length() != ring.length()) cnt++;
		}
		
		System.out.println(cnt);
	}
	
	
}
