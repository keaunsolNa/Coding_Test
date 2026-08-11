package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test07_BasicMath {

	
	// 벌집
	public static void test02() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int temp = 1;
		int i = 1;
		if(N != 1) {
			while(N > temp) {
				temp += (i*6);
				i++;
			}
		}
		
		System.out.println(i);
	}

	// 분수 찾기
	public static void test03() {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		int now = 1;
		int prev = 0;
		
		while(true) {
			if(X <= now + prev) {
				if(now % 2 == 0) {
					System.out.println((X - prev) + "/" + (now - (X - prev - 1)));
				} else {
					System.out.println(now - (X - prev - 1) + "/" + (X - (prev)));
				}
				break;
			} else {
				prev += now;
				now++;
			}
		}
		
	}
	
	
}
