package baekjoon_DynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class DynamicProgramming01 {
	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 1로 만들기
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(recursion(N, 0));
	}
	
	private static int recursion(int N, int count) {
		 
		if (N < 2) {
			return count;
		}
		return Math.min(recursion(N / 2, count + 1 + (N % 2)), 
						recursion(N / 3, count + 1 + (N % 3)));
	}
	
	// 알고리즘 수업 - 피보나치 수 1
	static int cnt = 0;
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N  = Integer.parseInt(br.readLine());
		recur(N);
		sb.append(cnt).append(" ");
		cnt = 0;
		dynamic(N);
		sb.append(cnt);
		System.out.println(sb);
	}
	
	public static int recur(int N) {
		
		if(N == 1 || N == 2) {
			cnt++;
			return 1;
		} else {
			return recur(N-1) + recur(N-2);
		}
		
	}
	
	public static int dynamic(int N) {
		int[] dp = new int[N+1];
		
		dp[1] = 1;
		dp[2] = 1;
		
		for(int i = 3; i <= N; i++) {
			cnt++;
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[N];
	}
	
	// 돌 게임
	public static void test03() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		if(N%2 == 0) {
			System.out.println("CY");
		} else {
			System.out.println("SK");
		}
	}

	// 돌 게임 2
	public static void test04() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		if(N%2 == 0) {
			System.out.println("SK");
		} else {
			System.out.println("CY");
		}
	}

	// 피보나치 수 7
	public static void test05() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(dynamic2(N));
	}
	
	public static long dynamic2(int N) {
		long[] dp = new long[1000001];
		
		dp[1] = 1;
		dp[2] = 1;
		for(int i = 3; i <= N; i++) {
			dp[i] = (dp[i-1] + dp[i-2]) % 1000000007;
		}
		
		return dp[N];
	}
	
	// 계단 오르기
	static Integer[] point;
	static int stair[];
	public static void test06() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		point = new Integer[T + 1];
		
		stair = new int[T + 1];
		for(int i = 1; i <= T; i++) stair[i] = Integer.parseInt(br.readLine());
		
		point[0] = stair[0];
		point[1] = stair[1];
		
		if(T >= 2) {
			point[2] = stair[1] + stair[2];
		}
		System.out.println(totalStair(T));
		
	}
	
	public static int totalStair(int n) {
		
		if(point[n] == null) {
			point[n] = Math.max(totalStair(n-2), totalStair(n-3) + stair[n-1]) + stair[n];
		}
		
		return point[n];
	}

	// 이름 궁합
	public static void test07() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] alp = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
		String joonmin = br.readLine();
		String her = br.readLine();
		
		String point = "";
		for(int i = 0; i < joonmin.length(); i++) {
			point += alp[(joonmin.charAt(i) - 'A')];
			point += alp[(her.charAt(i) - 'A')];
		}
		
		while(point.length() != 2) {
			String temp = "";
			for(int i = 0; i < point.length() - 1; i++) {
				int temp2 = 0;
				
				temp2 += Character.getNumericValue(point.charAt(i));
				
				if(i < point.length() - 1) {
					
					temp2 += Character.getNumericValue(point.charAt(i + 1));
				}
				
				if(temp2 > 9) {
					temp += (temp2+"").charAt(1);
				} else {
					temp += temp2+"";
				}
			}
			point = temp;
			
		}
		
		System.out.println(point);
		
	}

	// 돌 게임 3
	public static void test08() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		if(N%7 == 0 || N%7 == 2) {
			System.out.println("CY");
		} else {
			System.out.println("SK");
		}
			
	}

	// Virus Outbreak
	public static void test09() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = 0;
		BigInteger [] arr = new BigInteger[500];
		
		arr[0] = BigInteger.ZERO;
		arr[1] = BigInteger.ONE;
		
		for(int i = 2; i <= 490; i++) {
			arr[i] = arr[i-2].add(arr[i-1]);
		}
		
		while((n=Integer.parseInt(br.readLine()))!=-1) {
			bw.write("Hour "+n+": "+arr[n]+" cow(s) affected\n");
		}
		
		bw.close();
	}

	// 1, 2, 3 더하기 
	public static void test10() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] nums = new int[11];
		nums[1] = 1;
		nums[2] = 2;
		nums[3] = 4;
		
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			for(int j = 4; j <= N; j++) {
				nums[j] = nums[j - 1] + nums[j - 2] + nums[j - 3];
			}
			
			System.out.println(nums[N]);
		}
		
	}
	
}