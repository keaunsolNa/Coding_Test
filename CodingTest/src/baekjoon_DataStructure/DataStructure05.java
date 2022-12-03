package baekjoon_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class DataStructure05 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}
	
	// I’ve Been Everywhere, Man
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			Set<String> city = new HashSet<>();
			int N = Integer.parseInt(br.readLine());
			
			for(int j = 0; j < N; j++) {
				city.add(br.readLine());
			}
			
			System.out.println(city.size());
		}
	}
	
	// 붙임성 좋은 총총이
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		Set<String> dancer = new HashSet<>();
		dancer.add("ChongChong");
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String dancer1 = st.nextToken();
			String dancer2 = st.nextToken();
			if(dancer.contains(dancer1)) {
				dancer.add(dancer1);
				dancer.add(dancer2);
			}
			if(dancer.contains(dancer2)) {
				dancer.add(dancer1);
				dancer.add(dancer2);
			}
			
		}
		
		System.out.println(dancer.size());
		
	}

	// 야근
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		Map<String, String> map = new HashMap<>();
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String oper = st.nextToken();
			map.put(name, map.getOrDefault(name, "") + (","+oper));
		}
		
		int answer = 0;
		for (String name : map.keySet()) {
			StringTokenizer st = new StringTokenizer(map.get(name), ",");
			String before = st.nextToken();
			while(st.hasMoreTokens()) {
				String now = st.nextToken();
				if(before.equals("+")) {
					if(now.equals("-")) {
						before = now;
						continue;
					}
				}
				
				answer++;
				before = now;
			}
		}
		
		System.out.println(answer);
	}
	
	// 파일 정리
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i < N; i++) {
			String extension = br.readLine().split("[.]")[1];
			map.put(extension, map.getOrDefault(extension, 0)+1);
		}
		
		Map<String, Integer> sortedMap = new TreeMap<>(map);
		
		for (String key : sortedMap.keySet()) {
			System.out.println(key + " " + sortedMap.get(key));
		}
		
	}

	// 꿍의 여친 만들기 
	public static void test05() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++) {
        	Map<String, Integer> needTimes = new HashMap<>();
        	String[] times = br.readLine().split(",");
        	
        	for(int j = 0; j < times.length; j++) {
        		StringTokenizer st = new StringTokenizer(times[j], ":");
        		needTimes.put(st.nextToken(), Integer.parseInt(st.nextToken()));
        		
        	}
        	
        	String[] require = br.readLine().split("\\|");
        	Map<List<String>, Integer> requireMap = new HashMap<>();
        	
        	int min = 1001;
        	
        	for(int j = 0; j < require.length; j++) {
        		int time = 0;
        		List<String> requireList = new ArrayList<>();
        		String[] requireType = require[j].split("&");
        		for (String string : requireType) {
					requireList.add(string);
					if(time < needTimes.get(string)) {
						time = needTimes.get(string);
					}
				}
        		requireMap.put(requireList, time);
        		if(min > time) {
        			min = time;
        		}
        	}
        	
        	System.out.println(min);
        }
        
        
	}

	// 생태학
	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		int total = 0;
		Map<String, Integer> tree = new TreeMap<>();
		while(true) {
			input = br.readLine();
			if(input == null) break;
			tree.put(input, tree.getOrDefault(input, 0) + 1);
			total++;
		}
		
		for(String treeName : tree.keySet()) {
			double percent = (double) tree.get(treeName) / (double) total * 100;
			percent = Math.round(percent*10000)/10000.0;
			System.out.print(treeName + " ");
			System.out.printf("%.4f", percent);
			System.out.println();
		}
	}

	// 최대 힙
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < N; i++) {
			int input = Integer.parseInt(br.readLine());
			
			if(input == 0) {
				if(pq.peek() == null) {
					sb.append(0).append("\n");
					pq.poll();
				} else {
					sb.append(pq.poll()).append("\n");
				}
			} else {
				pq.add(input);
			}
		}
		
		System.out.println(sb);
	}

	// 최소 힙 
	public static void test08() throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < N; i++) {
			int input = Integer.parseInt(br.readLine());
			
			if(input == 0) {
				if(pq.peek() == null) {
					sb.append(0).append("\n");
					pq.poll();
				} else {
					sb.append(pq.poll()).append("\n");
				}
			} else {
				pq.add(input);
			}
		}
		
		System.out.println(sb);
	}

	// N번째 큰 수
	public static void test09() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        StringTokenizer st;
        
        for(int i = 0; i < N; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < N; j++) {
                pq.offer(Integer.parseInt(st.nextToken()));
            }
        }
        
        for(int i = 0; i < N-1; i++) {
            pq.poll();
        }
        
        System.out.println(pq.poll());
	}

	// 세 번째
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(list);
		
		if(list.size() != 3) {
			for(int i = 0; i < 4 ; i++) {
				int input = list.get(i);
				for(int j = 0; j < 4 ; j++) {
					if(j != i) {
						pq.add(Integer.parseInt(input + "" + list.get(j)));
					}
				}
			}
	
			for(int i = 0; i < 2; i++) {
				pq.poll();
			}
			
			System.out.println(pq.poll());
		} else {
			for(int i = 0; i < N ; i++) {
				int input = list.get(i);
				for(int j = 0; j < N ; j++) {
					if(j != i) {
						pq.add(Integer.parseInt(input + "" + list.get(j)));
					}
				}
			}
	
			for(int i = 0; i < 2; i++) {
				pq.poll();
			}
			
			System.out.println(pq.poll());
		}
	}





}
