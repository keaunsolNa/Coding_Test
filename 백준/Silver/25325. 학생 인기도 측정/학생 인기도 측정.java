import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Map<String, Integer> studentMap = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			studentMap.put(st.nextToken(), 0);
		}
		
		for(int i = 0; i < N; i++) {
			String[] temp = br.readLine().split(" ");
			
			for(int j = 0; j < temp.length; j++) {
				studentMap.put(temp[j], studentMap.getOrDefault(temp[j], 0)+1);
			}
		}

		String[] arr = new String[N];
		Iterator<String> iterName = studentMap.keySet().iterator();
		Iterator<Integer> iterValue = studentMap.values().iterator();

		int cnt = 0;
		while(iterName.hasNext()) {
			arr[cnt] = iterName.next() + " " + iterValue.next();
			cnt++;
		}

		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				String[] one = o1.split(" ");
				String[] two = o2.split(" ");
				
				if(Integer.parseInt(one[1]) == Integer.parseInt(two[1])) {
					
					return one[0].compareTo(two[0]);
					
				} 
				else
				return Integer.parseInt(two[1]) - Integer.parseInt(one[1]);
				
			}
			
		});

		for (String str : arr) {
			System.out.println(str);
		}
		
		
	}
}
