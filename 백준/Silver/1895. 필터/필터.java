import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[][] map = new int[r][c];

        for (int i = 0; i < r; i++) {

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < c; j++) map[i][j] = Integer.parseInt(st.nextToken());
        }

        int t = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        int result = 0;

        for (int i = 0; i <= r - 3; i++) {

            for (int j = 0; j <= c - 3; j++) {

                for (int x = i; x < i + 3; x++) {

                    for (int y = j; y < j + 3; y++) {

                        list.add(map[x][y]);
                    }
                }

                Collections.sort(list);
                if (list.get(4) >= t) result += 1;
                list.clear();
            }
        }

        System.out.println(result);

    }
}
