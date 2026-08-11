package baekjoon_Class01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Class01 {

	public static void main(String[] args) throws IOException {
		test01();
	}
	
	// A + B
	public static void test01() {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a + b);
	}
	
	// A - B
	public static void test02() {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a - b);
	}
	
	// A/B
	public static void test03() {
		Scanner sc = new Scanner(System.in);
		double a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a / b);
	}
	
	// 단어의 개수
	public static void test04() {
		Scanner sc = new Scanner(System.in);
		String[] testString = sc.nextLine().split(" ");
		
		List<String> stringList = new ArrayList<>();
		for(int i = 0; i < testString.length; i++) {
			if(!testString[i].equals("")) {
				stringList.add(testString[i]);
			}
		}
		
		System.out.println(stringList.size());
	}
	

	// 최댓값
	public static void test12() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[] arr = new int[9];
		for(int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine()," ");
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		br.close();
		int max = -1;
		int index = -1;
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		
		System.out.println(max);
		System.out.println(index + 1);
	}


	// 나머지
	public static void test22() throws IOException {
      	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Set<Integer> arrSet = new HashSet<>();
		
		for(int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine()," ");
			arrSet.add(Integer.parseInt(st.nextToken()) % 42);
		}
		
		br.close();
		
		System.out.println(arrSet.size());
	}


	// 사칙 연산
	public static void test29() {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
	}
	

	// A-B -3
	public static void test31() {
        Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			System.out.println(sc.nextInt() + sc.nextInt());
		}
	}
	
	
	// A*B
	public static void test34() {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a * b);
	}
	
	
}

