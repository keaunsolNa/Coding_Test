import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String time = br.readLine();
        int HH = Integer.parseInt(time.split(":")[0]);
        int MM = Integer.parseInt(time.split(":")[1]);


        int[][] vector = new int[][]{{0, 4, 3, 4, 3, 2, 3, 2, 1, 2}, {4, 0, 1, 2, 1, 2, 3, 2, 3, 4}, {3, 1, 0, 1, 2, 1, 2, 3, 2, 3}, {4, 2, 1, 0, 3, 2, 1, 4, 3, 2}, {3, 1, 2, 3, 0, 1, 2, 1, 2, 3}, {2, 2, 1, 2, 1, 0, 1, 2, 1, 2}, {3, 3, 2, 1, 2, 1, 0, 3, 2, 1}, {2, 2, 3, 4, 1, 2, 3, 0, 1, 2}, {1, 3, 2, 3, 2, 1, 2, 1, 0, 1}, {2, 4, 3, 2, 3, 2, 1, 2, 1, 0}};

        int min = Integer.MAX_VALUE, x = 0, y = 0;

        for (int i = 0; i < 100; i++) {

            for (int j = 0; j < 100; j++) {

                if( i % 24 != HH || j % 60 != MM) continue;

                int sum = vector[i / 10][i % 10] + vector[i % 10][j / 10] + vector[j / 10][j % 10];

                if(sum < min) {
                    min = sum;
                    x = i;
                    y = j;
                }
            }

        }
        System.out.printf("%02d:%02d\n", x, y);
    }

}