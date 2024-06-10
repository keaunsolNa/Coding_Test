import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int[][] pic1 = new int[h][w];
        for (int i = 0; i < h; i++) {

            String temp = br.readLine();
            for (int j = 0; j < w; j++) pic1[i][j] = Character.getNumericValue(temp.charAt(j));
        }

        int[][] pic2 = new int[h][w];
        for (int i = 0; i < h; i++) {

            String temp = br.readLine();
            for (int j = 0; j < w; j++) pic2[i][j] = Character.getNumericValue(temp.charAt(j));
        }

        int[] operator = new int[4];
        String temp = br.readLine();
        for (int i = 0; i < 4; i++) operator[i] = Character.getNumericValue(temp.charAt(i));

        for (int i = 0; i < h; i++) {

            for (int j = 0; j < w; j++) {

                if (pic1[i][j] == 0) sb.append(pic2[i][j] == 0 ? operator[0] : operator[1]);
                else sb.append(pic2[i][j] == 0 ? operator[2] : operator[3]);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

}