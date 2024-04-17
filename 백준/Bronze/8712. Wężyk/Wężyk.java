import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];
        int idx = 1;

        for (int i = 0; i < n; i++) {

            int temp = 1;
            for (int j = 0; j < n; j++) {

                if (i % 2 == 0) arr[i][j] = idx++;
                else arr[i][j] = idx++ + n - temp++ - j;
            }
        }

        for (int[] a : arr) {

            for (int b : a) {

                System.out.print(b + " ");
            }
            System.out.println();
        }

    }

}
