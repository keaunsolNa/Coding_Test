package baekjoon_Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Geometry02 {
	
	private static class Target{
		
		private int num;
		private double time;
		
		private Target(int num, int x, int y, int v) {
			
			this.num = num;
			this.time = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) / v;
			
		}
		
		private double getTime(){ return time; }
		private int getNum(){ return num; }
	}
	
	public static void main(String[] args) throws IOException {
		test05();
	}
	
	// 13411번 - 하늘에서 정의가 빗발친다!
	public static void test01() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int i, n = Integer.parseInt(in.readLine());
		Target r[] = new Target[n];
		
		for(i = 0; i < n; i++) {
			st = new StringTokenizer(in.readLine());
			r[i] = new Target(i, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		Arrays.sort(r, new Comparator<Target>() {

			public int compare(Target r1, Target r2) {
				
				double t1 = r1.getTime();
				double t2 = r2.getTime();

				if(t1 == t2){
					int n1 = r1.getNum();
					int n2 = r2.getNum();
					return n1 > n2 ? 1 : (n1 < n2 ? -1 : 0);
				}
				
				return t1 > t2 ? 1 : (t1 < t2 ? -1 : 0);
			}
		});
		
		for(i = 0; i < n; i++)sb.append(String.valueOf(r[i].getNum()+1) + " \n");
		
		System.out.println(sb);
	}
	
	// 11880번 - 개미
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			st = new StringTokenizer(br.readLine());
			long a = Integer.parseInt(st.nextToken());
			long b = Integer.parseInt(st.nextToken());
			long c = Integer.parseInt(st.nextToken());
			
			long z = (a * a) + (b * b) + (c * c);
			long min = Math.min(a * b, b * c);
			min = Math.min(min, a * c);
			
			sb.append(z + 2 * min + "\n");
		}
		
		System.out.println(sb);
			
	}
	
	// 10540번 - KLOPKA
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		int maxX = Integer.MIN_VALUE;
		int minX = Integer.MAX_VALUE;
		int maxY = Integer.MIN_VALUE;
		int minY = Integer.MAX_VALUE;
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			maxX = Math.max(x, maxX);
			minX = Math.min(x, minX);
			maxY = Math.max(y, maxY);
			minY = Math.min(y, minY);
		}
		
		int max = Math.max(maxX - minX, maxY - minY);
		System.out.println(max * max);
	}
	
	// 6013번 - Lonesome Partners
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		int[][] map = new int[T][2];
		for(int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			map[i][0] = x;
			map[i][1] = y;
		}
		
		double max = Double.MIN_VALUE;
		int[] ans = new int[2];
		for(int i = 0; i < T; i++) {
			
			for(int j = i + 1; j < T; j++) {
				
				double dis = Math.pow(map[i][0] - map[j][0], 2) + Math.pow(map[i][1] - map[j][1], 2);
				
				if(max < dis) {
					max = dis;
					ans[0] = i + 1;
					ans[1] = j + 1;
				}
			}
		}
		
		System.out.println(ans[0] + " " + ans[1]);
		
	}
	
	// 13552번 - 구와 쿼리
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] dot = new int[N][3];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());
			
			dot[i][0] = x;
			dot[i][1] = y;
			dot[i][2] = z;
			
		}
		
		int M = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < M; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			
			long rPow = 1l*r*r;
			int chk = 0;
			
			for(int j = 0; j < dot.length; j++) {
				
				long dis = 1l * (dot[j][0] - x) * (dot[j][0] - x) 
						 + 1l * (dot[j][1] - y) * (dot[j][1] - y) 
						 + 1l * (dot[j][2] - z) * (dot[j][2] - z);
				
				if(dis <= rPow) chk++;
			}
			
		
			sb.append(chk + "\n");
		}
		
		System.out.println(sb);
	}
	
	
	// 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
	}
	
	// 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
	}
	
	// 
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
	}
	
	// 
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
	}
	
	// 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
	}
	
	
	
	
}
