import java.io.*;
import java.util.*;

public class Main {
    private static int[][] map;
    private static int n, m, t;
    private static int ans = 0;

    private static class Node {

        int x;
        int y;
        int cnt;
        boolean gram;

        public Node(int x, int y, int cnt, boolean gram) {

            this.x = x;
            this.y = y;
            this.cnt = cnt;
            this.gram = gram;
        }
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }

        BFSSearch();

        if(ans <= t && ans > 0) System.out.println(ans);
        else if (ans == 0 || ans > t) System.out.println("Fail");
    }

    private static void BFSSearch() {
        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };
        boolean[][][] visit = new boolean[n][m][2];
        Queue<Node> que = new LinkedList<>();
        que.offer(new Node(0, 0, 0, false));
        visit[0][0][0] = true;

        while (!que.isEmpty()) {

            Node cur = que.poll();
            int x = cur.x;
            int y = cur.y;
            int cnt = cur.cnt;
            boolean gram = cur.gram;

            if (x == n - 1 && y == m - 1) {
                ans = cnt;
                return;
            }

            for (int i = 0; i < 4; i++) {

                int nowX = x + dx[i];
                int nowY = y + dy[i];

                if( nowX < 0 || nowX >= n || nowY < 0 || nowY >= m) continue;

                if (gram) {

                    if (visit[nowX][nowY][1]) continue;

                    que.offer(new Node(nowX, nowY, cnt + 1, true));
                    visit[nowX][nowY][1] = true;

                }

                else {

                    if (map[nowX][nowY] == 1) continue;

                    if (visit[nowX][nowY][0]) continue;

                    if (map[nowX][nowY] == 0) {

                        que.offer(new Node(nowX, nowY, cnt + 1, false));
                        visit[nowX][nowY][0] = true;

                    }

                    else if(map[nowX][nowY] == 2) {

                        que.offer(new Node(nowX, nowY, cnt + 1, true));
                        visit[nowX][nowY][0] = true;
                        visit[nowX][nowY][1] = true;
                    }
                }
            }
        }

    }
}
