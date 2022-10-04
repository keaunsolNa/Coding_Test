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

	// 다이얼
	public static void test08() {
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
	
	// 크로아티아 알파벳
	public static void test09() {
		Scanner sc = new Scanner(System.in);
		char[] charArr = sc.nextLine().toCharArray();

		int CroatiaAlphabet = 0;
		for(int i = 0; i < charArr.length; i++) {
			
			if(i != charArr.length - 1) {
				if(charArr[i] == 'c') {
					if(charArr[i+1] == '=' || charArr[i+1] == '-') {
						CroatiaAlphabet++;
						i++;
						continue;
					}
				} else if(charArr[i] == 'd') {
					if(charArr[i+1] == '-') {
						CroatiaAlphabet++;
						i++;
						continue;
					} else if(charArr[i+1] == 'z') {
						if(i+2 != charArr.length) {
							if(charArr[i+2] == '=') {
								CroatiaAlphabet++;
								i++;
								i++;
								continue;
							}
						} 
					}
				} else if(charArr[i] == 'l') {
					if(charArr[i+1] == 'j') {
						CroatiaAlphabet++;
						i++;
						continue;
					}
				} else if(charArr[i] == 'n') {
					if(charArr[i+1] == 'j') {
						CroatiaAlphabet++;
						i++;
						continue;
					}
				} else if(charArr[i] == 's') {
					if(charArr[i+1] == '=') {
						CroatiaAlphabet++;
						i++;
						continue;
					}
				} else if(charArr[i] == 'z') {
					if(charArr[i+1] == '=') {
						CroatiaAlphabet++;
						i++;
						continue;
					}
				}
			} 
			CroatiaAlphabet++;
		}
		
		System.out.println(CroatiaAlphabet);
		
	}

	// 전역 변수 스캐너
	static Scanner sc = new Scanner(System.in);
	
	// 그룹 단어 체커
	public static void test10() {
		int wordChecker = 0;
		int testCase = sc.nextInt();
		
		for(int i = 0; i < testCase; i++) {
			if(checker() == true) {
				wordChecker++;
			}
		}
		System.out.println(wordChecker);
	}
	
	// 그룹 단어 체커 판별 메소드
	public static boolean checker() {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = sc.next();
		
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);
			
			if(prev != now) {
				
				if(check[now - 'a'] == false) {
					check[now - 'a'] = true;
					prev = now;
					
				} else {
					return false;
				}
				
			} else {
				continue;
			}
		}
		return true;
		
	}
}
