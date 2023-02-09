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
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class DataStructure09 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}
	
	// 13414번 - 수강신청
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int K = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		Set<String> set = new LinkedHashSet<>();
		for(int i = 0; i < L; i++) {
			
			String number = br.readLine();
			if(set.contains(number)) set.remove(number);
			set.add(number);
		}

		Iterator<String> iter = set.iterator();
		
		for(int i = 0; i < K; i++) 
			if(iter.hasNext()) System.out.println(iter.next());
		
	}
	
	// 14235번 - 크리스마스 선물
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i = 0; i < n; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int order = Integer.parseInt(st.nextToken());
			
			if(order == 0) {
				
				if(pq.isEmpty()) sb.append(-1);
				else sb.append(pq.poll());
				
				sb.append("\n");
				
			} else {
				
				while(st.hasMoreTokens()) pq.add(Integer.parseInt(st.nextToken()));
				
			}
			
		}
		
		System.out.println(sb);
	}
	
	// 25327번 - 다중 항목 선호도 조사 (Large), F
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		List<String[]> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) list.add(br.readLine().split(" "));

		for(int i = 0; i < m; i++) {
			String[] query = br.readLine().split(" ");
			
			int cnt = 0;
			boolean check;
			
			for(int j = 0; j < list.size(); j++) {
				
				check = true;
				
				for(int k = 0; k < 3; k++) {
					
					if(query[k].charAt(0) != '-' && query[k].charAt(0) != list.get(j)[k].charAt(0)) {
						check = false;
						break;
					}
				}
				
				if(check) cnt++;
			}
			
			sb.append(cnt + "\n");
			
		}
		System.out.println(sb);
	}
	
	// 15903번 - 카드 합체 놀이
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Long> pq = new PriorityQueue<Long>();
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) pq.add(Long.parseLong(st.nextToken()));
		
		while(m --> 0) {
			
			long a = pq.poll();
			long b = pq.poll();
			pq.add(a + b);
			pq.add(a + b);
			
		}
		
		long total = 0;
		for (Long l : pq) total += l;
		
		System.out.println(total);
	}
	
	// 2493번 - 탑
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<int[]> stack = new Stack<>();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			int input = Integer.parseInt(st.nextToken());
			
			while(!stack.isEmpty()) {
				
				if(stack.peek()[1] >= input) {
					sb.append(stack.peek()[0] + " ");
					break;
				}
				stack.pop();
			}
			
			if(stack.isEmpty()) sb.append("0 ");
			
			stack.push(new int[] {i, input});
		}
		
		System.out.println(sb);
	}
	
	// 25775번 - Letter Frequency
	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int maxL = 0;
		String[] arr = new String[T];

		for(int i = 0; i < T; i++) {
			
			String input = br.readLine();
			arr[i] = input;
			maxL = Math.max(maxL, input.length());
		}
		
		for(int i = 0; i < maxL; i++) {
			Map<Character, Integer> map = new HashMap<>();
			for(int j = 0; j < T; j++) {
				
				if(arr[j].length() > i) map.put(arr[j].charAt(i), map.getOrDefault(arr[j].charAt(i), 0) + 1);
			}
			
			List<Map.Entry<Character, Integer>> entryList = new LinkedList<>(map.entrySet());

			entryList.sort(new Comparator<Map.Entry<Character, Integer>>() {
			    @Override
			    public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
			    	
			    	if(o2.getValue() == o1.getValue()) {
			    		return Character.getNumericValue(o1.getKey()) - Character.getNumericValue(o2.getKey());
			    	}
			    	return o2.getValue() - o1.getValue();
			    }
			});
			
			sb.append((i + 1)+ ": ");
			int idx = entryList.get(0).getValue();
			for(int k = 0; k < entryList.size(); k++) {
				
				if(entryList.get(k).getValue() == idx) sb.append(entryList.get(k).getKey() + " ");
			}
			sb.deleteCharAt(sb.length() - 1);
			sb.append("\n");
		}
		
		System.out.print(sb);
		
	}
	
	// 20376번 - Counting Monuments
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		Set<String> set = new HashSet<>();
		while((input = br.readLine()) != null) {
			
			input = input.substring(11, input.length());
			set.add(input);
		}
		
		System.out.println(set.size());
	}
	
	// 14769번 - Stacking Cups
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new TreeMap<>();
		
		while(N --> 0) {
			
			String[] input = br.readLine().split(" ");
			
			int round = 0;
			String color = "";
			
			try {
				round = Integer.parseInt(input[0])/2;
				color = input[1];
			} catch(Exception e) {
				color = input[0];
				round = Integer.parseInt(input[1]);
			}
			
			map.put(color, round);
			
			
		}
		
		List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
		
		entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				
				return o1.getValue() - o2.getValue();
			}
		});
		
		for(int i = 0; i < entryList.size(); i++) System.out.println(entryList.get(i).getKey());
	}
	
	// 5263번 - samba 
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			int input = Integer.parseInt(br.readLine());
			map.put(input, map.getOrDefault(input, 0) + 1);
		}
	
		for(int key : map.keySet()) {
			
			if(map.get(key) % k != 0) {
				System.out.println(key);
				return;
			}
		}
	}
	
	// 19583번 - 싸이버개강총회
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] time = br.readLine().split(" ");
		String[] S = time[0].split(":");
		int SH = (Integer.parseInt(S[0]) * 360) + (Integer.parseInt(S[1]));

		String[] E = time[1].split(":");
		int EH = (Integer.parseInt(E[0]) * 360) + (Integer.parseInt(E[1]));
		
		String[] Q = time[2].split(":");
		int QH = (Integer.parseInt(Q[0]) * 360) + (Integer.parseInt(Q[1]));
		
		String input = "";
		Map<String, Integer> map = new HashMap<>();
		
		while((input = br.readLine()) != null)  {
			
			String[] T = input.split(" ")[0].split(":");
			
			int TH = (Integer.parseInt(T[0]) * 360) + (Integer.parseInt(T[1])); 
			String name = input.split(" ")[1];
			
			if(TH <= SH) {
				map.put(name, 0);
			} else if(TH >= EH && TH <= QH) {
				
				if(map.containsKey(name)) map.put(name, 1);
			}
		}
		
		int ans = 0;
		for(String key : map.keySet()) if(map.get(key) == 1) ans++;
		
		System.out.println(ans);
	}
	
}
