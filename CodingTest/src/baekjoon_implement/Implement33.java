package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Implement33 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// Arithmetic and Geometric Sums
	private static int plus;
	private static long sum;
	private static long prev;
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String input = "";
		
		while(!(input = br.readLine()).equals("0")) {
			int N = Integer.parseInt(input);
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			gsOrAs(a, b, c, N);
			sb.append(sum + "\n");
			
			N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken()); 
			c = Integer.parseInt(st.nextToken()); 
			
			gsOrAs(a, b, c, N);
			sb.append(sum + "\n");
			
		}
		
		System.out.println(sb);
	}
	
	private static void gsOrAs(int a, int b, int c, int N) {
		
		if(b - a == c - b) {
			
			plus = b - a;
			sum = a;
			prev = a;
			as(a, N);
			
		} else {
			
			plus = b / a;
			sum = a;
			prev = a;
			gs(a, N);
			
		}
	}
	
	private static void gs(int start, int N) {
		
		for(int i = 0; i < N - 1; i++) {
			sum += prev * plus;
			prev *= plus;
		}
	}
	
	private static void as(int start, int N) {
		
		for(int i = 0; i < N - 1; i++) {
			sum += prev + plus;
			prev += plus;
		}
	}

	// 퐁당퐁당 1
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		
		int max = N * 2;
		int min = 1;
		
		int cnt = 0;
		boolean flag = true;
		
		for(int i = 0; i < T; i++) {
			
			if(flag) cnt++;
			else cnt--;
			
			if(flag && cnt >= max) flag = false;
			else if(!flag && cnt <= min) flag = true;
		}
		
		System.out.println(cnt);
	}
	
	// 대지
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

        int[] x = new int[N];
        int[] y = new int[N];

        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            x[i] = Integer.parseInt(arr[0]);
            y[i] = Integer.parseInt(arr[1]);
        }

        Arrays.sort(x);
        Arrays.sort(y);
        System.out.println((x[N - 1] - x[0]) * (y[N - 1] - y[0]));
		
	}
	
	// Batter Up
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
        String[] input = br.readLine().split(" ");
        List<Integer> list = new ArrayList<Integer>();
        
        for (String s : input) {
            int n = Integer.parseInt(s);
            if (n != -1) list.add(n);
        }

        double sum = 0;
        for (int i : list) sum += i;
        
        System.out.println(sum / list.size());
	}
	
	// Jumbled Compass 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		int c = B - A;
		
		if(c > 180) c -= 360;
		else if(c <= -180) c += 360;
		
		System.out.println(c);
	}
	
	// K 2K 게임
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int fk = K % 10;
		int fk2 = K * 2 % 10;
		
		int cnt = 0;
		for(int i = 1; i <= N; i++) {
			
			int fx = i % 10;
			if(fx != fk && fx != fk2) {
				sb.append(i + " ");
				cnt++;
			}
		}
		
		sb.insert(0, cnt + "\n");
		
		System.out.println(sb);
	}
	
	// Любитель нулей
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String str = N + "";
		
		for(int i = str.length() - 1; i > 0; i--) {
			if(str.charAt(i) == '0') {
				str = str.substring(0, str.length() - 1);
			} else break;
		}
	
		int cnt = 0;
		for(int i = 0; i < str.length(); i++) if(str.charAt(i) == '0') cnt++;

		System.out.println(cnt);
	}
	
	// Wykreślanka
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        
        int[] a = new int[N];
        int res = 0;
        int x = 0;

        for (int i = 0; i < N; i++) {
        	
            a[i] = Integer.parseInt(input[i]);
            
            if(a[i] == x + 1) x = a[i];
            else res++;
            
        }

        System.out.println(res);
		
	}
	
	// Exactly Electrical
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		int t = Integer.parseInt(br.readLine());
		
        a = Math.abs(c - a);
        b = Math.abs(d - b);
        
        if (a + b > t) System.out.println("N");
        
        else if (a + b == t || (t - (a + b)) % 2 == 0) System.out.println("Y");
        
        else System.out.println("N");
        
	}
	
	// 문문문
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long N = Long.parseLong(br.readLine());
		int K = Integer.parseInt(br.readLine());
		
	    if (N > 5) System.out.println("Love is open door");
	    else {
	    	for(int i = 1; i < N; i ++) {
	    		K = 1 - K;
	    		System.out.println(K);
	    	}
	    }
	}
	
}
