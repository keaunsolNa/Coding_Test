package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Test10_Sort {

	
	// 수 정렬하기2
	public static void test02()  {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int testCase = sc.nextInt();
		
		List<Integer> arrList = new ArrayList<>();
		
		for(int i = 0; i < testCase; i++) {
			arrList.add(sc.nextInt());
		}
		
		Collections.sort(arrList);
		
		for (Integer integer : arrList) {
			sb.append(integer).append('\n');
		}
		
		System.out.println(sb);
	}
	
	// 수 정렬하기 3
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCase = Integer.parseInt(br.readLine());
		int[] arr = new int[testCase];
		
		for(int i = 0; i < testCase; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		for (Integer integer : arr) {
			sb.append(integer).append('\n');
		}
		
		System.out.println(sb);
		
	}
	

	// 통계학
	public static void test05() throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int[] arr = new int[testCase];
		double sum = 0;
		
		for(int i = 0; i < testCase; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		Arrays.sort(arr);

		int mod = findMod(arr, testCase);
		
		System.out.println(Math.round(sum/testCase));
		System.out.println(arr[arr.length/2]);
		System.out.println(mod);
		System.out.println(arr[testCase - 1] - arr[0]);
		
	}
	
	// 통계학 최빈값 찾기 메서드
	public static int findMod(int[] arr, int testCase) {
		
		int cnt = 0;
		int max = -1;
		int mod = arr[0];
		boolean check = false;
		
		for (int i = 0; i < testCase - 1; i++) {
			
			if(arr[i] == arr[i+1]) {
				cnt++;
			} else {
				cnt = 0;
			}
			
			if(max < cnt) {
				max = cnt;
				mod = arr[i];
				check = true;
			} else if(max == cnt && check == true) {
				mod = arr[i];
				check = false;
			}
		}
		
		return mod;
	}


	// 좌표 정렬하기
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		String[] stringArr = new String[testCase];
		
		for(int i = 0; i < testCase; i++) {
			stringArr[i] = br.readLine();
		}

		Arrays.sort(stringArr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				String[] one = o1.split(" ");
				String[] two = o2.split(" ");
				
				if(Integer.parseInt(one[0]) == Integer.parseInt(two[0])) {
					return Integer.parseInt(one[1]) - Integer.parseInt(two[1]);
				} else {
					return Integer.parseInt(one[0]) - Integer.parseInt(two[0]);
				}
			}
		});
		
		for (String string : stringArr) {
			System.out.println(string);
		}
	}
	
	
	// 단어 정렬
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		Set<String> arrSet = new LinkedHashSet<>();
		
		for(int i = 0; i < testCase; i++) {
			arrSet.add(br.readLine());
		}
		
		String[] strArr = new String[arrSet.size()];
		int loop = 0;
		for (Iterator<String> iter = arrSet.iterator(); iter.hasNext();) {
			strArr[loop] = iter.next();
			loop++;
		}

		Arrays.sort(strArr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}
				
				else {
					return o1.length() - o2.length();
				}
			}
		});
		
	
		for (String string : strArr) {
			System.out.println(string);
		}
	}
	
	// 나이순 정렬
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		String[] stringArr = new String[testCase];
		
		for(int i = 0; i < testCase; i++) {
			stringArr[i] = br.readLine();
		}
		
		Arrays.sort(stringArr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				String[] one = o1.split(" ");
				String[] two = o2.split(" ");
				
				return Integer.parseInt(one[0]) - Integer.parseInt(two[0]);
			}
			
		});
		
		for (String string : stringArr) {
			System.out.println(string);
		}
	}

	
	// 대푯값 2
	public static void test12() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[5];
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			int x = Integer.parseInt(br.readLine());
			arr[i] = x;
			sum += x;
		}
		Arrays.sort(arr);
		System.out.println(sum/5);
		System.out.println(arr[2]);
	}
}
