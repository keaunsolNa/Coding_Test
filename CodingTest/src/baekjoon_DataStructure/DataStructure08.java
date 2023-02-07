package baekjoon_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class DataStructure08 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}
	
	// 20001번 - 고무오리 디버깅
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		int ans = 0;
		while(true) {
		
			input = br.readLine();
			if(input.equals("고무오리 디버깅 끝")) break;
			if(input.equals("문제")) ans++;
			if(input.equals("고무오리")) {
				
				if(ans > 0) ans--;
				else ans += 2;
			}
			
		}
		
		if(ans == 0) System.out.println("고무오리야 사랑해");
		else System.out.println("힝구");
	}
	
	// 13417번 - 카드 문자열
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		while(T --> 0) {
			
			int length = Integer.parseInt(br.readLine());
			char[] input = br.readLine().replaceAll(" ", "").toCharArray();
			
			sb2.append(input[0]);
			for(int i = 1; i < input.length; i++) {
				if((int)sb2.charAt(0) >= (int)input[i]) sb2.insert(0, input[i]);
				else sb2.append(input[i]);
			}
			
			sb.append(sb2 + "\n");
			sb2.setLength(0);
		}
		
		System.out.println(sb);
	}
	
	// 1235번 - 학생 번호
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] stu = new String[N];
		
		for(int i = 0; i < N; i++) stu[i] = br.readLine();
		
		int idx = 0;
		int ans = 0;
		int length = stu[0].length();
		while(true) {
			
			Set<String> set = new HashSet<>();
			for(int i = 0; i < N; i++) set.add(stu[i].substring(length - idx - 1, length));
			ans++;	
			idx++;
			if(set.size() == N) break;
		}
		
		System.out.println(ans);
	}
	
	// 8669번 - Las
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int g = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			set.add(r);
			
		}
		
		System.out.println(set.size());
	}
	
	// 8715번 - Permutacja
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		boolean[] arr = new boolean[T + 1];
		
		for(int i = 0; i < T; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if(temp > T) {
				System.out.println("NIE");
				return;
			}
			arr[temp] = true;
		}
		
		for(int i = 1; i <= T; i ++) {
			
			if(!arr[i]) {
				System.out.println("NIE");
				return;
			}
		}
		
		System.out.println("TAK");
		
	}
	
	// 15235번 - Olympiad Pizza
	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		Queue<Integer> que = new LinkedList<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0;  i < T; i++) que.add(Integer.parseInt(st.nextToken()));
		int[] arr = new int[T];
		int cnt = 1;
		boolean[] chk = new boolean[T];
		
		while(!que.isEmpty()) {
			
			for(int i = 0; i < T; i++) {
				
				if(!chk[i]) {
					if(que.peek() == 1) {
						arr[i] = cnt;
						chk[i] = true;
						que.poll();
						cnt++;
					}
					else {
						arr[i] = cnt;
						cnt++;
						que.add(que.poll() - 1);
					}
				}
			}
			
		}
		
		for (int i : arr) System.out.print(i + " ");
		
	}
	
	// 3077번 - 임진왜란 
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap<>();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) map.put(st.nextToken(), i);
        

        String[] input = br.readLine().split(" ");

        int cnt = 0;

        for (int i = 0; i < N - 1; i++) 
            for (int j = i + 1; j < N; j++) 
            	if (map.get(input[i]) < map.get(input[j])) cnt++;

        System.out.println(cnt + "/" + N * (N - 1) / 2);

	}
	
	// 
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
	}
	
	// 
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
	}
	
	// 
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
	}
	





}
