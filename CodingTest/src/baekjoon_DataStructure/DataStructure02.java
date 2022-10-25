package baekjoon_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class DataStructure02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}
	
	// 카드 1
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new LinkedList<>();
		
		for(int i = 1; i <= N; i++) {
			deque.add(i);
		}

		StringBuilder sb = new StringBuilder();
		while(deque.size() != 1) {
			sb.append(deque.pollFirst()).append(" ");
			
			if(deque.size() == 1) {
				break;
			} else {
				deque.add(deque.pollFirst());
			}
			
		}

		sb.append(deque.poll());
		System.out.println(sb);
	}
	
	// 카드 놓기
	static int[] result;
	static int[] target;
	static boolean[] visited;
	static Set<Integer> set = new LinkedHashSet<>();
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		target = new int[N];
		result = new int[K];
		visited = new boolean[N+1];
		
		for(int i = 0; i < N; i++) {
			target[i] = Integer.parseInt(br.readLine());
		}
		
		permutation(0, N, K);
		
		System.out.println(set.size());
		
	}

	public static void permutation(int cnt, int N, int K) {
		
		if(cnt == K) {
			String temp = "";
			for(int i = 0; i < result.length; i++) {
				temp += result[i] + "";
			}
			set.add(Integer.parseInt(temp));
			return;
		}
		for(int i = 0; i < N; i++) {
			if(!visited[i]) {
				visited[i] = true;
				result[cnt] = target[i];
				permutation(cnt + 1, N, K);
				visited[i] = false;
			}
		}
	}
	
	// 근무 지옥에 빠진 푸앙이 (Small)
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<String, Long> map = new HashMap<>();
		int time = 4;
		for(int i = 1; i < 4*N+1; i++) {
			if(i % 4 == 1) time = 4;
			if(i % 4 == 2) time = 6;
			if(i % 4 == 3) time = 4;
			if(i % 4 == 0) time = 10;
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < 7; j++) {
				String people = st.nextToken();
				if(people.equals("-")) continue;
				map.put(people, map.getOrDefault(people, (long) 0) + time);
			}
		}
		
		long min = 999999999;
		long max = 0;
		for (String name : map.keySet()) {
			if(map.get(name) > max) {
				max = map.get(name);
			}
			if(map.get(name) < min) {
				min = map.get(name);
			}
		}
		if(max - min > 12) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}

	// 근무 지옥에 빠진 푸앙이 (Large)
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<String, BigInteger> map = new HashMap<>();
		BigInteger value = new BigInteger("0");
		String time = "4";
		for(int i = 1; i < 4*N+1; i++) {
			if(i % 4 == 1) time = "4";
			if(i % 4 == 2) time = "6";
			if(i % 4 == 3) time = "4";
			if(i % 4 == 0) time = "10";
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < 7; j++) {
				String people = st.nextToken();
				if(people.equals("-")) continue;
				map.put(people, map.getOrDefault(people, value).add(new BigInteger(time)));
			}
		}
		BigInteger min = new BigInteger("9999999999999999999999999999");
		BigInteger max = new BigInteger("0");
		for (String name : map.keySet()) {
			if(map.get(name).compareTo(max) == 1) {
				max = map.get(name);
			}
			if(map.get(name).compareTo(min) == -1) {
				min = map.get(name);
			}
		}
		if(max.compareTo(min.add(new BigInteger("12"))) == 1) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}

	// 단어순서 뒤집기
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int people = Integer.parseInt(temp[0]);
		String game = temp[1];
		int maxPeople = 0;
		
		switch(game) {
			case "Y" : maxPeople = 1; break;
			case "F" : maxPeople = 2; break;
			case "O" : maxPeople = 3; break;
		}
		
		Set<String> peopleSet = new HashSet<>();
		for(int i = 0; i < people; i++) {
			peopleSet.add(br.readLine());
		}
		
		System.out.println(peopleSet.size()/maxPeople);

	}

	// 국회의원 선거
	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	}

	// 회사에 있는 사람
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	}

	// 학생 인기도 측정
	public static void test08() throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		
	}

	// CD
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
	}

	// 큐 2
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
	}





}
