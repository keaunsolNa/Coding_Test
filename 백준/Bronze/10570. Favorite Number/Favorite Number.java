import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			int V = Integer.parseInt(br.readLine());
			Map<Integer, Integer> map = new HashMap<>();
			
			for(int j = 0; j < V; j++) {
				int temp = Integer.parseInt(br.readLine());
				map.put(temp, map.getOrDefault(temp, 0) + 1);
			}
			List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
			entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
			    @Override
			    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
			    	if(o2.getValue() == o1.getValue()) {
			    		return o1.getKey() - o2.getKey();
			    	} else {
			    		return o2.getValue() - o1.getValue();
			    	}
			    }
			});
			
			System.out.println(entryList.get(0).getKey());
			
		}
		
	}
}
