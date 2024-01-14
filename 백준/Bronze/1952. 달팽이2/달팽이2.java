import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main { 
	private static int N, M;
	private static int[][] map;
	
	private static int[] dx = {0, 1, 0, -1}; 
	private static int[] dy = {1, 0, -1, 0};
	
	private static boolean[][] isVisited; 
	public static void main(String[] args) throws IOException{ 
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	M = Integer.parseInt(st.nextToken());
    	N = Integer.parseInt(st.nextToken());
    	br.close();
    	
    	map = new int[M][N];
    	isVisited = new boolean[M][N];
    	
    	int cnt = 0; 
    	int sum = 0; 
    	
    	int idx = 0; 
    	int nowX = 0;
    	int nowY = 0;
    	isVisited[nowX][nowY] = true;
    	sum = 1;
    	
    	while(idx < 4) {
    		
    		int nx = nowX + dx[idx]; 
    		int ny = nowY + dy[idx];
    		
    		if(sum == N * M) {
    			System.out.println(cnt);
    			return;
    		}
    		
    		if(nx >= 0 && ny >= 0 && nx < M && ny < N && !isVisited[nx][ny]) {
    			sum++; 
    			isVisited[nx][ny] = true;
    			nowX = nx; 
    			nowY = ny;
    		} 

    		else {
    			idx++; 
    			cnt++; 
    		}
    		
    		if(idx >= 4) idx = 0;
    	}
	} 
}