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
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new TreeMap<>();
		
		while(N --> 0) {
			
			String[] input = br.readLine().split(" ");
			
			int round = 0;
			String color = "";
			
			try {
				round = Integer.parseInt(input[0])/2;
				color = input[1];
			} catch(Exception e) {
				color = input[0];
				round = Integer.parseInt(input[1]);
			}
			
			map.put(color, round);
			
			
		}
		
		List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
		
		entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				
				return o1.getValue() - o2.getValue();
			}
		});
		
		for(int i = 0; i < entryList.size(); i++) System.out.println(entryList.get(i).getKey());
	}
}
