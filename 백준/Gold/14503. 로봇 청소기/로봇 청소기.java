import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    private static int N; 
	private static int M;
	private static int cnt;
	private static int[][] map2;
	private static boolean[][] visited2;
	
	private static int[] dr = {-1, 0, 1, 0};
    private static int[] dc = {0, 1, 0, -1};
    
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map2 = new int[N][M];
		visited2 = new boolean[N][M];
		
		st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < M; j++) 
				map2[i][j] = Integer.parseInt(st.nextToken());
		}
		
		pathFind(r, c, d);
		
		System.out.println(cnt);
   }
    
    private static void pathFind(int r, int c, int d) {
		
    	int nowR = r;
        int nowC = c;
        int nowD = d;
        int stop = 0;

        while(true) {
        	
            if(stop == 4) {
                int backDir = nowD - 2 < 0 ? nowD + 2 : nowD - 2;
                int backR = nowR + dr[backDir];
                int backC = nowC + dc[backDir];

                if(map2[backR][backC] == 1) break;
                
                else {
                    nowR = backR;
                    nowC = backC;
                    stop = 0;
                }
            }

            if(!visited2[nowR][nowC]) {
                visited2[nowR][nowC] = true;
                cnt++;
            }

            int nextDir = nowD - 1 < 0 ? nowD + 3 : nowD - 1;
            int nextR = nowR + dr[nextDir];
            int nextC = nowC + dc[nextDir];

            if(!visited2[nextR][nextC] && map2[nextR][nextC] == 0) {
                nowR = nextR;
                nowC = nextC;
                nowD = nextDir;
                stop = 0;
            }
            
            else {
            	nowD = nextDir;
                stop++;
            }
        }
	
	}
}