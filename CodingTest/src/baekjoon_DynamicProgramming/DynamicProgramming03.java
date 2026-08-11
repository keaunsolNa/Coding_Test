package baekjoon_DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DynamicProgramming03 {
	public static void main(String[] args) throws IOException {
		test10();
	}
	
	
	// 수열
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n + 1];
		int[] dp = new int[n + 1];
		
		int pCnt = 1;
		int mCnt = 1;
		int max = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(i > 0) {
				if(arr[i] > arr[i-1]) {
					pCnt++;
					mCnt = 1;
				}
				else if(arr[i] < arr[i-1]) {
					mCnt++;
					pCnt = 1;
				}
				else {
					pCnt++; mCnt++;
				}
			}
			
			if(max < pCnt) max = pCnt;
			else if(max < mCnt) max = mCnt;
		}
		
		System.out.println(max);
		
	}
	

	// 거스름돈
	public static void test05() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int five = 0;
		int two = 0;
		for(int i = N/5; i >= 0; i--) {
			if(N - (5*i) == 0) {
				five = i;
				two = 0;
				break;
			} else if((N - (5*i)) % 2 == 0) {
				five = i;
				two = (N - (5*i))/2;
				break;
			}
			
			if(i == 0) {
				if(N%2 == 0) {
					System.out.println(N/2);
				}
			}
		}
		if(N == 2) System.out.println(1); 
		else if(N == 4) System.out.println(2);
		else if(five == 0 && two == 0) System.out.println(-1);
		else System.out.println(five + two);
	}
	
	
	// 연속합
	private static Integer[] dp;
	private static int max;
	private static int[] arr;
	public static void test10() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		arr = new int[n];
		dp = new Integer[n];
		
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		dp[0] = arr[0];
		max = arr[0];
		
		recursion(n - 1);
		
		System.out.println(max);
	}
	
	private static int recursion(int n) {
		
		if(dp[n] == null) {
			dp[n] = Math.max(recursion(n - 1) + arr[n], arr[n]);
 
			max = Math.max(dp[n], max);
		}
		
		return dp[n];
	}
}