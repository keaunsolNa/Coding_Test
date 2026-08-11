package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Implement31 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	

	// Санта Клаус
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		boolean[] arr = new boolean[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken()) - 1;
			
			arr[num] = true;
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < k; i++) {
			int num = Integer.parseInt(st.nextToken()) - 1;
			
			arr[num] = true;
		}

		int num = 0;
		for(int i = 0; i < n; i ++) {
			if(!arr[i]) {
				sb.append(i + 1 + " ");
				num++;
			}
		}
		
		sb.insert(0, num + "\n");
		System.out.print(sb);
	}
	
	// Triangles 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int K = Integer.parseInt(st.nextToken());
			char start = st.nextToken().charAt(0);
			
			for(int j = 0; j < K; j++) {
				
				for(int k = j; k > -1; k--) {
					sb.append(start);
				}
				
				sb.append("\n");
				start = (char)((int)start + 1);
				
				if(start > 90) start = (char)65;
			}
			
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	// 카드
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		long ans = 0;
		for(int i = 0; i < N - 1; i++) ans += arr[i];
		
		System.out.println(ans);
	}
	

	// Statistics 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		int prev = Integer.parseInt(br.readLine());
		int ans = 0;
		T--;
		while(T --> 0) {
			
			int now = Integer.parseInt(br.readLine());
			
			if(prev < now) ans += (now - prev);
			else prev = now;
		}
		
		System.out.println(ans);
	}
	
	
}
