import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		while(T --> 0) {
			
			int N = Integer.parseInt(br.readLine());
			
			char[][] map = new char[N][N];
			int[] s = new int[2];
			for(int i = 0; i < N; i++) {
				
				String str = br.readLine();
				for(int j = 0; j < N; j++) {
					char temp = str.charAt(j);
					map[i][j] = temp;
					
					if(temp == 's') {
						s[0] = i;
						s[1] = j;
					}
					
				}
			}
			double minDis = Double.MAX_VALUE;
			int[] p = new int[2];
			for(int i = 0; i < N; i++) {
				
				for(int j = 0; j < N; j++) {
					
					if(map[i][j] == 'p') {
						double dis = Math.pow((Math.pow(i - s[0], 2) + Math.pow(j - s[1], 2)), 0.5);
						
						if(minDis > dis) {
							
							minDis = Math.min(minDis, dis);
							p[0] = i;
							p[1] = j;
						}
					}
				}
			}
			
			String ans = String.format("%.2f", minDis);
			
			sb.append("(" + s[0] + "," + s[1] + "):(" +p[0] + "," + p[1] + "):" + ans + "\n");
		}
		
		System.out.println(sb);
	}
}
