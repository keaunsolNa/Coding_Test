import java.io.*;
import java.util.*;

public class Main {

    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {-1, 1, 0, 0};
    private static char[][] map;
    private static boolean[][] visit;
    private static int n, m, nowX, nowY, wolf, sheep;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        wolf = sheep = 0;

        map = new char[n][m];
        visit = new boolean[n][m];
        for (int i = 0; i < n; i++) {

            char[] input = br.readLine().toCharArray();

            if (m >= 0) System.arraycopy(input, 0, map[i], 0, m);
        }

        System.out.println(getHab());
    }

    private static String getHab() {

        long sheepTotal = 0;
        long wolfTotal = 0;
        for(int i = 0; i < n; i++) {

            for(int j = 0; j < m; j++) {

                if(!visit[i][j] && map[i][j] != '#') {

                    wolf = sheep = 0;
                    dfs(i, j);

                    if (sheep > wolf) sheepTotal += sheep;
                    else wolfTotal += wolf;
                }
            }
        }

        return sheepTotal + " " + wolfTotal;
    }
    private static void dfs(int x, int y) {

        if('o' == map[x][y]) sheep++;
        else if('v' == map[x][y]) wolf++;

        visit[x][y] = true;

        for (int i = 0; i < 4; i++) {

            nowX = dx[i] + x;
            nowY = dy[i] + y;

            if(rangeCheck() && !visit[nowX][nowY] && map[nowX][nowY] != '#') dfs(nowX, nowY);
        }

    }

    private static boolean rangeCheck() {

        return (nowX >= 0 && nowY >= 0 && nowX < n && nowY < m);
    }

}
