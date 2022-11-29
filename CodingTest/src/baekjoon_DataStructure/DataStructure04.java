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
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class DataStructure04 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
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
	
	// Lamp
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int L = Integer.parseInt(st.nextToken());
		int G = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		Map<String, List<Integer>> map = new HashMap<>();
		for(int i = 0; i < G; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String name = st.nextToken();
			int a = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			List<Integer> lampList = new ArrayList<>();
			while(a <= L) {
				lampList.add(a);
				a += d;
			}
			map.put(name, lampList);
		}
		
		System.out.println("MAP : " + map);
		
		Map<String, Integer> patrolMap = new HashMap<>();
		for(int i = 0; i < R; i++) {
			String name = br.readLine();
			patrolMap.put(name, patrolMap.getOrDefault(name, 0) +1);
		}
		
		System.out.println("PM : " + patrolMap);
		
		Iterator<String> iter = patrolMap.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			if(patrolMap.get(key) % 2 == 0) {
				map.remove(key);
			}
		}
		System.out.println("AFTER MAP : " + map);
		
		Map<Integer, Integer> dupCheck = new HashMap<>();
		for(String key : map.keySet()) {
			for(int i = 0; i < map.get(key).size(); i++) {
				dupCheck.put(map.get(key).get(i), dupCheck.getOrDefault(map.get(key).get(i), 0) + 1);
			}
		}
		
		System.out.println("LIST : " + dupCheck);
		
		Iterator<Integer> iter2 = dupCheck.keySet().iterator();
		while(iter2.hasNext()) {
			Integer key = iter2.next();
			System.out.println(key);
			System.out.println(dupCheck);
			if(dupCheck.get(key) % 2 == 0) {
				dupCheck.remove(key);
				System.out.println(dupCheck);
				continue;
			}
		}
		System.out.println(dupCheck);
		System.out.println(dupCheck.size());
		
	}

	// 자료구조는 정말 최고야
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
        boolean result = true;

        for (int i = 0; i < M; i++) {
            int c = Integer.parseInt(br.readLine());
            String[] strs = br.readLine().split(" ");
            int preVal = 200001;
            for (int j = 0; j < c; j++) {
                if (Integer.parseInt(strs[j]) > preVal) {
                    result = false;
                }
                preVal = Integer.parseInt(strs[j]);
            }
        }


        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
		
	}
	
	// Banana
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<String, String> vol = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			String[] text = br.readLine().split("=");
			vol.put(text[0].replaceAll(" ", ""), text[1].replaceAll(" ", ""));
		}
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < T; i++) {
			int K = Integer.parseInt(br.readLine());
			String[] input = br.readLine().split(" ");
			
			for(int j = 0; j < K; j++) {
				sb.append(vol.get(input[j])).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	// Bags
	public static void test05() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        Set<Integer> stack = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
        	stack.add(Integer.parseInt(st.nextToken()));
        }
        System.out.println(stack.size());
	}

	// Polling
	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Map<String, Integer> hashMap = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			String name = br.readLine();
			hashMap.put(name, hashMap.getOrDefault(name, 0) + 1);
		}

		List<Map.Entry<String, Integer>> entryList = new LinkedList<>(hashMap.entrySet());
		entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
		    @Override
		    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
	    		return o2.getValue() - o1.getValue();
		    }
		});
		
		List<String> name = new ArrayList<>();
		if(entryList.get(0).getValue() == entryList.get(1).getValue()) {
			name.add(entryList.get(0).getKey());
			for(int i = 1; i < entryList.size(); i++) {
				if(entryList.get(0).getValue() == entryList.get(i).getValue()) {
					name.add(entryList.get(i).getKey());
				}
			}
		} else {
			name.add(entryList.get(0).getKey());
		}
		
		for(int i = 0; i < name.size(); i++) {
			
			if(i != name.size()-1) {
				System.out.println(name.get(i));
			} else {
				System.out.print(name.get(i));
			}
		}
	}

	// Is Everybody Appy?
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<String[]> list = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int faNumber = Integer.parseInt(st.nextToken());
			String[] app = new String[faNumber];
			for(int j = 0; j < faNumber; j++) {
				app[j] = st.nextToken();
			}
			
			list.add(app);
		}
		StringBuilder sb = new StringBuilder();
		
		String mostApp = list.get(0)[0];
		sb.append(mostApp).append(" ");
		for(int i = 1; i < list.size(); i++) {
			for(int j = 0; j < list.get(i).length; j++) {
				if(!(sb.toString().contains(list.get(i)[j]))) {
					sb.append(list.get(i)[j]).append(" ");
					break;
				}
			}
		}
		System.out.println(sb.deleteCharAt(sb.length()-1));
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
