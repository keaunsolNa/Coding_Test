import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[100][100];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int leftX = Integer.parseInt(st.nextToken()) - 1;
			int leftY = Integer.parseInt(st.nextToken()) - 1;
			int rightX = Integer.parseInt(st.nextToken()) - 1;
			int rightY = Integer.parseInt(st.nextToken()) - 1;
			
			for(int idx = leftX; idx <= rightX; idx++) {
				
				for(int idx2 = leftY; idx2 <= rightY; idx2++) {
					
					map[idx][idx2]++;
				}
			}
			
		}
		
		int ans = 0;
		for(int i = 0; i < 100; i++) {
			
			for(int j = 0; j < 100; j++) {
				
				if(map[i][j] > M) ans++;
			}
		}
		
		System.out.println(ans);
		
	}
}
