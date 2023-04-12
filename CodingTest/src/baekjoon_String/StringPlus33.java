package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class StringPlus33 {
	
	public static void main(String[] args) throws IOException {
		test04();
	}

	// 5103번 - DVDs
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st ;
		
		while(true) {
			
			String video = br.readLine();
			if(video.equals("#")) break;
			
			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int S = Integer.parseInt(st.nextToken());
			
			int T = Integer.parseInt(br.readLine());
			
			while(T --> 0) {
				
				st = new StringTokenizer(br.readLine());
				
				char order = st.nextToken().charAt(0);
				int value = Integer.parseInt(st.nextToken());
				
				switch(order) {
					
					case 'S' : S = Math.max(0, S - value); break;
					case 'R' : S = Math.min(M, S + value); break;
					
				}
			}
			
			sb.append(video + " " + S + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	// 5603번 - 問題2
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder(br.readLine());
		StringBuilder tempStr = new StringBuilder();
		
		while(T --> 0) {
			char[] temp = sb.toString().toCharArray();
			
			int cnt = 1;
			char target = temp[0];
			for(int i = 1; i < temp.length; i++) {
				if(target == temp[i]) {
					cnt++;
				}
				else {
					tempStr.append(cnt).append(target);
					target = temp[i];
					cnt = 1;
				}
			}
			
			tempStr.append(cnt).append(target);
			sb.setLength(0);
			sb.append(tempStr);
			tempStr.setLength(0);
		}
		
		System.out.println(sb);
		
	}
	
	// 20114번 - 미아 노트
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		char[] arr = new char[N];
		Arrays.fill(arr, '?');
		
		for(int i = 0; i < H; i++) {
			String input = br.readLine();
			
			for(int j = 0; j < N * W; j++) {
				char temp = input.charAt(j);
				
				if (temp == '?') continue;
				else arr[j / W] = temp;
			}
		}
		
		for (char c : arr) {
			System.out.print(c);
		}

	}
	
	// 21966번 - (중략)
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		if(N <= 25) {
			System.out.println(input);
			System.exit(0);
		}
		
		String sub = input.substring(12, N - 12);

		if(!sub.contains(".")) 
			System.out.println(input.substring(0, 11) + "..." + input.substring(N - 11, N));
		else 
			System.out.println(input.substring(0, 9) + "......" + input.substring(N - 10));
		
	}

	// 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
	}
	
	// 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
	}
	
	
}
