import java.util.*;
import java.io.*;

public class Main {

    private static StringBuilder sb = new StringBuilder();
    private static int c, i;
    private static int[] p;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int loop = 1;

        while (n --> 0) {

            c = Integer.parseInt(br.readLine());
            i = Integer.parseInt(br.readLine());
            p = new int[i];

            st = new StringTokenizer(br.readLine());
            for (int idx = 0; idx < i; idx++) p[idx] = Integer.parseInt(st.nextToken());

            sb.append("Case #").append(loop++).append(": ");
            get(p);

        }

        System.out.print(sb);
    }


    private static void get(int[] p) {

        for (int j = 0; j < i; j++) {

            for (int k = 0; k < i; k++) {

                if (j == k) continue;

                if (p[j] + p[k] == c) {
                    sb.append((j + 1)).append(" ").append((k + 1)).append("\n");
                    return;
                }
            }
        }
    }

}