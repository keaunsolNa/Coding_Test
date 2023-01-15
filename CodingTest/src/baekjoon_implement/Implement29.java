package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Implement29 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// Shifty Sum
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		
		long sum = N;
		while(K --> 0) {
			N = Integer.parseInt(N + "0");
			sum += N;
		}
		
		System.out.println(sum);
		
	}
	
	// Speed Limit 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int input = -2;
		
		while((input = Integer.parseInt(br.readLine())) != -1) {
			
			st = new StringTokenizer(br.readLine());
			int speed = Integer.parseInt(st.nextToken());
			int prevMile = Integer.parseInt(st.nextToken());
			long total = speed * prevMile;
			
			for(int i = 1; i < input; i++) {
				
				st = new StringTokenizer(br.readLine());
				speed = Integer.parseInt(st.nextToken());
				int mile = Integer.parseInt(st.nextToken());
				
				total += ((mile - prevMile) * speed);
				prevMile = mile;
			}
			
			sb.append(total + " miles" + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	// Tarifa 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int X = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		long ans = 0;
		while(N --> 0) {
			int spend = Integer.parseInt(br.readLine());
			ans += X;
			ans = (ans - spend);
		}
		
		System.out.println(ans + X);
	}
	
	// 현대모비스와 함께하는 부품 관리
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int start = 1; start <= T; start++) {
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			sb.append("Material Management " + start + "\n");
			
			for(int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				
				int size = Integer.parseInt(st.nextToken());
				int weight = Integer.parseInt(st.nextToken());
				
				
			}
			
			sb.append("Classification ---- End!" + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb);
				
	}
	
	// Collatz Conjecture
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		sb.append(N + " ");
		while(N != 1) {
			
			if(N % 2 == 0) N /= 2;
			else N = (N * 3) + 1;

			sb.append(N + " ");
		}

		System.out.println(sb);
	}

	// Harshad Numbers
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(long ans = N; ans < Long.MAX_VALUE; ans++) {
			
			int sum = 0;
			for(int i = 0; i < (ans+"").length(); i++) 
				sum += Character.getNumericValue((ans+"").charAt(i));
			
			
			if(ans % sum == 0) {
				System.out.println(ans);
				return;
			}
		}
		
	}
	
	// Multiple Choice
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		String[] stu = new String[T];
		for(int i = 0; i < T; i++) stu[i] = br.readLine();
		
		String[] ans = new String[T];
		for(int i = 0; i < T; i++) ans[i] = br.readLine();
		
		int corect = 0;
		for(int i = 0; i < T; i++) 
			if(stu[i].equals(ans[i])) corect++;
		
		System.out.println(corect);
		
	}

	// Sharing Birthdays
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		Set<String> set = new HashSet<>();
		for(int i = 0; i < T; i++) 
			set.add(br.readLine());
		
		System.out.println(set.size());
		
	}
	
	// SAHUR & IMSA’
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			
			sb.append("Case #" + i + ": ");
			
			st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			if(M - 45 < 0) {
				
				if(H - 1 < 0) sb.append(23 + " " + (M + 15));
				else sb.append((H - 1) + " " + (M + 15));
				
			} else sb.append(H + " " + (M - 45));
			
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		
		System.out.print(sb);
	}

	// Монетки 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		int front = 0;
		int back = 0;
		while(T --> 0) {
			int coin = Integer.parseInt(br.readLine());
			
			front += (coin == 1) ? 1 : 0;
			back += (coin == 0) ? 1 : 0;
			
		}
		
		System.out.println(Math.min(front, back));
	}
	
	
}
