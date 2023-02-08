package baekjoon_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class DataStructure09 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}
	
	// 13414번 - 수강신청
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int K = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		Set<String> set = new LinkedHashSet<>();
		for(int i = 0; i < L; i++) {
			
			String number = br.readLine();
			if(set.contains(number)) set.remove(number);
			set.add(number);
		}

		Iterator<String> iter = set.iterator();
		
		for(int i = 0; i < K; i++) 
			if(iter.hasNext()) System.out.println(iter.next());
		
	}
	
	// 14235번 - 크리스마스 선물
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i = 0; i < n; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int order = Integer.parseInt(st.nextToken());
			
			if(order == 0) {
				
				if(pq.isEmpty()) sb.append(-1);
				else sb.append(pq.poll());
				
				sb.append("\n");
				
			} else {
				
				while(st.hasMoreTokens()) pq.add(Integer.parseInt(st.nextToken()));
				
			}
			
		}
		
		System.out.println(sb);
	}
	
	// 25327번 - 다중 항목 선호도 조사 (Large)
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		List<String[]> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) list.add(br.readLine().split(" "));

		for(int i = 0; i < m; i++) {
			String[] query = br.readLine().split(" ");
			
			int cnt = 0;
			boolean check;
			
			for(int j = 0; j < list.size(); j++) {
				
				check = true;
				
				for(int k = 0; k < 3; k++) {
					
					if(query[k].charAt(0) != '-' && query[k].charAt(0) != list.get(j)[k].charAt(0)) {
						check = false;
						break;
					}
				}
				
				if(check) cnt++;
			}
			
			sb.append(cnt + "\n");
			
		}
		System.out.println(sb);
	}
	
	// 15903번 - 카드 합체 놀이
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Long> pq = new PriorityQueue<Long>();
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) pq.add(Long.parseLong(st.nextToken()));
		
		while(m --> 0) {
			
			long a = pq.poll();
			long b = pq.poll();
			pq.add(a + b);
			pq.add(a + b);
			
		}
		
		long total = 0;
		for (Long l : pq) total += l;
		
		System.out.println(total);
	}
	
	// 2493번 - 탑
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<int[]> stack = new Stack<>();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			int input = Integer.parseInt(st.nextToken());
			
			while(!stack.isEmpty()) {
				
				if(stack.peek()[1] >= input) {
					sb.append(stack.peek()[0] + " ");
					break;
				}
				stack.pop();
			}
			
			if(stack.isEmpty()) sb.append("0 ");
			
			stack.push(new int[] {i, input});
		}
		
		System.out.println(sb);
	}
	
	//
	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
	}
	
	//
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
	}
	
	//
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
	}
	
	//
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
	}
	
	//
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
	}
	





}
