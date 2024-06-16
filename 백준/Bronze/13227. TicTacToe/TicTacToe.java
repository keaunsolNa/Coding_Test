import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        char[][] map = new char[3][3];
        for (int i = 0; i < 3; i++) {
            map[i] = br.readLine().toCharArray();
        }

        if ((map[0][0] != '.' && map[0][0] == map[0][1] && map[0][0] == map[0][2]) ||
            (map[1][0] != '.' &&map[1][0] == map[1][1] && map[1][0] == map[1][2]) ||
            (map[2][0] != '.' &&map[2][0] == map[2][1] && map[2][0] == map[2][2]) ||
            (map[0][0] != '.' &&map[0][0] == map[1][0] && map[0][0] == map[2][0]) ||
            (map[0][1] != '.' &&map[0][1] == map[1][1] && map[0][1] == map[2][1]) ||
            (map[0][2] != '.' &&map[0][2] == map[1][2] && map[0][2] == map[2][2]) ||
            (map[0][0] != '.' &&map[0][0] == map[1][1] && map[0][0] == map[2][2]) ||
            (map[2][0] != '.' &&map[2][0] == map[1][1] && map[2][0] == map[0][2])
        ) System.out.println("YES");

        else System.out.println("NO");
    }

}