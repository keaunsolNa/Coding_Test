package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringPlus30 {
	
	public static void main(String[] args) throws IOException {
		test10();
	}

	// 9773번 -ID Key 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String input = br.readLine().replaceAll(" ", "");
			if(input.length() != 13) continue;
			int one = 0;
			for(int j = 0; j < input.length(); j++) one += Character.getNumericValue(input.charAt(j));
			int two = Integer.parseInt(input.subSequence(input.length() - 3, input.length()) + "") * 10;
			
			String idKey = one + two + "";
			
			while(idKey.length() != 4) {
				
				if(idKey.length() < 4) idKey =  Integer.parseInt(idKey) + 1000 + "";
				else idKey = idKey.substring(idKey.length() - 4, idKey.length());
			}
			
			System.out.println(idKey);
			
		}
	}
	
	// 20012번 - 사토르 마방진
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		char[][] map = new char[N][N];
		for(int i = 0; i < N; i++) map[i] = br.readLine().toCharArray();
		
		for(int i = 0; i < N; i++) {

			String line = "";
			for(int j = 0; j < N; j++) {
				line += map[i][j];
			}
			
			String line2 = "";
			for(int j = 0; j < N; j++) {
				line2 += map[j][i];
			}
			
			if(!line.equals(line2)) {
				System.out.println("NO");
				return;
			}

		}
		
		System.out.println("YES");
		
	}
	
	// 12607번 - T9 Spelling (Small) 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		String[] two = new String[] {"2", "22", "222"};
		String[] three = new String[] {"3", "33", "333"};
		String[] four = new String[] {"4", "44", "444"};
		String[] five = new String[] {"5", "55", "555"};
		String[] six = new String[] {"6", "66", "666"};
		String[] seven = new String[] {"7", "77", "777", "7777"};
		String[] eight = new String[] {"8", "88", "888"};
		String[] nine = new String[] {"9", "99", "999", "9999"};
		
		
		for(int i = 1; i <= N; i++) {
			
			String input = br.readLine();

			for(int j = 0; j < input.length(); j++) {
				
				switch(input.charAt(j)) {
					case 'a' : 
					case 'b' :
					case 'c' :
						
						if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '2') sb.append(" ");
						sb.append(two[input.charAt(j) - 97]);
						break;
						
					case 'd' :
					case 'e' :
					case 'f' :

						if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '3') sb.append(" ");
						sb.append(three[input.charAt(j) - 100]);
						break;
						
					case 'g' :
					case 'h' :
					case 'i' :

						if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '4') sb.append(" ");
						sb.append(four[input.charAt(j) - 103]);
						break;
						
					case 'j' : 
					case 'k' :
					case 'l' : 
						
						if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '5') sb.append(" ");
						sb.append(five[input.charAt(j) - 106]);
						break;
						
					case 'm' :
					case 'n' :
					case 'o' :
						
						if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '6') sb.append(" ");
						sb.append(six[input.charAt(j) - 109]);
						break;
						
					case 'p' : 
					case 'q' :
					case 'r' :
					case 's' :
						
						if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '7') sb.append(" ");
						sb.append(seven[input.charAt(j) - 112]);
						break;
						
					case 't' :
					case 'u' :
					case 'v' :
						
						if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '8') sb.append(" ");
						sb.append(eight[input.charAt(j) - 116]);
						break;
						
					case 'w' :
					case 'x' :
					case 'y' :
					case 'z' :
						
						if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '9') sb.append(" ");
						sb.append(nine[input.charAt(j) - 119]);
						break;
					
					case ' ' : 
						if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '0') sb.append(" ");
						sb.append("0");
						break;
					
					
				}
			}
			
			sb.insert(0, "Case #" + i+": ");
			System.out.println(sb);
			sb.setLength(0);
		}
	}
	
	// 12608번 - T9 Spelling (Large)
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		String[] two = new String[] {"2", "22", "222"};
		String[] three = new String[] {"3", "33", "333"};
		String[] four = new String[] {"4", "44", "444"};
		String[] five = new String[] {"5", "55", "555"};
		String[] six = new String[] {"6", "66", "666"};
		String[] seven = new String[] {"7", "77", "777", "7777"};
		String[] eight = new String[] {"8", "88", "888"};
		String[] nine = new String[] {"9", "99", "999", "9999"};
		
		
		for(int i = 1; i <= N; i++) {
			
			String input = br.readLine();

			for(int j = 0; j < input.length(); j++) {
				
				switch(input.charAt(j)) {
					case 'a' : 
					case 'b' :
					case 'c' :
						
						if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '2') sb.append(" ");
						sb.append(two[input.charAt(j) - 97]);
						break;
						
					case 'd' :
					case 'e' :
					case 'f' :

						if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '3') sb.append(" ");
						sb.append(three[input.charAt(j) - 100]);
						break;
						
					case 'g' :
					case 'h' :
					case 'i' :

						if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '4') sb.append(" ");
						sb.append(four[input.charAt(j) - 103]);
						break;
						
					case 'j' : 
					case 'k' :
					case 'l' : 
						
						if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '5') sb.append(" ");
						sb.append(five[input.charAt(j) - 106]);
						break;
						
					case 'm' :
					case 'n' :
					case 'o' :
						
						if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '6') sb.append(" ");
						sb.append(six[input.charAt(j) - 109]);
						break;
						
					case 'p' : 
					case 'q' :
					case 'r' :
					case 's' :
						
						if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '7') sb.append(" ");
						sb.append(seven[input.charAt(j) - 112]);
						break;
						
					case 't' :
					case 'u' :
					case 'v' :
						
						if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '8') sb.append(" ");
						sb.append(eight[input.charAt(j) - 116]);
						break;
						
					case 'w' :
					case 'x' :
					case 'y' :
					case 'z' :
						
						if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '9') sb.append(" ");
						sb.append(nine[input.charAt(j) - 119]);
						break;
					
					case ' ' : 
						if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '0') sb.append(" ");
						sb.append("0");
						break;
					
					
				}
			}
			
			sb.insert(0, "Case #" + i+": ");
			System.out.println(sb);
			sb.setLength(0);
		}
		
	}
	
	// 20735번 - Fifty Shades of Pink 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		while(N --> 0) {
			String name = br.readLine().toLowerCase();
			if(name.contains("rose") || name.contains("pink")) cnt++;
			
		}
		
		if(cnt == 0) System.out.println("I must watch Star Wars with my daughter");
		else System.out.println(cnt);
	}
	
	// 9377번 - String LD
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			
			int T = Integer.parseInt(br.readLine());
			if(T == 0) break;
			List<String> str = new ArrayList<>();
			for(int i = 0; i < T; i++) str.add(br.readLine());
			boolean chk = false;
			int cnt = 0;
			
			while(true) {
				
				for(int i = 0; i < T; i++) {
					
					if(str.get(i).length() == 0) {
						chk = true;
						break;
					}
							
				}
	
				if(chk) break;
				
				for(int i = 0; i < T; i++) {
					
					for(int j = i + 1; j < T; j++) {
						
						if(str.get(i).equals(str.get(j))) {
							chk = true;
							break;
						}
					}
					if(chk) break;
				}
				
				if(chk) break;
				for(int i = 0; i < T; i++) str.set(i, str.get(i).substring(1, str.get(i).length()));
				cnt++;
			}
			
			System.out.println(cnt-1);
		}
	}
	
	// 21895번 - Rock-Paper-Scissors for three
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());

		char[] one = br.readLine().toCharArray();
		char[] two = br.readLine().toCharArray();
		
		for(int i = 0; i < T; i++) {
			
			char r1 = one[i];
			char r2 = two[i];
			
			if(r1 != r2) {
				
				char ans;
				if(r1 == 'R') ans = (r2 == 'S') ? 'R' : 'P'; 
				else if(r1 == 'P') ans = (r2 == 'S') ? 'S' : 'P';
				else ans = (r2 == 'P')  ? 'S' : 'R';
				
				sb.append(ans);
			} else {
				
				switch(r1) {
					case 'R' : sb.append('P'); break;
					case 'S' : sb.append('R'); break;
					case 'P' : sb.append('S'); break;
				}
			}
		}
		
		System.out.println(sb);
	}
	
	// 5362번 - Garbled Message 
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input = "";
		while((input = br.readLine()) != null) sb.append(input.replaceAll("iiing", "th") + " \n");
	
		System.out.println(sb);
	}
	
	// 27386번 - Class Field Trip
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		String b = br.readLine();
		
		char[] temp = (a + b).toCharArray();
		Arrays.sort(temp);
		
		for (char c : temp) System.out.print(c);
		
	}
	
	// 15444번 - Vera and ABCDE
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		for(int j = 0; j < N; j++) {
			switch(input.charAt(j)) {
				case 'A' : sb.append("***"); break;
				case 'B' : sb.append("***"); break;
				case 'C' : sb.append("***"); break;
				case 'D' : sb.append("***"); break;
				case 'E' : sb.append("***"); break;
			}
		}
		
		sb.append("\n");
		
		for(int j = 0; j < N; j++) {
			switch(input.charAt(j)) {
			case 'A' : sb.append("*.*"); break;
			case 'B' : sb.append("*.*"); break;
			case 'C' : sb.append("*.."); break;
			case 'D' : sb.append("*.*"); break;
			case 'E' : sb.append("*.."); break;
			}
		}
		
		sb.append("\n");
		
		for(int j = 0; j < N; j++) {
			switch(input.charAt(j)) {
			case 'A' : sb.append("***"); break;
			case 'B' : sb.append("***"); break;
			case 'C' : sb.append("*.."); break;
			case 'D' : sb.append("*.*"); break;
			case 'E' : sb.append("***"); break;
			}
		}
		
		sb.append("\n");
		
		for(int j = 0; j < N; j++) {
			switch(input.charAt(j)) {
			case 'A' : sb.append("*.*"); break;
			case 'B' : sb.append("*.*"); break;
			case 'C' : sb.append("*.."); break;
			case 'D' : sb.append("*.*"); break;
			case 'E' : sb.append("*.."); break;
			}
		}
		
		sb.append("\n");
		
		for(int j = 0; j < N; j++) {
			switch(input.charAt(j)) {
			case 'A' : sb.append("*.*"); break;
			case 'B' : sb.append("***"); break;
			case 'C' : sb.append("***"); break;
			case 'D' : sb.append("***"); break;
			case 'E' : sb.append("***"); break;
			}
		}
		
		sb.append("\n");
		
		System.out.println(sb);
	}
	
}
