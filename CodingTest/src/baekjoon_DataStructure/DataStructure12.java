package baekjoon_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class DataStructure12 {

	private static class classroom implements Comparable<classroom> {
		int start;
		int end;
		
		classroom(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(classroom o) {
			
			if(this.start != o.start) return this.start - o.start;
			
			else return this.end - o.end;
		}
	}
	
	private static class goods implements Comparable<goods> {
		String name;
		int value;
		
		goods(String name, int value) {
			this.name = name;
			this.value = value;
		}
		
		@Override
		public int compareTo(goods o) {
			
			if(this.name.length() == o.name.length()) return this.name.compareTo(o.name);
			else return this.name.length() - o.name.length();
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	// 11000번 - 강의실 배정
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<classroom> que = new PriorityQueue<>();
		
		while(N --> 0) {
			
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			que.add(new classroom(start, end));	
		}
		
		PriorityQueue<Integer> lectures = new PriorityQueue<>();
		lectures.offer(que.poll().end);
		
		while(!que.isEmpty()) {
			
			if(lectures.peek() <= que.peek().start) {
				lectures.poll();
			}
			lectures.offer(que.poll().end);
		}
		
		System.out.println(lectures.size());
		
	}
	
	// 1374번 - 강의실
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<classroom> que = new PriorityQueue<>();
		
		while(N --> 0) {
			
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			que.add(new classroom(start, end));	
		}
		
		PriorityQueue<Integer> lectures = new PriorityQueue<>();
		lectures.offer(que.poll().end);
		
		while(!que.isEmpty()) {
			
			if(lectures.peek() <= que.peek().start) {
				lectures.poll();
			}
			lectures.offer(que.poll().end);
		}
		
		System.out.println(lectures.size());
	}
	
	// 19598번 - 최소 회의실 개수
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<classroom> que = new PriorityQueue<>();
		
		while(N --> 0) {
			
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			que.add(new classroom(start, end));	
		}
		
		PriorityQueue<Integer> lectures = new PriorityQueue<>();
		lectures.offer(que.poll().end);
		
		while(!que.isEmpty()) {
			
			if(lectures.peek() <= que.peek().start) {
				lectures.poll();
			}
			lectures.offer(que.poll().end);
		}
		
		System.out.println(lectures.size());
		
	}
	
	// 16562번 - 친구비
	private static int[] parent;
	private static int[] moneyArr;
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		parent = new int[N + 1];
        for(int i = 1; i <= N; i++) parent[i] = i;

        moneyArr = new int[N+1];
        boolean[] visited = new boolean[N+1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) moneyArr[i] = Integer.parseInt(st.nextToken());

        while(M-->0) {
        
        	st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            union(A, B);
        }

        int moneySum = 0;

        for(int i = 1; i<=N; i++) {
        	
            int rootIdx = find(i);

            if(visited[rootIdx]) {
                visited[i] = true;
                continue;
            }

            moneySum += moneyArr[rootIdx];

            visited[rootIdx] = true;
            visited[i] = true;
        }

        if(moneySum > K) System.out.println("Oh no");
        else System.out.println(moneySum);
		
	}
	
	private static void union(int idx1, int idx2) {
		
		int parent1 = find(idx1);
		int parent2 = find(idx2);
		
		if(moneyArr[parent1] >= moneyArr[parent2]) parent[parent1] = parent2;
		else parent[parent2] = parent1;
		
	}

	private static int find(int idx) {
    	
        if(parent[idx] == idx) return idx;
        else return find(parent[idx]);
        
    }
    
	// 14713번 - 앵무새 
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		List<Stack<String>>  list = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			Stack<String> temp = new Stack<>();
			while(st.hasMoreTokens()) temp.push(st.nextToken());
			list.add(temp);
		}
		
		st = new StringTokenizer(br.readLine());
		Stack<String> stack = new Stack<>(); 
		while(st.hasMoreTokens()) stack.push(st.nextToken());

		while(true)	{
			boolean flag = false;
			
			for(int i = 0; i< N; i++) {
				if(list.get(i).isEmpty()) continue;
				if(list.get(i).peek().equals(stack.peek())) {
					list.get(i).pop();
					stack.pop();
					flag = true;
					break;
				}
			}
			
			if(!flag || stack.isEmpty()) break;
			
		}
		
		System.out.println(stack.isEmpty() ? "Possible" : "Impossible");
	}
	
	// 19638번 - 센티와 마법의 뿅망치
	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		PriorityQueue<Integer> height = new PriorityQueue<>(Collections.reverseOrder());

		while(N --> 0) height.add(Integer.parseInt(br.readLine()));
		int idx = 0;
        
		String answer = "NO";
        for (int i = 0; i < T; i++) {

            if ((height.peek() < H) || (height.peek() == 1)) break;
            idx++;
            height.add(height.poll() / 2);
            
        }
		
        if (height.peek() < H) answer = "YES";
        
        System.out.print(answer.equals("YES") ? answer +"\n" + idx : answer +"\n" + height.poll());
        
	}
	
	// 5614번 - 問題 3
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		PriorityQueue<goods> que = new PriorityQueue<>();
		Map<String, Integer> map = new TreeMap<>();
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());

			String name = st.nextToken();
			int value = Integer.parseInt(st.nextToken());
			
			map.put(name, map.getOrDefault(name, 0) + value);
		}
		
		for (String goods : map.keySet()) 
			que.add(new goods(goods, map.get(goods)));
		
		
		
		while(!que.isEmpty()) 
			System.out.println(que.peek().name + " " + que.poll().value);
	}
	
	// 3277번 - DOMAINS 
	public static void test08() throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); 

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String address = sc.nextLine().trim();

            if (address.startsWith("http://")) 
                address = address.substring(7);
            

            String domain = address.split("/")[0].split("\\.")[address.split("/")[0].split("\\.").length - 1];

            map.put(domain, map.getOrDefault(domain, 0) + 1);
        }

        int maxFreq = Collections.max(map.values());
        List<String> mostVisited = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFreq) 
                mostVisited.add(entry.getKey());
            
        }

        System.out.println(maxFreq);
        System.out.println(String.join(" ", mostVisited));
		
	}
	
	// 
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
	}
	
	// 
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
	}
	
	
	
}
