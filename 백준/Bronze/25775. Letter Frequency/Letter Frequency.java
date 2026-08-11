import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test06();
	}

	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int maxL = 0;
		String[] arr = new String[T];

		for(int i = 0; i < T; i++) {
			
			String input = br.readLine();
			arr[i] = input;
			maxL = Math.max(maxL, input.length());
		}
		
		for(int i = 0; i < maxL; i++) {
			Map<Character, Integer> map = new HashMap<>();
			for(int j = 0; j < T; j++) {
				
				if(arr[j].length() > i) map.put(arr[j].charAt(i), map.getOrDefault(arr[j].charAt(i), 0) + 1);
			}
			
			List<Map.Entry<Character, Integer>> entryList = new LinkedList<>(map.entrySet());

			entryList.sort(new Comparator<Map.Entry<Character, Integer>>() {
			    @Override
			    public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
			    	
			    	if(o2.getValue() == o1.getValue()) {
			    		return Character.getNumericValue(o1.getKey()) - Character.getNumericValue(o2.getKey());
			    	}
			    	return o2.getValue() - o1.getValue();
			    }
			});
			
			sb.append((i + 1)+ ": ");
			int idx = entryList.get(0).getValue();
			for(int k = 0; k < entryList.size(); k++) {
				
				if(entryList.get(k).getValue() == idx) sb.append(entryList.get(k).getKey() + " ");
			}
			sb.deleteCharAt(sb.length() - 1);
			sb.append("\n");
		}
		
		System.out.print(sb);
		
	}
}
