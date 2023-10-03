
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
    
    	private static class GasStation implements Comparable<GasStation> {
		
		int distance;
		int canFill;
		
		GasStation(int distance, int canFill) {
			this.distance = distance;
			this.canFill = canFill;
		}

		@Override
		public int compareTo(GasStation o) {
			
			return this.distance - o.distance;
		}
		
		
	}
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<GasStation> pq = new PriorityQueue<>();
		while(N --> 0) {
			
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken()); 
			
			pq.add(new GasStation(a, b));
		}
		
		st = new StringTokenizer(br.readLine());
		int L = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
	
		PriorityQueue<Integer> fuels = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;
        
        while (P < L) {
            
        	while (!pq.isEmpty() && pq.peek().distance <= P) fuels.add(pq.poll().canFill);
            

            if (fuels.isEmpty()) {
                System.out.println(-1);
                return;
            }

            answer++;
            P += fuels.poll();
    
        }

        System.out.println(answer);
	}
}
