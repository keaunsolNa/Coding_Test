package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Implement30 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// Chessboard 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < M; j++) {
				char temp = ' ';
				if(i % 2 == 0) temp = (j % 2 == 0) ? '*' : '.';
				else temp = (j % 2 != 0) ? '*' : '.';
				
				sb.append(temp);
			}
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	// 피드백
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		sb.append(N + "\n");
		
		int[] arr = new int[N];
		arr[0] = 1;
		arr[1] = 2;
		arr[N - 1] = 997;
		
		for(int i = 1; i < N; i++) 
			if(arr[i] == 0) arr[i] = arr[i - 1] + 1;
		
		for (int i : arr) sb.append(i + " ");
		
		System.out.println(sb);
	}
	
	// Sum Kind of Problem 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int P = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= P; i++) {
			st = new StringTokenizer(br.readLine());
			
			int K = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			long S1 = 0;
			long S2 = 0;
			long S3 = 0;
			
			for(int idx = 1; idx <= N; idx++) S1 += idx;
			for(int idx = 1; idx <= 2 * N; idx += 2) S2 += idx;
			for(int idx = 2; idx <= 2 * N; idx += 2) S3 += idx;
			
			sb.append(K + " " + S1 + " " + S2 + " " + S3 + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb);
	}
	
	// 영리한 아리의 포탈 타기
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int S1 = Integer.parseInt(st.nextToken());
		int S2 = Integer.parseInt(st.nextToken());
		
		if(S1 != N) {
			System.out.println("NO...");
			return;
		}
		
		if(D == 1) {
			if(N % 2 == 0) System.out.println("YES!");
			else System.out.println("NO...");
		} else {
			if(N % 2 != 0) System.out.println("YES!");
			else System.out.println("NO...");
		}
	}
	
	// 두~~부 두부 두부
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
				
		System.out.println(((M - 1) + (K - 3) % N + N) % N + 1);
	}
	
	// Deficient, Perfect, and Abundant
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			int N = Integer.parseInt(br.readLine());
			
			long sum = 0;
			for(int i = 1; i < N; i++) 
				if(N % i == 0) sum += i;
			
			String ans = "";
			if(sum == N) ans = " is a perfect number.";
			else if(sum < N) ans = " is a deficient number.";
			else ans =" is an abundant number.";
			
			sb.append(N + ans + "\n" + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	// Perfection
	public static void test07() throws IOException {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			
			int N = sc.nextInt();
			
			if(N == 0) break;
			
			long sum = 0;
			for(int i = 1; i < N; i++) 
				if(N % i == 0) sum += i;
			
			String ans = "";
			if(sum == N) ans = " PERFECT";
			else if(sum < N) ans = " DEFICIENT";
			else ans =" ABUNDANT";
			
			sb.append(N + ans + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	// Missing Numbers
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		int idx = 0;
		while(N --> 0) {
			
			arr[idx] = Integer.parseInt(br.readLine());
			idx++;
			
		}
		
		int temp = 0;
		for(int i = 1; i < arr[idx - 1]; i++) {
			boolean flag = true;
			
			for(int j = 0; j < arr.length; j++) {
				
				if(arr[j] == i) {
					flag = false;
					continue;
				}
				
			}
			
			if(flag) sb.append(i + "\n");
		}
		
		if(sb.length() == 0) System.out.print("good job");
		else {
			sb.deleteCharAt(sb.length() - 1);
			System.out.print(sb);
		}
	}
	
	// Cakes 
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		int ans = Integer.MAX_VALUE;
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			int need = Integer.parseInt(st.nextToken());
			int have = Integer.parseInt(st.nextToken());
			
			ans = Math.min(ans, have / need);
		}
		
		System.out.print(ans);
	}
	
	// Monety 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int front = 0;
		int back = 0;
		for(int i = 0; i < N; i++) {
			
			int coin = Integer.parseInt(st.nextToken());
			front += (coin == 1) ? 1 : 0;
			back += (coin != 1) ? 1 : 0;
			
		}
		
		System.out.println(Math.min(front, back));
		
	}
	
	
	
}
