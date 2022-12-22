package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Test13_SetAndMap {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}
	
	// 숫자 카드
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			int temp = Integer.parseInt(st.nextToken());
			map.put(temp, map.getOrDefault(temp, 0) + 1);
		}

		int M = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < M; i ++) {
			int temp = Integer.parseInt(st.nextToken());
			if(map.containsKey(temp)){
				sb.append(1).append(" ");
			} else {
				sb.append(0).append(" ");
			}
		}
		
		System.out.println(sb);
	}
	
	// 문자열 집합
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Set<String> set = new HashSet<>();
		for(int i = 0; i < N; i++) {
			set.add(br.readLine());
		}
		
		int cnt = 0;
		for(int i = 0; i < M; i++) {
			if(set.contains(br.readLine())) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

	// 나는야 포켓몬 마스터 이다솜
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> pocketmon = new LinkedHashMap<>();
		String[] nameArr = new String[N + 1];
		
		for(int i = 1; i < N + 1; i++) {
			String name = br.readLine();
			pocketmon.put(name, i);
			nameArr[i] = name;
		}

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < M; i++) {
			
			String temp = br.readLine();
			try {
				
				int number = Integer.parseInt(temp);
				sb.append(nameArr[number]).append("\n");
				
			} catch(java.lang.NumberFormatException e) {
				
				sb.append(pocketmon.get(temp)).append("\n");
				
			}
			
		}
		
		System.out.println(sb);
	}

	// 숫자 카드 2
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<Integer, Integer> hashMap = new HashMap<>();	
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int temp = Integer.parseInt(st.nextToken());
			hashMap.put(temp, hashMap.getOrDefault(temp, 0) + 1);	
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < M; i++) {
			int temp = Integer.parseInt(st.nextToken());
			int answer = 0;
			
			try {
				answer = hashMap.get(temp);
			} catch(java.lang.NullPointerException e) {
				answer = 0;
			}
			sb.append(answer + " ");
		}
		
		System.out.println(sb);
	}

	// 듣보잡
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> hashMap = new HashMap<>();
		List<String> arrList = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			hashMap.put(br.readLine(), 1);
		}
		
		for(int i = 0; i < M; i++) {
			String temp = br.readLine();
			hashMap.put(temp, hashMap.getOrDefault(temp, 0) + 1);
			if(hashMap.get(temp) == 2) arrList.add(temp);
		}
		
		Collections.sort(arrList);
		sb.append(arrList.size() + "\n");
		for (String string : arrList) {
			sb.append(string + "\n");
		}
		
		System.out.println(sb);
	}

	// 대칭 차집합
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		Set<Integer> ASet = new HashSet<>();
		Set<Integer> AMBSet = new HashSet<>();
		for(int i = 0; i < A; i++) {
			int temp = Integer.parseInt(st.nextToken());
			ASet.add(temp);
			AMBSet.add(temp);
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		Set<Integer> BSet = new HashSet<>();
		Set<Integer> BMASet = new HashSet<>();
		for(int i = 0; i < B; i++) {
			int temp = Integer.parseInt(st.nextToken());
			BSet.add(temp);
			BMASet.add(temp);
		}
		
		AMBSet.removeAll(BSet);
		BMASet.removeAll(ASet);
		
		System.out.println(AMBSet.size() + BMASet.size());
	}
	
	// 서로 다른 부분 문자열의 개수
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		Set<String> hashSet = new HashSet<>();
		
		for(int i = 0; i <= s.length(); i++) {
			for(int j = i + 1; j <= s.length(); j++) {
				if(!hashSet.contains(s.substring(i, j))) {
					hashSet.add(s.substring(i, j));
				}
			}
		};
		
		System.out.println(hashSet.size());
		
	}



}
