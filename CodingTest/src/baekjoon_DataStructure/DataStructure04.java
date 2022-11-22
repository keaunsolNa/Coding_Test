package baekjoon_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class DataStructure04 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test02();
	}
	
	// 차집합
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

	
	// 동일한 단어 그룹화하기
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	}

	// 베스트셀러
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
	}

	// 사이클 단어
	public static void test05() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
	}

	// 도키도키 간식드리미
	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	}

	// Router 
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
	}

	// 비밀번호 찾기
	public static void test08() throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
	}

	// 인사성 밝은 곰곰이
	public static void test09() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
	}

	// 배부른 마라토너
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
	}





}
