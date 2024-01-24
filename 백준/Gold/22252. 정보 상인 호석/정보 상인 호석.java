import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int Q = Integer.parseInt(br.readLine());
		Map<String, PriorityQueue<Integer>> map = new HashMap<>();
		long answer = 0;
		
		while(Q --> 0) {
			
			st = new StringTokenizer(br.readLine());
			int number = Integer.parseInt(st.nextToken());
			
			String name = st.nextToken();
			int count = Integer.parseInt(st.nextToken());
			
			if(number == 1) {
				
				for(int i = 0; i < count; i++) {
					
					if(map.containsKey(name)) map.get(name).add(Integer.parseInt(st.nextToken()));
					
					else {
						
						PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
						pq.add(Integer.parseInt(st.nextToken()));
						map.put(name, pq);
						
					}
				}
				
			}
			
			else {
				
				if(map.containsKey(name)) {
					
					while(!map.get(name).isEmpty() && count > 0) {
						answer += map.get(name).poll();
						count--;
					}
				}
			}
		}
		
		System.out.println(answer);
   }
}