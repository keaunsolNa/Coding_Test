import java.io.*;
import java.util.*;

public class Main {

    private static List<Integer[]> list;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        list = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            list.add(new Integer[] {x, y} );
        }

        char[] order = br.readLine().toCharArray();
        int x = 0;
        int y = 0;

        for (char c : order)
        {

            switch (c)
            {
                case 'U' :
                    if (check(x, y + 1)) break;
                    y++;
                    break;
                case 'D' :
                    if (check(x, y - 1)) break;
                    y--;
                    break;
                case 'R' :
                    if (check(x + 1, y)) break;
                    x++;
                    break;
                case 'L' :
                    if (check(x - 1, y)) break;
                    x--;
                    break;
            }

        }

        bw.write((x) + " " + (y));
        bw.flush();
        bw.close();
        br.close();

    }

    private static boolean check (int x, int y)
    {

        for (Integer[] arr : list)
        {
            if (arr[0] == x && arr[1] == y) return true;
        }

        return false;
    }

}
