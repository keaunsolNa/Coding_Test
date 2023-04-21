package baekjoon_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class DataStructure11 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}
	
	// 27964번 - 콰트로치즈피자
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Set<String> set = new HashSet<>();
		while(st.hasMoreTokens()) {
			set.add(st.nextToken());
		}
		
		Iterator<String> iter = set.iterator();
		
		int cnt = 0;
		boolean flag = false;
		while(iter.hasNext()) {
			
			String token = iter.next();
			if(token.endsWith("Cheese")) cnt++;
			
			if(cnt >= 4) {flag = true; break; };
		}
		
		System.out.println(flag ? "yummy" : "sad");
	}
	
	// 10527번 - Judging Troubles
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Map<String, Integer> map1 = new HashMap<>();
		for(int i = 0; i < N; i++) {
			
			String key = br.readLine();
			map1.put(key, map1.getOrDefault(key, 0) + 1);
			
		}
		
		Map<String, Integer> map2 = new HashMap<>();
		for(int i = 0; i < N; i++) {
			
			String key = br.readLine();
			map2.put(key, map2.getOrDefault(key, 0) + 1);
			
		}
		
		int ans = 0;
		
		for (String key : map1.keySet()) {
			
			int a = map1.containsKey(key) ? map1.get(key) : 0;
			int b = map2.containsKey(key) ? map2.get(key) : 0;
			
			ans += Math.min(a, b);
		}
			
		
		System.out.println(ans);
	}
	
	// 4351번 - Hay Points
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> hayPoint = new HashMap<>();
		while(N --> 0) {
			st = new StringTokenizer(br.readLine());
			hayPoint.put(st.nextToken(), Integer.parseInt(st.nextToken()));
		}
		
		long total = 0;
		while(true) {
			
			String input = br.readLine();
			if(input.equals(".")) {
				K--; 
				System.out.println(total);
				total = 0;
			}

			st = new StringTokenizer(input);
			while(st.hasMoreTokens()) {
				
				String key = st.nextToken();
				if(hayPoint.containsKey(key)) total += hayPoint.get(key);
				
			}
			
			if(K == 0) break;
			
		}
		
	}
	
	// 5349번 - Duplicate SSN
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = "";
		List<String> list = new ArrayList<>();
		Set<String> answer = new TreeSet<>();
		
		while((input = br.readLine()) != null) {
			
			if(list.contains(input)) answer.add(input);
			else list.add(input);
			
			if(input.equals("END")) break;
		}

		Iterator<String> iter = answer.iterator();
		
		while(iter.hasNext()) System.out.println(iter.next());
	}
	
	// 26559번 - Friends
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			int t = Integer.parseInt(br.readLine());
			
			Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
			while(t --> 0) {
				st = new StringTokenizer(br.readLine());
				String name = st.nextToken();
				int number = Integer.parseInt(st.nextToken());
				
				map.put(number, name);
			}
			
			Iterator<Integer> iter = map.keySet().iterator();
			
			while(iter.hasNext()) {
				
				String name = map.get(iter.next());
				if(iter.hasNext()) sb.append(name +", ");
				
				else sb.append(name +"\n");
			}
		}
		
		System.out.println(sb);
		
	}
	
	// 8270번 - Tulips
	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] arr = new boolean[15000];
		int N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		while(N --> 0) {
			
			arr[Integer.parseInt(st.nextToken()) - 1] = true;
		}
		
		int ans = 0;
		for(int i = 0; i < arr.length; i++) if(!arr[i]) ans++;
		
		System.out.println(ans);
			
	}
	
	// 26884번 - Kent-buggen
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		Set<String> list = new HashSet<>();
		Set<String> set = new HashSet<>();
		
		for(int i = 0; i < N; i++) {
			
			String name = br.readLine();
			
			if(list.contains(name)) set.add(name);
			else list.add(name);
		}
		
		System.out.println(set.size());
	}
	
	//
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		String input = "";
		while(!(input = br.readLine()).equals("0")){
			
			st = new StringTokenizer(input);
			int size = Integer.parseInt(st.nextToken());
			char[] line = st.nextToken().toCharArray();
			
			Set<Character> set = new HashSet<>();
			int people = 0;
			int answer = 0;
			for(int i = 0; i < line.length; i++) {
				
				if(set.contains(line[i])) { set.remove(line[i]); people--; }
				else { set.add(line[i]); people++; };
				
				if(people > size) answer++;
				
			}

			if(answer == 0) sb.append("All customers tanned successfully.");
			else sb.append(answer + " customer(s) walked away.");
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	//
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
	}
	
	//
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
	}
	
	
}
