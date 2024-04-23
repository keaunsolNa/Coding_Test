import java.util.*;
import java.io.*;

public class Main {

    private static class DataPacket implements Comparable<DataPacket> {

        int time;
        int start;
        int destination;

        public DataPacket(int time, int start, int destination) {

            this.time = time;
            this.start = start;
            this.destination = destination;
        }

        @Override
        public int compareTo(DataPacket o) {
            return Integer.compare(this.time, o.time);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {

            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0) break;
            boolean[] infection = new boolean[n + 1];
            PriorityQueue<DataPacket> pq = new PriorityQueue<>();
            infection[1] = true;

            for (int i = 0; i < m; i++) {

                st = new StringTokenizer(br.readLine());
                int t = Integer.parseInt(st.nextToken());
                int s = Integer.parseInt(st.nextToken());
                int d = Integer.parseInt(st.nextToken());

                pq.add(new DataPacket(t, s, d));

            }

            while (!pq.isEmpty()) {

                DataPacket dp = pq.poll();
                if (infection[dp.start]) infection[dp.destination] = true;
            }

            int sum = 0;
            for (boolean check : infection) if (check) sum++;

            System.out.println(sum);
        }



    }
}
