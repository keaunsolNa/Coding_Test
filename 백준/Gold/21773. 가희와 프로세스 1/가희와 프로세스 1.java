import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		PriorityQueue<process> pq = new PriorityQueue<>();
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			
			pq.add(new process(A, B, C));
		}
		
		while(T --> 0) {
			process temp = pq.poll();
			sb.append(temp.pid + "\n");
			temp.priority -= 1;
			temp.needTime -= 1;
			
			if(temp.needTime != 0) pq.add(temp);
		}
		
		System.out.println(sb);
	}

	private static class process implements Comparable<process> {
		
		int pid;
		int needTime;
		int priority;
		
		process(int pid, int needTime, int priority) {
			this.pid = pid;
			this.needTime = needTime;
			this.priority = priority;
		}
		
		@Override
		public int compareTo(process o) {

			if(this.priority == o.priority) {
				return this.pid - o.pid;
			}
			
			return o.priority - this.priority;
		}
		
	}
}
