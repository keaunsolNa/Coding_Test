package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test03_Iteration {

	
	// A + B -3
	public static void test02(){
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			System.out.println(sc.nextInt() + sc.nextInt());
		}
	}
	
	// 합
	public static void test03(){
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		
		int result = 0;
		for(int i = 1; i <= a; i++) {
			result += i;
		}
		
		System.out.println(result);
	}
	
	
}

