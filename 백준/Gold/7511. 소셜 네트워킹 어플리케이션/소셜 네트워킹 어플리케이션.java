import java.io.*;
import java.util.*;

public class Main {

    private static int[] parent;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int tc = 1;

        while (t --> 0) {

            int n = Integer.parseInt(br.readLine());
            parent = new int[n];
            for (int i = 1; i < n; i++) parent[i] = i;

            int k = Integer.parseInt(br.readLine());

            for (int i = 0; i < k; i++) {

                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                union(a, b);
            }

            int m = Integer.parseInt(br.readLine());

            sb.append("Scenario ").append(tc++).append(":").append("\n");
            for ( int i = 0; i < m; i++) {

                st = new StringTokenizer(br.readLine());

                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());

                if(find(u) == find(v)) sb.append(1);
                else sb.append(0);

                sb.append("\n");
            }

            sb.append("\n");
        }

        System.out.println(sb);

    }

    private static int find(int x) {

        if (x == parent[x]) return x;
        return parent[x] = find(parent[x]);
    }

    private static void union(int x, int y) {

        x = find(x);
        y = find(y);

        if (x < y) parent[y] = x;
        else if (y < x) parent[x] = y;

    }
}
