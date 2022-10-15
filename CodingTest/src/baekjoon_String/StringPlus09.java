package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringPlus09 {
	
	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 팰린드롬 척화비 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		if(N%2 == 0) {
			
			for(int i = 0; i < N; i++) {
				sb.append("s");
			}
		} else {
			for(int i = 0; i < N; i++) {
				if(i == N/2) {
					sb.append("t");
				} else {
					sb.append("s");
				}
			}
		}
		
		System.out.println(sb);
	}

	// 팰린드롬 소떡소떡
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		String str = br.readLine();

		int count = 0;
		
		if(length%2 == 0) {
			
			for(int i = 0; i < str.length()/2; i++) {
				if(i != length/2) {
					if(!(str.charAt(i) == str.charAt(str.length()-(i+1)))) {
						count++;
					}
				}
			}
		} else {
			for(int i = 0; i < str.length()/2; i++) {
				if(!(str.charAt(i) == str.charAt(str.length()-(i+1)))) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

	// Heavy Numbers 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String A = st.nextToken();
		String B = st.nextToken();
		
		long aSum = 0;
		long bSum = 0;
		
		for(int i = 0; i < A.length(); i++) {
			aSum += Character.getNumericValue(A.charAt(i));
		}
		aSum *= A.length();
		
		for(int i = 0; i < B.length(); i++) {
			bSum += Character.getNumericValue(B.charAt(i));
		}
		bSum *= B.length();
		
		if(aSum > bSum) {
			System.out.println(1);
		} else if(aSum < bSum) {
			System.out.println(2);
		} else {
			System.out.println(0);
		}
	}
	
	// 지영 공주님의 마법 거울
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringBuilder sbRL = new StringBuilder();
		for(int i = 0; i < testCase; i++) {
			StringBuilder str = new StringBuilder(br.readLine()).reverse();
			sb.append(str.reverse()).append("\n");
			if(i != testCase-1) {
				sbRL.append(str.reverse()).append("\n");
			} else {
				sbRL.append(str.reverse());
			}
		}
		
		int upset = Integer.parseInt(br.readLine());
		
		if(upset == 1) {
			System.out.println(sb);
		} else if(upset == 2) {
			System.out.println(sbRL);
		} else if(upset == 3) {
			System.out.println(sbRL.reverse());
		}
	}
	
	// 농구 경기
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		Map<String, Integer> hashMap = new HashMap<>();
		for(int i = 0; i < testCase; i++) {
			String temp = br.readLine();
			hashMap.put(temp.charAt(0)+"", hashMap.getOrDefault(temp.charAt(0)+"", 0) + 1);
		}

		Iterator<String> iter = hashMap.keySet().iterator();
		
		StringBuilder sb = new StringBuilder();
		while(iter.hasNext()) {
			String temp = iter.next();
			if(hashMap.get(temp) >= 5) {
				sb.append(temp);
			}
		}
		
		if(sb.length() == 0) {
			System.out.println("PREDAJA");
		} else {
			System.out.println(sb);
		}
	}
	
	// 알파벳 거리
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		for(int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			StringBuilder sb  = new StringBuilder();
			
			String temp1 = st.nextToken();
			String temp2 = st.nextToken();

			sb.append("Distances: ");
			for(int j = 0; j < temp1.length(); j++) {
				int distance = temp2.charAt(j) - temp1.charAt(j);
				if(distance < 0) {
					distance += 26;
				}
				sb.append(distance).append(" ");
			}
		
			System.out.println(sb);
		}
		
	}

	// 가장 많은 글자
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while(sc.hasNext()) {
			sb.append(sc.nextLine().replaceAll(" ", ""));
		}
		
		Map<String, Integer> hashMap = new HashMap<>();
		for(int i = 0; i < sb.length(); i++) {
			hashMap.put((sb.charAt(i)+""), hashMap.getOrDefault((sb.charAt(i)+""), 0) +1);
		}
		
		List<Integer> valueList = new ArrayList<>(hashMap.values());
		valueList.sort(Integer::compareTo);

		int max = valueList.get(valueList.size() -1);
			
		Iterator<String> iter = hashMap.keySet().iterator();
		StringBuilder answer = new StringBuilder();
		List<String> arr = new ArrayList<>();
		while(iter.hasNext()) {
			String temp = iter.next();
			if(hashMap.get(temp) == max) {
				arr.add(temp);
			}
		}
		
		Collections.sort(arr);
		for (String string : arr) {
			System.out.print(string);
		}
	}
	
	// 첼시를 도와줘! 
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			
			int T = Integer.parseInt(br.readLine());
			
			long maxP = 0;
			String maxName = "";
			for(int j = 0; j < T; j++) {
				
				String[] str = br.readLine().split(" ");
				long price = Long.parseLong(str[0]);
				String name = str[1];
				if(price > maxP) {
					maxP = price;
					maxName = name;
				}
			}
			
			System.out.println(maxName);
		}
		
	}
	
	// 연속구간
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < 3; i++) {
			String str = br.readLine();
			
			int cnt = 1;
			int maxCnt = 1;
			for(int j = 0; j < 8; j++) {
				
				if(j != 7) {
					if(str.charAt(j) == str.charAt(j+1)) {
						cnt++;
						if(cnt > maxCnt) {
							maxCnt = cnt;
						}
					} else {
						cnt = 1;
					}
				}
			}
			System.out.println(maxCnt);
		}
		
	}
	
	// 카이사르 암호
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			switch(str.charAt(i)) {
				case 'A' : sb.append('X'); break;
				case 'B' : sb.append('Y'); break;
				case 'C' : sb.append('Z'); break;
				case 'D' : sb.append('A'); break;
				case 'E' : sb.append('B'); break;
				case 'F' : sb.append('C'); break;
				case 'G' : sb.append('D'); break;
				case 'H' : sb.append('E'); break;
				case 'I' : sb.append('F'); break;
				case 'J' : sb.append('G'); break;
				case 'K' : sb.append('H'); break;
				case 'L' : sb.append('I'); break;
				case 'M' : sb.append('J'); break;
				case 'N' : sb.append('K'); break;
				case 'O' : sb.append('L'); break;
				case 'P' : sb.append('M'); break;
				case 'Q' : sb.append('N'); break;
				case 'R' : sb.append('O'); break;
				case 'S' : sb.append('P'); break;
				case 'T' : sb.append('Q'); break;
				case 'U' : sb.append('R'); break;
				case 'V' : sb.append('S'); break;
				case 'W' : sb.append('T'); break;
				case 'X' : sb.append('U'); break;
				case 'Y' : sb.append('V'); break;
				case 'Z' : sb.append('W'); break;
			}
		}
		
		System.out.println(sb);
	}
	
}
