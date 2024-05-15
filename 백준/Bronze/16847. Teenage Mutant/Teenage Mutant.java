import java.util.*;
import java.io.*;

public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {

            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            String origin = br.readLine();
            String[] ancestors = new String[n];
            boolean[] check = new boolean[k];

            sb.append("Data Set ").append(tc).append(":").append("\n");

            for (int i = 0; i < n; i++) ancestors[i] = br.readLine();

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < k; j++) {

                    if (check[j]) continue;
                    if (origin.charAt(j) == ancestors[i].charAt(j)) {
                        check[j] = true;
                    }
                }
            }

            int total = 0;
            for (int i = 0; i < k; i++) if (!check[i]) total++;

            sb.append(total).append("/").append(k).append("\n").append("\n");
        }

        System.out.print(sb);
    }
}
