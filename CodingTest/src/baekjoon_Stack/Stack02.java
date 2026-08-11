package baekjoon_Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;


public class Stack02 {

	
	public static void main(String[] args) throws IOException {
		test10();
	}
	
	
	// 2304 - 창고 다각형
	public static void test01_2() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		StringTokenizer st;
	 
		int[][] col = new int[N][2];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(in.readLine());
			col[i][0] = Integer.parseInt(st.nextToken());
			col[i][1] = Integer.parseInt(st.nextToken());
		}
	 
		Arrays.sort(col, (o1, o2) -> o1[0] - o2[0]);
	 
		int area = 0;
		for(int i = 0; i < N; ) {

			int j = i + 1; 
			int max = j;
			while(j < N && col[i][1] > col[j][1])
				if(col[max][1] < col[j++][1]) max = j - 1;
	 
			if(j >= N){
	        
				area += col[i][1];
				if(max < N) area += col[max][1] * (col[max][0] - col[i][0] - 1);
				i = max;

			} else {
				area += col[i][1] * (col[j][0] - col[i][0]);
	            i = j;
			}
		}
		System.out.println(area);
	}
	
	
	// 17299번 - 오등큰수
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		Stack<Integer> stack = new Stack<Integer>();
		int N = Integer.parseInt(br.readLine());
		int[] sq = new int[N];
		
		st = new StringTokenizer(br.readLine());
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < N; i++) {
			
			int key = Integer.parseInt(st.nextToken());
			map.put(key, map.getOrDefault(key, 0) + 1);
			sq[i] = key;
			
		}
		
		for(int i = 0; i < N; i++) {
			
			while(!stack.isEmpty() && map.get(sq[stack.peek()]) < map.get(sq[i]))
				sq[stack.pop()] = sq[i];
			stack.push(i);
		}

		while(!stack.isEmpty()) sq[stack.pop()] = -1;
		
		for(int i = 0; i < N; i++) sb.append(sq[i] + " ");
		
		System.out.println(sb);
	}
	
	
	// 2374번 - 같은 수로 만들기 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Long> stack = new Stack<>();

		int n = Integer.parseInt(br.readLine());
		long max = 0;
		long ans = 0;
		
		for(int i = 0; i < n; i++) {
			long target = Long.parseLong(br.readLine());
			max = Math.max(max, target);
			
			if(stack.isEmpty()) stack.push(target);
			
			else {
				
				if(stack.peek() < target) {
					
					ans += target - stack.pop();
					stack.push(target);
					
				}
				
				else if(stack.peek() > target) {
					
					stack.pop();
					stack.add(target);
					
				}
			}
		}
		
		while(!stack.isEmpty()) {
			long num = stack.pop();
			ans += max - num;
		}
		
		System.out.println(ans);
		
	}

}
