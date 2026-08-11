package baekjoon_Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Greedy01 {
	public static void main(String[] args) throws IOException {
		test01();
	}
	
	// 전자레인지
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int time  = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();

		if(time%10 != 0) {
			System.out.println(-1);
		} else {
			int a = time/300;
			time = time%300;
			int b = time/60;
			time = time%60;
			int c = time/10;

			System.out.println(a + " " + b + " " + c);
		}
		
	}
	
	
	// 캥거루 세 마리
	public static void test03() throws IOException{
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			String[] ABC =  sc.nextLine().split(" ");
			int A = Integer.parseInt(ABC[0]);
			int B = Integer.parseInt(ABC[1]);
			int C = Integer.parseInt(ABC[2]);
				
			if(B - A > C - B) {
				System.out.println(B-A-1);
			} else {
				System.out.println(C-B-1);
			}
		}
	}

	// 거스름돈
	public static void test04() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pay = Integer.parseInt(br.readLine());
		
		int charge = 1000-pay;
		int cnt = 0;
		
		if(charge/500 > 0) {
			cnt += charge/500;
			charge %= 500;
		}
		
		if(charge/100 > 0) {
			cnt += charge/100;
			charge %= 100;
		}
		
		if(charge/50 > 0) {
			cnt += charge/50;
			charge %= 50;
		}

		if(charge/10 > 0) {
			cnt += charge/10;
			charge %= 10;
		}
		
		if(charge/5 > 0) {
			cnt += charge/5;
			charge %= 5;
		}
		
		if(charge/1 > 0) {
			cnt += charge/1;
			charge %= 1;
		}
		
		System.out.println(cnt);
	}

	
	// Holes 
	public static void test07() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int hole = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		if(hole == 0) {
			sb.append(1);
		} else if(hole == 1) {
			sb.append(0);
		} else {
			if(hole%2 == 0) {
				for(int i = 0; i < hole/2; i++) {
					sb.append(8);
				}
			} else {
				sb.append(4);
				for(int i = 0; i < hole/2; i++) {
					sb.append(8);
				}
			}
		}
		System.out.println(sb);
		
	}


}