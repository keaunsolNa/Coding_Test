import java.util.*;
import java.io.*;

public class Main {

    private static class Comb implements Comparable<Comb> {

        private int chain;
        private int back;
        private double ratio;

        public Comb (double chain, double back, double ratio) {
            this.chain = (int) chain;
            this.back = (int) back;
            this.ratio = ratio;
        }
        @Override
        public int compareTo(Comb o) {

            if (this.ratio == o.ratio) return Integer.compare(this.chain, o.chain);
            return Double.compare(this.ratio, o.ratio);
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] chainRing = new double[3];
        for (int i = 0; i < 3; i++) chainRing[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double[] backRing = new double[7];
        for (int i = 0; i < 7; i++) backRing[i] = Integer.parseInt(st.nextToken());

        PriorityQueue<Comb> pq = new PriorityQueue<>();
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 7; j++) {

                pq.add(new Comb(i + 1, j + 1, chainRing[i] / backRing[j]));
            }
        }

        while (!pq.isEmpty()) {

            Comb comb = pq.poll();

            sb.append(String.format("%.2f", comb.ratio)).append(" ").append(comb.chain).append(" ").append(comb.back).append("\n");
        }

        System.out.print(sb);

    }
}
