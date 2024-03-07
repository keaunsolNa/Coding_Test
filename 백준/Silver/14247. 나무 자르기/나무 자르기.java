import java.io.*;
import java.util.*;

public class Main {

    private static class Tree implements Comparable<Tree> {

        int init;
        int grow;

        public Tree (int init, int grow) {

            this.init = init;
            this.grow = grow;
        }

        @Override
        public int compareTo(Tree tree) {
            return this.grow - tree.grow;
        }
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] init = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) init[i] = Integer.parseInt(st.nextToken());

        int[] grow = new int[n];
        st = new StringTokenizer(br.readLine());
        PriorityQueue<Tree> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {

            grow[i] = Integer.parseInt(st.nextToken());
            pq.add(new Tree(init[i], grow[i]));
        }

        int day = 0;
        long ans = 0;
        while (!pq.isEmpty()) {

            Tree tree = pq.poll();
            ans += tree.init + ((long) tree.grow * day++);
        }

        System.out.println(ans);
    }
}
