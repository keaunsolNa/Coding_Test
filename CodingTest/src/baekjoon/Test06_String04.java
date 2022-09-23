package baekjoon;

import java.util.Scanner;

public class Test06_String04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < testCase; i++) {
			String testString = sc.nextLine();
			int replay = Integer.parseInt(testString.split(" ")[0]);
			char[] temp = testString.split(" ")[1].toCharArray();
			for(int j = 0; j < temp.length; j++) {
				for(int k = 0; k < replay; k++) {
					System.out.print(temp[j]);
				}
			}
			System.out.println();
		}
	}
}
