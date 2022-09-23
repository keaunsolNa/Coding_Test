package baekjoon;

import java.util.Scanner;

public class Test05_Function3 {

	public static void main(String[] args) {
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
