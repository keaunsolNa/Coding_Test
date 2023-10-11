import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
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
	
   public static void main(String[] args) throws IOException {
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
}