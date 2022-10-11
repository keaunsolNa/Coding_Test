package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringPlus5 {
	
	public static void main(String[] args) throws IOException {
		test09();
	}
	
	// 홀수일까 짝수일까
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			String K = br.readLine();

			if(Character.getNumericValue(K.charAt(K.length() - 1)) % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}
		
		
	}

	// 등장하지 않는 문자의 합
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		List<Character> alpList = new ArrayList<>();
		for(int i = 65; i <= 90; i++) {
			alpList.add((char)i);
		}

		for(int i = 0; i < testCase; i++) {
			String S = br.readLine();
			List<Character> alpList2 = new ArrayList<>();
			
			for(int j = 0; j < S.length(); j++) {
				alpList2.add(S.charAt(j));
			}

			int sum = 0;
			for(int k = 0; k < alpList.size(); k++) {
				if(!alpList2.contains(alpList.get(k))) {
					sum += alpList.get(k);
				}
			}
			System.out.println(sum);
		}
	}

	// 경고
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] before = br.readLine().split(":");
		String[] after = br.readLine().split(":");
		
		int beforeSecond = Integer.parseInt(before[2]) + (Integer.parseInt(before[1])*60) + (Integer.parseInt(before[0])*3600);
		int afterSecond = Integer.parseInt(after[2]) + (Integer.parseInt(after[1])*60) + (Integer.parseInt(after[0])*3600);
		int time = afterSecond - beforeSecond;
		
		if(time < 0) {
			time = (86400 - beforeSecond) + afterSecond;
		} 
		
		String H = time/3600+"";
		String M = time%3600/60+"";
		String S = time%60+"";
		
		if(H.length() == 1) {
			H = "0"+H;
		} 
		if(M.length() == 1) {
			M = "0"+M;
		}
		if(S.length() == 1) {
			S = "0"+S;
		}
		
		if(H.equals("00") && M.equals("00") && S.equals("00")) {
			System.out.println("24:00:00");
		} else {
			System.out.println(H + ":" + M + ":" + S);
		}
	}
	
	// 거울, 오! 거울
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		while(!(input = br.readLine()).equals("***")) {
			StringBuilder sb = new StringBuilder(input);
			
			System.out.println(sb.reverse());
		}
		
	}
	
	// 입실 관리
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			String Si = br.readLine().toLowerCase();
			
			System.out.println(Si);
		}
	}
	
	// IBM 빼기 1
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		for(int i = 0; i < testCase; i++) {
			System.out.println("String #" + (i+1));
			String str = br.readLine();
			
			for(int j = 0; j < str.length(); j++) {
				if((int)str.charAt(j) == 90) {
					System.out.print((char)'A');
				} else {
					System.out.print((char)((int)str.charAt(j)+1));
				}

			}
			System.out.println();
			System.out.println();
		}
	}

	// 선린인터넷고등학교 교가
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		String str = br.readLine();

		StringBuilder sb = new StringBuilder();
		
		for(int i = 5; i > 0; i--) {
			sb.append(str.charAt(str.length()-i));
		}
		System.out.println(sb);
	}
	
	// 인생 점수
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			String str = br.readLine();
			
			int sum = 0;
			for(int j = 0; j < str.length(); j++) {
				
				switch(str.charAt(j)) {
					case 'A' : sum = sum + 1; break;
					case 'B' : sum = sum + 2; break;
					case 'C' : sum = sum + 3; break;
					case 'D' : sum = sum + 4; break;
					case 'E' : sum = sum + 5; break;
					case 'F' : sum = sum + 6; break;
					case 'G' : sum = sum + 7; break;
					case 'H' : sum = sum + 8; break;
					case 'I' : sum = sum + 9; break;
					case 'J' : sum = sum + 10; break;
					case 'K' : sum = sum + 11; break;
					case 'L' : sum = sum + 12; break;
					case 'M' : sum = sum + 13; break;
					case 'N' : sum = sum + 14; break;
					case 'O' : sum = sum + 15; break;
					case 'P' : sum = sum + 16; break;
					case 'Q' : sum = sum + 17; break;
					case 'R' : sum = sum + 18; break;
					case 'S' : sum = sum + 19; break;
					case 'T' : sum = sum + 20; break;
					case 'U' : sum = sum + 21; break;
					case 'V' : sum = sum + 22; break;
					case 'W' : sum = sum + 23; break;
					case 'X' : sum = sum + 24; break;
					case 'Y' : sum = sum + 25; break;
					case 'Z' : sum = sum + 26; break;
				}
			}
			
			if(sum == 100) {
				System.out.println("PERFECT LIFE");
			} else {
				System.out.println(sum);
			}
		}
	}
	
	// FBI
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt = 0;
		for(int i = 0; i < 5; i++) {
			String str = br.readLine();
			
			if(str.contains("FBI")) {
				System.out.println((i+1));
				cnt++;
			}
		}
		
		if(cnt == 0) {
			System.out.println("HE GOT AWAY!");
		}
	}
	
	// 연길이의 이상형
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++) {
			switch(str.charAt(i)) {
				case 'E' : sb.append('I'); break;
				case 'S' : sb.append('N'); break;
				case 'T' : sb.append('F'); break;
				case 'J' : sb.append('P'); break;
				case 'I' : sb.append('E'); break;
				case 'N' : sb.append('S'); break;
				case 'F' : sb.append('T'); break;
				case 'P' : sb.append('J'); break;
			}
		}
		
		System.out.println(sb);
	}
	
}
