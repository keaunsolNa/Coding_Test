import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        char[][] map = new char[r][c];

        for (int i = 0; i < r; i++)
        {
            char[] input = br.readLine().toCharArray();
            map[i] = input;
        }

        int ans = 0;
        int[] arr = new int[2];
        for (int i = 0; i < r; i++)
        {

            if (i < 1 || i >= r - 1) continue;
            for (int j = 0; j < c; j++)
            {

                if (j < 1 || j >= c - 1) continue;
                if (map[i][j] != '0') continue;

                if (map[i - 1][j] == 'O' && map[i + 1][j] == 'O' && map[i][j - 1] == 'O' &&
                    map[i][j + 1] == 'O' && map[i - 1][j - 1] == 'O' && map[i + 1][j + 1] == 'O' &&
                    map[i - 1][j + 1] == 'O' && map[i + 1][j - 1] == 'O')
                {
                    ans++;
                    arr[0] = i + 1;
                    arr[1] = j + 1;
                }
            }
        }

        bw.write(ans == 0 ? "Oh no!" : ans > 1 ? "Oh no! " + ans + " locations" : arr[0] + " " + arr[1]);
        bw.flush();
        bw.close();
        br.close();

    }
}
