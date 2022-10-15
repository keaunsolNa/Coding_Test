package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class StringPlus08 {
	
	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// Backward numbers
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
			int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
			
			int ab = Integer.parseInt(new StringBuilder(A+B+"").reverse().toString());
			
			System.out.println(ab);
		}
		
	}

	// Odd/Even Strings
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		Map<String, Integer> strMap = new HashMap<>();
		
		for(int i = 0; i < str.length(); i++) {
			strMap.put(str.charAt(i)+"", strMap.getOrDefault(str.charAt(i)+"", 0) + 1);
		}
		
		Iterator<Integer> iter = strMap.values().iterator();
		int oddOrEven = -1;
		while(iter.hasNext()) {
			if(iter.next() % 2 == 0) {
				if(oddOrEven == -1) {
					oddOrEven = 2;
				} else if(oddOrEven == 3) {
					oddOrEven = 0;
				}
			} else {
				if(oddOrEven == -1) {
					oddOrEven = 3;
				} else if(oddOrEven == 2) {
					oddOrEven = 0;
				}
			}
		}
		
		if(oddOrEven == 2) {
			System.out.println(0);
		} else if(oddOrEven == 3) {
			System.out.println(1);
		} else {
			System.out.println("0/1");
		}
	}

	// 뒤집힌 덧셈
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		int ab = Integer.parseInt(new StringBuilder(A+B+"").reverse().toString());
		
		System.out.println(ab);
		
	}
	
	// 이상한 곱셈
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String A  = st.nextToken();
		String B  = st.nextToken();
		
		if(A.length() < B.length()) {
			String temp = A;
			A = B;
			B = temp;
		}

		long sum = 0;
		for(int i = 0; i < A.length(); i++) {
				int tempI = Character.getNumericValue(A.charAt(i));
			for(int j = 0; j < B.length(); j++) {
				int tempJ = Character.getNumericValue(B.charAt(j));
				sum += tempI*tempJ;
			}
		}
		
		System.out.println(sum);
	}
	
	// 유학 금지
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		input = input.replaceAll("C", "");
		input = input.replaceAll("A", "");
		input = input.replaceAll("M", "");
		input = input.replaceAll("B", "");
		input = input.replaceAll("R", "");
		input = input.replaceAll("I", "");
		input = input.replaceAll("D", "");
		input = input.replaceAll("G", "");
		input = input.replaceAll("E", "");
		
		System.out.println(input);
	}
	
	// 정수의 개수
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		
		System.out.println(N.split(",").length);
	}

	// 더하기
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] strArr = br.readLine().split(",");
		
		long sum = 0;
		for(int i = 0; i < strArr.length; i++) {
			sum += Integer.parseInt(strArr[i]);
		}
		
		System.out.println(sum);
	}
	
	// 럭키 스트레이트
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		int sumLeft = 0;
		for(int i = 0; i < N.length()/2; i++) {
			sumLeft += Integer.parseInt(N.charAt(i)+"");
		}
		
		int sumRight = 0;
		for(int i = N.length()/2; i < N.length(); i++) {
			sumRight += Integer.parseInt(N.charAt(i)+"");
		}

		if(sumLeft == sumRight) {
			System.out.println("LUCKY");
		} else {
			System.out.println("READY");
		}
	}
	
	// Changing Strings
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		int indexU = 0;
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == 'U') {
				sb.append("U");
				indexU = i;
				break;
			} else {
				sb.append("-");
			}
		}
		
		int indexF = 0;
		for(int i = str.length() - 1; i > 0; i--) {
			
			if(str.charAt(i) == 'F') {
				indexF = i;
				break;
			} else {
				sb.append("-");
			}
		}
		
		for(int i = indexU; i < indexF-1; i++) {
			sb.insert(i+1, "C");
		}
		
		sb.insert(indexF, "F");
		System.out.println(sb);
	}
	
	// 오타맨 고창영
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int index = Integer.parseInt(st.nextToken());
			StringBuilder str = new StringBuilder(st.nextToken());
			
			str.deleteCharAt(index - 1);
			
			System.out.println(str);
		}
	}
	
}
