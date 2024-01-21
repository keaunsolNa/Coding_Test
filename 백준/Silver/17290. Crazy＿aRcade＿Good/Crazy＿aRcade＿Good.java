import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        char[][] map = new char[10][10];

        for(int i = 0; i < 10; i++) {

            for(int j = 0; j < 10; j++) map[i][j] = 'x';
        }

        for(int i = 0; i < 10; i++) {

            String input = br.readLine();
            for(int j = 0; j < 10; j++) {

                char temp = input.charAt(j);

                if(temp == 'o') {

                    for(int k = 0; k < 10; k++) {

                        if(i - k >= 0) map[i - k][j] = 'o';
                        if(i + k < 10) map[i + k][j] = 'o';
                        if(j - k >= 0) map[i][j - k] = 'o';
                        if(j + k < 10) map[i][j + k] = 'o';
                    }
                }
            }
        }

        int min = 100;
        for (int i = 0; i < 10; i++) {

            for(int j = 0; j < 10; j++) {

                if(map[i][j] == 'x') {

                    min = Math.min(min, (Math.abs(r - (i + 1)) + (Math.abs(c - (j + 1)))));
                }
            }
        }

        System.out.println(min);


    }


}