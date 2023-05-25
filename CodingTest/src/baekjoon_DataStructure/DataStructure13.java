package baekjoon_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class DataStructure13 {

	private static class Pair implements Comparable<Pair>{

		int first;
		int second;
		
		public Pair(int first, int second) {
			this.first = first;
			this.second = second;
		}

		@Override
		public int compareTo(Pair o) {
			
			if(this.first == o.first) 
				return this.second - o.second;
			
			else return this.first - o.first;
		}

	}
	
	private static class Node {
		int N;
		int C;
		
		public Node(int N, int C) {
			this.N = N;
			this.C = C;
		}
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	// 27659번 - Queue skipping (Easy)
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			br.readLine();
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			List<Integer> list = new ArrayList<>();
			for(int i = 1; i <= n; i++) list.add(i);
			
			for(int i = 0; i < e; i++) {
				int number = Integer.parseInt(br.readLine());
				
				list.remove(Integer.valueOf(number));
				list.add(0, number);
			}
			
			System.out.println(list.get(list.size() - 1));
		}
		
	}
	
	// 2812번 - 크게 만들기
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		char[] arr = br.readLine().toCharArray();
		Deque<Character> dq = new ArrayDeque<>();
		
		for(int i = 0; i < N; i++) {
			
			while(K > 0 && !dq.isEmpty() && dq.getLast() < arr[i]) {
				dq.removeLast();
				K--;
			}
			dq.addLast(arr[i]);
		}
		
        while (dq.size() > K) sb.append(dq.removeFirst());
		
        System.out.println(sb);
	}
	
	// 14595번 - 동방 프로젝트 (Large)
	private static int parents[];
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		
		parents = new int[N + 1];
		
		for(int i = 0;i <= N; i++) parents[i] = i;
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			pq.add(new Pair(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		
		int right = 0;
		int a; 
		int b;
		
		while(!pq.isEmpty()) {
			Pair pair = pq.poll();
			a = pair.first;
			b = pair.second;

			if(a < right) a = right;

			for(int i = a; i <= b; i++) union(a,i);
			
			if(b > right) right = b;
			
		}
		
		int count=0;
		for(int i = 1; i <= N; i++) if(i == parents[i]) count++;
		
		System.out.println(count);

		
	}
	
	static int findSet(int a) {
		
		if(a == parents[a]) return a;
		return parents[a] = findSet(parents[a]);
		
	}
	
	static void union(int a, int b) {
		
		a = findSet(a);
		b = findSet(b);
		
		if(a != b) parents[b] = a;
	}
	
	// 5052번 - 전화번호 목록
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			int n = Integer.parseInt(br.readLine());
			String[] arr = new String[n];

			for(int i = 0; i < n; i++) arr[i] = br.readLine();
			
			Arrays.sort(arr);
			boolean chk = true;
			
			for(int i = 0; i < n - 1; i++) {
				
				if(arr[i + 1].startsWith(arr[i])) chk = false;
				if(!chk) break;
				
			}
			
			System.out.println(chk ? "YES" : "NO");
		}
				
	}
	
	// 3078번 - 좋은 친구
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		long ans = 0;
		
		for(int i = 0; i < N; i++) {
			
			int len = br.readLine().length();
			
			if(map.containsKey(len)) {
				List<Integer> list = map.get(len);
				
				for(int j = 0; j < list.size(); j++) {
					
					if(i - list.get(j) <= K) {
						
						ans += list.size();
						break;
						
					}
					
					else list.remove(j--);
				}
				
			} else map.put(len, new ArrayList<>());
			
			map.get(len).add(i);
		} 
		
		System.out.println(ans);
		
	}
	
	// 
	private static ArrayList<Node> list[];
	private static boolean[] visited;
	private static int start;
	private static int end;
	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[N + 1];
		for(int i = 0; i < N + 1; i++) list[i] = new ArrayList<>();
		
		int max = 0;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			
			max = Math.max(C, max);
			min = Math.min(C, min);
			
			list[A].add(new Node(B, C));
			list[B].add(new Node(A, C));
			
		}
		
		st = new StringTokenizer(br.readLine());
		start = Integer.parseInt(st.nextToken());
		end = Integer.parseInt(st.nextToken());
		
		int result = 0;
		while(min <= max) {
			
			int mid = (min + max) / 2;
			visited = new boolean[N + 1];
			
			if(bfs(mid)) {
				
				min = mid + 1;
				result = mid;
			} else max = mid - 1;
			
		}
		
		System.out.println(result);
		
	}
	
	public static boolean bfs(int mid) {
		
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);
		visited[start] = true;
		
		while(!q.isEmpty()) {
			
			int temp = q.poll();
			
			if(temp == end) return true;
			
			for(int i = 0; i < list[temp].size(); i++) {
				if(list[temp].get(i).C >= mid && visited[list[temp].get(i).N] == false) {
					
					visited[list[temp].get(i).N] = true;
					q.offer(list[temp].get(i).N);
				}
			}
		}
		return false;
	}
	
	// 
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
	}
	
	// 
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
	}
	
	
}
