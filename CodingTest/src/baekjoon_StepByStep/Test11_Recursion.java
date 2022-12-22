package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Test10_Recursion {
	private static int round = 0;
	private static int K;
	private static int answer = -1;
	private static int[] sorted;
	private static List<int[]> hanoiList = new ArrayList<>();
	private static char[][] starArr;

	// 팩토리얼
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(factorial(N));
	}
	
	// 팩토리얼 재귀 메소드
	public static int factorial(int n) {
		
		if(n < 2) return 1;
		return n*factorial(n-1);
	}
	
	// 피보나치 수
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(fibonacci(n));
	}
	
	// 피보나치 수 재귀 메소드
	public static int fibonacci(int n) {
		if(n < 2)return n;
		int f0 = 0, f1 = 1, f2 = 1;
		for(int i = 2; i < n; i++) {
			f0 = f1;
			f1 = f2;
			f2 = f1 + f0;
		}
		return f2;
	}
	
	// 재귀의 귀재
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String S = br.readLine();
			int result = isPalindrome(S);
			System.out.println(result + " " + round);
			round = 0;
		}
	}
	
	// 재귀의 귀재 재귀 호출 메서드
	public static int isPalindrome(String S) {
		return recursion(S, 0, S.length()-1);
	}
	
	// 재귀의 귀재 Palindrome 판별 메서드
	public static int recursion(String s, int len, int r) {
		round++;
		if(len >= r) return 1;
		else if(s.charAt(len) != s.charAt(r)) return 0;
		else return recursion(s, len+1, r-1);
	}
	
	// 병합 정렬 1
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine()," ");
		
		int testCase = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine()," ");
		int[] arr = new int[testCase];
		for(int i = 0; i < testCase; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		sorted = new int[testCase];
		merge(arr, 0, testCase - 1);

		System.out.println(answer);
		
	}
	
	// 병합 정렬 재귀 호출 메서드
	public static void merge(int[] arr, int left, int right) {
		
		if(round > K) return;
		
		if(left < right) {
			int mid = (left + right) / 2;
			merge(arr, left, mid);
			merge(arr, mid+1, right);
			merge(arr, left, mid, right);
					
		}
		
	}
	
	// 병합 정렬 Sorted 메서드
	public static void merge(int[] arr, int left, int mid, int right) {
		
		int i = left;
		int j = mid + 1;
		int index = 0;
		
		while (i <= mid && j <= right) {
			if(arr[i] <= arr[j]) {
				sorted[index] = arr[i];
				i++;
			} else {
				sorted[index] = arr[j];
				j++;
			}
			index++;
		}
		
		while (i <= mid) 
			sorted[index++] = arr[i++];

		while (j <= right) 
			sorted[index++] = arr[j++];

		i = left;
		index = 0;
		while (i <= right) {
			round++;
			if (round == K) {
				answer = sorted[index];
				break;
			} 
			arr[i++] = sorted[index++];
		}
		
	}

	// 별 찍기 - 10
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		starArr = new char[testCase][testCase];
		
		starMarker(0, 0, testCase, false);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < testCase; i++) {
			for(int j = 0; j < testCase; j++) {
				sb.append(starArr[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
	
	// 별 찍기 제곱수 판멸 및 별 찍기 메서드 
	public static void starMarker(int x, int y, int n, boolean blank) {
		
		if(blank) {
			for(int i = x; i < x + n; i++) {
				for(int j = y; j < y + n; j++) {
					starArr[i][j] = ' ';
				}
			}
			return;
		}
		
		if(n == 1) {
			starArr[x][y] = '*';
			return;
		}
		
		int size = n / 3;
		int cnt = 0;
		for(int i = x; i < x + n; i += size) {
			for(int j = y; j < y + n; j += size) {
				cnt++;
				if(cnt == 5) {
					starMarker(i, j, size, true);
				} else {
					starMarker(i, j, size, false);
				}
			}
		}
	}

	// 하노이 탑 이동 순서
	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		hanoi(N, 1, 2, 3);
		int[][] answer = new int[hanoiList.size()][];
		 
        for (int i = 0; i < hanoiList.size(); i++) {
        	answer[i] = hanoiList.get(i);
		}
        StringBuilder sb = new StringBuilder();
        sb.append(hanoiList.size()).append("\n");
        for (int[] is : answer) {
			for (int is2 : is) {
				sb.append(is2).append(" ");
			}
			sb.append("\n");
		}
        
        System.out.println(sb);
	}
	
	// 하노이 탑 이동 순서 정렬 메서드
	public static void hanoi(int n, int one, int two, int three) {
		if(n == 1) toArray(one, three);
		else {
			hanoi(n-1, one, three, two);
			toArray(one, three);
			hanoi(n-1, two, one, three);
		}
	}
	
	// 하노이 탑 이동 후 List에 add하는 메서드
	public static void toArray(int one, int two) {
		int[] temp = new int[2];
		temp[0] = one;
		temp[1] = two;
		hanoiList.add(temp);
	}
	

}
