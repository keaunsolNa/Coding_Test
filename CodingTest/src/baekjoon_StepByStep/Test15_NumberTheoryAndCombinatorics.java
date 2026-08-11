package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Test15_NumberTheoryAndCombinatorics {

	static int[][] dp;
	public static void main(String[] args) throws NumberFormatException, IOException {
		test02();
	}
	
	
	// 약수
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);
		if(arr.length != 1) {
			System.out.println(arr[0]*arr[arr.length - 1]);
		} else {
			System.out.println(arr[0]*arr[0]);
		}
	}
	
	
	// 최소공배수
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			int result = x*y;
			
			while(x!=y) {
				if(x>y)
					x = x-y;
				else y = y-x;
			}
			
			int result2 = y;
			
			System.out.println(result/result2);
		}
	}

	
    // 이항 계수 동적 계획법 모듈러 연산
    public static int dp(int n, int k) {
    	
    	if (dp[n][k] > 0) return dp[n][k];
		
 
		if (k == 0 || n == k) {
			return dp[n][k] = 1;
		}
 
		return dp[n][k] = (dp(n - 1, k - 1) + dp(n - 1, k)) % 10007;
    }
    
    
    // 팩토리얼 0의 개수
    public static void test11() throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int N = Integer.parseInt(br.readLine());
    	int count = 0;
    	
    	while(N >= 5) {
    		count += N / 5;
    		N /= 5;
    	}
    	
    	System.out.println(count);
    	
    }
    
    
}
