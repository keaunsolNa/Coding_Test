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

public class Main {

    private static class Node {
		int N;
		int C;
		
		public Node(int N, int C) {
			this.N = N;
			this.C = C;
		}
		
	}
	
    
    private static ArrayList<Node> list[];
	private static boolean[] visited;
	private static int start;
	private static int end;
   public static void main(String[] args) throws IOException {
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
	
}