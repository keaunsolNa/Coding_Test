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
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			int K = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			PriorityQueue<Long> pq = new PriorityQueue<>();
			
			while(K --> 0) pq.add(Long.parseLong(st.nextToken()));
			
			long ans = 0;
			while(pq.size() > 1) {
				long temp1 = pq.poll();
				long temp2 = pq.poll();
				
				ans += temp1 + temp2;
				pq.add(temp1 + temp2);
			}
			
			sb.append(ans + "\n");
		}
		
		System.out.println(sb);
	}
}
