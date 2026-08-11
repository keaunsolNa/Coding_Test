import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

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
}
