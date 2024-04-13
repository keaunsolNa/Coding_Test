import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[3][n];

        for (int i = 0; i < 3; i++) {

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++)
                arr[i][j] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {

            int[] temp = new int[3];
            for (int j = 0; j < 3; j++) temp[j] = arr[j][i];
            Arrays.sort(temp);

            sb.append(temp[1]).append(" ");
        }

        System.out.println(sb);

    }

}