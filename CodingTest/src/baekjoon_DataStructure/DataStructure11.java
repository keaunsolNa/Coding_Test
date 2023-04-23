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
	
	private static class Tree implements Comparable<Tree> {
		int x;
		int y;
		int z;

		Tree(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}

		@Override
		public int compareTo(Tree t) {
			return this.z - t.z;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
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
	
	// 4649번 - Tanning Salon
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		String input = "";
		while(!(input = br.readLine()).equals("0")){
			
			st = new StringTokenizer(input);
			int size = Integer.parseInt(st.nextToken());
			char[] line = st.nextToken().toCharArray();
			
			List<Character> list = new ArrayList<>();
			Set<Character> ans = new HashSet<>();
			for(int i = 0; i < line.length; i++) {
				
				if(!list.contains(line[i]) && list.size() < size) list.add(line[i]);
				else if(list.contains(line[i])) list.remove((Object)line[i]); 
				else if(!list.contains(line[i]) && list.size() >= size) ans.add(line[i]);
				
			}

			if(ans.size() == 0) sb.append("All customers tanned successfully.");
			else sb.append(ans.size() + " customer(s) walked away.");
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	// 16235번 - 나무 재테크
	private static int N, M, K;
	private static int[][] A;
	private static int[][] map;
	private static ArrayList<Tree> trees = new ArrayList<>();
	private static ArrayList<Tree> liveTrees;
	private static ArrayList<Tree> deadTrees;
	private static int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
	private static int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		map = new int[N][N];
		A = new int[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = 5;
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < M; i++) {
			
			st = new StringTokenizer(br.readLine());
			trees.add(new Tree(Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken())));
		}

		while (K > 0) {
			liveTrees = new ArrayList<>();
			deadTrees = new ArrayList<>();
			Collections.sort(trees);
			spring();
			summer();
			fall();
			winter();
			K--;
		}
		
		System.out.println(trees.size());
	}
	
	private static void spring() {
		for (int i = 0; i < trees.size(); i++) {
			Tree t = trees.get(i);
			if (t.z > map[t.x][t.y]) {
				deadTrees.add(t);
			} else {
				map[t.x][t.y] -= t.z;
				t.z += 1;
				liveTrees.add(t);
			}
		}
		trees.clear();
		trees.addAll(liveTrees);
	}

	private static void summer() {
		for (int i = 0; i < deadTrees.size(); i++) {
			Tree t = deadTrees.get(i);
			map[t.x][t.y] += t.z / 2;
		}
	}

	private static void fall() {
		for (int i = 0; i < trees.size(); i++) {
			Tree t = trees.get(i);
			if (t.z % 5 == 0) {
				for (int j = 0; j < 8; j++) {
					int px = t.x + dx[j];
					int py = t.y + dy[j];
					if (0 <= px && px < N && 0 <= py && py < N) {
						trees.add(new Tree(px, py, 1));
					}
				}
			}
		}
	}

	private static void winter() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] += A[i][j];
			}
		}
	}
	
	// 17479번 - 정식당
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> normal = new HashMap<String, Integer>();
		for(int i = 0; i < A; i++) {
			
			st = new StringTokenizer(br.readLine());
			normal.put(st.nextToken(), Integer.parseInt(st.nextToken()));
			
		}
		
		Map<String, Integer> unique = new HashMap<String, Integer>();
		for(int i = 0; i < B; i++) {
			st = new StringTokenizer(br.readLine());
			unique.put(st.nextToken(), Integer.parseInt(st.nextToken()));
		}
		
		List<String> special = new ArrayList<>();
		for(int i = 0; i < C; i++) special.add(br.readLine());
		
		int order = Integer.parseInt(br.readLine());
		
		long normalOrder = 0;
		long uniqueOrder = 0;
		int specialOrderCount = 0;
		
		for(int i = 0; i < order; i++) {

			String menu = br.readLine();
			
			if(normal.containsKey(menu)) normalOrder += normal.get(menu);
			else if(unique.containsKey(menu)) uniqueOrder += unique.get(menu);
			else specialOrderCount++;
		}
		
		 if((normalOrder < 20000 && uniqueOrder > 0) || (normalOrder + uniqueOrder < 50000 && specialOrderCount > 0) || specialOrderCount > 1)
	            System.out.println("No");
	        else
	            System.out.println("Okay");
		 
	}
	
	
}
