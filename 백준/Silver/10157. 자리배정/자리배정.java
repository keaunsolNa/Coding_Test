import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int[] dx = {-1, 0, 1, 0};
	private static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        
		int C = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(br.readLine());

		int[][] map = new int[R + 2][C + 2];

    	for(int i = 0; i < C + 2; i++) {
    		map[0][i] = -1;
    		map[R + 1][i] = -1;
    	}

    	for(int i = 0; i < R + 2; i++) {
    		map[i][0] = -1;
    		map[i][C + 1] = -1;
    	}

    	if(K > C * R) {
    		System.out.println(0);
    		return;
    	}

    	int cx = R; 
    	int cy = 1;
    	int seat = 1; 
    	int dir = 0;

    	while(true) {
    		
    		map[cx][cy] = seat;
    		
    		if(seat == K) {
    			
    			System.out.println(cy + " " + (R - cx + 1));
    			break;
    			
    		}

    		if(map[cx + dx[dir]][cy + dy[dir]] != 0) dir = (dir + 1) % 4;
            
    		cx += dx[dir];
    		cy += dy[dir];
    		seat++;

    		if(seat > C * R) break;
    		
    	}
    }
}