import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[][] map = new int[m][n];
        for (int i = 0; i < m; i++) {

            char[] input = br.readLine().toCharArray();
            for (int j = 0; j < n; j++) {

                map[i][j] = input[j] - '0';
            }
        }

        double total = getTotal(m, n, map);

        System.out.printf("%.4f", total);
    }

    private static double getTotal(int m, int n, int[][] map) {
        double total = 0;
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                int to = 0;
                int cnt = 0;
                if (i - 1 >= 0) { to += Math.abs(map[i][j] - map[i - 1][j]); cnt++; }
                if (i + 1 < m)  { to += Math.abs(map[i][j] - map[i + 1][j]); cnt++; }
                if (j - 1 >= 0) { to += Math.abs(map[i][j] - map[i][j - 1]); cnt++; }
                if (j + 1 < n)  { to += Math.abs(map[i][j] - map[i][j + 1]); cnt++; }

                total += (double)to / (double)cnt;
            }


        }
        return total;
    }

}