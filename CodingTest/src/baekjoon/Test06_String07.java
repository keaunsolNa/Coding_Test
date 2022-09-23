package baekjoon;

import java.util.Scanner;

public class Test06_String07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] string = sc.nextLine().split(" ");

		int answer = 0;
		
		for(int i = 0; i < string.length; i++) {
			StringBuilder sbr = new StringBuilder(new String(string[i].toCharArray()));
			int reverse = Integer.parseInt(sbr.reverse().toString());
			if(answer < reverse) {
				answer = reverse;
			};
		}
		
		System.out.println(answer);
	}
}
