import java.io.*;
import java.util.*;

public class Main {

    private static class CPU implements Comparable<CPU> {

        String name;
        int performance;

        public CPU (String name, int performance) {
            this.name = name;
            this.performance = performance;
        }

        @Override
        public int compareTo(CPU o) {
            if (o.performance == this.performance) return this.name.compareTo(o.name);
            else return o.performance - this.performance;
        }
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<CPU> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int ram = Integer.parseInt(st.nextToken());
            int cpuSpeed = Integer.parseInt(st.nextToken());
            int disk = Integer.parseInt(st.nextToken());

            int total = 2 * ram + 3 * cpuSpeed + disk;
            pq.add(new CPU(name, total));
        }

        if (!pq.isEmpty()) System.out.println(pq.poll().name);
        if (!pq.isEmpty()) System.out.println(pq.poll().name);

    }

}
