package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Implement34 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// Pascal Library
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String input = "";
		
		while(!(input = br.readLine()).equals("0 0")) {
			
			st = new StringTokenizer(input);
			int N = Integer.parseInt(st.nextToken());
			int D = Integer.parseInt(st.nextToken());
			
			boolean[][] arr = new boolean[D][N];
			
			for(int i = 0; i < D; i++) {
				
				st = new StringTokenizer(br.readLine());
				
				for(int j = 0; j < N; j++) {
					arr[i][j] = (Integer.parseInt(st.nextToken()) == 1) ? true : false;
				}
			}
			
			if(chk(arr, N, D)) System.out.println("yes");
			else System.out.println("no");
			
		}
		
	}
	
	private static boolean chk(boolean[][] arr, int N, int D) {
		
		for(int i = 0; i < N; i++) {
			boolean chk = true;
			
			for(int j = 0; j < D; j++) {
				if(!arr[j][i]) chk = false;
			}
			
			if(chk) return true;
		}
		
		return false;
		
	}
	
	// Forced Choice 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < S; i++) {
			st = new StringTokenizer(br.readLine());
			
			int m = Integer.parseInt(st.nextToken());
			
			boolean keep = false;
			for(int j = 0; j < m; j++) {
				int choise = Integer.parseInt(st.nextToken());
				
				if(choise == P) keep = true;
			}
			
			if(keep) System.out.println("KEEP");
			else System.out.println("REMOVE");
		}
		
	}
	
	// Luhn 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int number = 0;
		for(int i = input.length() - 2; i >= 0; i -= 2) {
			
			
			int temp = (input.charAt(i) - '0') * 2;
			
			if(temp >= 10) {
				
				String two = temp +"";
				
				number += (two.charAt(0) - '0') + (two.charAt(1) - '0');
				
			} else number += temp;
			
		}
		
		for(int i = input.length() - 1; i >= 0; i -= 2) {
			
			int temp = (input.charAt(i) - '0');
			
			number += temp;
		}
		
		if(number % 10 == 0) System.out.println("DA");
		else System.out.println("NE");
	}
	
	// Alien 
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		int b1 = Integer.parseInt(st.nextToken());
		int b2 = Integer.parseInt(st.nextToken());
		
		String ans = "No";
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			if(x1 <= b1 && b1 <= x2 && y1 <= b2 && b2 <= y2) ans = "Yes";
		}
		
		System.out.println(ans);
	}
	
	// Filling Out the Team
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer token;
		
		while(true) {
			token = new StringTokenizer(br.readLine());
			int p = 0;
			double sp = Double.parseDouble(token.nextToken());
			double w = Double.parseDouble(token.nextToken());
			double st = Double.parseDouble(token.nextToken());
			
			if(sp == 0 && w == 0 && st == 0) break;
			
		    if (sp <= 4.5 && w >= 150 && st >= 200) {
		    	p = 1; 
		    	sb.append("Wide Receiver");
		    }

		    if (sp <= 6.0 && w >= 300 && st >= 500) {
		    	if(p == 1) sb.append(" ");
		    	p = 1; 
		    	sb.append("Lineman");
		    }
		    
		    if (sp <= 5.0 && w >= 200 && st >= 300) {
		    	if(p == 1) sb.append(" ");
		    	p = 1; 
		    	sb.append("Quarterback");
		    }
		    
		    if (p == 0) {
		    	sb.append("No positions");
		    }
		    
		    sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	// Nice Raises
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		int t1 = 0;
		int t2 = 0;
		
		while(n --> 0) {
			int money = Integer.parseInt(br.readLine());
			
			int plus = money + r;
			int two = money * 2;
			
			if(plus > two) t1++;
			else if(plus < two) t2++;
		}
		
		if(t1 > t2) System.out.println(1);
		else if(t1 < t2) System.out.println(2);
		else System.out.println(0);
		
	}
	
	// ЛИНИЯ
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		while(true) {
			
			if(N % 2 != 0) {
				N = N/2 + 1;
			} else {
				break;
			}
		}
		
		System.out.println(N);
	}
	
	// Game Show!
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int C = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int ans = 0;
		while(C --> 0) {
			
			int v = Integer.parseInt(br.readLine());
			sum += v;
			
		    if (sum > ans) ans = sum;
		}
		
		System.out.println(ans + 100);
	}
	
	// Presidential Election
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		int totalE1 = 0;
		int totalE2 = 0;
		int totalV1 = 0;
		int totalV2 = 0;
		
		while(N -- > 0) {
			st = new StringTokenizer(br.readLine());
			
			int e = Integer.parseInt(st.nextToken());
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());
			
			if(v1 < v2) {
				totalV1 += v1;
				totalV2 += v2;
				totalE2 += e;
			} else if(v1 > v2) {
				totalV1 += v1;
				totalV2 += v2;
				totalE1 += e;
			}
		}

		if(totalV1 > totalV2 && totalE1 > totalE2) System.out.println(1);
		else if(totalV1 < totalV2 && totalE1 < totalE2) System.out.println(2);
		else System.out.println(0);
	}
	
	// Missing Runners 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		boolean[] chk = new boolean[N+1];
		
		for(int i = 1; i < N; i++) 
			chk[Integer.parseInt(st.nextToken())] = true;
		
		
		for(int i = 1; i <= N; i++) {
			if(!chk[i]) {
				System.out.println(i);
				return;
			}
		}
	}
	
	
}
