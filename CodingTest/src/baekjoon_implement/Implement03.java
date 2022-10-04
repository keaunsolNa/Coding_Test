package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Implement03 {

	public static void main(String[] args) throws IOException {
		test06();
	}
	
	// 코딩은 체육과목 입니다
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		if(N%4 != 0) {
			sb.append("long ");
		}
		for(int i = 0; i < N/4; i++) {
			sb.append("long ");
		}
		
		sb.append("int");
		System.out.println(sb);
	}
	
	// 알고리즘 수업 - 알고리즘의 수행 시간 1
	public static void test02()   {
		System.out.println("1");
		System.out.println("0");
	}
	
	// UCPC에서 가장 쉬운 문제 번호는?
	public static void test03() throws IOException {
		System.out.println("A");
	}
	
	// 기찍 N
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = N; i > 0; i--) {
			System.out.println(i);
		}
	}
	
	// 별 찍기 - 3
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for(int i = 0; i < N; i++) {
			for(int j = i; j < N; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 10부제
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int cnt = 0;
		for(int i = 0; i < 5; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if(N == temp) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
	
	// 삼각형 외우기 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		if(A+B+C != 180) {
			System.out.println("Error");
		} else if(A == 60 && B == 60 && C == 60) {
			System.out.println("Equilateral");
		} else if(A != B && B != C && A != C) {
			System.out.println("Scalene");
		} else {
			System.out.println("Isosceles");
		}
	}
	
	// 연세대학교
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		if(N == 0) {
			System.out.println("YONSEI");
		} else {
			System.out.println("Leading the Way to the Future");
		}
	}
	
	// Hello Judge 
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			System.out.println("Hello World, Judge " + i + "!");
		}
	}
	
	// Next in line
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		System.out.println(B + (B-A));
	}
	
	
}