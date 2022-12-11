package baekjoon_Competition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class WinterForestInvitation {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test01();
	}
	
	// 눈 치우기
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] snow = new int[N];
		int total = 0;
		for(int i = 0; i < N; i++) {
			snow[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(snow);
		for(int i = snow.length - 1; i >= 0; i--) {
			if(snow[i] <= 0) continue;
			for(int j = i -1; j >= 0; j--) {
				while(snow[i] > 0 && snow[j] > 0) {
					snow[i]--;
					snow[j]--;
					total++;
				}
			}
			
			if(total > 1440) {
				break;
			}
		}
		
		for (int i : snow) {
			if( i > 0) total+=i;
		}
		
		if(total > 1440) {
			System.out.println(-1);
		} else {
			System.out.println(total);
		}
		
	}
}