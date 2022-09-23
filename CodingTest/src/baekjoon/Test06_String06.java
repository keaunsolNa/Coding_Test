package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test06_String06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] testString = sc.nextLine().split(" ");
		
		List<String> stringList = new ArrayList<>();
		for(int i = 0; i < testString.length; i++) {
			if(!testString[i].equals("")) {
				stringList.add(testString[i]);
			}
		}
		
		System.out.println(stringList.size());
	}
}
