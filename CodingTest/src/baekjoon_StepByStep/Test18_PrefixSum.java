package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test18_PrefixSum {

	public static void main(String[] args) throws IOException {
		test02();
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
	
	
	// 체스판 다시 칠하기 2
	private static int N;
	private static int M;
	private static int K;
	
    
}
