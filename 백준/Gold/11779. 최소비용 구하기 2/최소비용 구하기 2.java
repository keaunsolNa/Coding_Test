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
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        dist = new int[n + 1];
        preCity = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        graph = new ArrayList<>();
        for(int i = 0; i < n + 1; i++) graph.add(new ArrayList<>());

        for(int i = 0; i < m; i++) {

            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weigh = Integer.parseInt(st.nextToken());

            graph.get(start).add(new City(end, weigh));
        }

        st = new StringTokenizer(br.readLine());
        int start1 = Integer.parseInt(st.nextToken());
        int end1 = Integer.parseInt(st.nextToken());

        dijkstra(start1);

        System.out.println(dist[end1]);

        int cnt = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(end1);

        while(preCity[end1] != 0) {

            cnt++;
            stack.push(preCity[end1]);
            end1 = preCity[end1];
        }

        System.out.println(cnt + 1);
        while(!stack.isEmpty()) System.out.print(stack.pop() + " ");
    }

    // 다익스트라 알고리즘
    public static void dijkstra(int start) {

        // 우선순위큐
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