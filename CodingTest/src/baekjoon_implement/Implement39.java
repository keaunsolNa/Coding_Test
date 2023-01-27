package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Implement39 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 9723번 - Right Triangle 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			
			st = new StringTokenizer(br.readLine());
			double[] arr = new double[3];
			
			for(int j = 0; j < 3; j++) arr[j] = Double.parseDouble(st.nextToken());
			
			Arrays.sort(arr);
			
			
			sb.append("Case #" + i + ": ");
			if((arr[0] * arr[0]) + (arr[1] * arr[1]) == (arr[2] * arr[2])) sb.append("YES");
			else sb.append("NO");
				
			sb.append("\n");
					
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	// 9297번 - Reducing Improper Fractions 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			
			st = new StringTokenizer(br.readLine());
			sb.append("Case " + i + ": ");
			
			int n = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
		
			int x = n / d;
			
			n -= d * x;
			
			if (n == 0) {
				System.out.println("Case " + i + ": " + x);
			} else if (x == 0) {
				System.out.println("Case " + i + ": " + n + "/" + d);
			} else {
				System.out.println("Case " + i + ": " + x + " " + n + "/" + d);
			}
		}
		
	}
	
	// 23925번 - Retype 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());
			
			long N = Long.parseLong(st.nextToken());
			long K = Long.parseLong(st.nextToken());
			long S = Long.parseLong(st.nextToken());
			
			long costTime = Math.min(N + K + 1, K + (Math.abs(K - S)) + (N - S));
			
			sb.append("Case #" + i +": " + costTime + "\n");
		}
		
		System.out.print(sb);
	}
	
	// 22093번 - Соцопрос
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int max = Math.max(a - b, 0);
			int min = Math.min(n - b, a);
			
			System.out.println(max + " " + min);
		}
	}
	
	// 5163번 - Isn’t It Funny How a Bear Likes Honey?
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		final double pi = 3.14159265359;
		
		int T = Integer.parseInt(br.readLine());

		for(int i = 1; i <= T; i++){
	    	
	        st = new StringTokenizer(br.readLine());
	        double b = Double.parseDouble(st.nextToken());
	        double w = Double.parseDouble(st.nextToken());
	        double tH = 0;
	    
	        for(int j = 1; j <= b; j++) {
	        	
	        	double radius = Double.parseDouble(br.readLine());
	        	tH += 4.0 / 3.0 * pi * Math.pow(radius, 3) / 1000;

	        }
	        
	        System.out.printf("Data Set %d:\n", i);
	        if(tH >= w)  System.out.println("Yes");
	        else System.out.println("No");
	        System.out.println();
	    }
	}
	
	// 24302번 - КУРИЕРИ 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		A /= 1000;
		B /= 1000;
		
		int ans = Math.min(cal1(A), cal2(A)) + Math.min(cal1(B), cal2(B));
		
		if (ans % 100 > 9) 
			System.out.println((ans / 100) + "." + (ans % 100));
		else
			System.out.println((ans / 100) + ".0" + (ans % 100));
		
	}
	
	private static int cal1(int x) {
		
		if (x <= 5) return 400;
		if (x <= 10) return 700;
		if (x <= 20) return 1200;
		if (x <= 30) return 1700;
		return x * 57;
		
	}
	
	private static int cal2(int x) {
		
		if (x <= 2) return 90 + x * 90;
		if (x <= 5) return 100 + x * 85;
		if (x <= 20) return 125 + x * 80;
		if (x <= 40) return 325 + x * 70;
		return 925 + 55 * x;
		
	}
	
	// 9907번 - ID 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String number = br.readLine();
		
		int total = 0;
		
		total += (number.charAt(0) -'0') * 2;
		total += (number.charAt(1) -'0') * 7;
		total += (number.charAt(2) -'0') * 6;
		total += (number.charAt(3) -'0') * 5;
		total += (number.charAt(4) -'0') * 4;
		total += (number.charAt(5) -'0') * 3;
		total += (number.charAt(6) -'0') * 2;
		
		total %= 11;

		if(total == 0) System.out.println("J");
		else if(total == 10) System.out.println("Z");
		else System.out.println((char)(total + 64));
		
	}
	
	// 22150번 - Шоколадка
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int[] arr = new int[2 * N];
			boolean flag = false;
			
			for(int i = 0; i < 2 * N; i++) arr[i] = Integer.parseInt(st.nextToken());
			
			for(int i = 0; i < 2 * N; i += 2) {
				if(arr[i] + arr[i + 1] != N) flag = true;
			}
			
			if(flag) System.out.println("yes");
			else System.out.println("no");
		}
	}
	
	// 21280번 - Förvirrad föreläsare 
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		int prev = Integer.parseInt(st.nextToken());
		
		int plus = 0;
		int minus = 0;
		for(int i = 1; i < T; i++) {
			
			int now = Integer.parseInt(st.nextToken());
			if(prev > now)  minus += (prev - now);
			else if(now > prev) plus += (now - prev);
			
			prev = now;
		}
		
		System.out.println(minus + " " + plus);
	}
	
	// 25849번 - Briefcases Full of Money
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long one = Integer.parseInt(st.nextToken());
		long five = Integer.parseInt(st.nextToken()) * 5;
		long ten = Integer.parseInt(st.nextToken()) * 10;
		long twenty = Integer.parseInt(st.nextToken()) * 20;
		long fifty = Integer.parseInt(st.nextToken()) * 50;
		long hundred = Integer.parseInt(st.nextToken()) * 100;

		long max = Math.max(one, Math.max(five, Math.max(ten, Math.max(twenty, Math.max(fifty, hundred)))));
		
		if(hundred == max) {
			System.out.println(100);
			return;
		}
		
		if(fifty == max) {
			System.out.println(50);
			return;
		}
		
		if(twenty == max) {
			System.out.println(20);
			return;
		}
		
		if(ten == max) {
			System.out.println(10);
			return;
		}
		
		if(five == max) {
			System.out.println(5);
			return;
		}
		
		if(one == max) {
			System.out.println(1); 
			return;
		}
		
	}
	
}
