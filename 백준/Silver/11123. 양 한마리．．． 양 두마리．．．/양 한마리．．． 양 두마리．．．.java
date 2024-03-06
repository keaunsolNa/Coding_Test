import java.io.*;
import java.util.*;

public class Main {

    private static final int[] dx = {1, 0, -1, 0};
    private static final int[] dy = {0, 1, 0, -1};
    private static char[][] map;
    private static boolean[][] visit;
    private static int w, h, nowX, nowY;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t --> 0) {

            st = new StringTokenizer(br.readLine());
            h = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());

            map = new char[h][w];
            visit = new boolean[h][w];

            for (int i = 0; i < h; i++) {

                char[] input = br.readLine().toCharArray();
                if (w >= 0) System.arraycopy(input, 0, map[i], 0, w);
            }

            int cnt = 0;
            for (int i = 0; i < h; i++) {

                for (int j = 0; j < w; j++) {

                    if(!visit[i][j] && map[i][j] == '#'){
                        cnt++;
                        dfs(i, j);
                    }
                }
            }

            sb.append(cnt).append("\n");
        }

        System.out.print(sb);
    }

    private static void dfs(int x, int y) {

        visit[x][y] = true;
        for (int i = 0; i < 4; i++) {

            nowX = dx[i] + x;
            nowY = dy[i] + y;

            if(rangeCheck() && !visit[nowX][nowY] && map[nowX][nowY] == '#') dfs(nowX, nowY);
        }
    }

    private static boolean rangeCheck() {

        return (nowX >= 0 && nowY >= 0 && nowX < h && nowY < w);
    }

}
