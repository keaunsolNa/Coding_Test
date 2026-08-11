import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	private static int N;
	private static int K;

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			int K = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			PriorityQueue<runner> pq = new PriorityQueue<>();
			List<Integer> runner = new ArrayList<>();
			
			for(int i = 0; i < K; i++) runner.add(Integer.parseInt(st.nextToken()));
			
			int N = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < N; i++) {
				
				st = new StringTokenizer(br.readLine());
				
				int number = Integer.parseInt(st.nextToken());
				int t = Integer.parseInt(st.nextToken());
				int m = Integer.parseInt(st.nextToken());
				
				int time = t * 60 + m;
				
				if(time > 0 && time <= 360 && runner.contains(number)) {
					pq.add(new runner(number, time));
				}
			}
			
			System.out.println(pq.peek().number + " " +  pq.size());
		}
	}

	private static class runner implements Comparable<runner> {
		int number = 0;
		int time = 0;
		
		runner(int number, int time){
			this.number = number;
			this.time = time;
		}
		
		@Override
		public int compareTo(runner o) {
			
			return this.time - o.time;
		}
		
	}
}
