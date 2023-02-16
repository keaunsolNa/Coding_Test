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
		test01();
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
	
	// 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
	}
	
	// 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
	}
	
	// 
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
	}
	
	// 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
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
