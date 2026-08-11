package baekjoon_DataStructure;

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

public class DataStructure09 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test03();
	}
	
	
	// 25327번 - 다중 항목 선호도 조사 (Large), F
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		List<String[]> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) list.add(br.readLine().split(" "));

		for(int i = 0; i < m; i++) {
			String[] query = br.readLine().split(" ");
			
			int cnt = 0;
			boolean check;
			
			for(int j = 0; j < list.size(); j++) {
				
				check = true;
				
				for(int k = 0; k < 3; k++) {
					
					if(query[k].charAt(0) != '-' && query[k].charAt(0) != list.get(j)[k].charAt(0)) {
						check = false;
						break;
					}
				}
				
				if(check) cnt++;
			}
			
			sb.append(cnt + "\n");
			
		}
		System.out.println(sb);
	}
	
	
	// 2493번 - 탑
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<int[]> stack = new Stack<>();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			int input = Integer.parseInt(st.nextToken());
			
			while(!stack.isEmpty()) {
				
				if(stack.peek()[1] >= input) {
					sb.append(stack.peek()[0] + " ");
					break;
				}
				stack.pop();
			}
			
			if(stack.isEmpty()) sb.append("0 ");
			
			stack.push(new int[] {i, input});
		}
		
		System.out.println(sb);
	}
	
	
}
