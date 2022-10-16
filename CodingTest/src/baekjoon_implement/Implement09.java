package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Implement09 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// Rectangles
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int R = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < R; i++) {
			for(int j = 0; j < C; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 포인터 공부
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());

		System.out.println("int a;");
		System.out.println("int *ptr = &a;");
		if(N > 1) {
			StringBuilder sb = new StringBuilder();
			for(int i = 2; i <= N; i++) {
				sb.append("int ");
				for(int j = N - (i-1); j <= N; j++) {
					sb.append("*");
				}
				sb.append("ptr").append(i).append(" = &ptr");
				if(i-1 != 1) {
					sb.append(i-1);
				}
				sb.append(";").append("\n");
				
			}
			System.out.println(sb);
		}
	}
	
	// The Merchant of Venice
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < K; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int shipCount = Integer.parseInt(st.nextToken());
			int shipSpeed = Integer.parseInt(st.nextToken());
			int day = Integer.parseInt(st.nextToken());
			long sumDucat = 0;
			
			StringBuilder sb = new StringBuilder();
			for(int j = 0; j < shipCount; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				int distance = Integer.parseInt(st.nextToken());
				int ducat = Integer.parseInt(st.nextToken());

				if(shipSpeed*day >= distance) {
					sumDucat += ducat;
				}
			}
			
			sb.append("Data Set ").append(i+1).append(":").append("\n").append(sumDucat).append("\n");
			System.out.println(sb);
		}
	}
	
	// 알고리즘 수업 - 알고리즘의 수행 시간 2
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(N);
		System.out.println(1);
		
	}
	
	// Easy-to-Solve Expressions
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		if(A == B + C || B == A + C || C == A + B) {
			System.out.println(1);
		} else if(A == B * C || B == A * C || C == A * B) {
			System.out.println(2);
		} else {
			System.out.println(3);
		}
	}
	
	// 별 찍기 - 4
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int star = Integer.parseInt(br.readLine());
		
		for(int i = star; i > 0; i--) {
			for(int k = star; k > i; k--) {
				System.out.print(" ");
			}
		
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 별 찍기 - 5
	public static void test07() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int star = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= star; i++) {
			
			for(int j = i; j < star; j++) {
				System.out.print(" ");
			}
			
			System.out.print("*");
			for(int k = i-1;  k > 0; k--) {
				System.out.print("*");
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		 
	}
	
	// 홀수
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int min = 101;
		int sum = 0;
		for(int i = 0; i < 7; i++) {
			int temp = Integer.parseInt(br.readLine());
			if(temp%2 == 1) {
				sum += temp;
				if(temp < min) {
					min = temp;
				}
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
	
	// Betygsättning
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int PA = Integer.parseInt(st.nextToken());
		int PC = Integer.parseInt(st.nextToken());
		int PE = Integer.parseInt(st.nextToken());
		
		int AH = 0;
		int CH = 0;
		
		if(A%2 == 0) {
			AH = A/2;
		} else {
			AH = A/2 + 1;
		}

		if(C%2 == 0) {
			CH = C/2;
		} else {
			CH = C/2 + 1;
		}
				
		if(PA == A && PC == C && PE == E) {
			System.out.println("A");
		} else if(AH <= PA && C == PC && E == PE) {
			System.out.println("B");
		} else if(C == PC && E == PE) {
			System.out.println("C");
		} else if(CH <= PC && E == PE) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}
	}
	
	// 푸앙이와 종윤이
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int a = 100 - A;
		int b = 100 - B;
		int c = 100 - (a+b);
		int d = a*b;
		int q = d/100;
		int r = d%100;
		
		int first = c + q;
		int second = r;
		
		System.out.println(a + " " + b + " " + c + " " + d + " " + q + " " + r);
		System.out.println(first + " " + second);
	}
	
}
