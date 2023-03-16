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

	private static class Xy{
		
		private int x;
		private int y;
		
		private Xy(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) throws IOException {
		test10();
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

	// 5957번 - Cleaning the Dishes
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		Stack<Integer> stack3 = new Stack<>();
		
		for(int i = N; i >= 1; i--) stack1.add(i);
		
		String input = "";
		
		while((input = br.readLine()) != null) {
			st = new StringTokenizer(input);
			
			int work = Integer.parseInt(st.nextToken());
			int doing = Integer.parseInt(st.nextToken());
			
			switch(work) {
			
				case 1 : 
					for(int i = 0; i < doing; i++) stack2.add(stack1.pop()); break;
					
				case 2 : 
					for(int i = 0; i < doing; i++) stack3.add(stack2.pop()); break;
					
			}
		}

		while(!stack3.isEmpty()) System.out.println(stack3.pop());
		
	}
	
	// 9935번 - 문자열 폭발
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		char[] input = br.readLine().toCharArray();
		String target = br.readLine();
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < input.length; i++) {
			stack.push(input[i]);
			
			if(stack.size() >= target.length()) {
				boolean flag = true;
				
				for(int j = 0; j < target.length(); j++) {
					if(stack.get(stack.size() - target.length() + j) != target.charAt(j)) {
						flag = false;
						break;
					}
				}
				
				if(flag) for(int j = 0; j < target.length(); j++) stack.pop();
			}
				
		}
		
		if(stack.size() == 0) {
			System.out.println("FRULA");
			return;
		}
		
		for (Character character : stack) sb.append(character);
		
		System.out.println(sb);
	}
	
	// 16120 - PPAP
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		Stack<Character> stack = new Stack<>();
		String PPAP = "PPAP";
		for(int i = 0; i < input.length(); i++) {
			
			stack.push(input.charAt(i));
			
			if(stack.size() >= 4) {
				boolean flag = true;
				
				for(int j = 0; j < 4; j++) {
					if(stack.get(stack.size() - 4 + j) != PPAP.charAt(j)) {
						flag = false;
						break;
					}
				}
				
				if(flag) {
					for(int j = 0; j < 4; j++) stack.pop();
					stack.push('P');
				}
			}
		}
		
		if(stack.pop() == 'P' && stack.size() == 0) System.out.println("PPAP");
		else System.out.println("NP");
	}
	
	// 15926번 - 현욱은 괄호왕이야!!
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		Stack<Integer> stack = new Stack<>();
		int cnt = 0;
		stack.add(-1);
		
		for(int i = 0; i < n; i++) {
			char target = input.charAt(i);
			
			if(target == '(') stack.push(i);
			else {
				stack.pop();
				if(!stack.isEmpty()) cnt = Math.max(cnt, i - stack.peek());
				else stack.add(i);
			}
		}
		
		System.out.println(cnt);
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
	
	// 26558 - Clothes
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			int N = Integer.parseInt(br.readLine());
			
			Stack<String> shirt = new Stack<>();
			Stack<String> pants = new Stack<>();
			Stack<String> socks = new Stack<>();
			
			for(int i = 0; i < N; i++) {
				
				st = new StringTokenizer(br.readLine(), "(");
				String value = st.nextToken();
				value = value.substring(0, value.length() - 1);
				
				String key = st.nextToken();
				key = key.substring(0, key.length() - 1);

				switch(key) {
					
					case "shirt" : shirt.add(value); break;
					
					case "pants" : pants.add(value); break;
					
					case "socks" : socks.add(value); break;
					
				}
			}
			
			while(!shirt.isEmpty()) {
				
				if(!pants.isEmpty()) {
					
					if(!socks.isEmpty()) {
						
						sb.append(shirt.pop() + ", " + pants.pop() + ", " + socks.pop() +"\n");
						continue;
					}
				}
				
				break;
			}
			
			sb.append("\n");
		
		}
		
		System.out.println(sb);
	}
	
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
