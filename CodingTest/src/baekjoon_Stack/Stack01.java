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
		test03();
	}
	
	// 좋은 단어
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
	
	// 과제는 끝나지 않아!
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

	//
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
	}
	
	

}
