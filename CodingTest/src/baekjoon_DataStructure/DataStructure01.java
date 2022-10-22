package baekjoon_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class DataStructure01 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}
	
	// 줄 세우기
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int studentNumber = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		List<Integer> arrList = new ArrayList<>();
		
		for(int i = 1; i <= studentNumber; i++) {
			int temp = Integer.parseInt(st.nextToken());
			arrList.add(temp, i);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = arrList.size()-1; i >= 0; i--) {
			sb.append(arrList.get(i) + " ");
		}
		
		System.out.println(sb);
	}
	
	// 막대기
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> arrList = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			arrList.add(Integer.parseInt(br.readLine()));
		}
		
		int max = 0;
		int cnt = 0;
		for(int i =  arrList.size()-1; i >= 0; i--) {
			if(arrList.get(i) > max) {
				max = arrList.get(i);
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

	// 민균이의 비밀번호 
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		List<String> arrList = new ArrayList<>();
		List<String> arrListReverse = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			String temp = br.readLine();
			String tempReverse = new StringBuilder(temp).reverse().toString();
			arrList.add(temp);
			arrListReverse.add(tempReverse);
		}
		
		for(int i = 0; i < arrList.size(); i++) {
			String temp = arrList.get(i);
			for(int j = 0; j < arrListReverse.size(); j++) {
				
				if(temp.equals(arrListReverse.get(j))) {
					System.out.println(arrList.get(i).length() + " " +  arrList.get(i).charAt(arrList.get(i).length()/2));
					return;
				}
			}
		}
	}

	// 콘서트
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> arrList = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			arrList.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(arrList);
		
		int cnt = 0;
		for(int i = 0; i < arrList.size(); i++) {
			if(arrList.get(i) != i +1) {
				System.out.println(i + 1);
				cnt++;
				break;
			}
		}
		
		if(cnt == 0) {
			System.out.println(N + 1);
		}
	}

	// 단어순서 뒤집기
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			StringBuilder sb = new StringBuilder();
			String[] temp = br.readLine().split(" ");
			
			sb.append("Case #").append(i+1).append(": ");
			for(int j = temp.length - 1; j >= 0; j--) {
				sb.append(temp[j]).append(" ");
			}
			System.out.println(sb);
		}
	}

	// 국회의원 선거
	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		if(N == 1) {
			System.out.println(0);
			return;
		}
		
		int P = Integer.parseInt(br.readLine());
		List<Integer> arrList = new ArrayList<>();
		for(int i = 1; i < N; i++) {
			int temp = Integer.parseInt(br.readLine());
			arrList.add(temp);
		}
		
		int cnt = 0;
		while(true) {
			Collections.sort(arrList);
			if(arrList.get(N-2) < P) break;
			cnt++;
			arrList.set(N-2, arrList.get(N-2)-1);
			P++;
		}
		
		System.out.println(cnt);
		
	}

	// 회사에 있는 사람
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<String, String> log = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			String[] temp = br.readLine().split(" ");
			String name = temp[0];
			
			if(log.containsKey(name)) {
				log.remove(name);
			} else {
				log.put(name, "enter");
			}
		}

		List<String> nameList = new ArrayList<>(log.keySet());
		Collections.sort(nameList, Comparator.reverseOrder());
		for (String string : nameList) {
			System.out.println(string);
		}
	}

	// 학생 인기도 측정
	public static void test08() throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Map<String, Integer> studentMap = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			studentMap.put(st.nextToken(), 0);
		}
		
		for(int i = 0; i < N; i++) {
			String[] temp = br.readLine().split(" ");
			
			for(int j = 0; j < temp.length; j++) {
				studentMap.put(temp[j], studentMap.getOrDefault(temp[j], 0)+1);
			}
		}

		String[] arr = new String[N];
		Iterator<String> iterName = studentMap.keySet().iterator();
		Iterator<Integer> iterValue = studentMap.values().iterator();

		int cnt = 0;
		while(iterName.hasNext()) {
			arr[cnt] = iterName.next() + " " + iterValue.next();
			cnt++;
		}

		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				String[] one = o1.split(" ");
				String[] two = o2.split(" ");
				
				if(Integer.parseInt(one[1]) == Integer.parseInt(two[1])) {
					
					return one[0].compareTo(two[0]);
					
				} 
				else
				return Integer.parseInt(two[1]) - Integer.parseInt(one[1]);
				
			}
			
		});

		for (String str : arr) {
			System.out.println(str);
		}
		
		
	}

	// CD
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
    		StringTokenizer st = new StringTokenizer(br.readLine());
		
		    int N = Integer.parseInt(st.nextToken());
		    int M = Integer.parseInt(st.nextToken());
		
            if(N == 0 && M == 0){
                break;
            }
            
		    Set<Integer> hashSet = new HashSet<>();
		
		    for(int i = 0; i < N; i++) {
		    	hashSet.add(Integer.parseInt(br.readLine()));
	    	}
		
		    int count = 0;
		    for(int i = 0 ; i < N; i++) {
		    	int number = Integer.parseInt(br.readLine());
			    
			    if(hashSet.contains(number)) {
				    count++;
			    }
		    }
		
		    System.out.println(count);
        }
	}

	// 큐 2
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Deque<Integer> q = new ArrayDeque<>();
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer command;
		
		while(N-- > 0) {
			command = new StringTokenizer(br.readLine(), " ");	
			
			switch(command.nextToken()) {	
			
			case "push":
				
				q.offer(Integer.parseInt(command.nextToken()));	
				break;
				
			case "pop" :
				
				Integer item = q.poll();	
				if(item == null) {
					sb.append(-1).append('\n');
				}
				else {
					sb.append(item).append('\n');
				}
				break;
				
			case "size":	
				sb.append(q.size()).append('\n');
				break;
				
			case "empty":
				if(q.isEmpty()) {
					sb.append(1).append('\n');
				}
				else {
					sb.append(0).append('\n');
				}
				break;
				
			case "front":
				
				Integer ite = q.peek();
				if(ite == null) {
					sb.append(-1).append('\n');
				}
				else {
					sb.append(ite).append('\n');
				}
				break;
				
			case "back":
				
				Integer it = q.peekLast();	 
				if(it == null) {
					sb.append(-1).append('\n');
				}
				else {
					sb.append(it).append('\n');
				}
				break;
			}
		}
		System.out.println(sb);
		
	}





}
