import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Map<List<String>, Integer> map = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			List<String> list = new ArrayList<>();
			
			for(int j = 0; j < 3; j++) list.add(st.nextToken());
			Collections.sort(list);
			
			map.put(list, map.getOrDefault(list, 0) + 1);
		}

		List<List<String>> keySet = new ArrayList<>(map.keySet());
		keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
		
		System.out.println(map.get(keySet.get(0)));
   }
}