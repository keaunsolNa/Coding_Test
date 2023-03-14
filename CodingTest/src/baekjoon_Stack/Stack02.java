package baekjoon_Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;


public class Stack02 {

	private static class Xy{
		
		private int x;
		private int y;
		
		private Xy(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) throws IOException {
		test03();
	}
	
	// 2304번 - 창고 다각형(F)
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		List<Xy> list = new ArrayList<>();
		
		int ans = 0;
		int cnt = 1;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			
			list.add(new Xy(x, h));
			if(ans < h) {
				ans = h;
				cnt = 1;
			} else if(ans>= h) {
				cnt++;
			} 
				
		}
		
		ans = ans * cnt;
		 
		System.out.println(ans);
		Collections.sort(list, (o1, o2) -> o1.x - o2.x); 
		
		Stack<Xy> stack = new Stack<>();
		for (Xy xy : list) stack.add(new Xy(xy.x, xy.y));
		
		
		while(!stack.isEmpty()) {
			
			int x = stack.peek().x;
			int y = stack.pop().y;
			
			while(!stack.isEmpty()) {
				
				int temp = stack.peek().y;
				if(temp > y) {
					ans += (x - stack.peek().x) * y;
					break;
				}
				
				stack.pop();
			}
		}
		
		Stack<Xy> stack2 = new Stack<>();
		Collections.sort(list, (o1, o2) -> o2.x - o1.x); 
		for (Xy xy : list) stack2.add(new Xy(xy.x, xy.y));
		
		while(!stack2.isEmpty()) {
			
			int x = stack2.peek().x;
			int y = stack2.pop().y;
			
			while(!stack2.isEmpty()) {
				int temp = stack2.peek().y;
				if(temp > y) {
					ans += (stack2.peek().x - x) * y;
					break;
				}
				
				stack2.pop();
			}
		}
		
		System.out.println(ans);
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
	
	// 6198 - 옥상 정원 꾸미기
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());
		
		long cnt = 0;
		for(int i = 0; i < N; i++) {
			
			int temp = arr[i];
			for(int j = i + 1; j < N; j++) {
				
				if(temp > arr[j]) cnt++;
				else break;
			}
		}
		
		System.out.println(cnt);
		
	}
	
	// 17298번 - 오큰수 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		Stack<Integer> stack = new Stack<Integer>();
		int N = Integer.parseInt(br.readLine());
		int[] sq = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) sq[i] = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) {
			
			while(!stack.isEmpty() && sq[stack.peek()] < sq[i]) sq[stack.pop()] = sq[i];
			
			stack.push(i);
			System.out.println(stack);
		}

		while(!stack.isEmpty()) sq[stack.pop()] = -1;
		
		for(int i = 0; i < N; i++) sb.append(sq[i] + " ");
		
		System.out.println(sb);
	}


    
	// 
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
	}
	

}
