import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    	private static class Jewelry {
		
		int m;
		int v;
		
		Jewelry(int m, int v) {
			this.m = m;
			this.v = v;
		}
		
	}
    
   public static void main(String[] args) throws IOException {
 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Jewelry[] jewelries = new Jewelry[N];
		
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			jewelries[i] = new Jewelry(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			
		}
		
        Arrays.sort(jewelries, new Comparator<Jewelry>() {
        	 
            @Override
            public int compare(Jewelry o1, Jewelry o2) {
                if (o1.m == o2.m) {
                    return o2.v - o1.v;
                }
                return o1.m - o2.m;
            }
 
        });
		
        int[] pack = new int[K];
        for (int i = 0; i < K; i++) pack[i] = Integer.parseInt(br.readLine());
        Arrays.sort(pack);
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        long ans = 0;
        for (int i = 0, j = 0; i < K; i++) {
        	
            while (j < N && jewelries[j].m <= pack[i]) pq.offer(jewelries[j++].v);
            if (!pq.isEmpty()) ans += pq.poll();
            
        }
		
		System.out.println(ans);
   }
}