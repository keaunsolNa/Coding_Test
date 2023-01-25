package baekjoon_BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BruteForcePlus04 {
	
   public static void main(String[] args) throws IOException {
      test10();
   }
	
	// 20410번 - 추첨상 사수 대작전! (Easy)
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long m = Long.parseLong(st.nextToken());
		long seed = Long.parseLong(st.nextToken());
		long x1 = Long.parseLong(st.nextToken());
		long x2 = Long.parseLong(st.nextToken());
		for(int a = 0; a < m; a++) {
			
			for(int c = 0; c < m; c++) {
				
				if((a * seed + c) % m == x1) {
					
					if((a * x1 + c) % m == x2) {
						System.out.println(a + " " + c);
						return;
					}
				}
			}
		}
	}

	// 20411번 - 추첨상 사수 대작전! (Normal)
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long m = Long.parseLong(st.nextToken());
		long seed = Long.parseLong(st.nextToken());
		long x1 = Long.parseLong(st.nextToken());
		long x2 = Long.parseLong(st.nextToken());
		
		for(long a = 0; a < m; a++) {
			
			for(long c = 0; c < m && ((seed - x1) * a + x2 - x1) % m == 0; c++ ) {
				
				if((x1 + x2) % m == (a * (seed + x1) + 2 * c) % m) {
					System.out.println(a + " " + c);
					return;
				}
			}
		}
		
	}
	
	// 14697번 - 방 배정하기
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		for(int a = 0; a <= 50; a++) {
			
			for(int b = 0; b <= 50; b++) {
				
				for(int c = 0; c <= 50; c++) {
					if((a * A) + (b * B) + (c * C) == N) {
						System.out.println(1);
						return;
					}
				}
			}
		}
		
		System.out.println(0);
	}
	
	// 1233번 - 주사위
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int S1 = Integer.parseInt(st.nextToken());
		int S2 = Integer.parseInt(st.nextToken());
		int S3 = Integer.parseInt(st.nextToken());
		
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for(int s1 = 1; s1 <= S1; s1++) {
			
			for(int s2 = 1; s2 <= S2; s2++) {
				
				for(int s3 = 1; s3 <= S3; s3++) {
					int sum = s1 + s2 + s3;
					map.put(sum, map.getOrDefault(sum, 0) + 1);
				}
			}
		}
		
		int max = 0;
		int ans = 0;
		for(Integer key : map.keySet()) {
			
			if(max < map.get(key)) {
				max = map.get(key);
				ans = key;
			}
		}
		
		System.out.println(ans);
	}
	
	// 19751번 Fractification 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[4];
		
		for(int i = 0; i < 4; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		System.out.println(arr[0] + " " + arr[2] + " " + arr[1] + " " + arr[3]);
		
	}
	
	// 24333번 - СРЕЩА НА ПРИЯТЕЛИ
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int l1 = Integer.parseInt(st.nextToken());
		int r1 = Integer.parseInt(st.nextToken());
		int l2 = Integer.parseInt(st.nextToken());
		int r2 = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		for(int j = l2; j <= r2; j++) {
			if(j != k) {
				
				if(j >= l1 && j <= r1) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
	
	// 26941번 - Pyramidbygge 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int B = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int i = 1; i <= 100000000; i += 2) {
			B -= (i * i);
			cnt++;
			if(B < 0) {
				System.out.println((cnt - 1));
				return;
			}
		}
	}
	
	// 24348번 - ИЗРАЗ
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long[] arr = new long[3];
		arr[0] = Long.parseLong(st.nextToken());
		arr[1] = Long.parseLong(st.nextToken());
		arr[2] = Long.parseLong(st.nextToken());
		
		Arrays.sort(arr);

		if(arr[1] == 0) System.out.println(arr[2]);
		else System.out.println(arr[1] * arr[2] + arr[0]);
		
	}
	
	// 2851번 - 슈퍼 마리오
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[10];
		
		int sum = 0;
		int prevSum = 0;
		for(int i = 0; i < 10; i++) {
			int temp = Integer.parseInt(br.readLine());
			
			prevSum = sum;
			sum += temp;
			
			if(sum >= 100) break;
		}
		
		if(Math.abs(prevSum - 100) == Math.abs(sum - 100)) {
			System.out.println(Math.max(sum, prevSum));
		} else {
			if(Math.abs(prevSum - 100) > Math.abs(sum - 100)) System.out.println(sum);
			else System.out.println(prevSum);
		}
		
	}
	
	// 17173번 - 배수들의 합
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[M];
		for(int i = 0; i < M; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		long sum = 0;
		
		for(int i = arr[0]; i <= N; i++) {
			for(int j = 0; j < M; j++) {
				
				if(i % arr[j] == 0) {
					sum += i;
					break;
				}
				
			}
		}
		
		System.out.println(sum);
	}
	

}

