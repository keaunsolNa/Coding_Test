package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test06_String03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] sArr= S.toCharArray();
		List<Integer> SArr = new ArrayList<>();
		
		for (char c : sArr) {
			SArr.add(Character.getNumericValue(c));
		}

		for(int i = 10; i < 36; i++) {
			if(SArr.contains(i)) {
				System.out.print(SArr.indexOf(i));
			} else {
				System.out.print(-1);
			}
			if(i == 35) {
				break;
			}
			System.out.print(" ");
		}
	}
	
	
}
