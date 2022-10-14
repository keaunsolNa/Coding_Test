package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Implement08 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// Gnome Sequencing
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		System.out.println("Gnomes:");
		for(int i = 0; i < testCase; i++) {
			String[] arr = br.readLine().split(" ");
			if(Integer.parseInt(arr[0]) < Integer.parseInt(arr[1]) && Integer.parseInt(arr[1]) < Integer.parseInt(arr[2])) {
				System.out.println("Ordered");
			} else if(Integer.parseInt(arr[0]) > Integer.parseInt(arr[1]) && Integer.parseInt(arr[1]) > Integer.parseInt(arr[2])) {
				System.out.println("Ordered");
			} else {
				System.out.println("Unordered");
			}
		}
	}
	
	// Counting Clauses
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		
		if(A >= 8) {
			System.out.println("satisfactory");
		} else {
			System.out.println("unsatisfactory");
		}
	}
	
	// Andando no tempo
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		if(A == B || B == C || A == C) {
			System.out.println("S");
		} else if(A + B == C || A + C == B || B + C == A) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}
	}
	
	// SMS from MCHS
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int C = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		if(C < 0 && D >= 10) {
			System.out.println("A storm warning for tomorrow! Be careful and stay home if possible!");
		} else if(A > C) {
			System.out.println("MCHS warns! Low temperature is expected tomorrow.");
		} else if(A <= C && B < D) {
			System.out.println("MCHS warns! Strong wind is expected tomorrow.");
		} else {
			System.out.println("No message");
		}
	}
	
	// Checkers 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		if(A >= B) {
			System.out.println(B);
		} else {
			System.out.println(A+1);
		}
	}
	
	// The Fastest Sorting Algorithm In The World 
	public static void test06() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cnt = 1;

		while(true) {
			String s = br.readLine();
			if(s.equals("0")) {
				break;
			} 
			sb.append("Case ").append(cnt).append(": Sorting... done!").append("\n");
			cnt++;
		}
		
		System.out.println(sb);
	}
	
	// 帰省 (Homecoming) 
	public static void test07() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		if(C >= A && C < B) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		 
	}
	
	// Máquina de café
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		int AT = (B*2) + (C*4);
		int BT = (A*2) + (C*2);
		int CT = (A*4) + (B*2);
		
		System.out.println(Math.min(Math.min(AT, BT), CT));
		
	}
	
	// Tournament Selection
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int winCnt = 0;
		for(int i = 0; i < 6; i++) {
			String WOL = br.readLine();
			if(WOL.equals("W")) {
				winCnt++;
			}
		}
		
		if(winCnt >= 5) {
			System.out.println(1);
		} else if(winCnt >= 3) {
			System.out.println(2);
		} else if(winCnt >= 1) {
			System.out.println(3);
		} else {
			System.out.println(-1);
		}
	}
	
	// Kuber
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long A = Long.parseLong(br.readLine());
		
		long answer = 0;
		for(int i = 1; i <= A; i++) {
			answer += Math.pow(i, 3);
		}
		
		System.out.println(answer);
	}
	
}
