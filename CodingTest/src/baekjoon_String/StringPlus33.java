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
		test03();
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
	
	// 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	}
	
	// 
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
	}
	
	
}
