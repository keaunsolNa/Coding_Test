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
	
	private static class Node {
		int N;
		int C;
		
		public Node(int N, int C) {
			this.N = N;
			this.C = C;
		}
		
	}
	
    public static class Problem implements Comparable<Problem> {
        int idx;
        int level;

        public Problem(int idx, int level) {
            this.idx = idx;
            this.level = level;
        }

        public int compareTo(Problem o) {

            if (level - o.level == 0) return idx - o.idx;
            return level - o.level;
        }

    }
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
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
	
	// 4881번 - 자리수의 제곱
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
	
	// 21939번 - 문제 추천 시스템 Version 1
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		TreeSet<Problem> ts = new TreeSet<>();
        Map<Integer,Integer> map = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int P = Integer.parseInt(st.nextToken());
			int L = Integer.parseInt(st.nextToken());
			
            ts.add(new Problem(P, L));
            map.put(P,L);
		}
		
		int m = Integer.parseInt(br.readLine());
		
        for (int i = 0; i < m; i++) {
        	
        	st = new StringTokenizer(br.readLine());
        	String command = st.nextToken();
        	
            if (command.equals("add")) {
            	
                int P = Integer.parseInt(st.nextToken());
                int L = Integer.parseInt(st.nextToken());
                
                ts.add(new Problem(P, L));
                map.put(P,L);
                
            } else {
            	
                if (command.equals("recommend")) {
                	
                    if (Integer.parseInt(st.nextToken()) == 1) sb.append(ts.last().idx + "\n");
                    else sb.append(ts.first().idx + "\n");
                    
                } else {
                	
                    int L = Integer.parseInt(st.nextToken());
                    ts.remove(new Problem(L,map.get(L)));
                    map.remove(L);
                    
                }
            }
        }
	
        System.out.println(sb);
	}
	
	// 2358번 - 평행선
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> x = new HashMap<Integer, Integer>();
        Map<Integer, Integer> y = new HashMap<Integer, Integer>();

        int count = 0;
        
        for(int i = 0; i < n; i++) {
         
        	st = new StringTokenizer(br.readLine());
            int input_x = Integer.parseInt(st.nextToken());
            int input_y = Integer.parseInt(st.nextToken());

            if(x.containsKey(input_x)) x.put(input_x, x.get(input_x) + 1);
            else  x.put(input_x, 1);
            

            if(y.containsKey(input_y)) y.put(input_y, y.get(input_y) + 1);
            else y.put(input_y, 1);
            
        }

        for(int key : x.keySet()) 
            if(x.get(key) > 1) count++;

        for(int key : y.keySet()) 
            if(y.get(key) > 1) count++;

        System.out.println(count);
	}
	
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
	
	// 1351번 - 무한 수열
	private static int P;
	private static int Q;
	private static Map<Long, Long> map = new HashMap<>();
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long N = Long.parseLong(st.nextToken());
		P = Integer.parseInt(st.nextToken());
		Q = Integer.parseInt(st.nextToken());
		
		System.out.println(solve(N));;
		
		
	}
	
	private static long solve(long num) {
		if(num == 0) return 1;
		if(map.containsKey(num)) return map.get(num);
		
		long a = (long)Math.floor(num / P);
		long b = (long)Math.floor(num / Q);
		
		map.put(num, solve(a) + solve(b));
		
		return map.get(num);
	}
	
}
