import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

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
    
    private static int parents[];
   public static void main(String[] args) throws IOException {
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
}