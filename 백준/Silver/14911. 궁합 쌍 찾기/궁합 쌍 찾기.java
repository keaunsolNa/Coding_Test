import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(br.readLine().split(" ")).map(String::trim).mapToInt(Integer::parseInt).toArray();
		
		int target = Integer.parseInt(br.readLine());
		Map<Integer, Integer> map = new TreeMap<>();
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr.length; j++) {
				
				if(i == j) continue;
				
				if(arr[i] + arr[j] == target) {
					if(arr[i] >= arr[j]) map.put(arr[j], arr[i]);
					else map.put(arr[i], arr[j]);
				}
			}
		}
		
		List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
		entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				
				if(o2.getKey() == o1.getKey()) 
					return o1.getValue() - o2.getValue();
				return o1.getKey() - o2.getKey();
			}
		});
		
		for (Entry<Integer, Integer> entry : entryList) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.print(entryList.size());
	}
}
