package baekjoon_DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class DataStructure10 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}
	
	private static class DeadLine implements Comparable<DeadLine>{
		
		private int deadLine;
		private int cuplamen;
		
		private DeadLine(int deadLine, int cuplamen) {
			this.deadLine = deadLine;
			this.cuplamen = cuplamen;
		}
		
        @Override
        public int compareTo(DeadLine o) {
        	
        	if(this.deadLine == o.deadLine) {
        		return o.cuplamen - this.cuplamen;
        	}
        	
            return this.deadLine - o.deadLine;
        }
	}
	
	
	// 1655번 - 가운데를 말해요
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> minPq = new PriorityQueue<Integer>();
		PriorityQueue<Integer> maxPq = new PriorityQueue<Integer>(Collections.reverseOrder());
		StringBuilder sb = new StringBuilder(); 
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			
			int temp = Integer.parseInt(br.readLine());
			
			if(minPq.size() == maxPq.size()) maxPq.add(temp);
			else minPq.add(temp);
				
			if(!minPq.isEmpty() && maxPq.peek() > minPq.peek()) {
				minPq.add(maxPq.poll());
				maxPq.add(minPq.poll());
			}
			
			sb.append(maxPq.peek() + "\n");
		}
		
		System.out.print(sb);
	}
	
	// 2696번 - 중앙값 구하기
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			PriorityQueue<Integer> minPq = new PriorityQueue<Integer>();
			PriorityQueue<Integer> maxPq = new PriorityQueue<Integer>(Collections.reverseOrder());
			StringBuilder sb = new StringBuilder();
			int M = Integer.parseInt(br.readLine());
			
			int chk = 0;
			int length = 0;
			for(int i = 0; i < M / 10 + 1; i++) {
				st = new StringTokenizer(br.readLine());
				
				int cnt = 1;
				while(st.hasMoreTokens()) {
					int temp = Integer.parseInt(st.nextToken());
					
					if(minPq.size() == maxPq.size()) maxPq.add(temp);
					else minPq.add(temp);
					
					if(!minPq.isEmpty() && maxPq.peek() > minPq.peek()) {
						minPq.add(maxPq.poll());
						maxPq.add(minPq.poll());
					}
					
					if(cnt % 2 != 0) {
						sb.append(maxPq.peek() + " ");
						chk++;
						length++;
					}
					
					if(chk == 10) {
						sb.append("\n");
						chk = 0;
					}
					
					cnt++;
				}
				
			}
			sb.insert(0, length + "\n");
			sb.append("\n");
			ans.append(sb);
		}
		
		System.out.print(ans);
	}
	
	// 1781번 - 컵라면
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> list = new PriorityQueue<Integer>();
		StringTokenizer st;
	
		int N = Integer.parseInt(br.readLine());
		DeadLine[] arr = new DeadLine[N];
		
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int deadLine = Integer.parseInt(st.nextToken());
			int cup = Integer.parseInt(st.nextToken());
			
			arr[i] = new DeadLine(deadLine, cup);
			
		}

		long cnt = 0;
		Arrays.sort(arr);
		
		for(DeadLine question : arr) {
			
			int size = list.size();
			
			if(size < question.deadLine) list.offer(question.cuplamen);
			
			else if(size == question.deadLine) {
				
				int noodleCount = list.peek();
				if(noodleCount < question.cuplamen) {
					
					list.poll();
					list.offer(question.cuplamen);
					
				}
			}
		}
		
		while(!list.isEmpty()) cnt += list.poll();
		
		System.out.println(cnt);
		
	}
	
	// 
	private static  int[] tree;
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		tree = new int[N + 1];
		
        for (int i = 1; i <= N; i++) tree[i] = i;
        
        for (int i = 0; i < M; i++) {
        	
            st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
 
            if (order == 0) union(a, b);
            
            else if (order == 1) sb.append((chk(a, b) ? "YES" : "NO") + "\n");
            
            else continue;
            
        }
 
        System.out.println(sb.toString());
	}
	
	private static int find(int x) {
		
        if (x == tree[x]) return x;
        return tree[x] = find(tree[x]);
        
    }
 
	private static void union(int x, int y) {
    	
        x = find(x);
        y = find(y);
 
        if (x != y) {
        	
            if (x < y) tree[y] = x;
            else tree[x] = y;
            
        }
    }
 
	private static boolean chk(int x, int y) {
		
        x = find(x);
        y = find(y);
 
        if (x == y) return true;
        return false;
        
    }
	
}
