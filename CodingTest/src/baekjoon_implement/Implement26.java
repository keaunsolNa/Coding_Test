package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Implement26 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// Tawla
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String[] temp = br.readLine().split(" ");
			int A = Integer.parseInt(temp[0]);
			int B = Integer.parseInt(temp[1]);

			String answer = "";
			if(B > A) {
				int number = A;
				A = B;
				B = number;
			}
			
			if(A == B) {
				
				switch(A) {
					case 1 : answer = "Habb Yakk"; break;
					case 2 : answer = "Dobara"; break;
					case 3 : answer = "Dousa"; break;
					case 4 : answer = "Dorgy"; break;
					case 5 : answer = "Dabash"; break;
					case 6 : answer = "Dosh"; break;
				}
				
			} else if(A == 6 && B == 5) answer = "Sheesh Beesh";
			
			else {
				
				switch(A) {
					case 1 : answer = "Yakk"; break;
					case 2 : answer = "Doh"; break;
					case 3 : answer = "Seh"; break;
					case 4 : answer = "Ghar"; break;
					case 5 : answer = "Bang"; break;
					case 6 : answer = "Sheesh"; break;
				}
				
				switch(B) {
				
					case 1 : answer += " Yakk"; break;
					case 2 : answer += " Doh"; break;
					case 3 : answer += " Seh"; break;
					case 4 : answer += " Ghar"; break;
					case 5 : answer += " Bang"; break;
					case 6 : answer += " Sheesh"; break;
				}
			}
			
			sb.append("Case " + (i+1) + ": " + answer + "\n");
		}
		
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb);
	}
	
	// Koncert 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			
			double r = 0;
			double g = 0;
			double b = 0;
			for(int j = 0; j < 10; j++) {
				
				st = new StringTokenizer(br.readLine());
				r += Integer.parseInt(st.nextToken());
				g += Integer.parseInt(st.nextToken());
				b += Integer.parseInt(st.nextToken());
				
			}
			
			System.out.println(Math.round(r / 10) + " " + Math.round(g / 10) + " " + Math.round(b / 10));
			
		}

	}
	
	// Broken Calculator 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		long prev = 1;
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			String oper = st.nextToken();
			int B = Integer.parseInt(st.nextToken());
			
			long result = 0;
			
			switch(oper) {
				case "+" : result = (A + B - prev); break;
				case "-" : result = ((A - B) * prev); break;
				case "*" : result = (long) Math.pow(A * B, 2); break;
				case "/" :
					if(A % 2 == 0) result = A / 2;
					else result = (A + 1) / 2;
			}
			
			System.out.println(result);
			prev = result;
		}
		
	}
	
	// 改元
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String input = "";
		
		while(!(input = br.readLine()).equals("#")) {
			st = new StringTokenizer(input);
			
			String heisei = st.nextToken();
			int year = Integer.parseInt(st.nextToken());
			int month = Integer.parseInt(st.nextToken());
			int day = Integer.parseInt(st.nextToken());
			
			if(year == 31) {
				if(month >= 5) {
					heisei = "?";
					year -= 30;
				}
			} else if(year > 31) {
				heisei = "?";
				year -= 30;
			}
			
			sb.append(heisei + " " + year + " " + month + " " + day + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	// Hedgemony (Small)
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			
			int N = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine());
			double[] arr = new double[N];
			for(int n = 0; n < N; n++) arr[n] = Integer.parseInt(st.nextToken());
			
			for(int c = 1; c < N - 1; c++) {
				
				if(arr[c] > (arr[c - 1] + arr[c + 1]) / 2)
					arr[c] = (arr[c - 1] + arr[c + 1]) / 2;
			}
			
			System.out.print("Case #" + i + ": ");
			System.out.printf("%.6f", arr[N - 2]);
			System.out.println();
		}
	}
	
	// Hedgemony (Large)
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			
			int N = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine());
			double[] arr = new double[N];
			for(int n = 0; n < N; n++) arr[n] = Integer.parseInt(st.nextToken());
			
			for(int c = 1; c < N - 1; c++) {
				
				if(arr[c] > (arr[c - 1] + arr[c + 1]) / 2)
					arr[c] = (arr[c - 1] + arr[c + 1]) / 2;
			}
			
			System.out.print("Case #" + i + ": ");
			System.out.printf("%.6f", arr[N - 2]);
			System.out.println();
		}
		
	}
	
	// ICONS
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int minSum = Integer.MAX_VALUE;
		int minRow = Integer.MAX_VALUE;
		int minCol = Integer.MAX_VALUE;
		
	    for(int i = 1; i <= N; i++) {
	    	
	        int j = N % i == 0 ? N / i : N / i + 1;
	        
	        if(i + j < minSum) {
	        	
	            minSum = i + j;
	            minRow = i;
	            minCol = j;
	            
	        }
	    }
	    
	    System.out.println(minRow + " " + minCol);
	}
	
	// 전북대학교
	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        if(N % 2 == 0) {
        	System.out.println("I LOVE CBNU");
        	return;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) sb.append("*");
        sb.append("\n");
        
        int mid = Math.round(N / 2) + 1;
        
        for (int i = 0; i < mid; i++) {
        	
            if (i == 0) {
            	
            	for(int j = 0; j < N / 2; j++) sb.append(" ");
            	sb.append("*");
            	sb.append("\n");
            	
            }
            
            
            else {
            	
                int center = (i == 1) ? i : i * 2 - 1;
                for(int j = 0; j < N / 2 - i; j++) sb.append(" ");
                sb.append("*");
                
                for(int j = 0; j < center; j++) sb.append(" ");
                sb.append("*");
                sb.append("\n");
                
            }
        }
        
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
        
	}
	
	// Divisors
	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        while(T --> 0) {
        	int number = Integer.parseInt(br.readLine());

        	int sum = 0;
        	for(int i = 1; i <= number; i++) {
        		if(number % i == 0) sum++;
        	}
        	
        	sb.append(number +" " + sum + "\n");
        }
        
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
	}
	
	// Fence Painting 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		boolean[] fence = new boolean[101];
		for(int i = A; i < B; i++) fence[i] = true;
		for(int i = C; i < D; i++) fence[i] = true;
		
		int ans = 0;
		for(int i = 0; i <= 100; i++) {
			if(fence[i]) ans++;
		}
		
		
		System.out.println(ans);
	}
	
	
	
}
