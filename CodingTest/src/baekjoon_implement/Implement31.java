package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Implement31 {

	public static void main(String[] args) throws IOException {
		test06();
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
	
	
}
