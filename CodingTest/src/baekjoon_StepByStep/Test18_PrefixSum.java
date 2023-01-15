package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test18_PrefixSum {

	public static void main(String[] args) throws IOException {
		test06();
	}
	
	// 구간 합 구하기 4
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] numbers = new int[N + 1];
		for(int i = 1; i <= N; i++) numbers[i] = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= N; i++) numbers[i] += numbers[i - 1];
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			sb.append(getRangedSum(numbers, A, B) + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		
		System.out.print(sb);
	}
	
	// 누적 합 알고리즘
	public static int getRangedSum(int[] arr, int L, int R) {
        return arr[R] - arr[L-1];
    }
	
	// 수열
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] temper = new int[N];
		for(int i = 0; i < N; i++) temper[i] = Integer.parseInt(st.nextToken());
		
		getRangedSum2(temper, N, K);
	}
	
	// 부분 누적 합 알고리즘
	public static void getRangedSum2(int[]arr, int N, int K) {
		long sum = 0;
		
		for(int i = 0; i < K; i++) sum += arr[i];
		long ans = sum;
		
		for(int i = K; i < N; i++) {
			sum = sum - arr[i - K] + arr[i];
			
			ans = Math.max(ans, sum);
		}
		
		System.out.println(ans);
	}
	
	// 인간-컴퓨터 상호작용
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		int Q = Integer.parseInt(br.readLine());
		int L = str.length();
		
		int[][] PS = new int[L + 1][26];
		PS[1][str.charAt(0) - 'a']++;
		
		for(int i = 2; i <= L; i++) {
			
			int idx = str.charAt(i - 1) - 'a';
			
			for(int j = 0; j < 26; j++) {
				
				int prefix = PS[i - 1][j];
				PS[i][j] = j == idx ? prefix + 1 : prefix;
			}
		
		}
		
		for(int i = 0; i < Q; i++) {
			st = new StringTokenizer(br.readLine());
			
			int idx = st.nextToken().charAt(0) - 'a';
			int start = Integer.parseInt(st.nextToken()) + 1;
			int end = Integer.parseInt(st.nextToken()) + 1;
			
			sb.append(PS[end][idx] - PS[start - 1][idx] + "\n");
			
		}
		
		sb.deleteCharAt(sb.length() - 1);
		
		System.out.println(sb);
		
	}
	
	// 나머지 합
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[M];
		
		int sum = 0;
		st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            sum = (sum + Integer.parseInt(st.nextToken())) % M;
            arr[sum]++;
        }		
        
        long ans = arr[0];
        for (int i = 0; i < M; i++) ans += (long) arr[i] * (arr[i] - 1) / 2;
        System.out.println(ans);
	}
	
	// 구간 합 구하기 5
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[N + 1][N + 1];
		for(int i = 1; i <= N; i++) {
			
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= N; j++) 
				map[i][j] = Integer.parseInt(st.nextToken());
			
		}
		
		for(int i = 1; i <= N; i++) {
			
			for(int j = 1; j <= N; j++) 
				map[i][j] += map[i - 1][j];
			
		}
		
		for(int i = 1; i <= N; i++) {
			
			for(int j = 1; j <= N; j++) 
				map[i][j] += map[i][j - 1];
			
		}

		for(int i = 0; i < M; i++) {
			
			st = new StringTokenizer(br.readLine());

			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
				
			sb.append(
					  map[x2][y2] 					// 0.0 ~ x2.y2 까지의 최대 사각형
				    - map[x1 - 1][y2] 				// - 세로 직사각형
					- map[x2][y1 - 1] 				// - 가로 직사각형 
					+ map[x1 - 1][y1 - 1]);		// + 중복 사각형
			
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	// 체스판 다시 칠하기 2
	private static int N;
	private static int M;
	private static int K;
	private static char[][] board;
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		board = new char[N ][M];
		
		for(int i = 0; i < N; i++) {
			
			String line = br.readLine();
			for(int j = 0; j < M; j++) 
				board[i][j] = line.charAt(j);
		}
		
        int[][] prefixSumB = ps('B');
        int[][] prefixSumW = ps('W');
	
        System.out.println(Math.min(calculate(prefixSumB), calculate(prefixSumW)));
        
	}
	
    private static int[][] ps(char st) {
    	
        int[][] temp = new int[N + 1][M + 1];
        
        for (int i = 0; i < N; i++) {
        	
            for (int j = 0; j < M; j++) {
                int curr = ((i + j) % 2 == 0) ? board[i][j] == st ? 0 : 1 : board[i][j] == st ? 1 : 0;
                temp[i + 1][j + 1] = temp[i + 1][j] + temp[i][j + 1] - temp[i][j] + curr;
            }
        }
        
        return temp;
    }
    
    private static int calculate(int[][] ps) {
    	
        int cnt = (int) 1e9;
        for (int i = 1; i <= N - K + 1; i++) {
        	
            for (int j = 1; j <= M - K + 1; j++) {
            	
                int num = ps[i + K - 1][j + K - 1] 
                		- ps[i + K - 1][j - 1] 
        				- ps[i - 1][j + K - 1] 
						+ ps[i - 1][j - 1];
                
                cnt = Math.min(cnt, num);
            }
        }
        
        return cnt;
    }
	
}
