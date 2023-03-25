package baekjoon_DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
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
		test06();
	}
	
	// 2910번 - 빈도 정렬
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		Map<Integer, Integer> inputArr = new HashMap<>();
		Map<Integer, Integer> bindoMap = new HashMap<>();
		
		st = new StringTokenizer(br.readLine());
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			
			int number = Integer.parseInt(st.nextToken());
			
			bindoMap.put(number, bindoMap.getOrDefault(number, 0) + 1);
			if(inputArr.containsKey(number)) continue;
			inputArr.put(number, cnt);
			cnt++;
		}
		

		List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(bindoMap.entrySet());
		entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				
				if(o2.getValue() == o1.getValue()) {
					return inputArr.get(o1.getKey()) - inputArr.get(o2.getKey());
				}
				return o2.getValue() - o1.getValue();
			}
		});
		
		for(int i = 0; i < entryList.size(); i++) {
			
			for(int j = 0; j < entryList.get(i).getValue(); j++) {
				System.out.print(entryList.get(i).getKey() + " ");
			}
			
		}
	}
	
	// 1972번 - 놀라운 문자열
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			String input = br.readLine();
			String answer = " is surprising.";
			if(input.equals("*")) break;
			
			for(int i = 0; i < input.length()-1; i++) {

				List<String> list = new ArrayList<String>();
                HashSet<String> set = new HashSet<String>();
                
                for(int j = 0; j < input.length() - i - 1; j++) {
                	
                    String pair_string = "" + input.charAt(j) + input.charAt(j+i+1);
                    list.add(pair_string);
                    set.add(pair_string);
                }
		
                if(list.size() != set.size()) {
                	answer = " is NOT surprising.";
                	break;
                }
            }
			
			System.out.println(input + answer);
		}
		
	}
	
	// 14426번 - 접두사 찾기
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int cnt  = 0;
		
		Map<Character, List<String>> map = new TreeMap<>();
		
		for(int i = 0; i < N; i++) {
			String temp = br.readLine();
			char key = temp.charAt(0);
			
			if(map.containsKey(key)) {
				map.get(key).add(temp);
			} else {
				
				List<String> arr = new ArrayList<>();
				arr.add(temp);
				map.put(key, arr);
				
			}
		};
		
		System.out.println(map);
		for(int i = 0; i < M; i++) {
			
			String temp = br.readLine();
			Character start = temp.charAt(0);
			
			if(!map.containsKey(start)) continue;
			for(int j = 0; j < map.get(start).size(); j++) {
				
				if(map.get(start).get(j).startsWith(temp)) {
					cnt++;
					break;
				}
			}
		}
		
		System.out.println(cnt);
	}
	
	// 26043번 - 식당 메뉴
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		PriorityQueue<Integer> studentA = new PriorityQueue<>();
		PriorityQueue<Integer> studentB = new PriorityQueue<>();
		Queue<int[]> studentC = new LinkedList<>();
		
		int N = Integer.parseInt(br.readLine());
		
		while(N --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int order = Integer.parseInt(st.nextToken());
			
			switch(order) {
				
				case 1 :
					
					studentC.add(new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
					break;
					
				case 2 : 
					
					int menu = Integer.parseInt(st.nextToken());
					int[] student = studentC.poll();
					
					if(student[1] == menu) studentA.add(student[0]);
					else studentB.add(student[0]);
					
			}
					
		}
		
		System.out.println(returner(studentA).toString());
		System.out.println(returner(studentB).toString());
		
		if(studentC.isEmpty()) System.out.println("None");
		
		else {
			
			StringBuilder sb = new StringBuilder();
			while(!studentC.isEmpty()) sb.append(studentC.poll()[0]).append(" ");
			
			System.out.print(sb.deleteCharAt(sb.length() - 1));
		}
		
	}
	
	private static StringBuilder returner(PriorityQueue<Integer> que) {
		
		StringBuilder answer = new StringBuilder();
		
		if(que.isEmpty()) answer.append("None");
		
		else {
			
			while(!que.isEmpty()) answer.append(que.poll()).append(" ");
			
			answer.deleteCharAt(answer.length() - 1);
		}
			
		return answer;
	}
	
	// 14911번 - 궁합 쌍 찾기
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(br.readLine().split(" ")).map(String::trim).mapToInt(Integer::parseInt).toArray();
		
		int target = Integer.parseInt(br.readLine());
		Map<Integer, Integer> map = new TreeMap<>();
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr.length; j++) {
				
				if(i == j) continue;
				
				if(arr[i] + arr[j] == target) {
					if(arr[i] >= arr[j]) map.put(arr[j], arr[i]);
					else map.put(arr[i], arr[j]);
				}
			}
		}
		
		List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
		entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				
				if(o2.getKey() == o1.getKey()) 
					return o1.getValue() - o2.getValue();
				return o1.getKey() - o2.getKey();
			}
		});
		
		for (Entry<Integer, Integer> entry : entryList) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.print(entryList.size());
	}
	
	// 1270번 - 전쟁 - 땅따먹기
	public static void test06() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        
        while (n-- > 0) {
        	
            System.gc();	// 가비지콜렉터 호출
            
            TreeMap<Long, Integer> map = new TreeMap<>();
            long res = 0;
            long idx = -1;
            
            st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());
            
            for (int i = 0; i < T; i++) {
            	
                long num = Long.parseLong(st.nextToken());
                map.put(num, map.getOrDefault(num, 0) + 1);
                
                long tmp = map.get(num);
                if (tmp > res) {
                    idx = num;
                    res = tmp;
                }
            }
            
            if (res > T / 2) sb.append(idx).append('\n');
            else sb.append("SYJKGW").append('\n');
            
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
	}
	
	// 
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
	}
	
	
}
