package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Implement58 {
    
	public static void main(String[] args) throws IOException {
		test02();
	}

	
	// 28235번 - 코드마스터 2023
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		switch(input) {
		
			case "SONGDO" : System.out.println("HIGHSCHOOL"); break;
			case "CODE" : System.out.println("MASTER"); break;
			case "2023" : System.out.println("0611"); break;
			case "ALGORITHM" : System.out.println("CONTEST"); break;
			
		}
		
	}
	
	// 3778번 - 애너그램 거리
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			
			String input1 = br.readLine();
			int[] alp1 = new int[26];
			for(int j = 0; j < input1.length(); j++) alp1[input1.charAt(j) -'a']++;
			
			String input2 = br.readLine();
			int[] alp2 = new int[26];
			for(int j = 0; j < input2.length(); j++) alp2[input2.charAt(j) -'a']++;
			
			int total = 0;
			for(int j = 0; j < 26; j++ ) total += Math.abs(alp1[j] - alp2[j]);
			
			System.out.println("Case #" + (i + 1) + ": " + total);
		}
	}
	
	
	// 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
	}
	
	// 
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
	}
	
	// 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
	}
	
	
}
