import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    private static final int[][] map = new int[5][5];
    private static final int[] dx = { -1, 1, 0, 0};
    private static final int[] dy = { 0, 0, -1, 1};
    private static final int[] arr = new int[6];
    private static final ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 5; i++) {

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++)
                map[i][j] = Integer.parseInt(st.nextToken());

        }

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++) dfs(i, j, 1);

        System.out.println(list.size());
    }

    private static void dfs(int x, int y, int depth) {

        if(depth > 6) {

            StringBuilder str = new StringBuilder();

            for (int j : arr) str.append(j);

            if (!list.contains(str.toString())) list.add(str.toString());
            return;

        }

        arr[depth - 1] = map[x][y];

        for (int i = 0; i < 4; i++) {

            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < 5 && ny >= 0 && ny < 5) dfs(nx, ny, depth + 1);
        }
    }

}
