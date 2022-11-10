package baekjoon_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class DataStructure04 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test02();
	}
	
	// 차집합
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		Map<Integer, Integer> map = new HashMap<>();
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < A; i++) {
			map.put(Integer.parseInt(st.nextToken()), 1);
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < B; i++) {
			int key = Integer.parseInt(st.nextToken());
			if(map.containsKey(key)) {
				map.remove(key);
			} 
		}
		
		List<Integer> arrayList = new ArrayList<>();
		for (Integer integer : map.keySet()) {
			arrayList.add(integer);
		}

		Collections.sort(arrayList);
		
		System.out.println(arrayList.size());
		StringBuilder sb = new StringBuilder();
		for (Integer integer : arrayList) {
			sb.append(integer).append(" ");
		}

		System.out.println(sb);
		
	}
	
	// 학생별 통화 요금 계산
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		Map<String, Integer> studentCall = new HashMap<String, Integer>();
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String[] time = st.nextToken().split(":");
			String name = st.nextToken();
			int hour = Integer.parseInt(time[0]);
			int min = Integer.parseInt(time[1]);
			int totalTime = hour*60 + min;
			
			studentCall.put(name, studentCall.getOrDefault(name, 0) + totalTime);
		}

		int baseTime = 100;
		int baseMoney = 10;
		int unitTime = 50;
		int unitMoney = 3;
		
		for (String key : studentCall.keySet()) {
			int time = studentCall.get(key);
			int cost = baseMoney;
			if(time > baseTime) {
				int leftover = (time-baseTime);
				if(leftover%unitTime == 0) {
					cost += (leftover/unitTime)*unitMoney;
				} else {
					cost += ((leftover/unitTime) + 1) * unitMoney;
				}
			}
			studentCall.put(key, cost);
		}

		List<Map.Entry<String, Integer>> entryList = new LinkedList<>(studentCall.entrySet());
		entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
		    
			@Override
		    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				if(o2.getValue() == o1.getValue()) {
					int cnt = 0;
					if(o2.getKey().length() > o1.getKey().length()) {
						while(++cnt < o1.getKey().length() - 1) {
							if((int)o2.getKey().charAt(cnt) != (int)o1.getKey().charAt(cnt)) {
								return o1.getKey().charAt(cnt) - o2.getKey().charAt(cnt);
							}
						}
					} else {
						while(cnt <= o2.getKey().length() - 1) {
							if((int)o2.getKey().charAt(cnt) != (int)o1.getKey().charAt(cnt)) {
								return o1.getKey().charAt(cnt) - o2.getKey().charAt(cnt);
							}
							cnt++;
						}
					}
					
					
					return o2.getKey().length() - o1.getKey().length();
				} else {
					return o2.getValue() - o1.getValue();
				}
		    }
			
		});

		for (Entry<String, Integer> entry : entryList) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	
	// 동일한 단어 그룹화하기
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	}

	// 베스트셀러
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
	}

	// 사이클 단어
	public static void test05() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
	}

	// 도키도키 간식드리미
	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	}

	// Router 
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
	}

	// 비밀번호 찾기
	public static void test08() throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
	}

	// 인사성 밝은 곰곰이
	public static void test09() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
	}

	// 배부른 마라토너
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
	}





}
