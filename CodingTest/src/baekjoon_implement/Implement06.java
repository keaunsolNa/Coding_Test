package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Implement06 {

	public static void main(String[] args) throws IOException {
		test09();
	}
	
	// 뉴턴과 사과
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int p1 = Integer.parseInt(st.nextToken());
		int p2 = Integer.parseInt(st.nextToken());
		int p3 = Integer.parseInt(st.nextToken());
		int p4 = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		
		if(p1 == x) {
			System.out.println(1);
		} else if(p2 == x) {
			System.out.println(2);
		} else if(p3 == x) {
			System.out.println(3);
		} else if(p4 == x) {
			System.out.println(4);
		}  else {
			System.out.println(0);
		}
	}
	
	// Hard choice
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x1 = Integer.parseInt(st.nextToken());
		int x2 = Integer.parseInt(st.nextToken());
		int x3 = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int y1 = Integer.parseInt(st.nextToken());
		int y2 = Integer.parseInt(st.nextToken());
		int y3 = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		if(x1 < y1) {
			sum += y1 - x1;
		} 
		if(x2 < y2) {
			sum += y2 - x2;
		} 
		if(x3 < y3) {
			sum += y3 - x3;
		}
		
		System.out.println(sum);
	}
	
	// ISBN 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A  = Integer.parseInt(br.readLine());
		int B  = Integer.parseInt(br.readLine());
		int C  = Integer.parseInt(br.readLine());
		int sum = 120 - 29;
		
		sum += A;
		sum += B*3;
		sum += C;
		
		System.out.println("The 1-3-sum is " + sum);
	}
	
	// 빵
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		int min = 1001;
		for(int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int A  = Integer.parseInt(st.nextToken());
			int B  = Integer.parseInt(st.nextToken());
			
			if(A<=B) {
				if(min > B) {
					min = B;
				}
			}
		}
		
		if(min != 1001) {
			System.out.println(min);
		} else {
			System.out.println(-1);
		}
	}
	
	// X に最も近い値 (The Nearest Value)
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int X = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		int min = 1000001;
		int answer = 0;
		for(int i = L; i <= R; i++) {
			if(min > Math.abs(i-X)) {
				min = Math.abs(i-X);
				answer = i;
			}
		}
		
		System.out.println(answer);
	}
	
	// Winning Score
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int A1 = Integer.parseInt(br.readLine());
		int A2 = Integer.parseInt(br.readLine());
		int A3 = Integer.parseInt(br.readLine());

		int aSum = (A1*3) + (A2*2) + (A3*1);
		
		int B1 = Integer.parseInt(br.readLine());
		int B2 = Integer.parseInt(br.readLine());
		int B3 = Integer.parseInt(br.readLine());
		
		int bSum = (B1*3) + (B2*2) + (B3*1);
		
		if(aSum > bSum) {
			System.out.println("A");
		} else if(aSum < bSum) {
			System.out.println("B");
		} else {
			System.out.println("T");
		}
	}
	
	// Identifying tea
	public static void test07() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tea = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int count = 0;
		for(int i = 0; i < 5; i++) {
			
			if(Integer.parseInt(st.nextToken()) == tea) {
				count++;
			}
		}
		 
		System.out.println(count);
	}
	
	// 출석 이벤트
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int money = Integer.parseInt(br.readLine());
		
		if(N < 5) {
		} else if (N < 10) {
			money = money-500;
		} else if (N < 15) {
			money = Math.min((money/100)*90, money-500);
		} else if (N < 20) {
			money = Math.min((money/100)*90, money-2000);
		} else {
			money = Math.min((money/100)*75, money-2000);
		}

		if(money > 0) {
			System.out.println(money);
		} else {
			System.out.println(0);
		}
	}
	
	// SciComLove
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < A; i++) {
			System.out.println("SciComLove");
		}
	}
	
	// MBTI
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String zinho = br.readLine();
		int testCase = Integer.parseInt(br.readLine());
		
		int sum = 0;
		for(int i = 0; i < testCase; i++) {
			String other = br.readLine();
			if(other.equals(zinho)) {
				sum++;
			}
		}
		System.out.println(sum);
	}
	
}
