package baekjoon;

import java.util.Scanner;

public class Test06_String08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] charArr = sc.nextLine().toCharArray();

		int sum = 0;
		
		for(int i = 0; i < charArr.length; i++) {
			if(charArr[i] == 'A' || charArr[i] == 'B' || charArr[i] == 'C') {
				sum += 3;
			} else if(charArr[i] == 'D' || charArr[i] == 'E' || charArr[i] == 'F') {
				sum += 4;
			} else if(charArr[i] == 'G' || charArr[i] == 'H' || charArr[i] == 'I') {
				sum += 5;
			} else if(charArr[i] == 'J' || charArr[i] == 'K' || charArr[i] == 'L') {
				sum += 6;
			} else if(charArr[i] == 'M' || charArr[i] == 'N' || charArr[i] == 'O') {
				sum += 7;
			} else if(charArr[i] == 'P' || charArr[i] == 'Q' || charArr[i] == 'R' || charArr[i] == 'S') {
				sum += 8;
			} else if(charArr[i] == 'T' || charArr[i] == 'U' || charArr[i] == 'V') {
				sum += 9;
			} else if(charArr[i] == 'W' || charArr[i] == 'X' || charArr[i] == 'Y' || charArr[i] == 'Z') {
				sum += 10;
			} 
		}
		
		System.out.println(sum);
	}
}
