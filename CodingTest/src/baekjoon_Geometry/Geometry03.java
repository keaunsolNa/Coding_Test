package baekjoon_Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Geometry03 {
	
	private static class Pow {
		
		int x;
		int y;
		
		Pow(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 11896번 - 다각형
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		
		if (a <= 2) a = 3;
		if (a % 2 == 1) a++;
		if (b % 2 == 1) b--;
		a /= 2;
		b /= 2;
		
		if (a > b) System.out.println(0);
        else System.out.println((b * (b + 1) - a * (a - 1)));
		
	}
	
	// 1358번 - 하키
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		int count = 0;
		for(int i = 0; i < P; i++) {
			
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
		
	        if ((a - X) * (a - X) + (b - (Y + H / 2)) * (b - (Y + H / 2)) <= (H / 2) * (H / 2) && a < X) count++;
	        
	        else if (X <= a && a <= X + W && Y <= b && b <= Y + H) count++;
	 
	        else if ((a - (X + W)) * (a - (W + X)) + (b - (Y + H / 2)) * (b - (Y + H / 2)) <= (H / 2) * (H / 2) && X + W < a) count++;
		}
		
		System.out.println(count);
	}
	
	// 1485번 - 정사각형
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());

		while(T --> 0) {
			
			Pow[] arr = new Pow[4];
			
			for(int i = 0; i < 4; i++) {
				st = new StringTokenizer(br.readLine());
				int px = Integer.parseInt(st.nextToken());
				int py = Integer.parseInt(st.nextToken());
				
				arr[i] = new Pow(px, py);
			}
			
			long[] dist = new long[6];
			int idx = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = i + 1; j < 4; j++) {
                    dist[idx++] = getDist(arr[i], arr[j]);
                }
            }
			
            Arrays.sort(dist);
            
            if (dist[0] == dist[1] && dist[1] == dist[2] && dist[2] == dist[3] && dist[4] == dist[5]) System.out.println(1);
            else System.out.println(0);
            
		}
	}
	
    private static long getDist(Pow p1, Pow p2) {
        return 1l * (p1.x - p2.x) * (p1.x - p2.x) + 1l * (p1.y - p2.y) * (p1.y - p2.y);
    }
    
	// 16478번 - 원의 분할
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		System.out.println((a * c * 1.0) / b / 1.0);
		
	}
	
	// 16482번 - 한 점에서 만나라!
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		
		System.out.println((double)(b * (c - d) * (a - e) * 1.0 / (d * e * 1.0 + (c - d) * (a - e) * 1.0)));
		
	}
	
	// 16487번 - 말 타기
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int m = Integer.parseInt(br.readLine());
		int n = b - m;
		
		System.out.println((double)(((c * c * m + a * a * n) * 1.0 / b * 1.0) - m * n * 1.0));
	}
	
	// 16488번 - 피카츄가 낸 어려운 문제
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long N = Integer.parseInt(st.nextToken());
		long K = Integer.parseInt(st.nextToken());
		
		System.out.println(N * N * K); 
		
	}
	
	// 16490번 - 외계인의 침투
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		
		System.out.println(a * a - t * t);
	}
	
	// 2527번 - 직사각형
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for(int t = 0; t < 4; t++) {
			
			st = new StringTokenizer(br.readLine());
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int p1 = Integer.parseInt(st.nextToken());
			int q1 = Integer.parseInt(st.nextToken());
			
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int p2 = Integer.parseInt(st.nextToken());
			int q2 = Integer.parseInt(st.nextToken());

			if (p1 < x2 || q1 < y2 || p2 < x1 || q2 < y1) {
				System.out.println("d");
			}
			
			else if ((x1 == p2 && y1 == q2) || (x1 == p2 && q1 == y2) || (p1 == x2 && q1 == y2) || (p1 == x2 && y1 == q2)) {
				System.out.println("c");
			}
			
			else if (p1 == x2 || q1 == y2|| p2 == x1 || y1 == q2){
				System.out.println("b");
			}
			
			else {
				System.out.println("a");
			}
			
		}
	}
	
	// 17843번 - 시계 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			 st = new StringTokenizer(br.readLine());
			 double[] arr = new double[3];
			 arr[0] = Integer.parseInt(st.nextToken());
			 arr[1] = Integer.parseInt(st.nextToken());
			 arr[2] = Integer.parseInt(st.nextToken());
			 
			 arr[1] += arr[2] / 60.0;
			 arr[0] *= 5.0;
			 arr[0] += (arr[1] / 60.0) * 5.0;
			 Arrays.sort(arr);
			 
			 double res = 360;
			 for(int i = 1; i < 3; i++) {
				
				 double angle = (arr[i] - arr[i - 1]) * 6;
				 if (res > angle) res = angle;
				 
			 }
			 
			 
			 double e = (arr[0] + 60.0 - arr[2]) * 6.0;

			 if (res > e) res = e;

			 System.out.println(String.format("%.6f", res));
		}
	}
	
}
