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
		test02();
	}

	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i = 0; i < n; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int order = Integer.parseInt(st.nextToken());
			
			if(order == 0) {
				
				if(pq.isEmpty()) sb.append(-1);
				else sb.append(pq.poll());
				
				sb.append("\n");
				
			} else {
				
				while(st.hasMoreTokens()) pq.add(Integer.parseInt(st.nextToken()));
				
			}
			
		}
		
		System.out.println(sb);
	}
}
