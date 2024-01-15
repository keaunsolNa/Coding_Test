import java.io.*;
import java.util.*;

public class Main {

    private static class Point implements Comparable<Point> {

       int x;
       int y;
       int z;

       public Point(int x, int y, int z) {
           this.x = x;
           this.y = y;
           this.z = z;
       }

       @Override
        public int compareTo(Point point) {
           return this.z - point.z;
       }
    }

    private static int[] parents;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        List<int[]> data = new ArrayList<>();

        for(int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            data.add(new int[] {i, x, y, z});
        }

        PriorityQueue<Point> q = new PriorityQueue<>();

        for(int idx = 1; idx <= 3; idx++) {

            int vector = idx;
            data.sort(Comparator.comparingInt(o -> o[vector]));

            for(int i = 1; i < n; i++) {

                int[] p1 = data.get(i - 1);
                int[] p2 = data.get(i);
                int dis = Math.abs(p1[idx] - p2[idx]);

                q.add(new Point(p1[0], p2[0], dis));

            }
        }

        parents = new int[n];
        for(int i = 0; i < n; i++) parents[i] = i;

        int total = 0;
        while(!q.isEmpty()) {

            Point point = q.poll();
            int rx = find(point.x);
            int ry = find(point.y);

            if(rx != ry) {
                total += point.z;
                union(point.x, point.y);
            }
        }

        System.out.println(total);

    }

    private static int find(int x) {

        if(parents[x] == x) return x;

        return parents[x] = find(parents[x]);
    }

    private static void union(int x, int y) {

        x = find(x);
        y = find(y);

        if(x < y) {
            int tmp = x;
            x = y;
            y = tmp;
        }

        parents[y] = x;
    }
}