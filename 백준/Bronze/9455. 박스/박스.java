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
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int[][] map = new int[n][m];
			
			for(int i = 0; i < n; i++) {
				
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < m; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int cnt = 0;
			
			for(int i = 0; i < m; i++) {
				
				String temp = "";
				for(int j = 0; j < n; j++) {
					temp += map[j][i];
					
				}
				
				for(int j = 0; j < temp.length(); j++) {
					
					if(temp.charAt(j) == '1') {
						
						cnt += (int)countChar(temp.substring(j, temp.length()), '0');
					}
				}
			}

			System.out.println(cnt);
		}

	}

	public static long countChar(String str, char ch) {
	
		return str.chars()
				.filter(c -> c == ch)
				.count();

	}
}
