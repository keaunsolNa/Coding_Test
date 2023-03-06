package baekjoon_GraphTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class GraphTheory01 {
	public static void main(String[] args) throws IOException {
		test04();
	}
	
	// 9372번 - 상근이의 여행
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			for(int i = 0; i < M; i++) br.readLine();
			
			sb.append((N - 1) + "\n");
		}
		
		System.out.println(sb);
	}
	
	// 6416번 - 트리인가? 
	public static void test02() throws IOException {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> map;
		int tc = 1;
		
		while(true) {
			
			map = new HashMap<>();
			int edge = 0;
			
			while(true) {
				
				int A = sc.nextInt();
				int B = sc.nextInt();
				if(A == -1 && B == -1) return;
				else if(A == 0 && B == 0) break;

				map.put(A, map.getOrDefault(A, 0));
				map.put(B, map.getOrDefault(B, 0) + 1);
				edge++;
			}
			
			boolean chk = true;
			int root = 0;
			
			Iterator<Integer> key = map.keySet().iterator();
			
			while(key.hasNext()) {
				if(map.get(key.next()) == 0) root++;
				
				if(root > 1) {
					chk = false;
					break;
				}
			}
			
			if(map.size() == 0) 
				System.out.println("Case " + tc + " is a tree.");
			else if(chk && root == 1 && edge == map.size() - 1) 
				System.out.println("Case " + tc + " is a tree.");
			else
				System.out.println("Case " + tc + " is not a tree.");
			tc++;
		}
		
	}
	
	// 11558번 - The Game of Death
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			int N = Integer.parseInt(br.readLine());
			int[] table = new int[N + 1];
			boolean[] chk = new boolean[N + 1];
			for(int i = 1; i <= N; i++) table[i]= Integer.parseInt(br.readLine());
			
			int idx = 1;
			int cnt = 0;
            boolean flag = false;
            while(!chk[idx]) {
            	
            	chk[idx] = true;
                if(idx == N) {
                    flag = true;
                    break;
                }
                
                idx = table[idx];
                cnt++;
            }
            
            System.out.println(flag ? cnt : 0);
		}
		
	}

	//
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
	}
	
	// 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
	}
	
	// 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
	}
	
	// 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
	}
	
	// 
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
	}
	
	// 
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
	}
	
	// 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
	}
	
}
