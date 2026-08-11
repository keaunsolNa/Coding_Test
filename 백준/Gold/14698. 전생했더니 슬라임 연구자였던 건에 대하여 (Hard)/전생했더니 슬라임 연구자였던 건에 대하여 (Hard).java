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
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		while(T --> 0) {
			
			int N = Integer.parseInt(br.readLine());
			PriorityQueue<Long> pq = new PriorityQueue<>();
			st = new StringTokenizer(br.readLine());
			while(N --> 0) pq.add(Long.parseLong(st.nextToken()));
			
			long ans = 1;
			
			while(pq.size() > 1) {
				long temp1 = pq.poll();
				long temp2 = pq.poll();
				long temp = temp1 * temp2;
				
				ans *= temp % 1000000007;
				ans %= 1000000007;
				
				pq.add(temp);
			}
			
			sb.append(ans + "\n");
		}
		
		System.out.println(sb);
	}
}
