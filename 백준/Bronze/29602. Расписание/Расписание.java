import java.util.*;
import java.io.*;

public class Main {

    private static class Number implements Comparable<Number> {

        int number;
        int index;

        public Number(int number, int index) {
            this.number = number;
            this.index = index;
        }


        @Override
        public int compareTo(Number o) {
            return o.number - this.number;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Number> pq = new PriorityQueue<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {

            pq.add(new Number(Integer.parseInt(st.nextToken()), i));
        }

        while (!pq.isEmpty()) {

            System.out.print(pq.poll().index + " ");
        }


    }

}
