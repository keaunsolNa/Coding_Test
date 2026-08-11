import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	private static int[] DX = { 1, 0, -1, 0 };
	private static int[] DY = { 0, -1, 0, 1 };
	private static int block = -2;

	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Queue<int[]> q = new ArrayDeque<>();
		int[][] map = new int[n][m];
		
        for (int i = 0; i < n; i++) {
        	
            st = new StringTokenizer(br.readLine());
            
            for (int j = 0; j < m; j++) {
            	
                char cur = st.nextToken().charAt(0);
                map[i][j] = cur != '0' ? -1 : block;
                
                if (cur == '2') {
                    q.add(new int[]{i, j});
                    map[i][j] = 0;
                }
                
            }
        }

        while (!q.isEmpty()) {
        	
            int[] cur = q.poll();
            for (int i = 0; i < 4; i++) {
            	
                int nr = cur[0] + DX[i];
                int nc = cur[1] + DY[i];
                if (nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                if (map[nr][nc] == block || map[nr][nc] >= 0) continue;
                map[nr][nc] = map[cur[0]][cur[1]] + 1;
                q.add(new int[]{nr, nc});
                
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {

        	for (int j = 0; j < m; j++) {
                if (map[i][j] == block) sb.append(0);
                else sb.append(map[i][j]);
                sb.append(' ');
            }
            
        	sb.append('\n');
        }

        System.out.print(sb);
        
	}
}
