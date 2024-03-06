import java.io.*;
import java.util.*;

public class Main {

    private static final int[] dx = {1, 0, -1, 0};
    private static final int[] dy = {0, 1, 0, -1};
    private static int[][] map;
    private static boolean[][] visit;
    private static int n, m, nowX, nowY, cnt;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        cnt = 1;

        map = new int[n][m];
        visit = new boolean[n][m];
        for (int i = 0; i < n; i++) {

            char[] input = br.readLine().toCharArray();

            for(int j = 0; j < m; j++)
                map[i][j] = input[j];
        }

        System.out.println(getHab('W') + " " + getHab('B'));
    }

    private static long getHab(char target) {

        long total = 0;
        for(int i = 0; i < n; i++) {

            for(int j = 0; j < m; j++) {

                if(!visit[i][j] && map[i][j] == target) {
                    dfs(i, j, target);
                    total += (long) Math.pow(cnt, 2);
                }
                cnt = 1;
            }
        }

        return total;
    }
    private static void dfs(int x, int y, char target) {

        visit[x][y] = true;
        for (int i = 0; i < 4; i++) {

            nowX = dx[i] + x;
            nowY = dy[i] + y;

            if(rangeCheck() && !visit[nowX][nowY] && map[nowX][nowY] == target) {
                cnt++;
                dfs(nowX, nowY, target);
            }
        }

    }

    private static boolean rangeCheck() {

        return (nowX >= 0 && nowY >= 0 && nowX < n && nowY < m);
    }

}
