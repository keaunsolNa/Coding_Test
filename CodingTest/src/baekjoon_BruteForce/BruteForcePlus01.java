package baekjoon_BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BruteForcePlus01 {
	private static int N;
	private static int day[];
	private static int money[];
	private static int maxMoney;
	private static int numbers[];
	private static int operator[];
	private static int MAX = -1000000000;
	private static int MIN = 1000000000;
	
	// 완전제곱수
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double M = Math.sqrt(Double.parseDouble(br.readLine()));
		double N = Math.sqrt(Double.parseDouble(br.readLine()));
		
		int sum = 0;
		for(int i = (int)Math.ceil(M); i <= N; i++) {
			sum += i*i;
		}
		
		if(sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println((int)Math.ceil(M) * (int)Math.ceil(M));
		}
	}

	// 퇴사
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		day = new int[N];
		money = new int[N];
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			day[i] = Integer.parseInt(st.nextToken());
			money[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0, 0);
		
		System.out.println(maxMoney);
	}
	
	// 퇴사 dfs 메서드
	public static void dfs(int i, int totalMoney) {

		if(i >= N) {
			if(maxMoney < totalMoney) maxMoney = totalMoney;
			return;
		}
		
		if(i + day[i] <= N) dfs(i + day[i], totalMoney + money[i]);
		
		
		if(i + 1 <= N) dfs(i + 1, totalMoney);
		
		
	}
	
	// 연산자 끼워넣기
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		numbers = new int[N];
		operator = new int[4];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < 4; i++) {
			operator[i] = Integer.parseInt(st.nextToken());
		}
		
		operatorDfs(numbers[0], 1);
		
		System.out.println(MAX);
		System.out.println(MIN);
	}
	
	// 연산자 끼워넣기 dfs 메서드
	public static void operatorDfs(int num, int idx) {
		if(idx == N) {
			MAX = Math.max(MAX, num);
			MIN = Math.min(MIN, num);
			return;
		}
		
		for(int i = 0; i < 4; i++) {
			
			if(operator[i] > 0) {
				
				operator[i]--;
				
				switch(i) {
				
				case 0 : operatorDfs(num + numbers[idx], idx +1); break;
				case 1 : operatorDfs(num - numbers[idx], idx +1); break;
				case 2 : operatorDfs(num * numbers[idx], idx +1); break;
				case 3 : operatorDfs(num / numbers[idx], idx +1); break;
				
				}
				
				operator[i]++;
			}
		}
	}
	
	// 약수 구하기
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int cnt = 0;
		int answer = 0;
		for(int i = 1; i <= N; i++) {
			if(N%i == 0) {
				cnt++;
			}
			if(cnt == K) {
				answer = i;
				break;
			}
		}
		
		System.out.println(answer);
	}

	// 날짜 계산
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int E = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int e = 1, s = 1, m = 1, cnt = 0;
		while(true) {
			cnt++;
			if(s == S && m == M && e == E) {
				break;
			}
			e++; m++; s++;
			if(e > 15) {
				e = 1;
			}
			if(m > 19) {
				m = 1;
			}
			if(s > 28) {
				s = 1;
			}
		}
		
		System.out.println(cnt);
	}

	// 수들의 합
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			int idx = i;
			int sum = 0;
			while(sum < M && idx < N) {
				sum += arr[idx];
				idx++;
			}
			
			if(sum == M) {
				cnt++;
			} 
		}
		
		System.out.println(cnt);
		
	}

	// 문자열 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		StringBuilder A = new StringBuilder(st.nextToken());
		StringBuilder B = new StringBuilder(st.nextToken());
		int answer = 0;
		if(A.length() == B.length()) {
			
			for(int i = 0; i < A.length(); i++) {
				if(A.charAt(i) != B.charAt(i)) {
					answer++;
				}
			}
			System.out.println(answer);
		} else {
			N = B.length();
			dfsString(B.length(), A, B);
			System.out.println(N);
		}
		
	}
	
	// 문자열 dfs 메서드
	public static void dfsString(int key, StringBuilder A, StringBuilder B) {
		if(A.length() >= key) {
			int delete = 0;
			for(int i = 0; i < A.length(); i++) {
				if(A.charAt(i) != 'X') {
					if(A.charAt(i) != B.charAt(i)) {
						delete++;
					}
				}
			}
			if(delete < N) {
				N = delete;
			}
			return;
		} else {
			dfsString(key, A.append("X"), B);
			A.deleteCharAt(A.length()-1);
			dfsString(key, A.insert(0, "X"), B);
		}
	}

	// 백설공주와 일곱난쟁이
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		for(int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		numbers = new int[7];
		dfsInt(0, 0, arr);
	}
	
	// 백설공주와 일곱난쟁이 dfs 메서드
	public static void dfsInt(int cnt, int depth, int[] arr) {
		if(cnt == 7) {
			int sum = 0;
			for (int i : numbers) {
				sum += i;
			}
			if(sum == 100) {
				for (int i : numbers) {
					System.out.println(i);
				}
				return;
			}
			return;
		} 
		
		for(int i =  depth; i < 9; i++) {
			numbers[cnt] = arr[i];
			dfsInt(cnt+1, i+ 1, arr);
		}
		
	}

	// 나누기
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder N = new StringBuilder(br.readLine());
		N = N.deleteCharAt(N.length() - 1);
		N = N.deleteCharAt(N.length() - 1);
		int F = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < 99; i++) {
			if(i < 10) {
				if(Integer.parseInt(N + "0" + i) % F == 0) {
					System.out.println("0"+i);
					break;
				}
			} else {
				if(Integer.parseInt(N +""+ i) % F == 0) {
					System.out.println(i);
					break;
				}
			}
		}
	}
	
	// 369
	public static void test10() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int answer = 0;
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j < (i+"").length(); j++) {
				switch((i+"").charAt(j)) {
					case '3' : answer++; break;
					case '6' : answer++; break;
					case '9' : answer++; break;
				}
			}
		}
		
		System.out.println(answer);
	}

}

