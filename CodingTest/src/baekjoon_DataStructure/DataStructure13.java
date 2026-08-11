package baekjoon_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class DataStructure13 {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		test01();
	}

	// 27659번 - Queue skipping (Easy)
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			br.readLine();
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			List<Integer> list = new ArrayList<>();
			for(int i = 1; i <= n; i++) list.add(i);
			
			for(int i = 0; i < e; i++) {
				int number = Integer.parseInt(br.readLine());
				
				list.remove(Integer.valueOf(number));
				list.add(0, number);
			}
			
			System.out.println(list.get(list.size() - 1));
		}
		
	}
	
	
}
