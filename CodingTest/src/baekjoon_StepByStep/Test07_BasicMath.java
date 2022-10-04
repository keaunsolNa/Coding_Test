package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test07_BasicMath {

	// 손익 분기점
	public static void test01() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		A = -A;
		int cnt = 0;
		if(B > C || (C-B) == 0) {
			System.out.println(-1);
		} else {
			System.out.println(((Math.abs(A))/(C-B) + 1));
		}
		
	}
	
	// 벌집
	public static void test02() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int temp = 1;
		int i = 1;
		if(N != 1) {
			while(N > temp) {
				temp += (i*6);
				i++;
			}
		}
		
		System.out.println(i);
	}

	// 분수 찾기
	public static void test03() {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		int now = 1;
		int prev = 0;
		
		while(true) {
			if(X <= now + prev) {
				if(now % 2 == 0) {
					System.out.println((X - prev) + "/" + (now - (X - prev - 1)));
				} else {
					System.out.println(now - (X - prev - 1) + "/" + (X - (prev)));
				}
				break;
			} else {
				prev += now;
				now++;
			}
		}
		
	}
	
	// 달팽이는 올라가고 싶다
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int day = (V - B) / (A - B);
		
		if((V - B) % (A-B) != 0) {
			day++;
		}
		
		System.out.println(day);
	}
	
	// ACM 호텔
	public static void test05() throws IOException {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i = 0; i < testCase; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			int userH = N%H;
			int userW = N/H + 1;
			if(userH == 0) {
				userH = H;
				userW = N/H;
			}
			if(userW < 10) {
				System.out.println(userH + "0" + userW);
			} else {
				System.out.println(userH + "" + userW);
			}
		}
		
	}
	
	// 부녀회장이 될테야
	public static void test06() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringBuilder sb = new StringBuilder();		
		int count = Integer.parseInt(br.readLine());
			
		int[][] apartment = new int [15][15];
			
		for(int i = 1; i < 15; i++) {
			apartment[0][i] = i;
		}
		
		for(int i = 1; i < 15; i++) {
			for(int j = 1; j < 15; j++) {
				if(j == 1)
					apartment[i][j] = 1;
				else
					apartment[i][j] = apartment[i - 1][j] + apartment[i][j - 1];
			}
		}
		
		for(int i = 0; i < count; i++) {
			int K = Integer.parseInt(br.readLine());
			int N = Integer.parseInt(br.readLine());
			
			sb.append(apartment[K][N]).append("\n");
		}
		
		System.out.print(sb); 
	}

	// 설탕 배달
	public static void test07() throws IOException {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int answer = -1;
		for(int i = N/5; i > 0; i--) {
			if(((N - (5*i))%3) == 0) {
				answer = i + ((N - (5*i))/3);
				break;
			} 
		}
		
		if(N%3 == 0  && answer == -1) {
			answer = N/3;
		}
		System.out.println(answer);
	}
	
	// 큰 수 A + B
	public static void test08() throws IOException {

		Scanner sc = new Scanner(System.in);
		BigInteger bigNumber = new BigInteger(sc.next());
		BigInteger bigNumber2 = new BigInteger(sc.next());
		
		System.out.println(bigNumber.add(bigNumber2));
		
	}
}
