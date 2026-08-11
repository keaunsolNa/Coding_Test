package baekjoon_Class01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Class02 {

	public static void main(String[] args) throws IOException {
		test30();
	}
	
    
	// 수자 카드 2
	public static void test30() throws NumberFormatException, IOException {
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
