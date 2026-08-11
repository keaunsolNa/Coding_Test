package baekjoon_Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Greedy03 {
	public static void main(String[] args) throws IOException {
		test02();
	}
	
	
	// 반복
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int cnt = 1;
		char cur = input.charAt(0);
		
		for (int i = 1; i < input.length(); i++) {
			char next = input.charAt(i);
			if(next - 'a' <= cur - 'a') cnt++;
			cur = next;
		}
		
		System.out.println(cnt);
	}
	
	//  가위 바위 보
	private static int totalWin;
	private static int roundWin;
	private static int maxWin;
	public static void test03() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int R = Integer.parseInt(br.readLine());
		String sangen = br.readLine();
		
		int N = Integer.parseInt(br.readLine());
		String[] friend = new String[N];
		for(int i = 0; i < N; i++) friend[i] = br.readLine();
		
		totalWin = 0;
		maxWin = 0;
		
		for(int i = 0; i < R; i++) {
			
			char rsp = sangen.charAt(i);
			int r = 0;
			int s = 0;
			int p = 0;
			for(int j = 0; j < N; j++) {
				
				char frsp = friend[j].charAt(i);
				totalWin += rcp(rsp, frsp);
				r += rcp('R', frsp);
				s += rcp('S', frsp);
				p += rcp('P', frsp);
			}
			
			maxWin += Math.max(Math.max(r, s), p);
		}
			
		System.out.println(totalWin);
		System.out.println(maxWin);
	}

	private static int rcp(char sangen, char friend) {
		roundWin = 0;
		switch(friend) {
		
			case 'S' : roundWin += sangen == 'S' ? 1 : sangen == 'R' ? 2 : 0; break; 
				
			case 'R' : roundWin += sangen == 'R' ? 1 : sangen == 'P' ? 2 : 0; break; 
				
			case 'P' : roundWin += sangen == 'P' ? 1 : sangen == 'S' ? 2 : 0; break; 
		}
		
		return roundWin;
	}
	
	// 카약과 강풍
	public static void test04() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		boolean[] broken = new boolean[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < S; i++) 
			broken[Integer.parseInt(st.nextToken()) - 1] = true;

		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < R; i++) {
			
			int target = Integer.parseInt(st.nextToken()) - 1;
			
			if(broken[target]) broken[target] = false;
			else {
				if(target != 0 && target != N - 1) {
					if(broken[target - 1]) broken[target - 1] = false;
					else broken[target + 1] = false;
				}
				else if(target == 0) broken[target + 1] = false;
				else if(target == N- 1) broken[target - 1] = false;
			}
		}
		
		int cnt = 0;
		for (boolean b : broken) 
			if(b) cnt++;
		
		System.out.println(cnt);
	}
    
	
}