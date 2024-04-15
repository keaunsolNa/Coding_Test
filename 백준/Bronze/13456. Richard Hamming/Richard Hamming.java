import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {

            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[2][n];

            for (int i = 0; i < 2; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < n; j++) arr[i][j] = Integer.parseInt(st.nextToken());
            }

            int dis = 0;
            for (int i = 0; i < n; i++) {

                if (arr[0][i] != arr[1][i]) dis++;
            }

            System.out.println(dis);
        }



    }

}