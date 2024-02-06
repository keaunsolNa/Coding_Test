import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static class City implements Comparable<City> {
        int end;
        int weight;

        City(int end, int weight) {
            this.end = end;
            this.weight = weight;
        }

        @Override
        public int compareTo(City arg0) {
            return weight - arg0.weight;
        }
    }

    private static int[] dist, preCity;
    private static List<ArrayList<City>> graph;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        dist = new int[n + 1];
        preCity = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        graph = new ArrayList<>();
        for(int i = 0; i < n + 1; i++) graph.add(new ArrayList<>());

        for(int i = 0; i < m; i++) {

            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            graph.get(start).add(new City(end, 1));
        }

        dijkstra(x);

        List<Integer> min = new ArrayList<>();
        for(int i = 1; i < dist.length; i++) {
            if(dist[i] == k) min.add(i);
        }

        Collections.sort(min);

        for(int i = 0; i < min.size(); i++) System.out.println(min.get(i));
        if(min.isEmpty()) System.out.println(-1);

    }

    public static void dijkstra(int start) {

        PriorityQueue<City> pq = new PriorityQueue<>();
        pq.offer(new City(start, 0));

        dist[start] = 0;

        while (!pq.isEmpty()) {
            City curTown = pq.poll();
            int cur = curTown.end;

            if (dist[cur] < curTown.weight) continue;;

            for(City next : graph.get(cur)) {

                if(dist[next.end] > dist[cur] + next.weight) {

                    dist[next.end] = dist[cur] + next.weight;
                    preCity[next.end] = cur;
                    pq.offer(new City(next.end, dist[next.end]));
                }
            }
        }
    }
}