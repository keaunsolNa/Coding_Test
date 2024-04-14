import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());

        for (int t = 1; t <= tc; t++) {

            sb.append("Case #").append(t).append(": ");

            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int[][] arr = new int[n][2];

            for (int i = 0; i < n; i++) {

                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());

            }


            int p = Integer.parseInt(br.readLine());

            for (int i = 0; i < p; i++) {

                int target = Integer.parseInt(br.readLine());
                int cnt = 0;

                for (int j = 0; j < n; j++) {

                    if (arr[j][0] <= target && target <= arr[j][1]) cnt++;

                }

                sb.append(cnt).append(" ");
            }

            if (t < tc) {
                sb.append("\n");
                br.readLine();
            }
        }


        System.out.print(sb);

    }

}