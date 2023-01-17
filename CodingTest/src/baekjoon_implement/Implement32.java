package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Implement32 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// Handebol
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int ans = 0;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			boolean chk = true;
			for(int j = 0; j < M; j++) {
				int goal = Integer.parseInt(st.nextToken());
				if(goal == 0) chk = false;
			}
			
			if(chk) ans++;
		}
		
		System.out.println(ans);
	}

	// Гостиница 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int two = 0; two <= N / 2; two++) {
			
			for(int three = 0; three <= N /3; three++) {
				
				if((two * 2) + (three * 3) == N) {
					System.out.println(two + " " + three);
					return;
				}
			}
		}
		
		
	}
	
	
	// In the Shower
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int cnt = 0;
			st = new StringTokenizer(br.readLine());
			int E = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			for(int j = 0; j < N; j++) {
				int A = Integer.parseInt(br.readLine());
				
				if(A > E) cnt++;
			}
			System.out.println(cnt);
		}
		
	}
	
	// Left Beehind 
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		String input = "";
		
		while(!(input = br.readLine()).equals("0 0")) {
			st = new StringTokenizer(input);
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
		
			if(x + y == 13) sb.append("Never speak again.");
			else if(x > y) sb.append("To the convention.");
			else if(y > x) sb.append("Left beehind.");
			else if(x == y) sb.append("Undecided.");
			
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	// 생장점 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int tree = 1;
			
			if(N == 0) break;
			
			for(int i = 0; i < 2 * N; i++) {
				int M = Integer.parseInt(st.nextToken());
				
				if(i % 2 == 0) tree *= M;
				else tree -= M;
				
			}
			System.out.println(tree);
		}
		
	}
	
	// Practice: Roll Call
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			
			String A = br.readLine();
			String B = br.readLine();
			
			sb.append("Case " + (i + 1)+": " + B + ", " + A + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	// License to Launch
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int min = Integer.MAX_VALUE;
		int idx = 0;
		for(int i = 0; i < T; i++) {
			int temp = Integer.parseInt(st.nextToken());

			if(temp < min) {
				min = temp;
				idx = i;
			}
		}
		
		System.out.println(idx);
	}
	
	// Dalia 
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int c1 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			int c2 = Integer.parseInt(st.nextToken());
			
			String ans = Math.abs((r1 - r2) * (c1 - c2)) == 2 ? "YES" : "NO";
			
			sb.append("Case " + (i + 1) + ": " + ans + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	
	// Sir Bedavere’s Bogus Division Solutions 
	public static void test09() throws IOException {
		
		for(int top = 100; top <= 999; top++){
		  
			for(int bottom = 100; bottom <= 999; bottom++){
	    	
				if(top % 111 == 0 && bottom % 111 == 0) continue;
				if(bottom*(top / 10) == top*(bottom % 100) && (top % 10) == (bottom /100))
	       
					System.out.printf("%d / %d = %d / %d\n", top, bottom, top/10, bottom%100);
			}
	  
		}

	}
	
	// Szachy
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int ans = 0;
		
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			int max = Integer.MIN_VALUE;
			
			for(int j = 0; j < N; j++) 
				max = Math.max(max, Integer.parseInt(st.nextToken()));
			
			ans += Math.max(0, max);
		}
		
		System.out.println(ans);
	}
	
	
	
	
}
