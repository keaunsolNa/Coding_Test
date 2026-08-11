import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	private static int dx2[]= {0, 0, 1, -1 ,1 ,1 ,- 1, -1};
	private static int dy2[]= {1, -1, 0, 0, 1, -1 ,- 1, 1};

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[N][M];
		Queue<int[]> que = new LinkedList<>();
		int[][] dist = new int[N][M];   
		
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < M; j++) {
				
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 1) que.add(new int[] {j, i});
							
			}
		}
		
		int answer = Integer.MIN_VALUE;
		
		while(!que.isEmpty()) {
			
			int[] cur = que.poll();  
			int x = cur[0];
			int y = cur[1];
			for (int j = 0; j < 8; j++) {
				
				int yy = y + dy2[j];
				int xx = x + dx2[j];
				
				if(xx < 0 || yy < 0 || xx >= M || yy >= N)continue;
				
				if(dist[yy][xx] != 0 || map[yy][xx] == 1)continue;
				
				dist[yy][xx] = dist[y][x] + 1;
				
				if(dist[yy][xx] > answer) answer = dist[yy][xx];
				
				que.add(new int[] {xx, yy});
		
			}
		}
		
		System.out.println(answer);	
		
	}
}
