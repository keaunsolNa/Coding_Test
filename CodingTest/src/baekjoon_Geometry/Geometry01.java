package baekjoon_Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Geometry01 {
	public static void main(String[] args) throws IOException {
		test09();
	}
	
	// 1297번 - TV 크기
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int D = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		double res = Math.sqrt(Math.pow(D, 2) / (Math.pow(H, 2) + Math.pow(V, 2)));
		System.out.print((int)Math.floor(res * H) + " ");
		System.out.println((int)Math.floor(res * V));
		
	}
	
	// 6502번 - 동혁 피자
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int idx = 1;
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			double r = Integer.parseInt(st.nextToken());
			if(r == 0) break;
			
			double w = Integer.parseInt(st.nextToken());
			double l = Integer.parseInt(st.nextToken());

			double circle = Math.PI * r * r;
			double square = w * l;
			
			sb.append("Pizza " + idx);
			
			if(w * w + l * l <= 4 * r * r) sb.append(" fits on the table.");
			else sb.append(" does not fit on the table.");
			
			sb.append("\n");
			idx++;
		}
		
		System.out.print(sb);
	}
	
	// 17247번 - 택시 거리
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[2][2];
		boolean chk = false;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				
				int temp = Integer.parseInt(st.nextToken());
				if(temp == 1 && !chk) {
					chk = true;
					map[0][0] = i;
					map[0][1] = j;
				}
				
				if(temp == 1 && chk) {
					map[1][0] = i;
					map[1][1] = j;
				}
			}
		}
		
		System.out.print(Math.abs(map[0][0] - map[1][0]) + Math.abs(map[0][1] - map[1][1]));
		
	}
	
	// 17177번 - 내접사각형 만들기
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		double r1 = a * a - b * b;
		double r2 = a * a - c * c;
		double d = (Math.sqrt(r1 * r2) - b * c) / a;
		
		if(d < 0) System.out.println(-1);
		else System.out.println((int) d);
	}
	
	// 5617번 - 問題 1
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String input = "";
		int T = 0;
		int RT = 0;
		int AT = 0;
		int OT = 0;

		while((input = br.readLine()) != null) {
			
			st = new StringTokenizer(input);
			int[] arr= new int[3];
			for(int i = 0; i < 3; i++) arr[i] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(arr);
			
			if(arr[0] + arr[1] <= arr[2]) {
				
				break; 
				
			} else {
				
				T++;				
				int ab = arr[0] * arr[0]  + arr[1] * arr[1];
				int c = arr[2] * arr[2];
				
				if(ab == c) RT++;
				else if(ab > c) AT++;
				else if(ab < c) OT++;
				
			}
		}
		
		System.out.println(T + " " + RT + " " + AT + " " + OT);
		
	}
	
	// 15449번 -Art
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[5];
		for(int i = 0; i < 5; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		int cnt = 0;
		for(int i = 0; i < 5; i++) {
			
			for(int j = i + 1; j < 5; j++) {
				
				for(int k = j + 1; k < 5; k++) {
					
					if(arr[i] + arr[j] > arr[k]) {
						
						if((arr[i] + arr[j] + arr[k]) / 2 > 0 )
						cnt++;
					}
				}
			}
		}
		
		System.out.println(cnt);
		
	}
	
	// 8716번 - Pole 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int x1 = Integer.parseInt(st.nextToken());
		int y1 = Integer.parseInt(st.nextToken());
		int x2 = Integer.parseInt(st.nextToken());
		int y2 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int x3 = Integer.parseInt(st.nextToken());
		int y3 = Integer.parseInt(st.nextToken());
		int x4 = Integer.parseInt(st.nextToken());
		int y4 = Integer.parseInt(st.nextToken());
		
		if(x2 < x3 || x1 > x4 || y1 < y4 || y2 > y3) System.out.println(0);
	    
	    else {
	    	long lx = Math.max(x1, x3);
	    	long rx = Math.min(x2, x4);
	    	long ry = Math.max(y2, y4);
	    	long ly = Math.min(y1, y3);
	    	
	    	long width = rx - lx;
	    	long height = ry - ly;
	    	
	    	System.out.println(Math.abs(width * height));
	    }
		
	}
	
	// 2756번 - 다트 
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			double[] dart = new double[12];
			for(int j = 0; j < 12; j++) dart[j] = Math.abs(Double.parseDouble(st.nextToken()));
			
			double P1 = 0;
			double P2 = 0;
			int tern = 1;
			
			for(int j = 0; j < 12;) {
				
				for(int k = 0; k < 3; k++) {
					double dis = dart[j] * dart[j] + dart[j + 1] * dart[j + 1];
					if(tern == 1) 
						P1 += dis <= 9 ? 100 : dis <= 36 ? 80 : dis <= 81 ? 60 : dis <= 144 ? 40 : dis <= 225 ? 20 : 0;
					else 
						P2 += dis <= 9 ? 100 : dis <= 36 ? 80 : dis <= 81 ? 60 : dis <= 144 ? 40 : dis <= 225 ? 20 : 0;
					j += 2;
				}
				tern = tern == 1 ? 2 : 1;
				
			}
			
			String P1S = String.format("%.0f", P1);
			String P2S = String.format("%.0f", P2);
			sb.append("SCORE: " + P1S + " to " + P2S + ", ");
			if(P1 > P2) sb.append("PLAYER 1 WINS.");
			else if(P2 > P1) sb.append("PLAYER 2 WINS.");
			else sb.append("TIE.");
			
			sb.append("\n");
		}

		System.out.print(sb);
	}
	
	// 16480번 - 외심과 내심은 사랑입니다
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long R = Long.parseLong(st.nextToken());
		long r = Long.parseLong(st.nextToken());
		
		System.out.print((R * (R -2 * r)));
	}
	
	// 16481번 - 원 전문가 진우 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long r1 = Long.parseLong(st.nextToken());
		long r2 = Long.parseLong(st.nextToken());
		long r3 = Long.parseLong(st.nextToken());
		
		System.out.printf("%.10f", (double)(r1 * r2 * r3) / (r1 * r2 + r2 * r3 + r1 * r3));
	}
	
	
	
}
