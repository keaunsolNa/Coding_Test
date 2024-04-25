import java.util.*;
import java.io.*;

public class Main {

    private static int n, nowX, nowY;
    private static int dirX[] = {0, 0, -1 ,1, -1, 1, -1, 1};
    private static int dirY[] = {-1, 1, 0, 0, 1, 1, -1, -1};
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        char[][] map = new char[n][n];

        for (int i = 0; i < n; i++) {

            char[] temp = br.readLine().toCharArray();
            map[i] = temp;
        }

        boolean boom = false;
        char[][] play = new char[n][n];
        for (int i = 0; i < n; i++) {

            char[] temp = br.readLine().toCharArray();

            if (!boom) {

                for (int j = 0 ; j < n; j++) {

                    if (temp[j] == 'x' && map[i][j] == '*') {
                        boom = true;
                        break;
                    }
                }
            }

            play[i] = temp;

        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (boom) {

                    if (map[i][j] == '*') sb.append("*");

                    else if (play[i][j] == '.') sb.append(".");

                    else {

                        int temp = 0;
                        for (int k = 0; k < 8; k++) {
                            nowX = dirX[k] + i;
                            nowY = dirY[k] + j;

                            if (range_check() && map[nowX][nowY] == '*') temp++;
                        }

                        sb.append(temp);
                    }
                }

                else {

                    if (play[i][j] == '.') sb.append(".");

                    else {
                        int temp = 0;
                        for (int k = 0; k < 8; k++) {
                            nowX = dirX[k] + i;
                            nowY = dirY[k] + j;

                            if (range_check() && map[nowX][nowY] == '*') temp++;
                        }

                        sb.append(temp);
                    }
                }
            }

            sb.append("\n");
        }

        System.out.print(sb.deleteCharAt(sb.length() - 1));

    }

    private static boolean range_check() {
        return (nowX >= 0 && nowY >= 0 && nowX < n && nowY < n);
    }
}
