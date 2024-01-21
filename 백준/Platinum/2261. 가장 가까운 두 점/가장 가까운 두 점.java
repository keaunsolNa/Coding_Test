import com.sun.source.tree.Tree;

import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Point[] points = new Point[n];

        for(int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(points, Comparator.comparingInt(o -> o.x));

        TreeSet<Point> set = new TreeSet<>((p1, p2) -> ((p1.y == p2.y) ? p1.x - p2.x : p1.y - p2.y));

        set.add(points[0]);
        set.add(points[1]);

        int ans = dist(points[0], points[1]);
        int start = 0;

        for(int i = 2; i < n; i++) {

            Point now = points[i];

            while(start < i) {

                Point point = points[start];
                int k = now.x - point.x;

                if(k * k > ans) {
                    set.remove(point);
                    start++;
                } else break;
            }

            int d = (int) Math.sqrt((double) ans) + 1;

            Point from = new Point(-100000, now.y - d);
            Point to = new Point(100000, now.y + d);

            for(Point point : set.subSet(from, to)) {
                ans = Math.min(ans, dist(now, point));
            }

            set.add(now);
        }

        System.out.println(ans);
    }

    private static int dist(Point p, Point q) {
        return (p.x - q.x) * (p.x - q.x) + (p.y - q.y) * (p.y - q.y);
    }

}