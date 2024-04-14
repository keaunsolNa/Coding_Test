import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {

            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0) break;
            int[][] arr = new int[m][n];

            for (int i = 0; i < m; i++) {

                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < n; j++) {

                    arr[i][j] = Integer.parseInt(st.nextToken());

                }
            }

            int max = 0;
            for (int i = 0; i < n; i++) {

                int sum = 0;
                for (int j = 0; j < m; j++) {

                    sum += arr[j][i];
                }
                max = Math.max(sum, max);
            }

            System.out.println(max);
        }



    }

}