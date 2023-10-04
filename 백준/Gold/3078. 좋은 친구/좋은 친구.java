import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		long ans = 0;
		
		for(int i = 0; i < N; i++) {
			
			int len = br.readLine().length();
			
			if(map.containsKey(len)) {
				List<Integer> list = map.get(len);
				
				for(int j = 0; j < list.size(); j++) {
					
					if(i - list.get(j) <= K) {
						
						ans += list.size();
						break;
						
					}
					
					else list.remove(j--);
				}
				
			} else map.put(len, new ArrayList<>());
			
			map.get(len).add(i);
		} 
		
		System.out.println(ans);
   }
}