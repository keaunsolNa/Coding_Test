package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Implement28 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// Head or Tail 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int input = -1;
		
		while((input = Integer.parseInt(br.readLine())) != 0) {
			st = new StringTokenizer(br.readLine());
			
			int w1 = 0;
			int w2 = 0;
			for(int i = 0; i < input; i++) {
				
				int x = Integer.parseInt(st.nextToken());
				if(x == 0) w1++;
				else w2++;
				
			}
			
			sb.append("Mary won " + w1 +" times and John won " + w2 + " times" + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
		
	}
	
	// Gradabase 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			sb.append("Case " + i + ":" + "\n");
			for(int j = 0; j < N; j++) {
				int grade = Integer.parseInt(br.readLine());
				
				if(grade != 6) sb.append(grade + 1).append("\n");
			}
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);

	}
	
	// Aron 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		if(N == 1) {
			br.readLine();
			System.out.println(2);
			return;
		}
		
		char prev = br.readLine().charAt(0);
		int ans = 2;
		N--;
		while(N --> 0) {
			char input = br.readLine().charAt(0);
			
			if(prev != input) ans++;
			
			prev = input;
		}
		
		System.out.print(ans);
	}
	
	// 종이접기
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		long sum = 0;
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < N; j++) {
				int temp = Integer.parseInt(st.nextToken());
				sum += temp;
			}
		}
		
		System.out.println(sum);
	}
	
	// 창용이의 시계
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		
		int time = (3600 * h) + (60 * m) + s;
		int q = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < q; i++) {
			st = new StringTokenizer(br.readLine());
			
			int T = Integer.parseInt(st.nextToken());
			int C = 0;
			if(T == 1) {
				
				C = Integer.parseInt(st.nextToken());
				time = (time + C) % 86400;
				
			} else if (T == 2){
				
				C = Integer.parseInt(st.nextToken());
				time = (time - C) % 86400;
				if(time < 0) time += 24 * 3600;
				
			} else {
				
				System.out.println((time / 3600) + " " + (time / 60 % 60) + " " + (time % 60));
			}
			
		}
		
	}
	
	// 11월 11일
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			int year = Integer.parseInt(st.nextToken());
			int month = Integer.parseInt(st.nextToken());
			int day = month;
			
			switch(month - 1) {
				case 1 : 
				case 3 :
				case 5 : 
				case 7 :
				case 8 :
				case 10 : 
				case 12 : 
					
					sb.append(year + " " + (month - 1) + " " + 31);
					break;
					
				case 4 :
				case 6 : 
				case 9 : 
				case 11 :
					
					sb.append(year + " " + (month - 1) + " " + 30);
					break;
					
				case 2 : 
					
					if((year % 100 != 0 && year % 4 == 0) || year % 400 == 0) 
						
						sb.append(year + " " + (month - 1) + " " + 29);
					
					else 
						sb.append(year + " " + (month - 1) + " " + 28);
					break;
					
				case 0 : 
					
					sb.append((year - 1) + " " + 12 + " " + 31);
			}
			
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
    }
    
	// The fellowship of the ring
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int W = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int cnt = 0;
		while(P --> 0) {
			int H = Integer.parseInt(st.nextToken());
			
			if(H >= W && H <= N) cnt++;
		}
		
		System.out.println(cnt);
	}
	
	// Oddities
	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        while(N --> 0) {
        	int X = Integer.parseInt(br.readLine());
        	
        	if(X % 2 == 0) sb.append(X + " is even" + "\n");
        	else sb.append(X + " is odd" + "\n");
        }
        
        sb.deleteCharAt(sb.length() -1);
        System.out.print(sb);
        
	}
	
	// Sim Card
	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String input = "";
        
        while(!(input = br.readLine()).equals("0 0")) {
        	st = new StringTokenizer(input);
        	
        	int time = Integer.parseInt(st.nextToken());
        	int bite = Integer.parseInt(st.nextToken());
        	
        	sb.append(Math.min((time * 30) + (bite * 40), Math.min((time * 35) + (bite * 30), (time * 40) + (bite * 20)))).append("\n");
        }
        
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
	}
	
	// Donation Packaging
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		int A = 0;
		int B = 0;
		int C = 0;
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			A += Integer.parseInt(st.nextToken());
			B += Integer.parseInt(st.nextToken());
			C += Integer.parseInt(st.nextToken());
			
			if(A >= 30 && B >= 30 && C >= 30) {
				
				int min = Math.min(A, Math.min(B, C));
				
				sb.append(min + "\n");
				A -= min;
				B -= min;
				C -= min;
				
			} else sb.append("NO" + "\n");
				
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
		
	}
	
}
