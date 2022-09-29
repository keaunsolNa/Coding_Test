package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test14_NumberTheoryAndCombinatorics {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test01();
	}
	
	// 배수와 약수
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String temp = br.readLine();
			if(temp.equals("0 0")) {
				break;
			}
			int A = Integer.parseInt(temp.split(" ")[0]);
			int B = Integer.parseInt(temp.split(" ")[1]);
			
			if(B%A == 0) {
				System.out.println("factor");
			} else if(A%B == 0) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}
		}
	}
	
	// 약수
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);
		if(arr.length != 1) {
			System.out.println(arr[0]*arr[arr.length - 1]);
		} else {
			System.out.println(arr[0]*arr[0]);
		}
	}
	
	// 최대공약수와 최소공배수
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int gcdX = x;
		int gcdY = y;
		while(gcdX!=gcdY) {
			if(gcdX>gcdY) 
				gcdX = gcdX-gcdY;
			else gcdY = gcdY-gcdX;
		} 
		System.out.println(gcdY);
		
		int result = x*y;
		
		while(x!=y) {
			if(x>y)
				x = x-y;
			else y = y-x;
		}
		
		int result2 = y;
		
		System.out.println(result/result2);
	}
	
	// 최소공배수
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			int result = x*y;
			
			while(x!=y) {
				if(x>y)
					x = x-y;
				else y = y-x;
			}
			
			int result2 = y;
			
			System.out.println(result/result2);
		}
	}

	// 검문
	public static void test05() throws NumberFormatException, IOException {
	
	}
}
