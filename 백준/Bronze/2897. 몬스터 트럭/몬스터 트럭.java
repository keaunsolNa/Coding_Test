import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        char[][] map = new char[r][c];

        for(int i = 0; i < r; i++) {

            String input = br.readLine();
            for(int j = 0; j < c; j++) {
                map[i][j] = input.charAt(j);
            }
        }

        int zero = 0;
        int one = 0;
        int two = 0;
        int thr = 0;
        int fou = 0;

        for(int i = 1; i < r; i++) {

            for(int j = 1; j < c; j++) {
                int cnt = 0;

                if(map[i][j] == 'X') cnt++;
                if(map[i - 1][j] == 'X') cnt++;
                if(map[i][j - 1] == 'X') cnt++;
                if(map[i - 1][j - 1] == 'X') cnt++;

                if(map[i - 1][j] == '#' || map[i][j] == '#' || map[i][j - 1] == '#' || map[i - 1][j - 1] == '#') cnt = -1;

                switch (cnt) {

                    case 0 : zero++; break;
                    case 1 : one++; break;
                    case 2 : two++; break;
                    case 3 : thr++; break;
                    case 4 : fou++; break;

                }
            }
        }

        System.out.println(zero);
        System.out.println(one);
        System.out.println(two);
        System.out.println(thr);
        System.out.println(fou);
    }
}