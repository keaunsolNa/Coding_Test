package baekjoon_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class DataStructure02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test02();
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
	

	// 단어순서 뒤집기1
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


	// 阿吽の呼吸
	public static void test08() throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Deque<String> deque = new LinkedList<>();
		for(int i = 0; i < N; i++) {
			deque.add(br.readLine());
			if(deque.peekLast().equals("Un")) {
				if(deque.peekFirst().equals("A")) {
					deque.pollFirst();
					deque.pollLast();
				}
			}
		}

		if(deque.isEmpty()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
	}


}
