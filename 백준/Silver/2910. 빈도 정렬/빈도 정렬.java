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
		test01();
	}

	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		Map<Integer, Integer> inputArr = new HashMap<>();
		Map<Integer, Integer> bindoMap = new HashMap<>();
		
		st = new StringTokenizer(br.readLine());
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			
			int number = Integer.parseInt(st.nextToken());
			
			bindoMap.put(number, bindoMap.getOrDefault(number, 0) + 1);
			if(inputArr.containsKey(number)) continue;
			inputArr.put(number, cnt);
			cnt++;
		}
		

		List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(bindoMap.entrySet());
		entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				
				if(o2.getValue() == o1.getValue()) {
					return inputArr.get(o1.getKey()) - inputArr.get(o2.getKey());
				}
				return o2.getValue() - o1.getValue();
			}
		});
		
		for(int i = 0; i < entryList.size(); i++) {
			
			for(int j = 0; j < entryList.get(i).getValue(); j++) {
				System.out.print(entryList.get(i).getKey() + " ");
			}
			
		}
	}
}
