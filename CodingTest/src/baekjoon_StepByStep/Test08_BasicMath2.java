package baekjoon_StepByStep;

import java.util.Scanner;

public class Test08_BasicMath2 {

	// 소수 찾기
	public static void test01() {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int cnt = 0;
		
		for(int i = 0; i < testCase; i++) {
			
			long isPrime = sc.nextInt();
			if(isPrime(isPrime)) {
				cnt++;
			}
			
		}
		System.out.println(cnt);
	}
	
	// 소수
	public static void test02() {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;
		int min = -1;
		
		for(int i = M; i <= N; i++) {
			if(isPrime(i)) {
				sum += i;
				if(min == -1) {
					min = i;
				}
			}
		}
		
		if(sum != 0) {
			System.out.println(sum);
		}
		System.out.println(min);
	}
	
	
	// 소수 구하기
	public static void test04() {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		for(int i = M; i <= N; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	
	// 소수 판별용 메서드
	public static boolean isPrime(long n) {
		
        if(n == 1 || n == 0) return false;

        for(long i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) return false;
        }

        return true;
        
    }
	
	
}
