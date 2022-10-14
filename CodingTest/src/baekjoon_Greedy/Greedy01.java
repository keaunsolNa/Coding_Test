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
		test10();
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
	
	//  우유 축제
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N  = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] milk = {0, 1, 2};
		int cnt = 0;
		int answer = 0;
		int index = 0;
		while(true) {
			if (index == N) {
				break;
			}
			int i = Integer.parseInt(st.nextToken());
			
			if(i == milk[cnt]) {
				answer++;
				cnt++;
			}
			
			if(cnt == 3) {
				cnt = 0;
			}
			index++;
			
		}
		
		System.out.println(answer);
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

	// 5와 6의 차이
	public static void test05() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String A = st.nextToken();
		String B = st.nextToken();
		int maxA = 0;
		int minA = 0;
		int maxB = 0;
		int minB = 0;
		if(A.contains("5") || A.contains("6")) {
			maxA = Integer.parseInt(A.replaceAll("5", "6"));
			minA = Integer.parseInt(A.replaceAll("6", "5"));
		} else {
			maxA = Integer.parseInt(A);
			minA = Integer.parseInt(A);
		}
		
		if(B.contains("5") || B.contains("6")) {
			maxB = Integer.parseInt(B.replaceAll("5", "6"));
			minB = Integer.parseInt(B.replaceAll("6", "5"));
		} else {
			maxB = Integer.parseInt(B);
			minB = Integer.parseInt(B);
		}
		
		System.out.println((minA+minB) + " " + (maxA+maxB));
	}
	
	// 세탁소 사장 동혁
	public static void test06() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int C = Integer.parseInt(br.readLine())*100;
			int Q = 0;
			int D = 0;
			int N = 0;
			int P = 0;
			if(C/2500 > 0) {
				Q += C/2500;
				C %= 2500;
			}
			
			if(C/1000 > 0) {
				D += C/1000;
				C %= 1000;
			}

			if(C/500 > 0) {
				N += C/500;
				C %= 500;
			}
			
			if(C/100 > 0) {
				P += C/100;
				C %= 100;
			}
			System.out.println(Q + " " + D + " " + N + " " + P);
		}
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

	// 피로도
	public static void test08() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int time = 0;
		int P = 0;
		int totalB = 0;
		while(time != 24) {
			if(P+A <= M) {
				P += A;
				totalB += B;
			} else {
				P -= C;
				if(P < 0) {
					P = 0;
				}
			}
			time++;
		}
		
		System.out.println(totalB);
	}

	// 욱제는 효도쟁이야!!
	public static void test09() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		List<Integer> arrayList = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			arrayList.add(Integer.parseInt(st.nextToken())); 
		}
		
		Collections.sort(arrayList);

		long Pay = 0;
		for(int i = 0; i < arrayList.size() - 1; i++) {
			Pay += arrayList.get(i);
		}
		
		System.out.println(Pay);
		
	}

	// 포인트 카드
	public static void test10() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		List<Integer> payList = new ArrayList<>();
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int cost = 0;
			if(A < N) {
				cost = (N-A);
			}
			
			payList.add(cost);
		}
		
		Collections.sort(payList);
		
		int totalPay = 0;
		for(int i = 0; i < payList.size()-1; i++) {
			totalPay += payList.get(i);
		}
		
		System.out.println(totalPay);
	}
	
}