package baekjoon;

import java.util.Scanner;

public class Test06_String02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		String number = sc.next();
		int sum = 0;

		char[] numberArr = number.toCharArray();
		
		for(int i = 0; i < numberArr.length; i++) {
			sum += Character.getNumericValue(numberArr[i]);
		}
		
		System.out.println(sum);
	}
	
	
}
