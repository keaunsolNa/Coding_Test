package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Implement46 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 9782번 - Median 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int idx = 1;
		
		while(true) {
			
			st = new StringTokenizer(br.readLine());
			
			int T = Integer.parseInt(st.nextToken());
			if(T == 0) break;
			
			int[] arr = new int[T];
			
			for(int i = 0; i < T; i++) arr[i] = Integer.parseInt(st.nextToken());
			
			double ans = 0;
			if(T % 2 != 0) ans = arr[T / 2];
			else ans = (double)(arr[T / 2 - 1] + arr[T / 2]) / 2;
			
			sb.append("Case " + idx +": " + ans + "\n");
			idx++;
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
		
	}
	
	// 9772번 - Quadrants
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		while(true) {
			
			st = new StringTokenizer(br.readLine());
			double x = Double.parseDouble(st.nextToken());
			double y = Double.parseDouble(st.nextToken());
			

			String ans = "";
			if(x == 0 && y == 0) {
				ans = "AXIS";
				sb.append(ans);
				break;
			}
			
			if(x == 0 || y == 0) ans = "AXIS";
			else if(x < 0 && y < 0) ans = "Q3";
			else if(x < 0 && y > 0) ans = "Q2";
			else if(x > 0 && y > 0) ans = "Q1";
			else if(x > 0 && y < 0) ans = "Q4";
			
			sb.append(ans + "\n");
		}
	
		System.out.print(sb);
		
	}
	
	// 27475번 - Cancel the Trains
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			st = new StringTokenizer(br.readLine());
			int downToUp = Integer.parseInt(st.nextToken());
			int leftToRight = Integer.parseInt(st.nextToken());
			int crash = 0;
			
			List<Integer> down = new ArrayList<>();
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < downToUp; i++) down.add(Integer.parseInt(st.nextToken()));
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < leftToRight; i++) 
				if(down.contains(Integer.parseInt(st.nextToken()))) crash++;
			
			sb.append(crash + "\n");
			
		}
		
		System.out.println(sb);
	}
	
	// 18312번 - 시각
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int cnt = 0;
		
		for(int h = 0; h <= N; h++) {
			
			for(int m = 0 ; m < 60; m++) {
				
				for(int s = 0; s < 60; s++) {

					if(h % 10 == K || h / 10 == K || m % 10 == K || m / 10 == K || s % 10 == K || s / 10 == K) cnt++;
					
				}
			}
		}
		
		System.out.println(cnt);
	}
	
	// 14593번 - 2017 아주대학교 프로그래밍 경시대회 (Large)
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int maxScore = 0;
		int recordC = 0;
		int recordL = 0;
		int winner = 0;
		
		for(int i = 0; i < N; i++) {
	
			st = new StringTokenizer(br.readLine());
			
			int S = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			int L = Integer.parseInt(st.nextToken());
			
			if(S > maxScore) {
				
				maxScore = S;
				recordC = C;
				recordL = L;
				winner = i + 1;
				
			} else if(S == maxScore) {
				
				if(C < recordC) {
					
					recordC = C;
					recordL = L;
					winner = i + 1;
					
				} else if(C == recordC) {
					
					if(L < recordL) {
						recordL = L;
						winner = i + 1;
					}
					
				}
			}
		}
		
		System.out.println(winner);
	}
	
	// 2331번 - 반복수열
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<>();
		list.add(A);
		
		while(true) {
			
			int temp = list.get(list.size() - 1);
			int res = 0;
			
			while(temp != 0) {
				res += (int) Math.pow(temp % 10, (double)P);
				temp /= 10;
			}
			
			if(list.contains(res)) {
				int ans = list.indexOf(res);
				System.out.println(ans);
				break;
			}
			
			list.add(res);
		}
		
	}
	
	// 14594번 - 동방 프로젝트 (Small)
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		boolean[] wall = new boolean[N - 1];
		int cnt = 0;

		for(int i = 0; i < M; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			for(int j = start - 1; j < end - 1; j++) wall[j] = true;
			
		}
		
		for (boolean b : wall) if(!b) cnt++;
		
		
		System.out.println(cnt + 1);
		
	}
	
	// 10708번 - 크리스마스 파티
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[] target = new int[M];
		int[] point = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) target[i] = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < M; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < N; j++) {
				int temp = Integer.parseInt(st.nextToken());
				
				if(target[i] == temp) point[j]++;
				else point[target[i] - 1]++;
			}
		}
		
		for(int i = 0; i < N; i++) System.out.println(point[i]);
		
	}
	
	// 14724번 - 관리자는 누구?
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int totalMax = 0;
		String[] winner = new String[] {"PROBRAIN", "GROW", "ARGOS", "ADMIN", "ANT", "MOTION", "SPG", "COMON", "ALMIGHTY"}; 
		String ans = "";
		
		for(int i = 0; i < 9; i++) {
			
			st = new StringTokenizer(br.readLine());
			int max = 0;
			for(int j = 0; j < N; j++) {
				max = Math.max(Integer.parseInt(st.nextToken()), max);
			}
			
			if(totalMax < max) {
				totalMax = max;
				ans = winner[i];
			}
		}
		
		System.out.print(ans);
		
	}
	
	// 23055번 - 공사장 표지판
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < N; j++) {
				
				if((i == 0) || (i == N - 1)) sb.append("*");
				else if((j == 0) || (j == N - 1)) sb.append("*");
				else if((i == j) || (i == N - 1 - j)) sb.append("*");
				else sb.append(" ");
				
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}
	
}
