package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Test21_QueueAndDeque {

	public static void main(String[] args) throws IOException {
		test01();
	}
	
	// 큐 2
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Deque<Integer> q = new ArrayDeque<>();
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer command;
		
		while(N-- > 0) {
			command = new StringTokenizer(br.readLine(), " ");	
			
			switch(command.nextToken()) {	
			
			case "push":
				
				q.offer(Integer.parseInt(command.nextToken()));	
				break;
				
			case "pop" :
				
				Integer item = q.poll();	
				if(item == null) {
					sb.append(-1).append('\n');
				}
				else {
					sb.append(item).append('\n');
				}
				break;
				
			case "size":	
				sb.append(q.size()).append('\n');
				break;
				
			case "empty":
				if(q.isEmpty()) {
					sb.append(1).append('\n');
				}
				else {
					sb.append(0).append('\n');
				}
				break;
				
			case "front":
				
				Integer ite = q.peek();
				if(ite == null) {
					sb.append(-1).append('\n');
				}
				else {
					sb.append(ite).append('\n');
				}
				break;
				
			case "back":
				
				Integer it = q.peekLast();	 
				if(it == null) {
					sb.append(-1).append('\n');
				}
				else {
					sb.append(it).append('\n');
				}
				break;
			}
		}
		System.out.println(sb);
	}
	
	// 카드 2
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 1; i <= N; i++) {
			queue.add(i);
		}
		
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			
			if(queue.isEmpty()) {
				System.out.println(temp);
			} else {
				int temp2 = queue.peek();
				queue.poll();
				queue.add(temp2);
			}
		}
	}
	
	// 요세푸스 문제 0
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 1; i <= N; i++) {
			queue.add(i);
		}
		
		int K = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		List<Integer> answerList = new ArrayList<>();
		while(!queue.isEmpty()) {
			for(int i = 0; i < K-1; i++) {
				int temp = queue.poll();
				queue.add(temp);
			}
			
			int answer = queue.poll();
			if(queue.isEmpty()) {
				sb.append(answer).append(">");
			} else {
				sb.append(answer).append(", ");
			}
		}
		
		System.out.println(sb);
	}
	
	// 프린터 큐
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());	

		while (T-- > 0) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			LinkedList<int[]> importantQueue = new LinkedList<>();	
			st = new StringTokenizer(br.readLine());

			for (int i = 0; i < N; i++) {
				importantQueue.add(new int[] { i, Integer.parseInt(st.nextToken()) });
			}
			
			int count = 0;	
			
			while (!importantQueue.isEmpty()) {	
				
				int[] front = importantQueue.poll();	
				boolean isMax = true;	
				
				for(int i = 0; i < importantQueue.size(); i++) {
					
					if(front[1] < importantQueue.get(i)[1]) {
						
						importantQueue.add(front);
						for(int j = 0; j < i; j++) {
							importantQueue.add(importantQueue.poll());
						}
						
						isMax = false;
						break;
					}
				}
				
				if(isMax == false) {
					continue;
				}
				
				count++;
				if(front[0] == M) {	
					break;
				}

			}

			sb.append(count).append('\n');

		}
		System.out.println(sb);
	}
	
	// 덱
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int order = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new LinkedList<>();
		
		for(int i = 0; i < order; i++) {
			String orderStr = br.readLine();
			
			if(orderStr.contains("push_front")) {
				
				int orderValue = Integer.parseInt(orderStr.split(" ")[1]);
				deque.addFirst(orderValue);
				
			} else if(orderStr.contains("push_back")) {
				
				int orderValue = Integer.parseInt(orderStr.split(" ")[1]);
				deque.addLast(orderValue);
				
			} else if(orderStr.contains("pop_front")) {
				
				if(deque.size() == 0) {
					System.out.println(-1);
				} else {
					System.out.println(deque.pollFirst());
				}
				
			} else if(orderStr.contains("pop_back")) {
				
				if(deque.size() == 0) {
					System.out.println(-1);
				} else {
					System.out.println(deque.pollLast());
				}
				
			} else if(orderStr.contains("size")) {
				
				System.out.println(deque.size());
				
			} else if(orderStr.contains("empty")) {
				
				if(deque.size() == 0) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				
			} else if(orderStr.contains("front")) {
				
				if(deque.size() == 0) {
					System.out.println(-1);
				} else {
					System.out.println(deque.peekFirst());
				}
				
			} else if(orderStr.contains("back")) {
				
				if(deque.size() == 0) {
					System.out.println(-1);
				} else {
					System.out.println(deque.peekLast());
				}
				
			}
		}
	}
	
	// 회전하는 큐
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] idxs = new int[m];
		st = new StringTokenizer(br.readLine());

		for(int i = 0; i < m; i++) {
			idxs[i] = Integer.parseInt(st.nextToken());
		}
		
		LinkedList<Integer> dq = new LinkedList<>();
		
		for(int i=1; i<n+1; i++) dq.offer(i);
		
		int count = 0;
		for(int idx : idxs) {
			
			while(true) {
				
				if(dq.peek() == idx) {
					
					dq.poll();
					break;
					
				} else {
					
					if(dq.indexOf(idx) < (double)dq.size() / 2) {
						
						while(dq.peek() != idx) {
							dq.offerLast(dq.pollFirst());
							count++;
						}
						
					} else {
						
						while(dq.peek() != idx) {
							dq.offerFirst(dq.pollLast());
							count++;
						}
						
					}
				}
			}
		}
		
		System.out.println(count);
	}
	
	// AC
    private static StringBuilder sb = new StringBuilder();
	public static void test07() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		ArrayDeque<Integer> deque;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			String input = br.readLine();
			int n = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine(), "[],");
			
			deque = new ArrayDeque<Integer>();
			
			for(int i = 0; i < n; i++) deque.add(Integer.parseInt(st.nextToken()));
			
			AC(input, deque);
			
		}
		
		System.out.println(sb);
	}
	
    private static void AC(String input, ArrayDeque<Integer> deque) {
		
		boolean reverse = true;
		
		for(char cmd : input.toCharArray()) {
			
			if(cmd == 'R') {
				reverse = !reverse;	
				continue;
			}
			
			
			if(reverse) {
				
				if(deque.pollFirst() == null) {
					sb.append("error\n");
					return;
				}
				
			} else {
				
				if(deque.pollLast() == null) {
					sb.append("error\n");
					return;
				}	
				
			}
		}
		
		makeString(deque, reverse);
		
	}
	
	private static void makeString(ArrayDeque<Integer> deque, boolean reverse) {
		
		sb.append('[');	
		
		if(deque.size() > 0) {	
			
			if(reverse) {	
				
				sb.append(deque.pollFirst());	
				while(!deque.isEmpty()) sb.append(',').append(deque.pollFirst());
				
			} else {	
				
				sb.append(deque.pollLast());	
				while(!deque.isEmpty()) sb.append(',').append(deque.pollLast());
				
			}
		}
		
		sb.append(']').append('\n');	
		
	}
	
}
