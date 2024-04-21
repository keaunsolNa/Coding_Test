import java.util.*;
import java.io.*;

public class Main {

    private static class Toys implements Comparable<Toys> {

        private int index;
        private int price;
        private double jp;

        public Toys(int index, int price, double jp) {

            this.index = index;
            this.price = price;
            this.jp = jp;
        }

        @Override
        public int compareTo(Toys o) {
            return Double.compare(o.jp, this.jp);
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Toys> pq = new PriorityQueue<>();

        for (int i = 1; i <= n; i++) {

            st = new StringTokenizer(br.readLine());
            double j = Integer.parseInt(st.nextToken());
            double p = Integer.parseInt(st.nextToken());
            double jp = j / p;

            pq.add(new Toys(i, (int)p, jp));

        }

        int total = 0;
        for (int i = 0; i < 3; i++) {

            Toys toys = pq.poll();
            sb.append(toys.index).append("\n");
            total += toys.price;
        }

        sb.insert(0, total + "\n");

        System.out.print(sb);
    }
}
