package baekjoon_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class DataStructure03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}
	
	// 꿀벌
	public static void test01() throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		String input = "";
		while(sc.hasNext()) {
			String action = sc.next();
			map.put(action, map.getOrDefault(action, 0) + 1);
		}
		
		int total = 0;
		for (String temp : map.keySet()) {
			total += map.get(temp);
		}
		
		StringBuilder sb = new StringBuilder();

		String key = "Re";
		for(int i = 0; i < 7; i++) {
			if(map.containsKey(key)) {
				
				double percent = ((double)map.get(key) / total);
				sb.append(key + " ").append(map.get(key) + " ").append(String.format("%.2f", percent)).append("\n");
				
			} else {
				sb.append(key + " ").append(0).append(" 0.00").append("\n");
			}
			
			if(key.equals("Re")) {
				key = "Pt";
			} else if(key.equals("Pt")) {
				key = "Cc";
			} else if(key.equals("Cc")) {
				key = "Ea";
			} else if(key.equals("Ea")) {
				key = "Tb";
			} else if(key.equals("Tb")) {
				key = "Cm";
			} else if(key.equals("Cm")) {
				key = "Ex";
			}
		}
		sb.append("Total " + total + " 1.00");
		
		System.out.println(sb);
		
	}
	
	// 요세푸스 문제
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 1; i <= N; i++) {
			queue.offer(i);
		}

		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while(queue.size() != 1) {
			
			for(int i = 0; i < K - 1; i++) {
				queue.offer(queue.poll());
			}
			sb.append(queue.poll() + ", ");
		}
		
		sb.append(queue.poll() + ">");
		
		System.out.println(sb);
	}

	
	// 동일한 단어 그룹화하기
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		
		String[] strArr = new String[N];
		for(int i = 0; i < N; i++) {
			String temp = br.readLine();
			char[] charArr = temp.toCharArray();
			Arrays.sort(charArr);
			
			String arr = "";
			for(int j = 0; j < charArr.length; j++) {
				arr += charArr[j];
			}
			strArr[i] = arr;
		}
		

		for(int i = 0; i < N; i++) {
			map.put(strArr[i], map.getOrDefault(strArr[i], 0) + 1);
		}
		
		System.out.println(map.size());
	}

	// 베스트셀러
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		int max = 0;
		
		for(int i = 0; i < N; i++) {
			String name = br.readLine();
			map.put(name, map.getOrDefault(name, 0) + 1);
			max = Math.max(max, map.get(name));
		}
		
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
        	
            if (entry.getValue() == max) list.add(entry.getKey());
            
        }
        
        Collections.sort(list);
        System.out.print(list.get(0));
		
	}

	// 사이클 단어
	public static void test05() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String>[] arr = new ArrayList[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = new ArrayList<>();
            String cur = br.readLine();
            for (int j = 0; j < cur.length(); j++)
                arr[i].add(cur.substring(j) + cur.substring(0, j));

            boolean chk = true;
            for (int j = 0; chk && j <= i-1; j++) {
                for (int k = 0; chk && k < arr[j].size(); k++) {
                    if (cur.equals(arr[j].get(k))) chk = false;
                }
            }
            if (chk)
                cnt++;
        }
        System.out.println(cnt);
	}

	// 도키도키 간식드리미
	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			queue.add(Integer.parseInt(st.nextToken()));
		}
		
		Stack<Integer> stack = new Stack<>();
		int number = 1;
		while(!queue.isEmpty()) {
			if(number == queue.peek()) {
				queue.poll();
				number++;
				continue;
			} else {
				if(!(stack.isEmpty()) && stack.peek() == number) {
					stack.pop();
					number++;
					continue;
				}
				stack.add(queue.poll());
			}
		}
		
		while(!stack.isEmpty()) {
			if(number == stack.peek()) {
				stack.pop();
				number++;
				continue;
			} else {
				break;
			}
		}
		
		if(stack.isEmpty()) {
			System.out.println("Nice");
		} else {
			System.out.println("Sad");
		}
	}

	// Router 
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int input = -99;
		int max = 0;
		Queue<Integer> queue = new LinkedList<>();
		while((input = Integer.parseInt(br.readLine())) != -1) {
			if(input != 0 && max < N) {
				queue.add(input);
				max++;
			} else if(input == 0) {
				queue.poll();
				max--;
			}
		}

		if(queue.isEmpty()) {
			System.out.println("empty");
		}
		for (Integer integer : queue) {
			System.out.print(integer + " ");
		}
		
	}

	// 비밀번호 찾기
	public static void test08() throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Map<String, String> map = new HashMap<>();
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String site = st.nextToken();
			String pass = st.nextToken();
			map.put(site, pass);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < M; i++) {
			String site = br.readLine();
			if(map.containsKey(site)) {
				sb.append(map.get(site)).append("\n");
			}
		}
		
		System.out.println(sb);
		
	}

	// 인사성 밝은 곰곰이
	public static void test09() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>(); 
        int size = 0;
        for(int i = 0; i < N; i++) {
        	String input = br.readLine();
        	
        	if(input.equals("ENTER")) {
        		size += set.size();
        		set = new HashSet<>();
        	} else {
        		set.add(input);
        	}
        }
        
        System.out.println(size + set.size());
	}

	// 배부른 마라토너
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			String name = br.readLine();
			map.put(name, map.getOrDefault(name, 0) + 1);
		}
		
		for(int i = 0; i < N-1; i++) {
			String name = br.readLine();
			if(map.containsKey(name) && map.get(name) == 1) {
				map.remove(name);
			} else {
				map.put(name, map.get(name)-1);
			}
		}

		System.out.println(map.keySet().iterator().next());
		
	}





}
