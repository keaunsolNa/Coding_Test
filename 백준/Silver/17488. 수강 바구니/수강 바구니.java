import java.io.*;
import java.util.*;

public class Main {

    private static int n;
    private static int[] l;
    private static boolean[] over;
    private static boolean[][] map;
    private static BufferedReader br;
    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        l = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) l[i] = Integer.parseInt(st.nextToken());

        map = new boolean[n][m];
        over = new boolean[m];
        enrolment();

        for(int i = 0; i < m; i++)
            if(l[i] <= 0) over[i] = true;

        boolean[][] ans = new boolean[n][m];
        for(int i = 0; i < n; i++) System.arraycopy(map[i], 0, ans[i], 0, m);

        enrolment();
        for(int j = 0; j < map.length; j++) {

            boolean chk = false;
            for (int i = 0; i < map[j].length; i++) {

                if (map[j][i] || ans[j][i]) {
                    sb.append(i + 1).append(" ");
                    chk = true;
                }

            }
            if(!chk) sb.append("망했어요");
            sb.append("\n");
        }

        System.out.print(sb);
    }

    private static void enrolment() throws IOException {
        StringTokenizer st;
        for(int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            while(true) {

                int request = Integer.parseInt(st.nextToken()) - 1;

                if(request == -2) break;

                if(over[request]) continue;

                l[request]--;
                if(l[request] < 0) {
                    for(int j = 0; j < n; j++) map[j][request] = false;
                    over[request] = true;
                } else {
                    map[i][request] = true;
                }
            }
        }
    }


}