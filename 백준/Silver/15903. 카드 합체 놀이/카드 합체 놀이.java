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
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Long> pq = new PriorityQueue<Long>();
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) pq.add(Long.parseLong(st.nextToken()));
		
		while(m --> 0) {
			
			long a = pq.poll();
			long b = pq.poll();
			pq.add(a + b);
			pq.add(a + b);
			
		}
		
		long total = 0;
		for (Long l : pq) total += l;
		
		System.out.println(total);
	}
}
