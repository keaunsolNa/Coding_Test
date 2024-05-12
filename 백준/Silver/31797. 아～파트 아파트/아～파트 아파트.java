import java.util.*;
import java.io.*;

public class Main {


    private static class Hand implements Comparable<Hand> {

        private int a;
        private int b;

        public Hand(int a, int b) {

            this.a = a;
            this.b = b;
        }


        @Override
        public int compareTo(Hand o) {
            return Integer.compare(this.a, o.a);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        List<Hand> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {

            st = new StringTokenizer(br.readLine());
            int h1 = Integer.parseInt(st.nextToken());
            int h2 = Integer.parseInt(st.nextToken());

            list.add(new Hand(h1, i + 1));
            list.add(new Hand(h2, i + 1));
        }

        Collections.sort(list);

        System.out.println(list.get((n - 1) % (2 * m)).b);

    }
}
