package baekjoon_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.PriorityQueue;
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
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		test03();
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
	
	// 
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
	}
	
	
}
