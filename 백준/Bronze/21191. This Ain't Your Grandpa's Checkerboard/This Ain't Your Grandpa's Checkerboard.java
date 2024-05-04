import java.io.*;

public class Main {

    private static int black, white, temp, max, n;
    private static char[][] map;
    private static boolean flag;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        map = new char[n][n];

        for (int i = 0; i < n; i++) map[i] = br.readLine().toCharArray();

        if (solve() && solve2()) System.out.println(1);
        else System.out.println(0);

    }

    private static boolean solve() {

        for (int i = 0; i < n; i++) {

            black = map[i][0] == 'W' ? 0 : 1;
            white = map[i][0] == 'W' ? 1 : 0;
            temp = max = 0;
            flag = map[i][0] == 'W';

            for (int j = 1; j < n; j++) {

                solve3(j, i);
            }

            if (black != white) return false;
            if (max >= 3) return false;
        }

        return true;
    }


    private static boolean solve2() {

        for (int i = 0; i < n; i++) {

            black = map[0][i] == 'W' ? 0 : 1;
            white = map[0][i] == 'W' ? 1 : 0;
            flag = map[0][i] == 'W';
            temp = max = 0;

            int j = 1;
            while (j < n) {

                solve3(i, j);
                j++;
            }

            if (black != white) return false;
            if (max >= 3) return false;
        }

        return true;
    }

    private static void solve3(int i, int j) {

        if (map[j][i] == 'W') {
            white++;
            if (flag) temp++;
            else temp = 1;
            flag = true;

        }
        else {
            black++;
            if (flag) temp = 1;
            else temp++;
            flag = false;
        }

        max = Math.max(max, temp);
    }

}
