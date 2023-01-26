package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Implement38 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 4388번 - 받아올림 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String A;
		String B;
		int carry;
		int totalCarry;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			A = st.nextToken();
			B = st.nextToken();
			
			if(A.equals("0") && B.equals("0")) break;

			totalCarry = 0;
			
			if(A.length() < B.length()) 
				while(A.length() != B.length()) A = "0" + A;
			else while(A.length() != B.length()) B = "0" + B;

			carry = 0;
			for(int i = A.length() - 1; i >= 0; i--) {
				
				if((int)(A.charAt(i) - '0') + (int)(B.charAt(i) - '0') + carry >= 10) {
					carry = 1;
					totalCarry++;
				} else carry = 0;
			}
			
			sb.append(totalCarry + "\n");
		}
		
		System.out.print(sb);
	}
	
	// 24569번 - Fergusonball Ratings 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		boolean gold = true;
		int star = 0;
		
		for(int i = 0; i < N; i++) {
			
			int score = Integer.parseInt(br.readLine());
			int penalty = Integer.parseInt(br.readLine());
			
			if(score * 5 - penalty * 3 > 40) star++;
			else gold = false;
				
		}
		
		if(gold) System.out.println(star + "+");
		else System.out.println(star);
	}
	
	// 14535번 - Birthday Graph
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int TC = 1;
		
		while(true) {
			
			int N = Integer.parseInt(br.readLine().replaceAll(" ", ""));
			if(N == 0) break;
			
			String Jan = "Jan:";
			String Feb = "Feb:";
			String Mar = "Mar:";
			String Apr = "Apr:";
			String May = "May:";
			String Jun = "Jun:";
			String Jul = "Jul:";
			String Aug = "Aug:";
			String Sep = "Sep:";
			String Oct = "Oct:";
			String Nov = "Nov:";
			String Dec = "Dec:";
			
			while(N --> 0) {
				

				st = new StringTokenizer(br.readLine());
				int day = Integer.parseInt(st.nextToken());
				int month = Integer.parseInt(st.nextToken());
				int year = Integer.parseInt(st.nextToken());
				
				switch(month) {
				
					case 1 : Jan += "*"; break;
					case 2 : Feb += "*"; break;
					case 3 : Mar += "*"; break;
					case 4 : Apr += "*"; break;
					case 5 : May += "*"; break;
					case 6 : Jun += "*"; break;
					case 7 : Jul += "*"; break;
					case 8 : Aug += "*"; break;
					case 9 : Sep += "*"; break;
					case 10 : Oct += "*"; break;
					case 11 : Nov += "*"; break;
					case 12 : Dec += "*"; break;
					
				}
				
			}
			
			sb.append("Case #" + TC + ":" + "\n");
			sb.append(Jan + "\n" + Feb + "\n" + Mar +"\n" + Apr + "\n");
			sb.append(May + "\n" + Jun + "\n" + Jul +"\n" + Aug + "\n");
			sb.append(Sep + "\n" + Oct + "\n" + Nov +"\n" + Dec + "\n");
			
			TC++;
		}
		
		System.out.println(sb);
		
	}
	
	// 20268번 - Keystroke
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < N; i++) st.nextToken();
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < M; i++) st.nextToken();
			
			int ans = (N == 2 && M == 2) ? 7 : 1;
			
			System.out.println(ans);
		}
	}
	
	// 10804번 - 카드 역배치 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		for(int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken()) - 1;
			int end = Integer.parseInt(st.nextToken()) - 1;
			
			int num = (Math.abs(end - start + 1) / 2);
            int count = 0;
            
            for (int j = 0; j < num; j++) {
            	
                int tmp = arr[start + count];
                arr[start + count] = arr[end - count];
                arr[end - count] = tmp;
                count++;
            }
		}
		
		for (int b : arr) {
			System.out.print(b + " ");
		}
		
			
	}
	
	// 13871번 - Farm robot 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int point = 1;
		int ans = 0;
		if(S == 1) ans++;
		
		for(int i = 0; i < C; i++) {
			int move = Integer.parseInt(st.nextToken());
			
			if(move == 1) point++;
			else point--;
			
			if(point == 0) point = N;
			if(point == N + 1) point = 1;
			if(point == S) ans++;
			
		}
		
		System.out.print(ans);
		
	}
	
	// 15079번 - Arggggggh!
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		double x = Integer.parseInt(st.nextToken());
		double y = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N - 1; i++) {
			st = new StringTokenizer(br.readLine());
			String dir = st.nextToken();
			double move = Integer.parseInt(st.nextToken());
			switch(dir) {
				case "N" : y += move; break;
				case "NE" : y += Math.sqrt(move * move / 2); x += Math.sqrt(move * move / 2); break;
				case "E" : x += move; break;
				case "SE" : y -= Math.sqrt(move * move / 2); x += Math.sqrt(move * move / 2); break;
				case "S" : y -= move; break;
				case "SW" : y-= Math.sqrt(move * move / 2); x -= Math.sqrt(move * move / 2); break;
				case "W" : x -= move; break;
				case "NW" : y += Math.sqrt(move * move / 2); x -= Math.sqrt(move * move / 2); break;
			}
		}
				
		System.out.println(String.format("%.8f", x) + " " + String.format("%.8f", y));
		
	}
	
	// 13773번 - Olympic Games 
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			int year = Integer.parseInt(br.readLine());
			if (year == 0) break;
			
			String msg = "";
			
			sb.append(year);
			
	        if (year < 1896)  sb.append(" No summer games");
	        
	        else if(year == 1916 || year == 1940 || year == 1944) sb.append(" Games cancelled");
	        
	        else if (year > 2020 && year % 4 == 0) sb.append(" No city yet chosen");

	        else if (year % 4 == 0) sb.append(" Summer Olympics");
	        
	        else sb.append(" No summer games");
			
	        sb.append("\n");
		}
		
		System.out.print(sb);
	}
	
	// 15429번 - Odd Gnome 
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			
			int[] gnom = new int[n];
			for(int i = 0; i < n; i++) gnom[i] = Integer.parseInt(st.nextToken());
			
			int king = 0;
			
			for(int i = 1; i < n - 1; i++) 
				if(gnom[i - 1] + 1 != gnom[i]) {
					king = i + 1;
					break;
				}
			
			
			sb.append(king + "\n");
		}
		
		System.out.print(sb);
	}
	
	// 25933번 - Medal Ranking
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int ag = Integer.parseInt(st.nextToken());
			int as = Integer.parseInt(st.nextToken());
			int ab = Integer.parseInt(st.nextToken());
			int rg = Integer.parseInt(st.nextToken());
			int rs = Integer.parseInt(st.nextToken());
			int rb = Integer.parseInt(st.nextToken());
			
			boolean count = false;
			boolean color = false;
			
			if(ag + as + ab > rg + rs + rb) count = true;
			
			if(ag > rg) color = true;
			else if(ag == rg) {
				
				if(as > rs) color = true;
				else if(as == rs) {
					
					if(ab > rb) color = true;
				}
			} 
			
			sb.append(ag + " " + as + " " + ab + " " + rg + " " + rs + " " + rb + "\n");
			if(count && color) sb.append("both");
			else if(count) sb.append("count");
			else if(color) sb.append("color");
			else sb.append("none");
			
			sb.append("\n");
			sb.append("\n");
		}
		
		System.out.print(sb);
		
	}
	
	
	
	
	
}
