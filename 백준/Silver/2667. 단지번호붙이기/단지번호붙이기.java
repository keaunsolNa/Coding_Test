import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int cnt;
    private static int N;
    private static int map[][];
    private static int dirX[] = {0, 0, -1, 1};
	private static int dirY[] = {-1, 1, 0, 0};
	private static boolean visit[][];
	private static int[] aparts = new int[25 * 25];

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		visit = new boolean[N][N];
		
		for(int i = 0; i < N; i++) {
			String input = br.readLine();
			for(int j = 0; j < N; j++) {
				map[i][j] = Character.getNumericValue(input.charAt(j));
			}
		}
		
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(map[i][j] == 1 && !visit[i][j]){
                    cnt++;
                    dfs(i,j);
                }
            }
        }
        
        Arrays.sort(aparts);
        System.out.println(cnt);

        for(int i = 0; i < aparts.length; i++){
            if(aparts[i] != 0) System.out.println(aparts[i]);
        }
		
	}

    private static void dfs(int x, int y) {
    
    	visit[x][y] = true;
        aparts[cnt]++;

        for(int i = 0; i < 4; i++) {
            int nx = x + dirX[i];
            int ny = y + dirY[i];

            if(nx >= 0 && ny >=0 && nx < N && ny < N)
                if(map[nx][ny] == 1 && !visit[nx][ny]) dfs(nx,ny);
        }
   
    }
}
