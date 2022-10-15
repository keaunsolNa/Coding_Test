package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class StringPlus07 {
	
	public static void main(String[] args) throws IOException {
		test09();
	}
	
	// Baby Bites
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int answer = 0;
		for(int i = 1; i <= testCase; i++) {
			String temp = st.nextToken();
			if(!(temp.equals(i+"") || temp.equals("mumble"))) {
				answer = - 1;
			}
			
		}
		
		if(answer == -1) {
			System.out.println("something is fishy");
		} else {
			System.out.println("makes sense");
		}
	}

	// Hissing Microphone
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = br.readLine();
		
		if(answer.contains("ss")) {
			System.out.println("hiss");
		} else {
			System.out.println("no hiss");
		}
	}

	// Greetings!
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String hey = br.readLine();
		
		int eLength = hey.substring(1, hey.length()-1).length();

		StringBuilder sb = new StringBuilder();
		sb.append("h");
		for(int i = 0; i < eLength; i++) {
			sb.append("e");
			sb.append("e");
		}
		sb.append("y");
		
		System.out.println(sb);
	}
	
	// Test
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			String s = "BCBCDCDADABA";
			if(n == 1) {
				System.out.println("A");
			} else {
				System.out.println(s.charAt((n-2)%12));
			}
		}
	}
	
	// Rotating letters
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int answer = 0;
		for(int i = 0; i < input.length(); i++) {
			
			switch(input.charAt(i)) {
				case 'I' : break;
				case 'O' : break;
				case 'S' : break;
				case 'H' : break;
				case 'Z' : break;
				case 'X' : break;
				case 'N' : break;
				default : answer = -1; break;
			}
		}
		
		if(answer == -1) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
	
	// Culture shock
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int shock = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < testCase; i++) {
			String temp = st.nextToken();
			
			if(temp.equals("he") || temp.equals("him") || temp.equals("she") || temp.equals("her")) {
				shock++;
			}
		}
		
		System.out.println(shock);
			
	}

	// Terraforming
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int changes = Integer.parseInt(br.readLine());
		Map<String, Integer> changesMap = new HashMap<>();
		
		for(int i = 0; i < changes; i++) {
			String[] temp = br.readLine().split(" +");
			changesMap.put(temp[0], changesMap.getOrDefault(temp[0], 0) + Integer.parseInt(temp[1]));
		}
		
		changesMap.put("ocean", changesMap.getOrDefault("ocean", 0) + 0);
		changesMap.put("temperature", changesMap.getOrDefault("temperature", 0) + 0);
		changesMap.put("oxygen", changesMap.getOrDefault("oxygen", 0) + 0);
		
		if(changesMap.get("ocean") >= 9 && changesMap.get("temperature") >= 38 && changesMap.get("oxygen") >= 14) {
			System.out.println("liveable");
		} else {
			System.out.println("not liveable");
		}
	}
	
	// Animal King Election
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = 0;
		int L = 0;
		for(int i = 0; i < 9; i++) {
			String temp = br.readLine();
			if(temp.equals("Tiger")) {
				T++;
			} else {
				L++;
			}
		}
		
		if(T > L && T >= 5) {
			System.out.println("Tiger");
		} else if(L > T && L >= 5) {
			System.out.println("Lion");
		}
	}
	
	// Dyslexia
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		String A = br.readLine();
		String B = br.readLine();
		
		int answer = 0;
		for(int i = 0; i < length; i++) {
			if(A.charAt(i) == B.charAt(i)) {
				answer++;
			}
		}
		
		System.out.println(answer);
	}
	
	// Dyslexia
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		String A = br.readLine();
		String B = br.readLine();
		
		int answer = 0;
		for(int i = 0; i < length; i++) {
			if(A.charAt(i) != B.charAt(i)) {
				answer++;
			}
		}
		
		System.out.println(answer);
		
	}
	
}
