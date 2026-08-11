package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Implement27 {

	public static void main(String[] args) throws IOException {
		test03();
	}
	
	
	// Teleportation 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
        int case1 = Math.abs(b - a);
        int case2 = Math.abs(a - x) + Math.abs(b - y);
        int case3 = Math.abs(a - y) + Math.abs(b - x);

        int answer = Math.min(case1, Math.min(case2, case3));

        System.out.print(answer);
	}
	
	// Golf 
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String input = "";
		
		int idx = 1;
		while(!(input = br.readLine()).equals("0 0")) {
			st = new StringTokenizer(input);
			int p = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			
			sb.append("Hole #" + idx + "\n");
			
			
			if(s == 1) {
				sb.append("Hole-in-one.");
				sb.append("\n" + "\n");
				idx++;
				continue;
			}
			
			switch(s - p) {
				
				case -2 : sb.append("Eagle." + "\n"); break;
				
				case -1 : sb.append("Birdie." + "\n"); break;
				
				case 0 : sb.append("Par." + "\n"); break;
				
				case 1 : sb.append("Bogey." + "\n"); break;
				
				default : 
					if(s - p < - 2) sb.append("Double eagle." + "\n"); 
					else sb.append("Double Bogey." + "\n"); break;
			}
			
			sb.append("\n");
			idx++;
		}
		
		sb.deleteCharAt(sb.length() - 1);
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	
	// 빙고
    private static int[][] bingo;
	public static void test07() throws IOException {
		Scanner sc = new Scanner(System.in);
		
		bingo = new int[5][5];
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) 
				bingo[i][j] = sc.nextInt();
		}

		
		for(int i = 1; i <= 25; i++) {
			int num = sc.nextInt();
			for(int j = 0; j < 5; j++) {
				
				for(int k = 0; k < 5; k++) {
					
					if(bingo[j][k] == num) bingo[j][k] = 0;
					
					if (check(j, k) >= 3) {
						System.out.println(i);
						return;
					}
				}
				
			}
		}
		
	}
	
	private static int check(int r, int c) {

		int cnt = 0;

		for (int i = 0; i < 5; i++) {
			int rcnt = 0;
			
			for (int j = 0; j < 5; j++) 
				if (bingo[i][j] == 0) rcnt++;
			
			if (rcnt == 5) cnt++;
			
		}

		for (int i = 0; i < 5; i++) {
			int cnt2 = 0;
			
			for (int j = 0; j < 5; j++) 
				if (bingo[j][i] == 0) cnt2++;
			
			if (cnt2 == 5) cnt++;
			
		}

		int cnt2 = 0;
		for (int i = 4; i >= 0; i--) {

			if (bingo[4-i][i] == 0) cnt2++;
			if (cnt2 == 5) cnt++;
			
		}

		cnt2 = 0;
		for (int i = 0; i < 5; i++) {
			if ( bingo[i][i] == 0) cnt2++;
			if (cnt2 == 5) cnt ++;
		}
		
		return cnt;
	}
	
	
}
