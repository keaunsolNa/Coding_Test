import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		Map<String, List<Integer>> map = new HashMap<>();
		
		for(int i = 0; i < 51; i++ ) {
		
			st = new StringTokenizer(br.readLine());
			String card = st.nextToken();
			int number = Integer.parseInt(st.nextToken());

			if(map.get(card) == null) {
				
				List<Integer> list = new ArrayList<>();
				list.add(number);
				map.put(card, list);
				
			} else map.get(card).add(number);
			
		}
		
		for (String key : map.keySet()) {
			
			if(map.get(key).size() == 13) continue;
			
			else 
				for(int i = 1 ; i <= 13; i++) 
					if(!map.get(key).contains(i)) {
						System.out.println(key + " " + i);
						return;
					}
		}
   }
}