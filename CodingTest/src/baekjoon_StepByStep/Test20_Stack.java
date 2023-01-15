package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test20_Stack {

	public static void main(String[] args) throws IOException {
		test03();
	}
	
	// 스택
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int order = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < order; i++) {
			
			String orderStr = br.readLine();
			
			if(orderStr.contains("push")) {
				
				int pushValue = Integer.parseInt(orderStr.split(" ")[1]);
				stack.push(pushValue);
				
			} else if(orderStr.contains("pop")) {
				
				try {
					System.out.println(stack.pop());
				} catch(java.util.EmptyStackException e) {
					System.out.println(-1);
				}
			
			} else if(orderStr.contains("size")) {
				
				System.out.println(stack.size());
				
			} else if(orderStr.contains("empty")) {
				
				if(stack.size() == 0) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				
			} else if(orderStr.contains("top")) {
				
				try {
					System.out.println(stack.peek());
				} catch(java.util.EmptyStackException e) {
					System.out.println(-1);
				}
			
			}
		}
	}
	
	// 제로
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < K; i++) {
			int temp = Integer.parseInt(br.readLine());
			
			if(temp != 0) {
				stack.add(temp);
			} else {
				stack.pop();
			}
		}

		if(stack.isEmpty()) {
			System.out.println(0);
		} else {
			long sum = 0;
			while(!stack.isEmpty()) {
				sum += stack.pop();
			}
			
			System.out.println(sum);
		}
	}
	
	// 괄호
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String s = br.readLine();
			String answer = "NO";
	        Deque<Character> deque = new LinkedList<>();
	        char[] charArray = s.toCharArray();
	        
	        for (char c : charArray) {
	        	if(c == '(') {
	        		deque.add(c);
	        	} else if(c == ')') {
	        		if(deque.size() == 0) {
	        			answer = "NO";
	        			deque.add('N');
	        			break;
	        		} else {
	        			deque.poll();
	        		}
	        	}
			}
	        
	        if(deque.size() == 0) {
	        	answer = "YES";
	        }
	        
	        System.out.println(answer);
		}
	}
	
	// 균형잡힌 세상
	public static void test04() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
 
		String s;
		while(true) {
			
			s = br.readLine();
			
			if(s.equals(".")) {	
				break;
			}
			
			sb.append(solve(s)).append('\n');
		}
		
		System.out.println(sb);
	}
	
    public static String solve(String s) {
		
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);	
			
			if(c == '(' || c == '[') {
				stack.push(c);
			}
			
			else if(c == ')') {
				
				if(stack.empty() || stack.peek() != '(') {
					return "no";
				}
				
				else {
					stack.pop();
				}
				
			}
			
			else if(c == ']') {
				
				if(stack.empty() || stack.peek() != '[') {
					return "no";
				}
				
				else {
					stack.pop();
				}
				
			}
			
		}
		
		if(stack.empty()) {
			return "yes";
		}
		
		else {
			return "no";
		}
		
	}
	
	// 스택 수열
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < testCase; i++) {
			queue.add(Integer.parseInt(br.readLine()));
		}
		
		StringBuilder sb = new StringBuilder();
		while(!queue.isEmpty()) {
			
			for(int i = 1; i <= testCase; i++) {
				stack.push(i);
				sb.append("+").append("\n");
				while(stack.contains(queue.peek())) {
					stack.pop();
					queue.poll();
					sb.append("-").append("\n");
					continue;
				}
			}
			break;
		}

		if(stack.isEmpty()) {
			System.out.println(sb);
		} else {
			System.out.println("NO");
		}
	}
	
}
