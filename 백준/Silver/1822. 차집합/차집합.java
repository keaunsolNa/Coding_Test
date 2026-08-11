import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test01();
	}

	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		Map<Integer, Integer> map = new HashMap<>();
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < A; i++) {
			map.put(Integer.parseInt(st.nextToken()), 1);
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < B; i++) {
			int key = Integer.parseInt(st.nextToken());
			if(map.containsKey(key)) {
				map.remove(key);
			} 
		}
		
		List<Integer> arrayList = new ArrayList<>();
		for (Integer integer : map.keySet()) {
			arrayList.add(integer);
		}

		Collections.sort(arrayList);
		
		System.out.println(arrayList.size());
		StringBuilder sb = new StringBuilder();
		for (Integer integer : arrayList) {
			sb.append(integer).append(" ");
		}

		System.out.println(sb);
		
	}
}
