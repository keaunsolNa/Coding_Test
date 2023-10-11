import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
        int[] dy = { -1, 1, 0, 0 };
        int[] dx = { 0, 0, -1, 1 };
        
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[][] tomato = new int[N][M];
        int cnt = 0;
		int days = 0;
        
		Queue<int[]> que = new LinkedList<>();

        for (int n = 0; n < N; n++) {
        	
        	st = new StringTokenizer(br.readLine());
        	for (int m = 0; m < M; m++) {
        		
        		tomato[n][m] = Integer.parseInt(st.nextToken());
        		if (tomato[n][m] == 1)que.add(new int[] { n, m });
        		else if (tomato[n][m] == 0) cnt++;
        		
        	}
        }
        	

        while (cnt > 0 && !que.isEmpty()) {
            for (int s = que.size(); s > 0; s--) {
                int[] cur = que.poll();

                for (int k = 0; k < 4; k++) {
                    int ny = cur[0] + dy[k];
                    int nx = cur[1] + dx[k];

                    if (ny < 0 || nx < 0 || ny >= N || nx >= M || tomato[ny][nx] != 0) continue;
                    
                    cnt--;
                    tomato[ny][nx] = 1;
                    que.add(new int[] { ny, nx });
                }
            }
            days++;
        }
        System.out.println(cnt == 0 ? days : -1);
   }
}