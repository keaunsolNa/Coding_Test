import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static class Snow implements Comparable<Snow>{

        private final int snow;

        public Snow (int snow)
        {
            this.snow = snow;
        }

        @Override
        public int compareTo(Snow o) {
            return Integer.compare(o.snow, this.snow);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Snow> pq = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine());

        while (n --> 0) pq.add(new Snow(Integer.parseInt(st.nextToken())));

        long total = 0;
        while (!pq.isEmpty())
        {

            int prev = pq.poll().snow;

            if (!pq.isEmpty())
            {
                int now = pq.poll().snow;
                total += now;
                prev -= now;
                if (prev > 0) pq.add(new Snow(prev));
            }

            else total += prev;

            if (total > 1440) break;
        }
        System.out.println(total <= 1440 ? total : -1);
    }
}