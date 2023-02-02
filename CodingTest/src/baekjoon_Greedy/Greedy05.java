package baekjoon_Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Greedy05 {
	public static void main(String[] args) throws IOException {
		test07();
	}
	
	// 16953번 - A → B
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		int cnt = 0;
		
		while(a != b) {
			
			if(b < a) {
				System.out.println(-1);
				return;
			}
			
			if(b % 2 == 0) b /= 2;
			else if(b % 10 == 1) b /= 10;
			else {
				System.out.println(-1);
				return;
			}
			cnt++;
			
		}
		
		System.out.println(cnt + 1);
	}
	
	
	// 27106번 - Making Change
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int P = Integer.parseInt(br.readLine());
		int needCharge = 100 - P;
		int cent1 = needCharge / 25;
		needCharge %= 25;
		int cent2 = needCharge / 10;
		needCharge %= 10;
		int cent3 = needCharge / 5;
		needCharge %= 5;
		int cent4 = needCharge / 1;
		
		System.out.println(cent1 + " " + cent2 +" " + cent3 + " " + cent4);
	}
	
	// 2828번 - 사과 담기 게임
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int J = Integer.parseInt(br.readLine());
		
		int left = 1;
		int right = M;
		
		int cnt = 0;
		for(int i = 0; i < J; i++) {
			
			int fall = Integer.parseInt(br.readLine());
			
			if(left <= fall || right >= fall) {
				
				if(left > fall) 
					
					while(left != fall) { left--; right--; cnt++; }
				
				else if(right < fall) 
					
					while(right != fall) { left++; right++; cnt++; }

			}
		}
		
		System.out.println(cnt);
	
	}
	
	// 11508번 - 2+1 세일
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Integer[] price = new Integer[N];
		
		for(int i = 0; i < N; i++) price[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(price, Collections.reverseOrder());
		
		long totalPrice = 0;
		for(int i = 0; i < N; i++) {
			
			if((i + 1) % 3 != 0) totalPrice += price[i];
			
		}
		
		System.out.println(totalPrice);
	}
	
	// 19939번 - 박 터뜨리기
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		for(int i = 1; i <= K; i++) {
			N -= i;
			if(N < 0) break;
		}
		
		if(N >= 0) {
			if(N % K > 0) System.out.println(K);
			else System.out.println(K - 1);
		}
		else System.out.println(-1);
		
	}
	
	// 11497번 - 통나무 건너뛰기
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {

			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			int[] arr = new int[N];
			for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(arr);
			
			int left = N - 1;
			int right = 0;
			int[] nums = new int[N];
			
			for(int i = 0; i < N; i++) {
				
				if(i % 2 == 0) nums[left--] = arr[i];
				else nums[right++] = arr[i];
				
			}
			
			int ans = Integer.MIN_VALUE;
			
            for (int i = 1; i < N; i++) 
            	ans = Math.max(ans, Math.abs(nums[i] - nums[i - 1]));
            
            ans = Math.max(ans, Math.abs(nums[0] - nums[N - 1]));
            System.out.println(ans);
            
		}
		
	}
	
	// 9009번 - 피보나치
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		long[] arr = new long[T];
		long max = 0;
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			max = Math.max(max, n);
			arr[i] = n;
		}
		
		List<Long> list = new ArrayList<>();
		for(long i = 2; ; i++) {
			long temp = fibonacci(i);
			if(temp > max) break;
			list.add(temp);
		}
		
		for(int i = 0; i < arr.length; i++) {
			List<Long> answer = new ArrayList<>();
			
			long target = arr[i];
			
			while(target != 0) {
				for (int l = list.size() - 1; l >= 0; l--) {
					
	                if (list.get(l) <= target) {
	                	target -= list.get(l);
	                    answer.add(list.get(l));
	                }
	            }
			}
			
			for(int a = answer.size() - 1; a >= 0; a--) {
				System.out.print(answer.get(a) + " ");
			}
			System.out.println();
		}
		
	}
	
	private static long fibonacci(long n) {
		if(n < 2) return n;
		
		long f0 = 0, f1 = 1, f2 = 1;
		
		for(int i = 2; i < n; i++) {
			f0 = f1;
			f1 = f2;
			f2 = f1 + f0;
		}
		return f2;
	}
	
	// 
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	}
	
	// 
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	}
	
	// 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	}
	
	
	
}