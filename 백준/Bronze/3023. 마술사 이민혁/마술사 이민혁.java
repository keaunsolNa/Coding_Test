import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        char[][] map = new char[2 * r][2 * c];
        for (int i = 0; i < r; i++) {

            String str = br.readLine();
            StringBuilder temp = new StringBuilder(str);
            str += temp.reverse();

            map[i] = str.toCharArray();
            map[2 * r - i - 1] = str.toCharArray();

        }

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        map[a - 1][b - 1] = map[a - 1][b - 1] == '#' ? '.' : '#';
        for (char[] cr : map) {

            for (char x : cr) sb.append(x);

            sb.append("\n");
        }

        System.out.print(sb.deleteCharAt(sb.length() - 1));
    }
}
