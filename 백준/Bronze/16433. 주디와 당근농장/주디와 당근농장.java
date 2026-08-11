import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken()) - 1;
		int C = Integer.parseInt(st.nextToken()) - 1;
		
		char[][] map = new char[N][N];
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < N; j++) {
				
				map[i][j] = '.';
			}
		}
		
		map[R][C] = 'v';
		int dy[]= {-1, -1, 1, 1};
		int dx[]= {1, -1, 1, -1};
		Queue<int[]> q=new LinkedList<int[]>();
		
		q.add(new int[] {R, C});
		
		while(!q.isEmpty()) {
			
			int[] p = q.poll();
			
			for(int i = 0; i < 4; i++) {
				int ny = p[0] + dy[i];
				int nx = p[1] + dx[i];
				if(ny >= 0 && nx >= 0 && ny < N && nx < N && map[ny][nx] == '.') {
					map[ny][nx] = 'v';
					q.add(new int[] {ny, nx});
				}
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
}
