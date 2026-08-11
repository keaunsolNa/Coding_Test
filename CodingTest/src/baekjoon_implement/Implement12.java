package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Implement12 {

	public static void main(String[] args) throws IOException {
		test01();
	}
	
	// Triangles 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = -1;
		
		while((input = Integer.parseInt(br.readLine())) != 0) {
			
			for(int i = 0; i < input; i++) {
				for(int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
	}
	
	// 주사위
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			StringBuilder sb  = new StringBuilder();
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append("Case " + (i+1) + ": " + + (a+b));
			System.out.println(sb);
		}
	}
	
	
	// 가위 바위 보?
	public static void test07() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			
			int N = Integer.parseInt(br.readLine());
			int win = 0;
			for(int j = 0; j < N; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				String P1 = st.nextToken();
				String P2 = st.nextToken();

				switch(P1) {
					case "P" : 
						win += P2.equals("R") ? 1 : P2.equals("S") ? -1 : 0;
						break;
					case "R" : 
						win += P2.equals("P") ? -1 : P2.equals("S") ? 1 : 0;
						break;
					case "S" : 
						win += P2.equals("P") ? 1 : P2.equals("R") ? -1 : 0;
						break;
				}
				
			}
			
			if(win > 0) {
				System.out.println("Player 1");
			} else if(win == 0) {
				System.out.println("TIE");
			} else {
				System.out.println("Player 2");
			}
		}
	}
	
	// 히스토그램
	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
        	int temp = Integer.parseInt(br.readLine());
        	
        	for(int j = 0; j < temp; j++) {
        		System.out.print("=");
        	}
        	System.out.println();
        }
	}
	
	
}
