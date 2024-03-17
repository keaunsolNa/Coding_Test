import java.io.*;
import java.util.*;

public class Main {

    private static class Point {

        int id;
        double point;

        public Point(int id, double point) {
            this.id = id;
            this.point = point;
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Point> list = new ArrayList<>();
        double ans = 0;
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < m; i++) {

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {

                int id = Integer.parseInt(st.nextToken());
                double point = Double.parseDouble(st.nextToken());

                list.add(new Point(id, point));
            }
        }

        list.sort((o1, o2) -> Double.compare(o2.point, o1.point));

        for (Point point : list) {

            if (list2.size() >= k) break;
            if (!list2.contains(point.id)) {
                ans += point.point;
                list2.add(point.id);
            }
        }

        System.out.printf("%.1f", ans);
    }


}
