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
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		
		char[][] map = new char[H][W];
		for(int i = 0; i < H; i++) {
			String input = br.readLine();
			for(int j = 0; j < W; j++) 
				map[i][j] = input.charAt(j);
		}

		int[][] answer = new int[H][W];
		for(int i = 0; i < H; i++) {
			
			int cnt = 1;
			boolean cloud = false;
			for(int j = 0; j < W; j++) {
				
				if(!cloud && map[i][j] != 'c') answer[i][j] = -1;
				
				else if(map[i][j] == 'c' && !cloud) {
					answer[i][j] = 0;
					cloud = true;
				}
				
				else if(cloud && map[i][j] == 'c') {
					answer[i][j] = 0;
					cnt = 1;
				}
				
				else if(cloud && map[i][j] != 'c') {
					answer[i][j] = cnt;
					cnt++;
				}
			}
		}
		
		for (int[] is : answer) {
			
			for (int is2 : is) {
				System.out.print(is2 + " ");
			}
			System.out.println();
		}
	}
}
