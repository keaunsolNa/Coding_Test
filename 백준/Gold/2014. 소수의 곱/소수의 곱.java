import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		long[] primary = new long[K]; 
		PriorityQueue<Long> pq = new PriorityQueue<>();
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < K; i++) {
			primary[i] = Long.parseLong(st.nextToken());
			pq.add(primary[i]);
		}
		
		long head = 0;
		
		for(int i = 0; i < N; i++) {
			
			head = pq.poll();
			for(int j = 0; j < K; j++) {
				long value = head * primary[j];
				pq.add(value);
				
				if(head % primary[j] == 0) break;
			}
		}
		
		System.out.println(head);
   }
}