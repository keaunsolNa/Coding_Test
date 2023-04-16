package baekjoon_DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class DynamicProgramming05 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}
	
	// 26529번 - Bunnies
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		long[] pibbo = new long[46];
		pibbo[0] = 1;
		pibbo[1] = 1;
		
		for(int i = 2; i <= 45; i++) pibbo[i] = pibbo[i - 1] + pibbo[i - 2];
		
		
		while(T --> 0) System.out.println(pibbo[Integer.parseInt(br.readLine())]);
		
	}
	
	// 15988번 - 1, 2, 3 더하기 3
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		long[] nums = new long[1000001];
		nums[1] = 1;
		nums[2] = 2;
		nums[3] = 4;
		
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			for(int j = 4; j <= N; j++) {
				nums[j] = (nums[j - 1]  + nums[j - 2] + nums[j - 3]) % 1000000009;
			}
			
			System.out.println(nums[N]);
		}		
		
		
	}
	
	// 14650번 - 걷다보니 신천역 삼 (Small)
	private static long[] dp;
	private static int n;
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		n = Integer.parseInt(br.readLine());
		
		if(n == 1) {
			System.out.println(0);
			System.exit(0);
		}
		dp = new long[n+1];
		
		System.out.println(solution());
		
	}
	
    private static long solution() {
    	
        dp[2] = 2;
        for (int i = 3; i <= n; i++) dp[i] = (dp[i-1] * 3);
        return dp[n];
    }
    
	// 14651번 - 걷다보니 신천역 삼 (Large)
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		if(n == 1) {
			System.out.println(0);
			System.exit(0);
		}
		dp = new long[n+1];
		
		System.out.println(solution2());
		
	}
	
    private static long solution2() {
    	
        dp[2] = 2;
        for (int i = 3; i <= n; i++) dp[i] = (dp[i-1] * 3) % 1000000009;
        return dp[n];
    }

    // 11055번 - 가장 큰 증가하는 부분 수열
	private static Integer[] number;
	private static Integer[] dp2;
	public static void test05() throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		number = new Integer[n + 1];
		dp2 = new Integer[n + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 1; i <= n; i++) number[i] = Integer.parseInt(st.nextToken());
	
		dp2[1] = number[1];
		
		for(int i = 2; i <= n; i++) { 
			
			dp2[i] = number[i]; 
			
			for(int j = 1; j < i; j++) 
				if(number[i] > number[j]) dp2[i] = Math.max(dp2[j] + number[i], dp2[i]); 
		}
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 1; i <= n; i++) 
			if(dp2[i] > max) max = dp2[i];
		
		
		System.out.println(max);
	}

	// 11722번 - 가장 긴 감소하는 부분 수열
	private static Integer[] number2;
	private static Integer[] dp3;
	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		number2 = new Integer[N];
		dp3 = new Integer[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) number2[i] = Integer.parseInt(st.nextToken());
		
		
		for(int i = 0; i < N; i++) solove(i);
	
		int ans = Integer.MIN_VALUE;
		for (int i : dp3) if(ans < i) ans = i;
		
		System.out.println(ans);
	}

	private static int solove(int n) {
		
		if(dp3[n] == null) {
			dp3[n] = 1;
			
			for(int i = n - 1; i >= 0; i--) {
				if(number2[i] > number2[n]) dp3[n] = Math.max(dp3[n], solove(i) + 1);
			}
		}
		
		return dp3[n];
	}
	
	// 14002번 - 가장 긴 증가하는 부분 수열 4 
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		number2 = new Integer[N];
		dp3 = new Integer[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) number2[i] = Integer.parseInt(st.nextToken());
		
		
		for(int i = 0; i < N; i++) solove2(i);
	
		int ans = Integer.MIN_VALUE;
		for (int i : dp3) if(ans < i) ans = i;
		
        int value = ans;
        Stack<Integer> stack = new Stack<>();

        for (int i = N - 1; i >= 0; i--) {
            if (value == dp3[i]) {
                stack.push(number2[i]);
                value--;
            }
        }

        while (!stack.isEmpty()) sb.append(stack.pop() + " ");
        
        System.out.println(ans);
        System.out.println(sb);
		
	}
	
	private static int solove2(int n) {
		
		if(dp3[n] == null) {
			dp3[n] = 1;
			
			for(int i = n - 1; i >= 0; i--) 
				if(number2[i] < number2[n]) dp3[n] = Math.max(dp3[n], solove2(i) + 1);
			
		}
		
		return dp3[n];
	}
	
	//
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	}

	//
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	//
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	}

}
