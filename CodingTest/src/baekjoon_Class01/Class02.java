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
		test38();
	}
	
    
    // 벌집
    public static void test15() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int temp = 1;
		int i = 1;
		if(N != 1) {
			while(N > temp) {
				temp += (i*6);
				i++;
			}
		}
		
		System.out.println(i);
    }
    

	// 나무 자르기
	public static void test20() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		List<Integer> tree = new ArrayList<>();
		int last = 1;
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			int length = Integer.parseInt(st.nextToken());
			tree.add(length);
			if(length > last) last = length;
		};
		
		int first = 0;
		while(first < last) {
			
			int mid = (first + last)/2;
			long sum = 0;
			
			for(int treeH : tree) {
				
				if(treeH - mid > 0) {
					sum += treeH - mid;
				}
			}
			
			if(sum < M) {
				last = mid;
			}
			
			else {
				first = mid +1;
			}
			
		}
		
		System.out.println(first - 1);
	
	}


	// 직각 삼각형
	public static void test23() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int[] arr = new int[3];
			arr[0] = Integer.parseInt(st.nextToken());
			arr[1] = Integer.parseInt(st.nextToken());
			arr[2] = Integer.parseInt(st.nextToken());

			Arrays.sort(arr);
			
			if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
				break;
			}
			if(Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2)) {
				System.out.println("right");
			} else System.out.println("wrong");
			
		}
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
	

	// Hashing 
	public static void test38() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = 1234567891;
		int strLength = Integer.parseInt(br.readLine());
		String str = br.readLine();
		long sum = 0;
		long pow = 1;
		char[] arr = str.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			
			sum += (arr[i] - 'a' + 1) * pow % M;
			pow = pow * 31 % M; 
		}
		
		long answer = sum % M;
		
		System.out.println(answer);
		
	}
	
}
