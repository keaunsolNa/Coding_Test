import java.util.*;
import java.io.*;
import java.util.stream.IntStream;

public class Main {

    private static class Work implements Comparable<Work> {

        private int point;

        public Work (int point) {
            this.point = point;
        }


        @Override
        public int compareTo(Work o) {
            return Integer.compare(o.point, this.point);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        PriorityQueue<Work> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) pq.add(new Work(Integer.parseInt(br.readLine())));
        int cnt = 0;
        int prev = 0;

        while (!pq.isEmpty()) {

            Work work = pq.poll();
            int temp = work.point - m;
            if (temp > k) pq.add(new Work(temp));

            temp = (prev / 2) + work.point;
            sb.append(temp).append("\n");
            prev = temp;
            cnt++;
        }

        sb.insert(0, cnt + "\n");

        System.out.print(sb);
    }

}
