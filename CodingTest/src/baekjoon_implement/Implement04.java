package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Implement04 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// CASIO
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		if(A == B) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
	
	// 특별한 날
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		if(A > 2) {
			System.out.println("After");
		} else if(A == 2 && B == 18) {
			System.out.println("Special");
		} else if(A == 1) {
			System.out.println("Before");
		} else if(B > 18){
			System.out.println("After");
		} else {
			System.out.println("Before");
		}
	}
	
	// 과목 선택
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[4];
		for(int i = 0; i < 4; i ++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		int c = Math.max(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));

		System.out.println(arr[3] + arr[2] + arr[1] + c);
		
	}
	
	// 와글와글 숭고한
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int S = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		
		if(S + K + H >= 100) {
			System.out.println("OK");
		} else {
			int temp = Math.min(Math.min(S, K), H);
			if(temp == S) {
				System.out.println("Soongsil");
			} else if(temp == K) {
				System.out.println("Korea");
			} else {
				System.out.println("Hanyang");
			}
		}
	}
	
	// Vera and Outfits 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(N*(N-1));
	}
	
	// 팀 나누기
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		System.out.println(Math.abs((A+D) - (B+C)));
	}
	
	// 뉴비의 기준은 뭘까?
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if(M <= 2) {
			System.out.println("NEWBIE!");
		} else if(M > N) {
			System.out.println("TLE!");
		} else {
			System.out.println("OLDBIE!");
		}
	}
	
	// 팬들에게 둘러싸인 홍준
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String id = br.readLine();
		
		for(int i = 1; i <= 9; i++) {
			if(i%3 == 0) {
				System.out.print(":fan:");
				System.out.println();
			} else if(i == 5) {
				System.out.print(":"+id+":");
			} else {
				System.out.print(":fan:");
			}
		}
	}
	
	// 치킨 두 마리 (...)
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int money = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
		int chicken = Integer.parseInt(br.readLine());
		
		if(money >= chicken*2) {
			System.out.println(money - chicken*2);
		} else {
			System.out.println(money);
		}
	}
	
	// 17배
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger N = new BigInteger(br.readLine(), 2);
		Stack<BigInteger> stack = new Stack<>();
		N = N.multiply(BigInteger.valueOf(17));
		
		while(true) {
			stack.push(N.remainder(BigInteger.valueOf(2)));
			N = N.divide(BigInteger.valueOf(2));
			if(N.equals(BigInteger.ONE)) {
				stack.push(N);
				break;
			}
		}
		
		while(!stack.isEmpty()) {
			BigInteger S = stack.pop();
			System.out.print(S);
		}
		
	}
	
}
