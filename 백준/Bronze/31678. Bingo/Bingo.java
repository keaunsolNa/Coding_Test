import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        Map<String, int[][]> map = new LinkedHashMap<>();

        while (t --> 0) {

            String name = br.readLine();
            int[][] temp = new int[5][5];

            for (int i = 0; i < 5; i++) {

                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 5; j++)
                    temp[i][j] = Integer.parseInt(st.nextToken());
            }

            map.put(name, temp);
        }

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {

            int target = Integer.parseInt(st.nextToken());
            for (String key : map.keySet()) {

                int[][] matrix = map.get(key);
                checkMatrix(matrix, target);
            }
        }

        int cnt = 0;
        for (String key : map.keySet()) {

            int[][] matrix = map.get(key);
            if (checkBingo(matrix)) { cnt++; sb.append(key).append("\n"); }

        }

        sb.insert(0, cnt).insert(1, "\n");

        System.out.print(sb);
    }

    private static void checkMatrix(int[][] map, int target) {

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                if(map[i][j] == target) {
                    map[i][j] = 0;
                    return;
                }
            }
        }
    }

    private static boolean checkBingo(int[][] map) {

        for (int i = 0; i < 5; i++) {

            boolean rowCheck = true;
            for (int j = 0; j < 5; j++)
                if(map[i][j] != 0) { rowCheck = false; break;}

            if(rowCheck) return true;
        }

        for (int i = 0; i < 5; i++) {

            boolean colCheck = true;

            for (int j = 0; j < 5; j++)
                if (map[j][i] != 0) { colCheck = false; break; }

            if(colCheck) return true;
        }

        int cnt = 0;
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                if (i == j && map[i][j] == 0) cnt++;

        if (cnt == 5) return true;

        cnt = 0;
        for (int i = 4; i >= 0; i--)
            if (map[i][4 - i] == 0) cnt++;

        return cnt == 5;
    }

}