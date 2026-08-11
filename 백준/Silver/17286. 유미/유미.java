import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	private static Point[] p = new Point[4];
	private static double[][] dist = new double[4][4];
	private static boolean[] visit = new boolean[4];
	private static int ans = (int)1e5;

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
        for (int i = 0; i < 4; i++) {
        	st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            Point point = new Point();
            point.x = x;
            point.y = y;
            p[i] = point;
        }

        for (int i = 0; i < 4; i++) {
            int x = p[i].x;
            int y = p[i].y;
            for (int j = i + 1; j < 4; j++) {
                int tx = p[j].x;
                int ty = p[j].y;
                double d = Math.sqrt((x - tx) * (x - tx) + (y - ty) * (y - ty));
                dist[i][j] = dist[j][i] = d;
            }
        }
        
        dfs(0, 0.0, 0);

        System.out.println(ans);
	}

	private static void dfs(int idx, double sum, int cnt) {
    	
        if (cnt == 4) {
            ans = Math.min(ans, (int)sum);
            return;
        }
        
        if (visit[idx]) return;
        
        visit[idx] = true;
        
        for (int i = 0; i < 4; i++) dfs(i, sum + dist[idx][i], cnt + 1);
        
        visit[idx] = false;
    }

	private static class Point {
        int x, y;
    }
}
