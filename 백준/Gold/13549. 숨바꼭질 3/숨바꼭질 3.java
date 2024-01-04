import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	private static class State {
		public int position;
		public int time;
		
		public State(int position, int time) {
			this.position = position;
			this.time = time;
		}
	}
	
	private static int n, k, minTime;
	private static final int MAX = 100000, INF = 100000;
	private static int[] visited = new int[MAX + 1];
	private static Queue<State> queue = new LinkedList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		if(n >= k) minTime = n - k;
		else bfs();
		
		System.out.println(minTime);
	}
	
	private static void bfs() {
		
		Arrays.fill(visited, INF);
		visited[n] = 0;
		queue.add(new State(n, 0));
		
		while(!queue.isEmpty()) {
			
			State cur = queue.remove();
			
			int np1 = cur.position - 1;
			
			if(valid(np1) && visited[np1] > cur.time + 1) {
				visited[np1] = cur.time + 1;
				queue.add(new State(np1, visited[np1]));
			}
			
			int np2 = cur.position + 1;
			
			if(valid(np2) && visited[np2] > cur.time + 1) {
				visited[np2] = cur.time + 1;
				queue.add(new State(np2, visited[np2]));
			}
			
			int np3 = cur.position * 2;
			if(valid(np3) && visited[np3] > cur.time) {
				visited[np3] = cur.time;
				queue.add(new State(np3, visited[np3]));
			}
		}
		
		minTime = visited[k];
	}
	
	private static boolean valid(int position) {
		return 0 <= position && position <= MAX;
	}

}