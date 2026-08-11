import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int[] dy = {-1, 1, 0, 0};
    private static int[] dx = {0, 0, -1, 1};
    private static int N;

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
        int[] dz = { 0, 0, 0, 0, -1, 1 };
        int[] dy = { 0, 0, -1, 1, 0, 0 };
        int[] dx = { -1, 1, 0, 0, 0, 0 };
        
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        
        int[][][] tomato = new int[H][N][M];
        int cnt = 0;
		int days = 0;
        
		Queue<Location> que = new LinkedList<>();
		
        for (int h = 0; h < H; h++) {

        	for (int n = 0; n < N; n++) {

        		st = new StringTokenizer(br.readLine());
        		
        		for(int m = 0; m < M; m++) {
        			
        			tomato[h][n][m] = Integer.parseInt(st.nextToken());
	        		if (tomato[h][n][m] == 0) cnt++;
	        		else if (tomato[h][n][m] == 1) que.add(new Location(h, n, m));

        		}        		
        	}
        }
        	
        while (cnt > 0 && !que.isEmpty()) {

        	int size = que.size();
        	
        	for (int i = 0; i < size; i++) {
        
        		Location cur = que.remove();

        		for (int k = 0; k < 6; k++) {
                	
                    int nz = cur.z + dz[k];
                    int ny = cur.y + dy[k];
                    int nx = cur.x + dx[k];
                    
                    if (nz < 0 || ny < 0 || nx < 0 || nz >= H || ny >= N || nx >= M || tomato[nz][ny][nx] != 0) continue;
                    
                    cnt--;
                    tomato[nz][ny][nx] = 1;
                    que.add(new Location(nz, ny, nx));
                }
            }
            days++;
        }
        System.out.println(cnt == 0 ? days : -1);

	}

	public static class Location {
		
		int z;
		int y;
		int x;

		Location(int z, int y, int x) {
			this.z = z;
			this.y = y;
			this.x = x;
		}
	}
}
