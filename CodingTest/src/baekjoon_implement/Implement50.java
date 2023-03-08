package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Implement50 {
   
	public static void main(String[] args) throws IOException {
		test02();
	}
	
	// 10709번 - 기상캐스터
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		
		char[][] map = new char[H][W];
		for(int i = 0; i < H; i++) {
			String input = br.readLine();
			for(int j = 0; j < W; j++) 
				map[i][j] = input.charAt(j);
		}

		int[][] answer = new int[H][W];
		for(int i = 0; i < H; i++) {
			
			int cnt = 1;
			boolean cloud = false;
			for(int j = 0; j < W; j++) {
				
				if(!cloud && map[i][j] != 'c') answer[i][j] = -1;
				
				else if(map[i][j] == 'c' && !cloud) {
					answer[i][j] = 0;
					cloud = true;
				}
				
				else if(cloud && map[i][j] == 'c') {
					answer[i][j] = 0;
					cnt = 1;
				}
				
				else if(cloud && map[i][j] != 'c') {
					answer[i][j] = cnt;
					cnt++;
				}
			}
		}
		
		for (int[] is : answer) {
			
			for (int is2 : is) {
				System.out.print(is2 + " ");
			}
			System.out.println();
		}
	}
	
	// 5638번 - Escape Route
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		while(T --> 0) {
			
			int N = Integer.parseInt(br.readLine());
			
			char[][] map = new char[N][N];
			int[] s = new int[2];
			for(int i = 0; i < N; i++) {
				
				String str = br.readLine();
				for(int j = 0; j < N; j++) {
					char temp = str.charAt(j);
					map[i][j] = temp;
					
					if(temp == 's') {
						s[0] = i;
						s[1] = j;
					}
					
				}
			}
			double minDis = Double.MAX_VALUE;
			int[] p = new int[2];
			for(int i = 0; i < N; i++) {
				
				for(int j = 0; j < N; j++) {
					
					if(map[i][j] == 'p') {
						double dis = Math.pow((Math.pow(i - s[0], 2) + Math.pow(j - s[1], 2)), 0.5);
						
						if(minDis > dis) {
							
							minDis = Math.min(minDis, dis);
							p[0] = i;
							p[1] = j;
						}
					}
				}
			}
			
			String ans = String.format("%.2f", minDis);
			
			sb.append("(" + s[0] + "," + s[1] + "):(" +p[0] + "," + p[1] + "):" + ans + "\n");
		}
		
		System.out.println(sb);
	}
	
	// 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
	}
	
	// 
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
	}
	
	// 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
	}
	
	// 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
	}
	
	// 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
	}
	
	// 
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
	}
	
	// 
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
	}
	
	// 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
	}
	
	
	
	
}
