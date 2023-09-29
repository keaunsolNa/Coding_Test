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

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
        PriorityQueue<int[]> question = new PriorityQueue<>(new Comparator<int[]>() {
        	
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        
        while (N --> 0) {
        	
            st = new StringTokenizer(br.readLine());
            int D = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int T = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            
            if (T == 1) P = 0;
            
            question.add(E == 1 ? new int[]{D / 2 + D % 2, P / 2} : new int[]{D, P});
            
        }
        
        st = new StringTokenizer(br.readLine());
        int hd = Integer.parseInt(st.nextToken());
        int hp = Integer.parseInt(st.nextToken());
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long ans = 0;
        
        while (M --> 0) {
            while (!question.isEmpty() && question.peek()[0] <= hd) pq.add(question.poll()[1]);
            
            if (pq.isEmpty()) { 
            	
            	System.out.println(-1); 
            	System.exit(0); 
            	
        	}
            
            int p = pq.poll();
            if (p > hp) ans += p-hp;
            hd += 1; 
            hp += 1;
            
        }
        
        System.out.println(ans);
   }
}