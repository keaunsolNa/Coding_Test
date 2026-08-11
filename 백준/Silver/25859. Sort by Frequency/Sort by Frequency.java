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
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Map<Character, Integer> map = new HashMap<>();
		String input = br.readLine();
		
		for(int i = 0; i < input.length(); i++) {
			map.put(input.charAt(i), map.getOrDefault(input.charAt(i), 0) + 1);
		}

		List<Entry<Character, Integer>> list_entries = new ArrayList<Entry<Character, Integer>>(map.entrySet());

		Collections.sort(list_entries, new Comparator<Entry<Character, Integer>>() {
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				
				if(o1.getValue() == o2.getValue()) {
					return o1.getKey() - o2.getKey();
				}
				else return o2.getValue().compareTo(o1.getValue());
			}
		});

		for (Entry<Character, Integer> entry : list_entries) {
			for(int i = 0; i < entry.getValue(); i++) sb.append(entry.getKey());
		}
		
		System.out.println(sb);
	}
}
