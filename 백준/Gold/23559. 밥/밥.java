import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    
	private static class flavor implements Comparable<flavor> {
		
		int a;
		int b;
		int dif;
		
		flavor(int a, int b, int dif) {
			this.a = a;
			this.b = b;
			this.dif = dif;
		}
		
		@Override
		public int compareTo(flavor o) {
			
			if(this.dif != o.dif) return this.dif - o.dif;
			return this.a - o.a;
		}
		
		
	}
    
   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		PriorityQueue<flavor> pq = new PriorityQueue<>(Comparator.reverseOrder());
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			pq.add(new flavor(A, B, A - B));
		}

		int ans = 0;
		int restDay = N - 1;
		for(int i = 0; i < N; i++) {
			
			flavor temp = pq.poll();
			
			if(temp.dif <= 0) {
				ans += temp.b;
				X -= 1000;
			}
			
			else if(X - 5000 >= restDay * 1000) {
				ans += temp.a;
				X -= 5000;
			}
			
			else {
				ans += temp.b;
				X -= 1000;
			}
			
			restDay--;
		}
		
		System.out.println(ans);
   }
}