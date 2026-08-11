package baekjoon_Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Greedy03 {
	public static void main(String[] args) throws IOException {
		test03();
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
	
    
}