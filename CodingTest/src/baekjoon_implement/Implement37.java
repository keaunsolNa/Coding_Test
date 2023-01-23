package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Implement37 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 13684번 - Divisão da Nlogõnia
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			int K = Integer.parseInt(br.readLine());
			if(K == 0) break;
			
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
	
			while(K --> 0) {
				
				st = new StringTokenizer(br.readLine());
				int X = Integer.parseInt(st.nextToken());
				int Y = Integer.parseInt(st.nextToken());
				
				if(X == N || Y == M) sb.append("divisa");
				else {
					
					if(X >= N && Y >= M) sb.append("NE");
					if(X >= N && Y < M) sb.append("SE");
					if(X < N && Y >= M) sb.append("NO");
					if(X < N && Y < M) sb.append("SO");
					
				}
				
				sb.append("\n");
			}
		}
		
		System.out.println(sb);
	}
	
	// 26940번 - Chokladkartongen
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		int prev = Integer.parseInt(st.nextToken());
		T--;
		
		int ans = 0;
		while(T --> 0) {
			
			int now = Integer.parseInt(st.nextToken());
			
			if(prev < now) ans++;
			
			prev = now;
		}
		
		System.out.println(ans);
	}
	
	// 10187번 - Golden 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		final double golden1 = 1.60803399;
		final double golden2 = 1.62803399;
		
		int T = Integer.parseInt(br.readLine());
		while(T --> 0) {
			
			st = new StringTokenizer(br.readLine());
			double A = Double.parseDouble(st.nextToken());
			double B = Double.parseDouble(st.nextToken());
			
			double C = Double.parseDouble(String.format("%.8f", A/B));

			if(C >= golden1 && C <= golden2) sb.append("golden");
			else sb.append("not");
			
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
	
	// 25527번 - Counting Peaks of Infection
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			int T = Integer.parseInt(br.readLine());
			if(T == 0) break;
			
			st = new StringTokenizer(br.readLine());
			
			int[] arr = new int[T];
			for(int i = 0; i < T; i++) arr[i] = Integer.parseInt(st.nextToken());
			
			int ans = 0;
			for(int i = 1; i < T - 1; i++) {
			
				if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) ans++;
				
			}
			
			sb.append(ans + "\n");
		}
		
		System.out.print(sb);
		
	}
	
	// 10902번 - Penalty calculation
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());

		int maxS = Integer.MIN_VALUE;
		int minT = Integer.MAX_VALUE;
		int f = 0;
		int p = 0;
		
		for(int i = 1; i <= T; i++) {
			
			st = new StringTokenizer(br.readLine());
			int t = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			
			if(s > maxS) {
				
				maxS = s;
				minT = t;
				f = i;
				p = t;
				
			} else if(s == maxS) {

				if(t < minT) {
					
					maxS = s;
					minT = t;
					f = i;
					p = t;
					
				}
				
			}
		}
		
		if(maxS == 0) p = 0;
		
		System.out.println(p + (f - 1) * 20);
		
	}
	
	// 25815번 - Cat’s Age
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int year = Integer.parseInt(st.nextToken());
		int month = Integer.parseInt(st.nextToken());
		int catY = 0;
		int catM = 0;
		
		if(year > 1) {
			
			catY += 24;
			catY += (year - 2) * 4;
			catM += (month * 4);
			
		} else if(year > 0) {
			
			catY += 15;
			catM += (month * 9);
			
		} else {
			
			catM += (month * 15);
			
		}
		
		catY += catM / 12;
		catM = catM % 12;
		
		System.out.println(catY + " " + catM);
	}
		
	// 13129번 - Disposable Cup;
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
	    for (int i = 1; i <= N; i++) {
	    	
	    	sb.append(A * N + B * i);
	    	sb.append(" ");
	    }
		
	    System.out.print(sb);
	}
	
	// 8794번 - Poniedziałki
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int Z = Integer.parseInt(br.readLine());
		
		while(Z --> 0) {
			
			st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int L = Integer.parseInt(st.nextToken());

			int ans = 0;
			if(L == 1) ans++;
			N -= (M - L + 1);
			ans += N / M;
			ans += (N % M == 0) ? 0 : 1;
			
			sb.append(ans + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	// 13221번 - Manhattan 
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		double md = Double.POSITIVE_INFINITY;
		int mx = 0;
		int my = 0;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int tx = Integer.parseInt(st.nextToken());
			int ty = Integer.parseInt(st.nextToken());
					
			double d = Math.abs(tx - x) + Math.abs(ty - y);
	        if (d < md) {
	            md = d;
	            mx = tx;
	            my = ty;
	        }
		}
		
		System.out.println(mx + " " + my);
	}
	
	// 11466번 - Alex Origami Squares
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double h = Integer.parseInt(st.nextToken());
		double w = Integer.parseInt(st.nextToken());
		
		if (w > h) {
			double temp = h;
			h = w;
			w = temp;
		}

		if (h >= 3 * w)
			System.out.printf("%.4f", w);

		else if (10 * h >= 15 * w)
			System.out.printf("%.4f", h / 3);
		
		else
			System.out.printf("%.4f", w / 2);

	}
	
	
	
	
}
