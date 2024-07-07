import java.io.*;
import java.util.*;

public class Main {

    private static class Staff implements Comparable<Staff> {

        private String name;
        private Double[] points;

        public Staff (String name, Double[] points)
        {
            this.name = name;
            this.points = points;
        }


        @Override
        public int compareTo(Staff o) {
            return Double.compare(o.points[0], points[0]);
        }
    }
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        double x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        double percent5 = x * 0.05;
        PriorityQueue<Staff> pq = new PriorityQueue<>();
        Map<String, Integer> map = new HashMap<>();
        while ( n --> 0)
        {

            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            double voted = Double.parseDouble(st.nextToken());

            if (percent5 <= voted)
            {
                Double[] point = new Double[14];
                for (int i = 1; i <= 14; i++)
                {
                    point[i - 1] = voted / (double) i;
                }

                Arrays.sort(point, Collections.reverseOrder());
                pq.add(new Staff(name, point));
                map.put(name, 0);
            }
        }


        for (int i = 0; i < 14; i++) {

            Staff staff = pq.poll();
            Double[] points = staff.points;
            points[0] = 0.0;
            Arrays.sort(points, Collections.reverseOrder());
            pq.add(new Staff(staff.name, points));
            map.put(staff.name, map.get(staff.name) + 1);
        }

        for (String key : map.keySet())
        {
            sb.append(key).append(" ").append(map.get(key)).append("\n");
        }

        System.out.print(sb);


    }
}