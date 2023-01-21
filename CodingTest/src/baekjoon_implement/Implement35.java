package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Implement35 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// Cabin Baggage 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		int ans = 0;
		while(T --> 0) {
			
			st = new StringTokenizer(br.readLine());
			double t1 = Double.parseDouble(st.nextToken());
			double t2 = Double.parseDouble(st.nextToken());
			double t3 = Double.parseDouble(st.nextToken());
			double t4 = Double.parseDouble(st.nextToken());
			
			double sum = t1 + t2 + t3;
			
			boolean chk = false;
			if((t1 <= 56 && t2 <= 45 && t3 <= 25) || sum <= 125) chk = true; 
			
			if(t4 > 7) chk = false;
				
			if(chk) {
				ans++;
				sb.append(1);
			} else sb.append(0);
			
			sb.append("\n");
		}
		
		System.out.print(sb);
		System.out.println(ans);
	}
	
	// General Election
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[N];
			for(int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				
				for(int j = 0; j < N; j++) {
					arr[j] += Integer.parseInt(st.nextToken());
				}
			}
		
			int max = Integer.MIN_VALUE;
			int winner = 0;
			for(int ans = 0; ans < N; ans++) {
				if(arr[ans] > max) {
					max = arr[ans];
					winner = ans + 1;
				}
			}
			
			System.out.println(winner);
			
		}
		
	}
	
	// Abdelrahman 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());

		int idx = 1;
		while(T --> 0) {
			
			st = new StringTokenizer(br.readLine());
			int computer = Integer.parseInt(st.nextToken());
			int cable = Integer.parseInt(st.nextToken());
			
			int need = computer - 1;
			
			sb.append("Case " + idx + ": " + (cable - need) + " \n");
			idx++;
		}
		
		System.out.println(sb);
		
	}
	
	// 에어팟
	public static void test04() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int prev = 0;
        int cnt = 1;
        
        st = new StringTokenizer(br.readLine());
        while (n--> 0) {
        	
            int now = Integer.parseInt(st.nextToken());
            
            if (now != prev) {
                cnt = 1;
                prev = now;
            }
            
            cnt *= 2;
            sum += cnt;
         
            if (sum >= 100) {
                sum = 0;
                cnt = 1;
            }
            
        }
        System.out.println(sum);
			
	}
	
	// TV Reports
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		while(n --> 0) {
			int input = Integer.parseInt(br.readLine());
			
			if(input > h) {
				sb.append("BBTV: Dollar reached " + input + " Oshloobs, A record!" + "\n");
				h = input;
				p = input;
			}
			
			if(input < p) {
				sb.append("NTV: Dollar dropped by " + (p - input) + " Oshloobs" + "\n");
				p = input;
			}
			
			else p = input;
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	// Floppies 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		final int fileSize = 1860000;
		
		int cnt = 1;
		while(true) {
			long input = Long.parseLong(br.readLine());
			
			if(input == 0) break;
			
			if(input % 2 == 0) input /= 2;
			else input = (input + 1) / 2;
			
			input += input / 2;
			sb.append("File #" + cnt + "\n");
			sb.append("John needs " + ((input + fileSize - 1) / fileSize) + " floppies." + "\n");
			
			sb.append("\n");
			
			cnt++;
		}
		
		System.out.print(sb);
	}
	
	// Non Classical Problem
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		double sum = 0;
		
		while(N --> 0) {
			
			st = new StringTokenizer(br.readLine());
			double A = Double.parseDouble(st.nextToken());
			double B = Double.parseDouble(st.nextToken());
			
			double number = A / B;
			
			sum += number;
			max = Math.max(number, max);
			min = Math.min(number, min);
		}
		
		System.out.printf("%.11f", min);
		System.out.print(" ");
		System.out.printf("%.11f", max);
		System.out.print(" ");
		System.out.printf("%.11f", sum);
	}
	
	// Balloons Colors
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			int[] p = new int[N];
			for(int i = 0; i < N; i++) p[i] = Integer.parseInt(st.nextToken());
			
			boolean easy = false;
			boolean hard = false;
			
			if(p[0] == X) easy = true;
			if(p[N - 1] == Y) hard = true;
			
			if(easy && hard) sb.append("BOTH" + "\n");
			else if(easy) sb.append("EASY" + " \n");
			else if(hard) sb.append("HARD" + "\n");
			else sb.append("OKAY" + "\n");
			
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
		
	}
	
	// Katmandu(23997)
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int cur = 0;
		boolean can = false;
		for(int i = 0; i < M; i++) {
			int t = Integer.parseInt(br.readLine());

			if((t - cur) >= T) can = true;
			cur = t;
		}
		
		if(D - cur >= T) can = true;
		
		if(can) System.out.println("Y");
		else System.out.println("N");
	}
	
	// Curve Speed(21167)
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = "";
		
        while ((input = br.readLine()) != null) {
        	
            String[] parts = input.split(" ");
            double R = Double.parseDouble(parts[0]);
            double S = Double.parseDouble(parts[1]);
            double result = Math.sqrt(R * (S + 0.16) / 0.067);
            
            DecimalFormat df = new DecimalFormat("#");
            df.setRoundingMode(RoundingMode.HALF_UP);
            System.out.println((Integer.toString((int)Math.round(result))));
            
        }		
	}
	
	
	
}
