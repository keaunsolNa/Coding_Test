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
		test10();
	}
	
	// Hawk eyes 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int small = 1;
		int big = 4;
				
		for(int i = 0; i < input.length(); i++) {
			
			switch(input.charAt(i)) {
				case 'A' : 
					small = small == 1 ? 2 : small == 2 ? 1 : small;
					big = big == 1 ? 2 : big == 2 ? 1 : big;
					break;
				case 'B' :
					small = small == 1 ? 3 : small == 3 ? 1 : small;
					big = big == 1 ? 3 : big == 3 ? 1 : big;
					break;
				case 'C' : 
					small = small == 1 ? 4 : small == 4 ? 1 : small;
					big = big == 1 ? 4 : big == 4 ? 1 : big;
					break;
				case 'D' : 
					small = small == 2 ? 3 : small == 3 ? 2 : small;
					big = big == 2 ? 3 : big == 3 ? 2 : big;
					break;
				case 'E' :
					small = small == 2 ? 4 : small == 4 ? 2 : small;
					big = big == 2 ? 4 : big == 4 ? 2 : big;
					break;
				case 'F' :
					small = small == 3 ? 4 : small == 4 ? 3 : small;
					big = big == 3 ? 4 : big == 4 ? 3 : big;
					break;
			}
		}
		
		System.out.println(small);
		System.out.println(big);
	}
	
	// Transactions
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String input = "";
		
		while(!(input = br.readLine()).equals("0 W 0")) {
			st = new StringTokenizer(input);
			
			int firstMoney = Integer.parseInt(st.nextToken());
			String WD = st.nextToken();
			int money = Integer.parseInt(st.nextToken());
			
			if(WD.equals("D")) {
				if(firstMoney + money >= -200) {
					sb.append(firstMoney + money).append("\n");
				} else {
					sb.append("Not allowed" + "\n");
				}
			} else {
				if(firstMoney - money >= -200) {
					sb.append(firstMoney - money).append("\n");
				} else {
					sb.append("Not allowed" + "\n");
				}
			}
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);

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
	
	// Stopwatch 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		if(T % 2 != 0) {
			System.out.println("still running");
			return;
		}
		
		int total = 0;
		while(T --> 0) {
			int start = Integer.parseInt(br.readLine());
			int stop = Integer.parseInt(br.readLine());
			T--;
			
			total += stop - start;
		}
		
		System.out.println(total);
	}
	
	// 스위치 켜고 끄기
	private static int[] button;
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		button = new int[N + 1];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i < N + 1; i++) button[i] = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < s; i++) {
			st = new StringTokenizer(br.readLine());
			
			if(Integer.parseInt(st.nextToken()) == 1) {
				int number = Integer.parseInt(st.nextToken());
				
				man(number);

			} else {
				
				int number = Integer.parseInt(st.nextToken());
				women(number);
				
			}
			
		}
		
        for(int i = 1; i < button.length; i++) {
        	sb.append(button[i] + " ");
        	if(i % 20 == 0) sb.append("\n");
        }
        
        System.out.print(sb);
	}
	
    private static void man(int x) {
    	int now = x;
    	
    	while(now < button.length) {
    		button[now] = button[now] == 1 ? 0 : 1;
    		now += x;
    	}
    }
    
    private static void women(int x) { 	

		button[x] = button[x] == 1 ? 0 : 1;
    	
    	int count = 1;
    	while((x - count) > 0 && (x + count) < button.length) {
    		
    		if(button[x + count] == button[x - count]) {
    			
    			button[x + count] = button[x + count] == 1 ? 0 : 1;
    			button[x - count] = button[x - count] == 1 ? 0 : 1;
    			count++;
    			
    		} else break;
    		
    	}
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
	
	// Overdraft 
	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int money = 0;
        int mini = 0;
        while(N --> 0) {
        	int input = Integer.parseInt(br.readLine());
        	
        	money += input;
        	
        	if(money < 0) 
        		mini = Math.max(mini, Math.abs(0 - money));
        }
        
        System.out.println(mini);
        
	}
	
	// Elder 
	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String owner = br.readLine();
        int T = Integer.parseInt(br.readLine());
        int cnt = 1;
        Set<String> ownerlist = new HashSet<>();
        ownerlist.add(owner);
        
        while(T --> 0) {
        	st = new StringTokenizer(br.readLine());
        	
        	String winner = st.nextToken();
        	String loswer = st.nextToken();
        	
        	if(loswer.equals(owner)) {
        		if(!ownerlist.contains(winner)) cnt++;
        		ownerlist.add(winner);
        		owner = winner;
        	}
        }
        
        System.out.println(owner);
        System.out.print(cnt);
	}
	
	// Automated Checking Machine
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int[] arr1 = new int[5];
		for(int i = 0; i < 5; i++) arr1[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] arr2 = new int[5];
		for(int i = 0; i < 5; i++) arr2[i] = Integer.parseInt(st.nextToken());

		String answer = "Y";
		for(int i = 0; i < 5; i++) {
			if(arr1[i] == arr2[i]) {
				answer = "N";
				break;
			}
		}
		
		System.out.println(answer);
		
	}
	
	
	
}
