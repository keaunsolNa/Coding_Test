package baekjoon_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class DataStructure08 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}
	
	// 20001번 - 고무오리 디버깅
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		int ans = 0;
		while(true) {
		
			input = br.readLine();
			if(input.equals("고무오리 디버깅 끝")) break;
			if(input.equals("문제")) ans++;
			if(input.equals("고무오리")) {
				
				if(ans > 0) ans--;
				else ans += 2;
			}
			
		}
		
		if(ans == 0) System.out.println("고무오리야 사랑해");
		else System.out.println("힝구");
	}
	
	// 13417번 - 카드 문자열
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		while(T --> 0) {
			
			int length = Integer.parseInt(br.readLine());
			char[] input = br.readLine().replaceAll(" ", "").toCharArray();
			
			sb2.append(input[0]);
			for(int i = 1; i < input.length; i++) {
				if((int)sb2.charAt(0) >= (int)input[i]) sb2.insert(0, input[i]);
				else sb2.append(input[i]);
			}
			
			sb.append(sb2 + "\n");
			sb2.setLength(0);
		}
		
		System.out.println(sb);
	}
	
	// 1235번 - 학생 번호
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] stu = new String[N];
		
		for(int i = 0; i < N; i++) stu[i] = br.readLine();
		
		int idx = 0;
		int ans = 0;
		int length = stu[0].length();
		while(true) {
			
			Set<String> set = new HashSet<>();
			for(int i = 0; i < N; i++) set.add(stu[i].substring(length - idx - 1, length));
			ans++;	
			idx++;
			if(set.size() == N) break;
		}
		
		System.out.println(ans);
	}
	
	// 8669번 - Las
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int g = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			set.add(r);
			
		}
		
		System.out.println(set.size());
	}
	
	// 8715번 - Permutacja
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		boolean[] arr = new boolean[T + 1];
		
		for(int i = 0; i < T; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if(temp > T) {
				System.out.println("NIE");
				return;
			}
			arr[temp] = true;
		}
		
		for(int i = 1; i <= T; i ++) {
			
			if(!arr[i]) {
				System.out.println("NIE");
				return;
			}
		}
		
		System.out.println("TAK");
		
	}
	
	// 15235번 - Olympiad Pizza
	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		Queue<Integer> que = new LinkedList<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0;  i < T; i++) que.add(Integer.parseInt(st.nextToken()));
		int[] arr = new int[T];
		int cnt = 1;
		boolean[] chk = new boolean[T];
		
		while(!que.isEmpty()) {
			
			for(int i = 0; i < T; i++) {
				
				if(!chk[i]) {
					if(que.peek() == 1) {
						arr[i] = cnt;
						chk[i] = true;
						que.poll();
						cnt++;
					}
					else {
						arr[i] = cnt;
						cnt++;
						que.add(que.poll() - 1);
					}
				}
			}
			
		}
		
		for (int i : arr) System.out.print(i + " ");
		
	}
	
	// 3077번 - 임진왜란 
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap<>();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) map.put(st.nextToken(), i);
        

        String[] input = br.readLine().split(" ");

        int cnt = 0;

        for (int i = 0; i < N - 1; i++) 
            for (int j = i + 1; j < N; j++) 
            	if (map.get(input[i]) < map.get(input[j])) cnt++;

        System.out.println(cnt + "/" + N * (N - 1) / 2);

	}
	
	// 10799번 - 쇠막대기
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] input = br.readLine().toCharArray();
		Stack<Character> stack = new Stack<>();
		
		int result = 0;
		for(int i = 0; i < input.length; i++) {
			
			
			if(input[i] == '(') stack.add(input[i]);
			else {
				
				if(input[i - 1] == '(') {
					stack.pop();
					result += stack.size();
				} else {
					stack.pop();
					result++;
				}
			}
				
		}
		
		System.out.println(result);
		
	}
	
	// 18115번 - 카드 놓기
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		List<Integer> skill = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) skill.add(Integer.parseInt(st.nextToken()));
		
		Collections.reverse(skill);
		
		Deque<Integer> dq = new LinkedList<>();
		int num = 1;
		
		for(int i = 0; i < N; i++) {
			
			switch(skill.get(i)){
				case 1 : dq.addFirst(num); break;
				case 2 : {
					int temp = dq.remove();
					dq.addFirst(num);
					dq.addFirst(temp);
					break;
				}
				case 3 : dq.addLast(num);
					
			}
			num++;
		}
		
		while(!dq.isEmpty()) sb.append(dq.poll() + " ");
		
		System.out.println(sb);
	}
	
	// 26042번 - 식당 입구 대기 줄
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> que = new LinkedList<>();
		int maxLine = 0;
		int target = Integer.MAX_VALUE;
		while(n --> 0) {
			
			st = new StringTokenizer(br.readLine());
			
			int order = Integer.parseInt(st.nextToken());
			
			if(order == 1) que.add(Integer.parseInt(st.nextToken()));
			else que.poll();

			if(que.size() > maxLine) {
				maxLine = que.size();
				target = que.peekLast();
			}
			if(que.size() == maxLine) {
				if(target > que.peekLast()) target = que.peekLast();
			}
			
		}
		
		System.out.println(maxLine + " " + target);
	}
	





}
