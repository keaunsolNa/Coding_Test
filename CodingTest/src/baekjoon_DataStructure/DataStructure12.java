package baekjoon_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class DataStructure12 {

	private static class classroom implements Comparable<classroom> {
		int start;
		int end;
		
		classroom(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(classroom o) {
			
			if(this.start != o.start) return this.start - o.start;
			
			else return this.end - o.end;
		}
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		test02();
	}

	// 11000번 - 강의실 배정
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<classroom> que = new PriorityQueue<>();
		
		while(N --> 0) {
			
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			que.add(new classroom(start, end));	
		}
		
		PriorityQueue<Integer> lectures = new PriorityQueue<>();
		lectures.offer(que.poll().end);
		
		while(!que.isEmpty()) {
			
			if(lectures.peek() <= que.peek().start) {
				lectures.poll();
			}
			lectures.offer(que.poll().end);
		}
		
		System.out.println(lectures.size());
		
	}
	
	// 1374번 - 강의실
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<classroom> que = new PriorityQueue<>();
		
		while(N --> 0) {
			
			st = new StringTokenizer(br.readLine());
			int classNo = Integer.parseInt(st.nextToken());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			que.add(new classroom(start, end));	
		}
		
		PriorityQueue<Integer> lectures = new PriorityQueue<>();
		lectures.offer(que.poll().end);
		
		while(!que.isEmpty()) {
			
			if(lectures.peek() <= que.peek().start) {
				lectures.poll();
			}
			lectures.offer(que.poll().end);
		}
		
		System.out.println(lectures.size());
	}
	
	
}
