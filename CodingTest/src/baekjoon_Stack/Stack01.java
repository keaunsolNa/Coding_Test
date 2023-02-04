package baekjoon_Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class Stack01 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 3986번 - 좋은 단어
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.valueOf(st.nextToken());
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			Stack<Character> stack = new Stack<Character>();	
			int len = str.length();
			stack.push(str.charAt(0));
			
			for(int j = 1; j < len; j++) {
				
				char nowCh = str.charAt(j);
				if(!stack.isEmpty()) {
					
					char prevCh = stack.peek();
					
					if(prevCh == nowCh) {	
						stack.pop();
						continue;
					}
				}
				stack.push(nowCh);
			}
			
			if(stack.isEmpty()) {
				count++;
			}
		}
		System.out.println(count);
		
	}
	
	// 17052번 - 과제는 끝나지 않아!
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Map<Integer, Integer>> stack = new Stack<>();
		
		int total = 0;
		for(int i = 0; i < N; i++) {
			String[] temp = br.readLine().split(" ");
			Map<Integer, Integer> map = new HashMap<>();
			
			if(temp[0].equals("0")) {
				if(!stack.isEmpty()) {
					Iterator<Integer> iterKey = stack.peek().keySet().iterator();
					Iterator<Integer> iterValue = stack.peek().values().iterator();
	
					map.put(iterKey.next(), iterValue.next() - 1);
					stack.pop();
					stack.add(map);
				}
				
			} else {
				map.put(Integer.parseInt(temp[1]), Integer.parseInt(temp[2]) - 1);
				stack.add(map);
			}

			if(!stack.isEmpty()) {
				Iterator<Integer> iterKey = stack.peek().keySet().iterator();
				Iterator<Integer> iterValue = stack.peek().values().iterator();
				
				if(iterValue.next() == 0) {
					stack.pop();
					total += iterKey.next();
				}
			}
			
		}
		
		System.out.println(total);
	}

	// 1935번 - 후위 표기식2
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Character, Integer> map = new HashMap<>();
		
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		char ch = 'A';
		for (int i = 0; i < N; i++) map.put(ch++, Integer.parseInt(br.readLine()));

		Stack<Double> operand = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);

			if ('A' <= ch && ch <= 'Z') operand.push((double) map.get(ch));
			
			else {
				
				double b = operand.pop();
				double a = operand.pop();

				switch (ch) {
				
				case '+':
					
					double n = a + b;
					operand.push(n);
					break;
					
				case '-':
					
					n = a - b;
					operand.push(n);
					break;
					
				case '*':
					
					n = a * b;
					operand.push(n);
					break;
					
				case '/':
					
					n = a / b;
					operand.push(n);
					break;
					
				}

			}
			
			
		}
		
		System.out.printf(String.format("%.2f", operand.pop()) + "\n");

	}
	
	// 11899번 - 괄호 끼워넣기
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Stack<Character> stack = new Stack<>();
		
		int ans = 0;
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '(') stack.add(input.charAt(i));
			else {
				if(!stack.isEmpty() && stack.peek() == '(') stack.pop();
				else ans++;
			}
		}
		
		System.out.println(ans + stack.size());
	}

	// 15815번 - 천재 수학자 성필
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Stack<Integer> operand = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if ('0' <= ch && ch <= '9') operand.push(Character.getNumericValue(ch));
			
			else {
				
				int b = operand.pop();
				int a = operand.pop();

				switch (ch) {
				
				case '+':
					
					int n = a + b;
					operand.push(n);
					break;
					
				case '-':
					
					n = a - b;
					operand.push(n);
					break;
					
				case '*':
					
					n = a * b;
					operand.push(n);
					break;
					
				case '/':
					
					n = a / b;
					operand.push(n);
					break;
					
				}

			}
			
			
		}
		
		System.out.print(operand.pop());
	}
	
	// 4889번 - 안정적인 문자열
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = "";
		
		int idx = 1;
		while(!(input = br.readLine()).contains("-")) {
			Stack<Character> stack = new Stack<>();
			int ans = 0;

			for(int i = 0; i < input.length(); i++) {
				
				if(input.charAt(i) == '{') stack.add('{');
				else {
					if(stack.isEmpty()) {
						stack.add('{');
						ans++;
					} else stack.pop();
				}
			}
			
			sb.append(idx + ". " + (ans + stack.size() / 2) + "\n");
			idx++;
		}
		
		System.out.println(sb);
	}
	
	// 2504번 - 괄호의 값
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();

		String input = br.readLine();
		int ans = 0;
		int value = 1;
		for(int i = 0; i < input.length(); i++) {
			
			if(input.charAt(i) == '(') {
				stack.add('(');
				value *= 2;
			}
			
			else if(input.charAt(i) == '[') {
				stack.add('['); 
				value *= 3;
			}
			
			else if(stack.isEmpty()) {
				
				System.out.println(0);
				return;
				
			}
			
			else if(input.charAt(i) == ')'){
				
				if(stack.peek() != '(') { 
					
					System.out.println(0);
					return;
					
                } else if(input.charAt(i - 1) == '(') ans += value;

				stack.pop();
                value /= 2;
				
			}
			
			else if(input.charAt(i) == ']') {
				
				if(stack.peek() != '[') { 
					
					System.out.println(0);
					return;
					
				} else if(input.charAt(i - 1) == '[') ans += value;
				
				stack.pop();
				value /= 3;
				
			}
			
		}
		
		if(!stack.isEmpty()) System.out.println(0);
		else System.out.println(ans);
	}
	
	// 1406번 - 에디터
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String N = br.readLine();
		Stack<Character> stL = new Stack<>();
		Stack<Character> stR = new Stack<>();

		for (int i = 0; i < N.length(); i++) stL.push(N.charAt(i));
		
		int M = Integer.parseInt(br.readLine());

		for (int i = 0; i < M; i++) {
			String order = br.readLine();
			
			if (order.charAt(0) == 'L') {
			
				if (!stL.empty()) stR.push(stL.pop());

			} else if (order.charAt(0) == 'D') {

				if (!stR.empty()) stL.push(stR.pop());

			} else if (order.charAt(0) == 'B') {
				
				if (!stL.empty()) stL.pop();
				
			} else if (order.charAt(0) == 'P') {

				stL.push(order.charAt(2));
				
			}

		}

		while (!stL.empty()) stR.push(stL.pop());

		while (!stR.empty()) sb.append(stR.pop());
		
		System.out.println(sb);
		
		
	}

	// 5397번 - 키로거
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			String input = br.readLine();
			Stack<Character> stL = new Stack<>();
			Stack<Character> stR = new Stack<>();
			
			for (int i = 0; i < input.length(); i++) {
				char order = input.charAt(i);
				
				if (order == '<') {
				
					if (!stL.empty()) stR.push(stL.pop());

				} else if (order == '>') {

					if (!stR.empty()) stL.push(stR.pop());

				} else if (order == '-') {
					
					if (!stL.empty()) stL.pop();
					
				} else {
					stL.push(order);
				}
					
			}
			
			while (!stL.empty()) stR.push(stL.pop());

			while (!stR.empty()) sb.append(stR.pop());
			
			sb.append("\n");
			
		}
		
		System.out.println(sb);
	}
	
	// 1918번 - 후위 표기식
	public static void test10() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stk = new Stack<>();
        
        int[] oper = new int[50];
        oper['*'] = 1;
        oper['/'] = 1;
        oper['('] = -1;
        oper[')'] = -1;
        
        String s = br.readLine();
        
        for (int i = 0; i < s.length(); i++) {
        	
            char c = s.charAt(i);
            
            if (c >= 'A') {
                sb.append(c);
                continue;
            }
            
            if (c == '(') {
                stk.add(c);
                continue;
            }
            
            if (c == ')') {
            	
                while (stk.peek() != '(') sb.append(stk.pop());
                stk.pop();
                continue;
            }
            
            while (!stk.isEmpty() && oper[stk.peek()] >= oper[c]) sb.append(stk.pop());
            stk.add(c);
            
        }
        
        while (!stk.isEmpty()) sb.append(stk.pop());
        
        System.out.println(sb);
	}
	

}
