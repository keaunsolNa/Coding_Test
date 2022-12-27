package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Implement20 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// Quadrilateral 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			String temp = "";
			for(int i = 0; i < A; i++) temp += "X";
			
			for(int i = 0; i < B; i++)sb.append(temp).append("\n");
			
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length()-1);
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
	}
	
	// 별 찍기 - 16
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			
			for(int j = N; j > i; j--) System.out.print(" ");
			for(int j = i; j > 0; j--) System.out.print("* ");
			System.out.println();
			
		}
	}
	
	// 별 찍기 - 17
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) { 
			for(int j = 1; j < 2 * N; j++) {
				if(j > N + i) break; 
				if(i == N - 1) {
					System.out.print("*");
					continue;
				}
				if(j == N - i || j == N + i) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	// N M 찍기
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= N*M; i++) {
			
			sb.append(i);
			
			if(i % M != 0) sb.append(" ");
			else sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	// H4x0r 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		
		for(int i = 0; i < input.length(); i++) {
			
			switch(input.charAt(i)) {
				case 'a' : sb.append(4); break;
				case 'e' : sb.append(3); break;
				case 'i' : sb.append(1); break;
				case 'o' : sb.append(0); break;
				case 's' : sb.append(5); break;
				default : sb.append(input.charAt(i));
			}
		}
		
		System.out.print(sb);
	}
	
	// 쌍의 합
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			int input = Integer.parseInt(br.readLine());
			
			sb.append("Pairs for ").append(input).append(": ");
			boolean flag = false;
			for(int i = 1; i <= input; i++) {
				
				for(int j = i + 1; j <=input; j++) {
					
					if(i + j == input) {
						
						if(flag) sb.append(", ");
						sb.append(i + " " + j);
						if(!flag) flag = true;
					}
				}
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	// 골뱅이 찍기 - ㄴ
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int j = 0; j < N*5; j++) {
			
			for(int i = 0; i < N; i++) sb.append("@");
			
			if(j >= N*4) for(int i  = 0; i < N*4; i++) sb.append("@");
			
			sb.append("\n");
			
		}
		
		
		System.out.println(sb);
	}
	
	// 알고리즘 수업 - 알고리즘의 수행 시간 3 
	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long N = Long.parseLong(br.readLine());
        
        System.out.println(N*N);
        System.out.println(2);
	}
	
	// 알고리즘 수업 - 알고리즘의 수행 시간 5
	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long N = Long.parseLong(br.readLine());
        
        System.out.println(N*N*N);
        System.out.println(3);
	}
	
	// 알고리즘 수업 - 알고리즘의 수행 시간 6
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long N = Long.parseLong(br.readLine());
		
		System.out.println(((N - 2) * (N - 1) * (2 * N - 3) + 3 * (N - 1) * (N - 2)) / 12);
		System.out.println(3);
	}
	
}
