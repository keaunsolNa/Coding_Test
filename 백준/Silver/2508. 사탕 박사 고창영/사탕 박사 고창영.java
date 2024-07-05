import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t --> 0)
        {

            br.readLine();

            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            char[][] map = new char[r][c];
            for (int i = 0; i < r; i++)
            {
                map[i] = br.readLine().toCharArray();
            }

            int cnt = 0;
            for (int row = 0; row < r; row++)
            {

                for (int col = 0; col < c - 2; col++)
                {
                    String temp = "" + map[row][col] + map[row][col + 1] + map[row][col + 2];
                    if (temp.equals(">o<")) cnt++;
                }
            }

            for (int col = 0; col < c; col++)
            {
                for (int row = 0; row < r - 2; row++)
                {
                    String temp = "" + map[row][col] + map[row + 1][col] + map[row + 2][col];
                    if (temp.equals("vo^")) cnt++;
                }
            }

            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}