package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Implement05 {

	public static void main(String[] args) throws IOException {
		test08();
	}
	
	// 줄번호
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= testCase; i++) {
			System.out.println(i+ ". " + br.readLine());
		}
	}
	
	// 한글
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		N += 44031;
		
		System.out.println((char)N);
		
	}
	
	// 자동완성
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine().toUpperCase();
		
		if(N.equals("N")) {
			System.out.println("Naver D2");
		} else {
			System.out.println("Naver Whale");
		}
	}
	
	// Which Alien?
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		if(A >= 3 && B <= 4) {
			System.out.println("TroyMartian");
		}
		if(A <= 6 && B >= 2) {
			System.out.println("VladSaturnian");
		}
		if(A <= 2 && B <= 3) {
			System.out.println("GraemeMercurian");
		}
	}
	
	// Can you add this?
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		for(int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			System.out.println(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
		}
	}
	
	// FYI
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String number = br.readLine();
		
		number = number.substring(0, 3);

		if(number.equals("555")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	// 사장님 도박은 재미로 하셔야 합니다
	public static void test07() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int money = 0;
		int sum = 0;
		while((money = Integer.parseInt(br.readLine())) != -1) {
			sum += money;
		}
		System.out.println(sum);
	}
	
	// 럭비 클럽
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		while(!(input = br.readLine()).equals("# 0 0")) {
			String[] arr = input.split(" ");
			String name = arr[0];
			int age = Integer.parseInt(arr[1]);
			int kg = Integer.parseInt(arr[2]);
			
			if(age > 17 || kg >= 80 ) {
				System.out.println(name + " Senior");
			} else {
				System.out.println(name + " Junior");
			}
		}
	}
	
	// 3 つの整数 (Three Integers)
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		if(A+B+C >= 5) {
			System.out.println(2);
		} else {
			System.out.println(1);
		}
	}
	
	// Telemarketer or not?
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		
		if(B != C) {
			System.out.println("answer");
		} else if(A != 8 && A != 9) {
			System.out.println("answer");
		} else if(D != 8 && D != 9) {
			System.out.println("answer");
		} else {
			System.out.println("ignore");
		}
	}
	
}
