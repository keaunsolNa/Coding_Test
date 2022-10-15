package baekjoon_Class01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Class01 {

	public static void main(String[] args) throws IOException {
		test21();
	}
	
	// A + B
	public static void test01() {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a + b);
	}
	
	// A - B
	public static void test02() {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a - b);
	}
	
	// A/B
	public static void test03() {
		Scanner sc = new Scanner(System.in);
		double a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a / b);
	}
	
	// 단어의 개수
	public static void test04() {
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

	// 두 수 비교하기
	public static void test06() {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		if(a > b){
            System.out.println('>');
        } else if(a < b) {
        	System.out.println('<');
        } else {
        	System.out.println("==");
        }
	}

	// 평균
	public static void test07() {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		float[] arr = new float[length];
		float max = -1;
		float avg = 0;
		
		
		for(int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			avg +=  (arr[i]/max*100)/length;
		}
		
		System.out.println(avg);
	}

	// 별 찍기 1
	public static void test08() {
        Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
    }

	// 별 찍기 2
	public static void test09() {
        Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		
		for(int i = a; i > 0; i--) {
			
			for(int j = i - 1; j > 0; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < a - i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 검증수
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		System.out.println((int)(Math.pow(Integer.parseInt(st.nextToken()), 2) + Math.pow(Integer.parseInt(st.nextToken()), 2) + 
		Math.pow(Integer.parseInt(st.nextToken()), 2) + Math.pow(Integer.parseInt(st.nextToken()), 2) + Math.pow(Integer.parseInt(st.nextToken()), 2))%10);
	}
	
	// Hello World!
	public static void test11() {
		System.out.println("Hello World!");
	}
	
	// 최댓값
	public static void test12() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[] arr = new int[9];
		for(int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine()," ");
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		br.close();
		int max = -1;
		int index = -1;
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		
		System.out.println(max);
		System.out.println(index + 1);
	}

	// 숫자의 개수
	public static void test13() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ABC = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine()) + "";
		
		for(int i = 0; i <= 9; i++) {
			int cnt = 0;
			for(int j = 0; j < ABC.length(); j++) {
				
				if(i == Character.getNumericValue(ABC.charAt(j))) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}

	// 문자열 반복
	public static void test14() {
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

	// 구구단
	public static void test15() {
        Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(a + " * " + i + " = " + a*i);
		}
	}
	
	// N 찍기
	public static void test16() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N  = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			System.out.println(i);
		}
	}
	
	// 기찍 N
	public static void test17() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = N; i > 0; i--) {
			System.out.println(i);
		}
	}
	
	// 윤년
	public static void test18() {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        if(a%4 == 0 && a%100 != 0){
            System.out.println(1);
        } else if(a % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
	}

	// 알람 시계
	public static void test19() {
        Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(b >= 45) {
			System.out.println(a + " " + (b-45));
		} else if(a == 1) {
			System.out.println(0 + " " + (b+15));
		} else if(a < 1) {
			System.out.println(23 + " " + (b+15));
		} else {
			System.out.println((a - 1) + " " + (b+15));
		}
	}
	
	// 상수
	public static void test20() {
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

	// 음계
	public static void test21() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int mixed = 0;
		if(temp[0].equals("1")) {
			if(temp[1].equals("2"))if(temp[2].equals("3"))if(temp[3].equals("4"))if(temp[4].endsWith("5"))
				if(temp[5].equals("6"))if(temp[6].equals("7"))if(temp[7].equals("8")) {
					System.out.println("ascending");
					mixed = 1;
				}
		} else if(temp[0].equals("8")) {
			if(temp[1].equals("7"))if(temp[2].equals("6"))if(temp[3].equals("5"))if(temp[4].endsWith("4"))
				if(temp[5].equals("3"))if(temp[6].equals("2"))if(temp[7].equals("1")) {
					System.out.println("descending");
					mixed = 1;
				}
		} 
		
		if(mixed == 0) {
			System.out.println("mixed");
		}
	}
	
	// 나머지
	public static void test22() throws IOException {
      	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Set<Integer> arrSet = new HashSet<>();
		
		for(int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine()," ");
			arrSet.add(Integer.parseInt(st.nextToken()) % 42);
		}
		
		br.close();
		
		System.out.println(arrSet.size());
	}

	// OX 퀴즈
	public static void test23() {
      	Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[length];
		
		for(int i = 0; i < length; i++) {
			arr[i] = sc.nextLine();
		}
		
		int score = 0;
		int totalScore = 0;
		
		for(int i = 0; i < arr.length; i++) {
			char[] temp = arr[i].toCharArray();
			
			for(int j = 0; j < temp.length; j++) {
				if(temp[j] == 'O') {
					score++;
					totalScore += score;
				} else if(temp[j] == 'X'){
					score = 0;
				}
			}
			System.out.println(totalScore);
			score = 0;
			totalScore = 0;
		}
	}

	// 시험 성적
	public static void test24() {
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		if(a >= 90){
            System.out.println('A');
        } else if(a >= 80) {
        	System.out.println('B');
        } else if(a >= 70) {
        	System.out.println('C');
        } else if(a >= 60) {
        	System.out.println('D');
        } else {
        	System.out.println('F');
        }
	}

	// 고양이
	public static void test25() {
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
	}

	// 개
	public static void test26() {
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
	}
	
	// 알파벳 찾기
	public static void test27() {
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
	
	// 최소, 최대
	public static void test28() {
  		Scanner sc = new Scanner(System.in);
		int arrLength = sc.nextInt();
		int[] arr = new int[arrLength];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[0] + " " + arr[arr.length-1]);
	}
	
	// 사칙 연산
	public static void test29() {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
	}
	
	// X 보다 작은 수
	public static void test30() {
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i = 0; i < a; i++) {
			int temp = sc.nextInt();
			if(temp < b) {
				System.out.println(temp);
			}
		}
	}

	// A-B -3
	public static void test31() {
        Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			System.out.println(sc.nextInt() + sc.nextInt());
		}
	}
	
	// A-B -4
	public static void test32() {
        Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);
		}
	}
	
	// A-B -5
	public static void test33() {
        Scanner sc = new Scanner(System.in);
		int a = 1;
		int b = 1;
		
		while(1 == 1) {
			a = sc.nextInt();
			b = sc.nextInt();
			if(a == 0 && b == 0) {
				break;
			}
			System.out.println(a + b);
		}
	}
	
	// A*B
	public static void test34() {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a * b);
	}
	
	// 아스키 코드
	public static void test35() {
		Scanner sc = new Scanner(System.in);
		int input = sc.next().charAt(0);
		System.out.println(input);
	}
	
	// 숫자의 합
	public static void test36() {
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


