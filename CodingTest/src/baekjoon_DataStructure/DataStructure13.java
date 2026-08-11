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
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeSet;

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
		test01();
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
	
	// 4881번 - 자리수의 제곱
	private static ArrayList<Node> list[];
	
	
	// 1043번 - 거짓말
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		ArrayList<Integer> know = new ArrayList<>();
		int answer;
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		ArrayList<Integer>[] party = new ArrayList[M];
		answer = M;
		
		st = new StringTokenizer(br.readLine());
		int cnt = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < cnt; i++) 
			know.add(Integer.parseInt(st.nextToken()));
		
		for(int i = 0; i < M; i++) {
			
			st = new StringTokenizer(br.readLine());
			cnt = Integer.parseInt(st.nextToken());
			party[i] = new ArrayList<>();
			
			for(int j = 0; j < cnt; j++) 
				party[i].add(Integer.parseInt(st.nextToken()));
			
		}
		
		Queue<Integer> q = new LinkedList<>();
		int[] partyCheck = new int[M];
		int[] peopleCheck = new int[N + 1];
		
		for(int i = 0; i < know.size(); i++) {
			
			q.add(know.get(i));
			peopleCheck[know.get(i)] = 1;
			
		}
		
		while(!q.isEmpty()) {
			
			int now = q.poll();
			for(int i = 0; i < M; i++) {
				
				if(partyCheck[i] == 1) continue;
				
				if(!party[i].contains(now)) continue;
				
				for(int j = 0; j < party[i].size(); j++) {
					
					if(peopleCheck[party[i].get(j)] == 1) continue;
					
					peopleCheck[party[i].get(j)] = 1;
					q.add(party[i].get(j));
				}
				
				partyCheck[i] = 1;
				answer--;
			}
		}
		
		
		System.out.println(answer);
	}
	
	private static Map<Long, Long> map = new HashMap<>();
	
	
}
