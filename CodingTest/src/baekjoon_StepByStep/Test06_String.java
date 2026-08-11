package baekjoon_StepByStep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test06_String {
	
	
	// 단어의 개수
	public static void test06() {
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


	// 전역 변수 스캐너
	static Scanner sc = new Scanner(System.in);
	
	
}
