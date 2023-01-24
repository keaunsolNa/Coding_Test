package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Implement31 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// Balancing Weights
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			int N = Integer.parseInt(br.readLine());
			int res = 0;
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < N; i++) 
				res += Integer.parseInt(st.nextToken());
			
            if (res > 0) System.out.println("Right");
            else if (res < 0) System.out.println("Left");
            else System.out.println("Equilibrium");
            
            
		}
		
	}

	// When Do We Finish? 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String input = "";
		
		while(!(input = br.readLine()).equals("00:00 00:00")) {
			st = new StringTokenizer(input);
			
			String start = st.nextToken();
			String need = st.nextToken();
			
			int SH = Integer.parseInt(start.split(":")[0]);
			int SM = Integer.parseInt(start.split(":")[1]);
			
			int NH = Integer.parseInt(need.split(":")[0]);
			int NM = Integer.parseInt(need.split(":")[1]);
			
			int AM = (SM + NM) % 60;
			int AH = (SH + NH + ((SM + NM) / 60)) % 24;
			
			
			if(AH < 10) sb.append("0" + AH + ":");
			else sb.append(AH + ":");
			
			if(AM < 10) sb.append("0" + AM);
			else sb.append(AM);
			
			if((SH + NH + ((SM + NM) / 60)) / 23 > 0) sb.append(" +" +((SH + NH + ((SM + NM) / 60)) / 23));
			
			sb.append("\n");
			
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
		
	}
	
	// Binary numbers 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		String binary = new StringBuilder(Integer.toBinaryString(N)).reverse().toString();

		for(int i = 0; i < binary.length(); i++) {
			
			if(binary.charAt(i) == '1') sb.append(i + " ");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb);
	}
	
	// Good times
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		int vic = solove(N - 300);
		int edm = solove(N - 200);
		int win = solove(N - 100);
		int tro = N;
		int hal = solove(N + 100);
		int stj = solove(N + 130);
		
		sb.append(N + " in Ottawa" + "\n");
		sb.append(vic + " in Victoria" + "\n");
		sb.append(edm + " in Edmonton" + "\n");
		sb.append(win + " in Winnipeg" + "\n");
		sb.append(tro + " in Toronto" + "\n");
		sb.append(hal + " in Halifax" + "\n");
		sb.append(stj + " in St. John's");
		
		System.out.println(sb);
		
	}
	
    private static int solove(int time) {
        int curTime = time;

        if (curTime % 100 > 59) curTime += 40;

        if (curTime % 100 < -59) curTime -= 40;

        if (time < 0) curTime = 2400 + time;

        if (curTime > 2399) curTime %= 2400;

        return curTime;
    }
	
	// Desvendando Monty Hall 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		int get = 0;
		while(T --> 0) {
			
			int car = Integer.parseInt(br.readLine());
			if(car != 1) get++;
			
		}
		
		System.out.println(get);
	}
	
	// Санта Клаус
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		boolean[] arr = new boolean[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken()) - 1;
			
			arr[num] = true;
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < k; i++) {
			int num = Integer.parseInt(st.nextToken()) - 1;
			
			arr[num] = true;
		}

		int num = 0;
		for(int i = 0; i < n; i ++) {
			if(!arr[i]) {
				sb.append(i + 1 + " ");
				num++;
			}
		}
		
		sb.insert(0, num + "\n");
		System.out.print(sb);
	}
	
	// Triangles 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int K = Integer.parseInt(st.nextToken());
			char start = st.nextToken().charAt(0);
			
			for(int j = 0; j < K; j++) {
				
				for(int k = j; k > -1; k--) {
					sb.append(start);
				}
				
				sb.append("\n");
				start = (char)((int)start + 1);
				
				if(start > 90) start = (char)65;
			}
			
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	// 카드
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		long ans = 0;
		for(int i = 0; i < N - 1; i++) ans += arr[i];
		
		System.out.println(ans);
	}
	
	// Secret Instructions
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = "";
		String dir = "";
		
		while(!(input = br.readLine()).equals("99999")) {
			
			int direction = (Character.getNumericValue(input.charAt(0)) + Character.getNumericValue(input.charAt(1)));
			int length = Integer.parseInt(input.substring(2));
			
			if(direction == 0) dir = dir;
			else if(direction % 2 == 0) dir = "right ";
			else if(direction % 2 != 0) dir = "left ";
			
			sb.append(dir + length + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
		
	}

	// Statistics 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		int prev = Integer.parseInt(br.readLine());
		int ans = 0;
		T--;
		while(T --> 0) {
			
			int now = Integer.parseInt(br.readLine());
			
			if(prev < now) ans += (now - prev);
			else prev = now;
		}
		
		System.out.println(ans);
	}
	
	
	
}
