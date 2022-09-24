package baekjoon;

import java.util.Scanner;

public class Test05_Function {

	// 정수 N개의 합
	public class test01 {
	    long sum(int[] a) {
	        long sum = 0;
	        for(int i = 0; i < a.length; i++){
	            sum += a[i];
	        }
	        return sum;
	    }
	}
	
	// 셀프 넘버
	public static void test02() {
		boolean[] noneSelf = new boolean[10001];
		
		for(int i = 1; i <= 10000; i++) {
			int n = selfOrNonSelf(i);
			if(n <= 10000) noneSelf[n] = true;
		}

		for(int i = 1; i < noneSelf.length; i++) {
			if(noneSelf[i] == false) {
				System.out.println(i);
			}
		}
		
	}
	
	// 셀프 넘버 판별 메소드
	public static int selfOrNonSelf(int n) {
		
		int sum = n;
		
		while(n != 0) {
			sum += (n%10);
			n = n / 10;
		}
		return sum;
		
	}
	
	// 한수
	public static void test03() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 99;
		if(N <= 99) {
			System.out.println(N);
			return;
		} else {
			for(int i = 100; i <= N; i++) {
				char[] arr = (i+"").toCharArray();
				
				int difference = arr[0] - arr[1];
				int difference2 = difference;
				for(int j = 1; j < arr.length; j++) {
					if(j < arr.length - 1) {
						if(arr[j] - arr[j+1] == difference) {
							continue;
						} else {
							difference2 = 99;
							break;
						}
					}
				}
				if(difference2 != 99) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
	
}

