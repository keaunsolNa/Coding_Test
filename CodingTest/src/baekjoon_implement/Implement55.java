package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Implement55 {
    
	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 28074번 - 모비스
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		if(countChar(input, 'M') > 0 && countChar(input, 'O') > 0 && countChar(input, 'B') > 0 && countChar(input, 'I') > 0 && countChar(input, 'S') > 0){ 
			System.out.println("YES");  
		}
		
		else System.out.println("NO");
			
	}
	
   public static long countChar(String str, char ch) {
       return str.chars()
               .filter(c -> c == ch)
               .count();
   }
   
	// 28135번 - Since 1973
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			
			if((i + "").contains("50")) cnt++;
			cnt++;
		}
		
		System.out.println(cnt);
	}
	
	// 28114번 - 팀명 정하기
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[] yearArr = new int[3];
		Map<Integer, Character> map = new TreeMap<>(Comparator.reverseOrder());
		
		for(int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			
			int solve = Integer.parseInt(st.nextToken());
			int year = Integer.parseInt(st.nextToken()) % 100;
			char name = st.nextToken().charAt(0);
			
			yearArr[i] = year;
			map.put(solve, name);
		}
		
		Arrays.sort(yearArr);
		for (int i : yearArr) System.out.print(i);
		
		System.out.println();
		
		for (int key : map.keySet()) System.out.print(map.get(key));
		
	}
	
	// 27325번 - 3 つの箱 (Three Boxes) 
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		char[] order = br.readLine().toCharArray();
		
		int now = 1;
		int ans = 0;
		for(int i = 0; i < N; i++) {
			
			if(order[i] == 'R') {
				
				if(now != 3) now += 1;
				
			} else {
				
				if(now != 1) now -= 1;
			}
			
			if(now == 3) ans++;
			
		}
		
		System.out.println(ans);
	}
	
	// 17924번 - Cooking Water 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());

		int min = Integer.MAX_VALUE;
		int max = 0;
		while(N --> 0) {
			
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			max = Math.max(a, max);
			min = Math.min(min, b);
		}
		
		System.out.println(max > min ? "edward is right" : "gunilla has a point");
		
	}
	
	// 17884번 - Lost Lineup
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Map<Integer, Integer> map = new TreeMap<>();
		for(int i = 0; i < N - 1; i++) {
			
			int people = Integer.parseInt(st.nextToken());
			int idx = i + 2;
			
			map.put(people, idx);
		}
		
		System.out.print("1 ");
		for (int key : map.keySet()) {
			System.out.print(map.get(key) + " ");
		}
	}
	
	// 9913번 - Max
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		Map<Integer, Integer> map = new HashMap<>();
		while(N --> 0) {
			
			int seq = Integer.parseInt(br.readLine());
			map.put(seq, map.getOrDefault(seq, 0) + 1);
		}
		
		List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
		entryList.sort(Map.Entry.comparingByValue());
		
		System.out.println(entryList.get(map.size() - 1).getValue());
	}
	
	// 3895번 - 롤 케이크
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int L = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());

		boolean[] cake = new boolean[L + 1];
		
		int max = 0;
		int peopleIdx = 0;
		int maxGet = 0;
		int peopleGet = 0;
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int p = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			int term = k - p ;
			
			if(term > max) {
				max = term;
				peopleIdx = i + 1;
			} else if(term == max) {
				
				if(peopleIdx > i + 1) peopleIdx = i + 1;
			}
			
			int get = 0;
			for(int j = p; j <= k; j++) {
				
				if(!cake[j]) {
					cake[j] = true;
					get++;
				}
			}
			
			if(maxGet < get) {
				maxGet = get;
				peopleGet = i + 1;
			}
			
			else if(maxGet == get) {
				
				if(peopleGet > i + 1) peopleGet = i + 1;
			}
		}
		
		System.out.println(peopleIdx);
		System.out.println(peopleGet);
	}
	
	// 8912번 - Sales
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			int N = Integer.parseInt(br.readLine());
			int cnt = 0;
			
			int[] arr = new int[N];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
			
			for(int i = 1; i < N; i++) {
				for(int j = 0; j < i; j++) if(arr[i] >= arr[j]) cnt++;
			}
			
			System.out.println(cnt);
		}
	}
	
	// 13772번 - Holes 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		while(N --> 0) {
			
			int cnt = 0;
			char[] input = br.readLine().toCharArray();
			
			for(int i = 0; i < input.length; i++) {
				
				cnt += (input[i] == 'A' || input[i] == 'D' || input[i] == 'O' || input[i] == 'P' || input[i] == 'Q' || input[i] == 'R') ? 1 
						: input[i] == 'B' ? 2 : 0;
			}
			
			System.out.println(cnt);
		}
	}
	
	
	
	
}
