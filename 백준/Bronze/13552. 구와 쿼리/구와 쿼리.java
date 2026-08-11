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
		test05();
	}

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
}
