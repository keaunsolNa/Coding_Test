package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringPlus13 {
	
	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 연세여 사랑한다
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = br.readLine().charAt(0);
		int i = (int)'I';
		int l = (int)'L';
		int o = (int)'O';
		int v = (int)'V';
		int e = (int)'E';
		int y = (int)'Y';
		int n = (int)'N';
		int s = (int)'S';
		
		int answer = 0;
		answer += Math.abs(i - c);
		c = i;
		answer += Math.abs(l - c);
		c = l;
		answer += Math.abs(o - c);
		c = o;
		answer += Math.abs(v - c);
		c = v;
		answer += Math.abs(e - c);
		c = e;
		answer += Math.abs(y - c);
		c = y;
		answer += Math.abs(o - c);
		c = o;
		answer += Math.abs(n - c);
		c = n;
		answer += Math.abs(s - c);
		c = s;
		answer += Math.abs(e - c);
		c = e;
		answer += Math.abs(i - c);
		c = i;
		
		System.out.println(answer);
	}
	
	// Digit Count
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int area1 = Integer.parseInt(input[0]);
		int area2 = Integer.parseInt(input[1]);
		int number = Integer.parseInt(input[2]);
		int cnt = 0;
		for(int i = area1; i <= area2; i++) {
			
			for(int j = 0; j < 4; j++) {
				if((i+"").charAt(j) == (number+"").charAt(0)) cnt++;
			}
		}
		
		System.out.println(cnt);
	}

	// 수 이어 쓰기 3 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= N; i++) sb.append(i);
		
		 System.out.println(sb.toString().indexOf(String.valueOf(N))+1);
	}
	
	// 창영마을
	public static void test04() throws NumberFormatException, IOException {
        Scanner scanner = new Scanner(System.in);

        List<Character> list = new ArrayList<>(Arrays.asList('1', '0', '0')); 

        String str = scanner.next(); 

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') {
                Collections.swap(list, 0, 1);
            } else if (str.charAt(i) == 'B') {
                Collections.swap(list, 1, 2);
            } else {
                Collections.swap(list, 0, 2);
            }
        }
        System.out.println(list.indexOf('1') + 1); 
	}
	
	// 크로스워드 만들기 
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();
		int x = 0;
		int y = 0;
		boolean flag = false;
		for(int i = 0; i < A.length(); i++) {
			char aChar = A.charAt(i);
			for(int j = 0; j < B.length(); j++) {
				char bChar = B.charAt(j);
				if(aChar == bChar) {
					x = i;
					y = j;
					flag = true;
					break;
				}
			}
			if(flag)break;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < B.length(); i++) {
			if(i == y) {
				sb.append(A).append("\n");
				continue;
			}
			
			for(int j = 0; j < A.length(); j++) {
				if(j == x) {
					sb.append(B.charAt(i));
				}
				else {
					sb.append(".");
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
	
	// 8진수
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		while(input.length()%3 != 0) {
			input = "0" + input;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < input.length(); i+=3) {
			String text = input.substring(i, i+3);
			switch(text) {
				case "000" : sb.append("0"); break;
				case "001" : sb.append("1"); break;
				case "010" : sb.append("2"); break;
				case "011" : sb.append("3"); break;
				case "100" : sb.append("4"); break;
				case "101" : sb.append("5"); break;
				case "110" : sb.append("6"); break;
				case "111" : sb.append("7"); break;
			}
		}
		
		System.out.println(sb);
		
    }

	// ZOAC 2
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		char now = 'A';
		int answer = 0;
		
		for(int i = 0; i < input.length(); i++) {
			char cTemp = input.charAt(i);
			int temp = Math.abs(cTemp - now);
			answer += Math.min(temp, 26 - temp);
			
			now = cTemp;
		}
		
		System.out.println(answer);
	}
	
	// 1번부터 문제의 상태가…?
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		if(input.contains("A")) {
			input = input.replaceAll("[BCDF]", "A");
		} else if(input.contains("B")) {
			input = input.replaceAll("[CDF]", "B");
		} else if(input.contains("C")) {
			input = input.replaceAll("[DF]", "C");
		} else {
			input = input.replaceAll("[A-Z]", "A");
		}
		
		System.out.println(input);
	}
	
	// Rock, Paper, Scissors 
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		while(!(input = br.readLine()).equals("E")) {
			String P1 = input;
			String P2 = br.readLine();
			int P1W = 0;
			int P2W = 0;
			for(int i = 0; i < P1.length(); i++) {
				switch(P1.charAt(i)) {
					case 'R' :
						if(P2.charAt(i) == 'S') {
							P1W++;
						} else if(P2.charAt(i) == 'P') {
							P2W++;
						}
						break;
					case 'S' :
						if(P2.charAt(i) == 'R') {
							P2W++;
						} else if(P2.charAt(i) == 'P') {
							P1W++;
						}
						break;
					case 'P' :
						if(P2.charAt(i) == 'S') {
							P2W++;
						} else if(P2.charAt(i) == 'R') {
							P1W++;
						}
						break;
				}
			}
			System.out.println("P1: "+P1W);
			System.out.println("P2: "+P2W);
		}
	}
	
	// Quite a problem
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		String regex = "(?i).*problem.*";
		while((input = br.readLine()) != null) {
			if(input.matches(regex)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
	
}
