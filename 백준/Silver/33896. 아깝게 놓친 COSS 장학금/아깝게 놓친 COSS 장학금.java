import java.io.*;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	private static class COSS implements Comparable<COSS> {

        String name;
        int score;
        int risk;
        int cost;
        int point;

        COSS(String name, int score, int risk, int cost, int point) {
            this.name = name;
            this.score = score;
            this.risk = risk;
            this.cost = cost;
            this.point = point;
        }

        @Override
        public int compareTo(COSS o) {

            if (this.point == o.point) {

                if (this.cost == o.cost) {
                    return this.name.compareTo(o.name);
                }

                return this.cost - o.cost;
            }

            return o.point - this.point;
        }
    }

    public static void main(String[] args) throws IOException {

        bw.write(solve());
        bw.flush();
        bw.close();
        br.close();

    }

    private static String solve() throws IOException {

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<COSS> pq = new PriorityQueue<>();

        while (n-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            int risk = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            int point = (int) Math.pow(score, 3) / (cost * (risk + 1));

            pq.add(new COSS(name, score, risk, cost, point));

        }

        pq.poll();
        return Objects.requireNonNull(pq.poll()).name;
    }

}