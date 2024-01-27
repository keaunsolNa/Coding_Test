import java.io.*;
import java.util.*;

public class Main {

    private static int[] parent;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        parent = new int[n];
        for(int i = 0; i < n; i++) parent[i] = i;

        for(int i = 1; i <= m; i++) {

            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            if(!union(start, end)) {
                System.out.println(i);
                System.exit(0);
            }
        }

        System.out.println(0);

    }

    private static int find(int x) {

        if (x == parent[x]) return x;
        return parent[x] = find(parent[x]);
    }

    private static boolean union(int x, int y) {

        x = find(x);
        y = find(y);

        if(x == y) return false;
        parent[y] = x;
        return true;
    }

}