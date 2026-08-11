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
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class DataStructure04 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test02();
	}
	
	
	// Lamp
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int L = Integer.parseInt(st.nextToken());
		int G = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		Map<String, List<Integer>> map = new HashMap<>();
		for(int i = 0; i < G; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String name = st.nextToken();
			int a = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			List<Integer> lampList = new ArrayList<>();
			while(a <= L) {
				lampList.add(a);
				a += d;
			}
			map.put(name, lampList);
		}
		
		System.out.println("MAP : " + map);
		
		Map<String, Integer> patrolMap = new HashMap<>();
		for(int i = 0; i < R; i++) {
			String name = br.readLine();
			patrolMap.put(name, patrolMap.getOrDefault(name, 0) +1);
		}
		
		System.out.println("PM : " + patrolMap);
		
		Iterator<String> iter = patrolMap.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			if(patrolMap.get(key) % 2 == 0) {
				map.remove(key);
			}
		}
		System.out.println("AFTER MAP : " + map);
		
		Map<Integer, Integer> dupCheck = new HashMap<>();
		for(String key : map.keySet()) {
			for(int i = 0; i < map.get(key).size(); i++) {
				dupCheck.put(map.get(key).get(i), dupCheck.getOrDefault(map.get(key).get(i), 0) + 1);
			}
		}
		
		System.out.println("LIST : " + dupCheck);
		
		Iterator<Integer> iter2 = dupCheck.keySet().iterator();
		while(iter2.hasNext()) {
			Integer key = iter2.next();
			System.out.println(key);
			System.out.println(dupCheck);
			if(dupCheck.get(key) % 2 == 0) {
				dupCheck.remove(key);
				System.out.println(dupCheck);
				continue;
			}
		}
		System.out.println(dupCheck);
		System.out.println(dupCheck.size());
		
	}

	
	// Banana
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<String, String> vol = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			String[] text = br.readLine().split("=");
			vol.put(text[0].replaceAll(" ", ""), text[1].replaceAll(" ", ""));
		}
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < T; i++) {
			int K = Integer.parseInt(br.readLine());
			String[] input = br.readLine().split(" ");
			
			for(int j = 0; j < K; j++) {
				sb.append(vol.get(input[j])).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	// Bags
	public static void test05() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        Set<Integer> stack = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
        	stack.add(Integer.parseInt(st.nextToken()));
        }
        System.out.println(stack.size());
	}


}
