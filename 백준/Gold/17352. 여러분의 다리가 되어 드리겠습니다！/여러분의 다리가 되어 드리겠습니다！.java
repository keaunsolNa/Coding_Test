import java.io.*;
import java.util.*;

public class Main {

    private static int[] parent;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        parent = new int[n + 1];

        for (int i = 1; i <= n; i++) parent[i] = i;

        for (int i = 0 ; i < n - 2; i++) {

            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            union(start, end);
        }

        for(int i = 1; i <= n; i++) {

            for(int j = i + 1; j <= n; j++) {

                if(find(i) != find(j)) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }

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
