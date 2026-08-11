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
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
		PriorityQueue<Integer> pq2 = new PriorityQueue<>();
		Queue<Integer> q = new LinkedList<>();
		 
		st = new StringTokenizer(br.readLine());
		while(N --> 0) pq1.add(Integer.parseInt(st.nextToken()));
		
		charge(pq1, pq2, M);
        
        int ans = 0;
        while(!pq2.isEmpty()) {
            int t = pq2.peek();

            for(int i = 0; i < M; i++) {
            	
                if(pq2.peek() - t == 0) pq2.poll();
                else q.add(pq2.poll() - t);
                
                if(pq2.isEmpty()) break;
            }

            while(!q.isEmpty()) pq2.add(q.poll());

            ans += t;

            charge(pq1, pq2, M);
        }
        
        System.out.println(ans);
	}

    private static void charge(PriorityQueue<Integer> pq1, PriorityQueue<Integer> pq2, int M) {
        while(pq2.size() != M) {
            if(pq1.isEmpty()) break;
            pq2.add(pq1.poll());
        }
    }
}
