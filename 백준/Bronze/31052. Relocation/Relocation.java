import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int[] loc = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) loc[i] = Integer.parseInt(st.nextToken());

        while (q --> 0) {

            st = new StringTokenizer(br.readLine());

            int order = Integer.parseInt(st.nextToken());

            if (order == 1) {

                int c = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());

                loc[c - 1] = x;
            }

            else {

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                sb.append(Math.abs(loc[a - 1] - loc[b - 1])).append("\n");
            }
        }

        System.out.print(sb);

    }


}
