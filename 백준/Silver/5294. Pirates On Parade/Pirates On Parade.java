import java.io.*;
import java.util.*;

public class Main {

    private static class Pirates implements Comparable<Pirates> {

        private final long height;
        private final String name;

        public Pirates (long height, String name) {

            this.height = height;
            this.name = name;
        }

        @Override
        public int compareTo(Pirates o) {

            return (int) (this.height - o.height);
        }
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String input = "";

        PriorityQueue<Pirates> pq = new PriorityQueue<>();
        while ((input = br.readLine()) != null) {

            st = new StringTokenizer(input);

            String name = st.nextToken();
            long height = Long.parseLong(st.nextToken());

            pq.add(new Pirates(height, name));
        }

        while (!pq.isEmpty()) {

            Pirates pirates = pq.poll();

            if (!pq.isEmpty() && Math.abs(pq.peek().height - pirates.height) <= 2) {

                sb.append(pirates.name).append(" ").append(pq.peek().name).append("\n");
                pq.poll();
            }
        }

        System.out.println(sb);
    }


}
