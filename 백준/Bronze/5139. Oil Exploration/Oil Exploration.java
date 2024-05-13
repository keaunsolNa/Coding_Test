import java.util.*;
import java.io.*;

public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int k = Integer.parseInt(br.readLine());
        for (int i = 1; i <= k; i++) {

            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            char[][] arr = new char[h][w];

            for (int j = 0; j < h; j++) arr[j] = br.readLine().toCharArray();

            sb.append("Data Set ").append(i).append(":").append("\n");
            for (int j = 0; j < w; j++) {

                int cost = 0;
                boolean flag = false;

                for (int q = 0; q < h; q++) {

                    switch (arr[q][j]) {


                        case 'X' : flag = true; break;
                        case 'H' : cost += 3; break;
                        case 'S' : cost += 1; break;
                    }

                    if (flag) break;
                }

                if (!flag) sb.append("N ");
                else sb.append(cost).append(" ");

            }
            sb.append("\n").append("\n");

        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
