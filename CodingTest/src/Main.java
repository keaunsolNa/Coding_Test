import java.io.*;
import java.util.*;

public class Main {

    private static final int MOD = 1000000007;
    public static void main(String[] args) throws NumberFormatException, IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = 4;
        int n = 3;
        int[][] puddles = new int[][]{{2, 2}};

        int[][] map = new int[n + 1][m + 1];
        for (int i = 0; i < puddles.length; i++) map[puddles[i][1]][puddles[i][0]] = -1;

        map[1][1] = 1;

        int x = map.length;
        int y = map[0].length;
        for (int i = 1; i < n + 1; i++) {

            for (int j = 1; j < m + 1; j++) {

                if (map[i][j] == -1) continue;
                if (map[i - 1][j] > 0) map[i][j] += map[i - 1][j] % MOD;
                if (map[i][j - 1] > 0) map[i][j] += map[i][j - 1] % MOD;
            }
        }



    }


}
