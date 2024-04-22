import java.util.*;
import java.io.*;

public class Main {

    private static class BinaryScale implements Comparable<BinaryScale> {
        int l;
        int m;
        double scale;

        public BinaryScale(int l, int m, double scale) {
            this.l = l;
            this.m = m;
            this.scale = scale;
        }

        @Override
        public int compareTo(BinaryScale o) {
            return Double.compare(this.scale, o.scale);
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<BinaryScale> pq = new PriorityQueue<>();

        while (n --> 0) {

            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            double scale = (l / Math.pow(2, m));

            pq.add(new BinaryScale(l, m, scale));
        }

        while (!pq.isEmpty()) {

            BinaryScale binaryScale = pq.poll();
            sb.append(binaryScale.l).append(" ").append(binaryScale.m).append("\n");
        }

        System.out.print(sb);

    }
}
