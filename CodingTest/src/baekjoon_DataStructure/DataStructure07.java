package baekjoon_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class DataStructure07 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}
	
	// 이중 우선순위 큐
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int K = Integer.parseInt(br.readLine());
			TreeMap<Integer, Integer> que = new TreeMap<>();
			
			for(int j = 0; j < K; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				String oper = st.nextToken();
				int value = Integer.parseInt(st.nextToken());
				
				switch(oper) {
					case "I" :
						que.put(value, que.getOrDefault(value, 0) + 1);
						break;
					case "D" :
						
						if(que.size() < 1) continue;
						
	                    int target = value == 1 ? que.lastKey() : que.firstKey();
	                    if (que.put(target, que.get(target) - 1) == 1)
	                        que.remove(target);
				}
			}
			
			if(que.isEmpty()) sb.append("EMPTY").append("\n");
			else sb.append(que.lastKey() + " " + que.firstKey()).append("\n");
		}
		
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
	}
	
	// 철벽 보안 알고리즘 
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			int N = Integer.parseInt(br.readLine());
			HashMap<String, Integer> map = new HashMap<>();
			
			String[] pk1 = br.readLine().split(" ");
			String[] pk2 = br.readLine().split(" ");
			String[] cryptogram = br.readLine().split(" ");
			int[] index = new int[N];
			String res[] = new String[N];
			
			
			for(int i = 0; i < N; i++) map.put(pk1[i], i);
			for(int i = 0; i < N; i++) index[i] = map.get(pk2[i]);
			for(int i = 0; i < N; i++) res[index[i]] = cryptogram[i];
			
			for(int i = 0; i < N; i++) System.out.print(res[i] + " ");
		}
	}

	// 반전 요세푸스
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Deque<Integer> dq = new LinkedList<>();
		List<Integer> list = new ArrayList<>();
		int num = 0;
		for(int i = 1; i <= N; i++) dq.add(i);
		
		while(!dq.isEmpty()) {
			
			while(num != M) {
				if(dq.isEmpty()) break;
				for(int i = 0; i < K-1; i++) dq.add(dq.pollFirst());
				list.add(dq.pollFirst());
				num++;
			}
			while(num != 0) {
				if(dq.isEmpty()) break;
				for(int i = 0; i < K-1; i++) dq.addFirst(dq.pollLast());
				list.add(dq.pollLast());
				num--;
			}
				
		}
		
		for (Integer integer : list) System.out.println(integer);
		
	}
	
	// 단어 뒤집기 2
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		String str = br.readLine();
	
		boolean tag = false;		
		for(int i = 0; i < str.length(); i++) {
	
			if(str.charAt(i) == '<') {
				tag = true;
	
				while( !stack.isEmpty() ) sb.append(stack.pop());
	
				sb.append(str.charAt(i));
			}
			
			else if(str.charAt(i) == '>') {
			
				tag = false;
				sb.append(str.charAt(i));
				
			}

			else if(tag == true) {

				sb.append(str.charAt(i));
				
			}

			else if( tag == false) {
				
				if(str.charAt(i) == ' ') {
	
					while( !stack.isEmpty() ) sb.append(stack.pop());
					sb.append(str.charAt(i));
					
				} else stack.push(str.charAt(i));
			}
		}
		
		while(!stack.isEmpty()) sb.append(stack.pop());
		
		System.out.println(sb);
	}

	// 問題 ２
	public static void test05() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        Map<String, String> map = new HashMap<>();

        for(int i = 0; i < T; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	map.put(st.nextToken(), st.nextToken());
        }
        
        int C = Integer.parseInt(br.readLine());
        for(int i = 0; i < C; i++) {
        	String input = br.readLine();
        	
        	if(map.containsKey(input)) sb.append(map.get(input));
        	else sb.append(input);
        }
        
        System.out.print(sb);
	}

	// Sort 마스터 배지훈의 후계자
	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
        int[] arr = new int[N];
        
        for(int i = 0 ; i < N ; i++) arr[i] = Integer.parseInt(br.readLine());
        
        Arrays.sort(arr);

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < N ; i++) if(!map.containsKey(arr[i])) map.put(arr[i], i);

        while(M-- > 0){
            int x = Integer.parseInt(br.readLine());
            if(map.containsKey(x)) sb.append(map.get(x)).append("\n");
            else sb.append(-1).append("\n");
        }

        System.out.println(sb);
			
	}

	// 카드셋트
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("P", 0);
		map2.put("K", 0);
		map2.put("H", 0);
		map2.put("T", 0);
		
		for(int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			String temp = input.charAt(i)+ "" + input.charAt(i+1) + input.charAt(i+2);
			i += 2;
			
			if(map.containsKey(temp)) {
				sb.append("GRESKA");
				break;
			} else map.put(temp, 0);
			
			
			map2.put(temp.charAt(0)+"", map2.getOrDefault(temp.charAt(0)+"", 1) + 1);
		}
		
		if(sb.length() != 0) {
			System.out.println(sb);
		} else {
			sb.append(13 - map2.get("P")).append(" ");
			sb.append(13 - map2.get("K")).append(" ");
			sb.append(13 - map2.get("H")).append(" ");
			sb.append(13 - map2.get("T"));
			
			System.out.print(sb);
		}
		
		
	}

	// Refrigerator Magnets
	public static void test08() throws NumberFormatException, IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        
        while(!(input = br.readLine()).equals("END")) {
        	boolean flag = true;
        	for(int i = 65; i <= 90; i++) {
        		if(countChar(input, (char)i) > 1) {
        			flag = false;
        			break;
        		}
        	}
        	
        	if(flag) sb.append(input).append("\n");
        	
        }
        
        sb.deleteCharAt(sb.length()-1);
        System.out.print(sb);
	}
	
    public static long countChar(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }

	// No Duplicates
	public static void test09() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        
        Set<String> set = new HashSet<>();
        
        for (String string : input) set.add(string);
        
        if(input.length != set.size()) System.out.println("no");
        else System.out.println("yes");
	}

	// AC
	public static StringBuilder sb = new StringBuilder();
	public static void test10() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		ArrayDeque<Integer> deque;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			String input = br.readLine();
			int n = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine(), "[],");
			
			deque = new ArrayDeque<Integer>();
			
			for(int i = 0; i < n; i++) deque.add(Integer.parseInt(st.nextToken()));
			
			AC(input, deque);
			
		}
		
		System.out.println(sb);
	}
	
	public static void AC(String input, ArrayDeque<Integer> deque) {
		
		boolean reverse = true;
		
		for(char cmd : input.toCharArray()) {
			
			if(cmd == 'R') {
				reverse = !reverse;	
				continue;
			}
			
			
			if(reverse) {
				
				if(deque.pollFirst() == null) {
					sb.append("error\n");
					return;
				}
				
			} else {
				
				if(deque.pollLast() == null) {
					sb.append("error\n");
					return;
				}	
				
			}
		}
		
		makeString(deque, reverse);
		
	}
	
	public static void makeString(ArrayDeque<Integer> deque, boolean reverse) {
		
		sb.append('[');	
		
		if(deque.size() > 0) {	
			
			if(reverse) {	
				
				sb.append(deque.pollFirst());	
				while(!deque.isEmpty()) sb.append(',').append(deque.pollFirst());
				
			} else {	
				
				sb.append(deque.pollLast());	
				while(!deque.isEmpty()) sb.append(',').append(deque.pollLast());
				
			}
		}
		
		sb.append(']').append('\n');	
		
	}





}
