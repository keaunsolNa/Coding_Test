package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Implement30 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// Chessboard 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < M; j++) {
				char temp = ' ';
				if(i % 2 == 0) temp = (j % 2 == 0) ? '*' : '.';
				else temp = (j % 2 != 0) ? '*' : '.';
				
				sb.append(temp);
			}
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	
	// Missing Numbers
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		int idx = 0;
		while(N --> 0) {
			
			arr[idx] = Integer.parseInt(br.readLine());
			idx++;
			
		}
		
		int temp = 0;
		for(int i = 1; i < arr[idx - 1]; i++) {
			boolean flag = true;
			
			for(int j = 0; j < arr.length; j++) {
				
				if(arr[j] == i) {
					flag = false;
					continue;
				}
				
			}
			
			if(flag) sb.append(i + "\n");
		}
		
		if(sb.length() == 0) System.out.print("good job");
		else {
			sb.deleteCharAt(sb.length() - 1);
			System.out.print(sb);
		}
	}
	
	// Cakes 
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		int ans = Integer.MAX_VALUE;
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			int need = Integer.parseInt(st.nextToken());
			int have = Integer.parseInt(st.nextToken());
			
			ans = Math.min(ans, have / need);
		}
		
		System.out.print(ans);
	}
	
	// Monety 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int front = 0;
		int back = 0;
		for(int i = 0; i < N; i++) {
			
			int coin = Integer.parseInt(st.nextToken());
			front += (coin == 1) ? 1 : 0;
			back += (coin != 1) ? 1 : 0;
			
		}
		
		System.out.println(Math.min(front, back));
		
	}
	
	
}
