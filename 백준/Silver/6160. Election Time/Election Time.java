import java.util.*;
import java.io.*;

public class Main {

    private static class Vote implements Comparable<Vote>{

        private int index;
        private int first;
        private int second;

        public Vote (int index, int first, int second) {
            this.index = index;
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Vote o) {
            return Integer.compare(o.first, this.first);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        PriorityQueue<Vote> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            priorityQueue.add(new Vote(i + 1, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        int max = 0;
        int ans = 0;
        for (int i = 0; i < k; i++) {

            Vote vote = priorityQueue.poll();

            if (max < vote.second) {
                max = vote.second;
                ans = vote.index;
            }

        }

        System.out.println(ans);

    }
}
