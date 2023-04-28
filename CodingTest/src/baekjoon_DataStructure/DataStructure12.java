package baekjoon_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

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
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
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
			int classNo = Integer.parseInt(st.nextToken());
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
    
	// 
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
	}
	
	
	// 
	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
	}
	
	
	
}
