package baekjoon_StepByStep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test06_String {
	
	// 아스키 코드
	public static void test01() {
		Scanner sc = new Scanner(System.in);
		int input = sc.next().charAt(0);
		System.out.println(input);
	}
	
	// 숫자의 합
	public static void test02() {
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
	
	// 알파벳 찾기
	public static void test03() {
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

	// 문자열 반복
	public static void test04() {
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

	// 단어 공부
	public static void test05() {
		Scanner sc = new Scanner(System.in);
		char[] word = sc.nextLine().toUpperCase().toCharArray();
		
		Map<Integer, Integer> wordMap = new HashMap<>();
		for(int i = 65; i <= 90; i++) {
			wordMap.put(i, 0);
		}

		for(int i = 0; i < word.length; i++){
			wordMap.put((int)word[i], wordMap.get((int)word[i]) + 1);
		}
		 
		int max = 0;
		int equlas = 0;
		for(Iterator<Integer> iter=wordMap.values().iterator(); iter.hasNext();) {
			int temp = iter.next();
			if(max < temp) {
				max = temp;
				equlas = 0;
			} else if(max == temp) {
				equlas++;
			}
		}
		
		if(equlas != 0) {
			System.out.println('?');
		} else {
			for(Map.Entry<Integer, Integer> entry : wordMap.entrySet()){
			    if(entry.getValue().equals(max)) { 
			    	System.out.println((char)(int)entry.getKey());
			    }
			}
		}
	}

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

	// 상수
	public static void test07() {
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

	
	// 전역 변수 스캐너
	static Scanner sc = new Scanner(System.in);
	
	
}
