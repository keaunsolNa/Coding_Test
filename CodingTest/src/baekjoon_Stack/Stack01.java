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
