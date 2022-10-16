package baekjoon_Class01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Class02 {

	public static void main(String[] args) throws IOException {
		test24();
	}
	
	// 체스판 다시 칠하기
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine()," ");
		int Column = Integer.parseInt(st.nextToken());		// 세로
		int Row = Integer.parseInt(st.nextToken());			// 가로
		char[][] chessBoard = new char[Column][Row];
		
		for(int i = 0; i < Column; i++) {
			chessBoard[i] = br.readLine().toCharArray();
		}
		
		int min = 9999;
		String[] compareChess = new String[8];
		for(int i = 0; i <= Column - 8; i++) {
			for(int j = 0; j <= Row - 8; j++) {
				for (int t = 0; t < 8 ; t++) {
					StringBuilder sb = new StringBuilder();
					for (int c = 0; c < 8; c++) {
						sb.append(chessBoard[t + i][c + j]);
					}
					compareChess[t] = sb.toString();
				}
				int temp = cutting(compareChess, 'W', 'B');
				int temp2 = cutting(compareChess, 'B', 'W');
				if(temp > temp2) {
					temp = temp2;
				}
				if(min > temp) {
					min = temp;
				}
			}
		}

		System.out.println(min);
	}
    
	// 판 자르기 메서드
    public static int cutting(String[] chess, char firstChess, char nextChess) {
		int answer = 0;
		for (String string : chess) {
			for(int i = 0; i < string.length(); i++) {
				if(i%2 == 0 || i == 0) {
					if(!(firstChess == string.charAt(i))) {
						answer++;
					} 
				} else {
					if((firstChess == string.charAt(i))) {
						answer++;
					} 
				}
			}
			char temp = firstChess;
			firstChess = nextChess;
			nextChess = temp;
		}
		
		return answer;
	}

    // 직사각형에서 탈출
    public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int xOut = Math.min(w-x, Math.abs(0-x));
		int yOut = Math.min(h-y, Math.abs(0-y));
		System.out.println(Math.min(xOut, yOut));
    }

    // 단어 정렬
    public static void test03() throws NumberFormatException, IOException {
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

    // 팰린드롬 수
    public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String temp = br.readLine();
			if(temp.equals("0")) {
				break;
			}
			int answer = 0;
			for(int i = 0; i < temp.length()/2; i++) {
				if(!(temp.charAt(i) == temp.charAt(temp.length() - (i+1)))) answer++;
			}
			if(answer > 0) {
				System.out.println("no");
			} else {
				System.out.println("yes");
			}
		}
    }
    
    // 영화감독 숌
    public static void test05() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = 666;
		int count = 1;
		
		while(count != N) {
			num++;
			if(String.valueOf(num).contains("666")) {
				count++;
			}
		}
		
		System.out.println(num);
    }

    // 랜선 자르기
    public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		List<Long> list = new ArrayList<>();
		long max = 1;
		
		for(int i = 0; i < K; i++) {
			long length = Long.parseLong(br.readLine());
			list.add(length);
			if(length > max) max = length;
		}
		
		long first = 1;
		long last = max;
		
		long answer = first;
		
		while(first <= last) {
			long mid = (first+last)/2;
			long num = getNum(list, mid);
			
			if(num < N) {
				last = mid - 1;
			} else {
				answer = mid;
				first = mid + 1;
			}
		}

		System.out.println(answer);
    }
    
    public static int getNum(List<Long> list, long unit) {
    	int num = 0;

    	for (Long length : list) {
			num += (length/unit);
		}
    	return num;
    }

    // 스택 수열
    public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < testCase; i++) {
			queue.add(Integer.parseInt(br.readLine()));
		}
		
		StringBuilder sb = new StringBuilder();
		while(!queue.isEmpty()) {
			
			for(int i = 1; i <= testCase; i++) {
				stack.push(i);
				sb.append("+").append("\n");
				while(stack.contains(queue.peek())) {
					stack.pop();
					queue.poll();
					sb.append("-").append("\n");
					continue;
				}
			}
			break;
		}

		if(stack.isEmpty()) {
			System.out.println(sb);
		} else {
			System.out.println("NO");
		}
    }

    // 수 찾기
    public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
	
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long[] arr = new long[testCase];
		for(int i = 0; i < testCase; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		Arrays.sort(arr);
		
		int testCase2 = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb  = new StringBuilder();
		
		for(int i = 0; i < testCase2; i++) {
			
			if(search(arr, Long.parseLong(st.nextToken())) >= 0) {
				sb.append("1").append("\n");
			} else {
				sb.append("0").append("\n");
			}
		}
		
		System.out.println(sb);
		
    }

    // 이진 탐색 메서드
    public static int search(long[] arr, Long target) {
    	int first = 0;
    	int last = arr.length - 1;
    			
    	while(first <= last) {
    		int mid = (first+last)/2;
    		
    		if(target < arr[mid]) {
    			last = mid - 1;
    		}
    		else if (target > arr[mid]){
    			first = mid + 1;
    		} 
    		else {
    			return mid;
    		}
    	}
    	return -1;
    }

    // 소수 구하기
    public static void test09() {
        Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		for(int i = M; i <= N; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
    }
    
    // 소수 탐색 메서드
    public static boolean isPrime(long n) {
		
        if(n == 1 || n == 0) return false;

        for(long i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) return false;
        }

        return true;
        
    }

    // 프린터 큐
    public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());	

		while (T-- > 0) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			LinkedList<int[]> importantQueue = new LinkedList<>();	
			st = new StringTokenizer(br.readLine());

			for (int i = 0; i < N; i++) {
				importantQueue.add(new int[] { i, Integer.parseInt(st.nextToken()) });
			}
			
			int count = 0;	
			
			while (!importantQueue.isEmpty()) {	
				
				int[] front = importantQueue.poll();	
				boolean isMax = true;	
				
				for(int i = 0; i < importantQueue.size(); i++) {
					
					if(front[1] < importantQueue.get(i)[1]) {
						
						importantQueue.add(front);
						for(int j = 0; j < i; j++) {
							importantQueue.add(importantQueue.poll());
						}
						
						isMax = false;
						break;
					}
				}
				
				if(isMax == false) {
					continue;
				}
				
				count++;
				if(front[0] == M) {	
					break;
				}

			}

			sb.append(count).append('\n');

		}
		System.out.println(sb);
	}

    
    
    // 소수 찾기
    public static void test11() {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int cnt = 0;
		
		for(int i = 0; i < testCase; i++) {
			
			long isPrime = sc.nextInt();
			if(isPrime(isPrime)) {
				cnt++;
			}
			
		}
		System.out.println(cnt);
    }
    
    // 통계학
    public static void test12() throws NumberFormatException, IOException {
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
    
    // mod 값 탐색 메서드
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

    // 카드2
    public static void test13() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 1; i <= N; i++) {
			queue.add(i);
		}
		
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			
			if(queue.isEmpty()) {
				System.out.println(temp);
			} else {
				int temp2 = queue.peek();
				queue.poll();
				queue.add(temp2);
			}
		}
    }

    // 분해합
    public static void test14() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		int targetNumber = 0;
		for(targetNumber = 0; targetNumber < N; targetNumber++) {
			sum = targetNumber;
			for(int j = 0; j < (targetNumber + "").length(); j++) {
				sum += Character.getNumericValue((targetNumber + "").charAt(j));
			}
			if(sum == N) {
				break;
			}
		}
		if(targetNumber == N) {
			targetNumber = 0;
		}
		System.out.println(targetNumber);
    }

    // 벌집
    public static void test15() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int temp = 1;
		int i = 1;
		if(N != 1) {
			while(N > temp) {
				temp += (i*6);
				i++;
			}
		}
		
		System.out.println(i);
    }
    
    // 최대공약수와 최소공배수
    public static void test16() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int gcdX = x;
		int gcdY = y;
		while(gcdX!=gcdY) {
			if(gcdX>gcdY) 
				gcdX = gcdX-gcdY;
			else gcdY = gcdY-gcdX;
		} 
		System.out.println(gcdY);
		
		int result = x*y;
		
		while(x!=y) {
			if(x>y)
				x = x-y;
			else y = y-x;
		}
		
		int result2 = y;
		
		System.out.println(result/result2);
    }

    // 수 정렬하기 2
    public static void test17() {
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

    // 부녀회장이 될테야
    public static void test18() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringBuilder sb = new StringBuilder();		
		int count = Integer.parseInt(br.readLine());
			
		int[][] apartment = new int [15][15];
			
		for(int i = 1; i < 15; i++) {
			apartment[0][i] = i;
		}
		
		for(int i = 1; i < 15; i++) {
			for(int j = 1; j < 15; j++) {
				if(j == 1)
					apartment[i][j] = 1;
				else
					apartment[i][j] = apartment[i - 1][j] + apartment[i][j - 1];
			}
		}
		
		for(int i = 0; i < count; i++) {
			int K = Integer.parseInt(br.readLine());
			int N = Integer.parseInt(br.readLine());
			
			sb.append(apartment[K][N]).append("\n");
		}
		
		System.out.print(sb); 
    }

    // 블랙잭
	private static boolean[] visit;
	private static int sumNumber = 0;
	private static int[] result = new int[3];
    public static void test19() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine()," ");
		
		int cardAmount = Integer.parseInt(st.nextToken());
		int keyNumber = Integer.parseInt(st.nextToken());
		
		int[] card = new int[cardAmount];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < cardAmount; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		visit = new boolean[card.length];
		int depth = 0;
		dfs(depth, keyNumber, cardAmount, card);
		
		System.out.println(sumNumber);
    }
    
	public static void dfs(int depth, int keyNumber, int cardAmount, int[] card) {
		
		if(depth == 3) {
			int sum = 0;

			for (int i : result) {
				sum += i;
			}
			
			if (sum > keyNumber) {
				return;
			}
			
			if(sum <= keyNumber) {
				sumNumber = Math.max(sumNumber, sum);
			}
		} else {
			
			for(int i = depth; i < cardAmount; i++) {
				
				if(!visit[i]) {
					visit[i] = true;
					result[depth] = card[i];
					dfs(depth+1, keyNumber, cardAmount, card);
					visit[i] = false;
				}
			}
		}
		
	}

	// 나무 자르기
	public static void test20() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		List<Integer> tree = new ArrayList<>();
		int last = 1;
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			int length = Integer.parseInt(st.nextToken());
			tree.add(length);
			if(length > last) last = length;
		};
		
		int first = 0;
		while(first < last) {
			
			int mid = (first + last)/2;
			long sum = 0;
			
			for(int treeH : tree) {
				
				if(treeH - mid > 0) {
					sum += treeH - mid;
				}
			}
			
			if(sum < M) {
				last = mid;
			}
			
			else {
				first = mid +1;
			}
			
		}
		
		System.out.println(first - 1);
	
	}

	// 설탕 배달
	public static void test21() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int answer = -1;
		for(int i = N/5; i > 0; i--) {
			if(((N - (5*i))%3) == 0) {
				answer = i + ((N - (5*i))/3);
				break;
			} 
		}
		
		if(N%3 == 0  && answer == -1) {
			answer = N/3;
		}
		System.out.println(answer);
		
	}

	// 달팽이는 올라가고 싶다.
	public static void test22() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int day = (V - B) / (A - B);
		
		if((V - B) % (A-B) != 0) {
			day++;
		}
		
		System.out.println(day);
	}
	
	// 직각 삼각형
	public static void test23() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int[] arr = new int[3];
			arr[0] = Integer.parseInt(st.nextToken());
			arr[1] = Integer.parseInt(st.nextToken());
			arr[2] = Integer.parseInt(st.nextToken());

			Arrays.sort(arr);
			
			if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
				break;
			}
			if(Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2)) {
				System.out.println("right");
			} else System.out.println("wrong");
			
		}
	}
	
	// 괄호
	public static void test24() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String s = br.readLine();
			String answer = "NO";
	        Deque<Character> deque = new LinkedList<>();
	        char[] charArray = s.toCharArray();
	        
	        for (char c : charArray) {
	        	if(c == '(') {
	        		deque.add(c);
	        	} else if(c == ')') {
	        		if(deque.size() == 0) {
	        			answer = "NO";
	        			deque.add('N');
	        			break;
	        		} else {
	        			deque.poll();
	        		}
	        	}
			}
	        
	        if(deque.size() == 0) {
	        	answer = "YES";
	        }
	        
	        System.out.println(answer);
		}
        
	}
	
	// ACM 호텔
	public static void test25() {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i = 0; i < testCase; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			int userH = N%H;
			int userW = N/H + 1;
			if(userH == 0) {
				userH = H;
				userW = N/H;
			}
			if(userW < 10) {
				System.out.println(userH + "0" + userW);
			} else {
				System.out.println(userH + "" + userW);
			}
		}
	}
	
	// 나이순 정렬
	public static void test26() throws NumberFormatException, IOException {
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
	
	
	
	
	
	
}
