package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Test13_SetAndMap {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test01();
	}
	
	// 숫자 카드
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			int temp = Integer.parseInt(st.nextToken());
			map.put(temp, map.getOrDefault(temp, 0) + 1);
		}

		int M = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < M; i ++) {
			int temp = Integer.parseInt(st.nextToken());
			if(map.containsKey(temp)){
				sb.append(1).append(" ");
			} else {
				sb.append(0).append(" ");
			}
		}
		
		System.out.println(sb);
	}
	

	// 숫자 카드 2
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<Integer, Integer> hashMap = new HashMap<>();	
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int temp = Integer.parseInt(st.nextToken());
			hashMap.put(temp, hashMap.getOrDefault(temp, 0) + 1);	
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < M; i++) {
			int temp = Integer.parseInt(st.nextToken());
			int answer = 0;
			
			try {
				answer = hashMap.get(temp);
			} catch(java.lang.NullPointerException e) {
				answer = 0;
			}
			sb.append(answer + " ");
		}
		
		System.out.println(sb);
	}


}
