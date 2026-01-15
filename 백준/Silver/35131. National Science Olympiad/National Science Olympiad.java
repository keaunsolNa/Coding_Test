import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static class Point implements Comparable<Point> {

        int point;
        int penalties;
        String name;

        Point(int point, int penalties, String name) {
            this.point = point;
            this.penalties = penalties;
            this.name = name;
        }

        @Override
        public int compareTo(Point o) {

            if(o.point == this.point)
            {
                if(o.penalties == this.penalties) return this.name.compareTo(o.name);
                else return this.penalties - o.penalties;
            }
            else return o.point - this.point;
        }


    }
    public static void main(String[] args) throws IOException {

        solve();
        bw.flush();
        bw.close();
        br.close();

    }

    private static void solve() throws IOException {

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Point> pq = new PriorityQueue<>();

        while(n --> 0)
        {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int point1 = Integer.parseInt(st.nextToken());
            int penalty1 = Integer.parseInt(st.nextToken());
            int point2 = Integer.parseInt(st.nextToken());
            int penalty2 = Integer.parseInt(st.nextToken());

            int point = point1 + point2;
            int penalty = penalty1 + penalty2;

            pq.add(new Point(point, penalty, name));
        }

        while (!pq.isEmpty())
        {

            bw.write(pq.poll().name + "\n");
        }

    }


}