package baekjoon_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Sort07 {
	
	private static class inputString implements Comparable<inputString> {
		
		String input;
		
		inputString(String input) {
			this.input = input;
		}

		@Override
		public int compareTo(inputString str) {
			
			if(this.input.length() == str.input.length()) {
				
				return this.input.compareTo(str.input);
			}
			
			else return this.input.length() - str.input.length();
		}
	}
	
	private static class point implements Comparable<point> {
		
		int x;
		int y; 
		int z;
		String name;
		
		point(int x, int y, int z, String name) {
			this.x = x;
			this.y = y;
			this.z = z;
			this.name = name;
		}

		@Override
		public int compareTo(point o) {
			
			if(this.x != o.x) 
				return o.x - this.x;
			
			else if(this.y != o.y) 
				return this.y - o.y;
			
			else if(this.z != o.z) 
				return o.z - this.z;
			
			else 
				return this.name.compareTo(o.name);
				
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		test08();
	}	
	
	// 13333번 - Q-인덱스
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		
		for(int i = n; i > 0; i--) {
			
			if(arr[n - i] >= i) {
				System.out.println(i);
				return;
			}
		}
		
		System.out.println(0);
	}
	
	// 7596번 - MP3 Songs
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int idx = 1;
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			
			String[] input = new String[n];
			for(int i = 0; i < n; i++) input[i] = br.readLine();
			
			Arrays.sort(input);
			
			sb.append(idx + "\n");
			for(int i = 0; i < n; i++) sb.append(input[i] + "\n");
			idx++;
		}
		
		System.out.println(sb);
	}
	
	// 26150번 - Identify, Sort, Index, Solve
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		Map<Integer, Character> map = new TreeMap<>();
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			String name = st.nextToken();
			int index = Integer.parseInt(st.nextToken());
			int D = Integer.parseInt(st.nextToken()) - 1;
			
			char value = ((int)name.charAt(D) > 90) ? (char)((int)name.charAt(D) - 32) : name.charAt(D);
			map.put(index, value);
		}
		
		for (Integer key : map.keySet()) System.out.print(map.get(key));
			
		
	}
	
	// 27674번 - A+B
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder answer = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			br.readLine();
			char[] input = br.readLine().toCharArray();

			Arrays.sort(input);
			StringBuilder sb = new StringBuilder();
			
			for (char c : input) sb.append(c);
			String sort = sb.reverse().toString();

			answer.append(Long.parseLong(sort.substring(0, sort.length() - 1)) + Character.getNumericValue(sort.charAt(sort.length() - 1)) + "\n");
		}
		
		System.out.println(answer);
		
	}
	
	// 8633번 - Sortowanie biżuterii 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		PriorityQueue<inputString> list = new PriorityQueue<>();
		for(int i = 0; i < N; i++) {

			list.add(new inputString(br.readLine()));
		}

		while(!list.isEmpty()) System.out.println(list.poll().input);
	}
	
	// 20568번 - Recess Rocks 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		int cnt = 0;
		for(int i = 1; i < n; i++) {
			if(arr[i] <= arr[i - 1]) cnt++;
		}
		
		System.out.println(cnt);
		
		
	}
	
	// 10825번 - 국영수
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		PriorityQueue<point> list = new PriorityQueue<>();
		
		for(int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());
			
			list.add(new point(x, y, z, name));
		}
		
		while(!list.isEmpty()) System.out.println(list.poll().name);
		
	}
	
	// 
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		
	}

	// 
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
	}
	
	// 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
	}
	
	
}
