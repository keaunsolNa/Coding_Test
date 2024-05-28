import java.util.*;
import java.io.*;

public class Main {

    private static class Pair implements Comparable<Pair> {

        private String name;
        private int rd;

        public Pair(String name, int rd) {

            this.name = name;
            this.rd = rd;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(rd, o.rd);
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        while (n --> 0) {

            st = new StringTokenizer(br.readLine());

            String name = st.nextToken();

            boolean attendingYN = st.nextToken().equals("jaehak");
            boolean winnerYN = st.nextToken().equals("notyet");
            int shake = Integer.parseInt(st.nextToken());
            int apc = Integer.parseInt(st.nextToken());

            if (attendingYN && winnerYN && (shake == -1 || shake > 3))
                pq.add(new Pair(name, apc));
        }

        int cnt = pq.size();
        int idx = 0;
        System.out.println(Math.min(10, cnt));
        String[] ans = new String[Math.min(pq.size(), 10)];
        while (!pq.isEmpty() && idx != 10) {
            String name = pq.poll().name;
            ans[idx++] = name;
        }
        Arrays.sort(ans);
        for (int i = 0; i < Math.min(cnt, 10); i++) sb.append(ans[i]).append("\n");

        System.out.print(sb);
    }
}
