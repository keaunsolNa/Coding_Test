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
		test03();
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
    
	//
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
	}
	
	//
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
	}
	
	
	
	
	
}
