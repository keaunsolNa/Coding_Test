package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Implement39 {

	public static void main(String[] args) throws IOException {
		test05();
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
	
	// 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
	}
	
	// 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
	}
	
	// 
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
	}
	
	// 
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
	}
	
	// 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
	}
	
	
	
	
	
	
}
