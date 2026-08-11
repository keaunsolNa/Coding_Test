import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		PriorityQueue<goods> que = new PriorityQueue<>();
		Map<String, Integer> map = new TreeMap<>();
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());

			String name = st.nextToken();
			int value = Integer.parseInt(st.nextToken());
			
			map.put(name, map.getOrDefault(name, 0) + value);
		}
		
		for (String goods : map.keySet()) 
			que.add(new goods(goods, map.get(goods)));
		
		
		
		while(!que.isEmpty()) 
			System.out.println(que.peek().name + " " + que.poll().value);
	}

	private static class goods implements Comparable<goods> {
		String name;
		int value;
		
		goods(String name, int value) {
			this.name = name;
			this.value = value;
		}
		
		@Override
		public int compareTo(goods o) {
			
			if(this.name.length() == o.name.length()) return this.name.compareTo(o.name);
			else return this.name.length() - o.name.length();
		}
	}
}
