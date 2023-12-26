import java.io.*;
import java.util.*;

public class Main {

    // 그래프를 기록할 클래스
    private static class Node implements Comparable<Node> {

        // 간선의 정점
        int end;

        // 간선의 가중치
        int weight;

        public Node(int end, int weight) {

            this.end = end;
            this.weight = weight;
        }

        // 가중치로 정렬
        @Override
        public int compareTo(Node o) {

            return this.weight - o.weight;
        }
    }

    // 경로가 존재하지 않는 경우
    private static final int INF = 100_000_000;

    // 정점의 개수 V, 간선의 개수 E, 시작 정점의 번호 K
    static int v,e,k;
    // 노드 정보를 담을 리스트
    static List<Node>[] list;
    // 방문 여부 탐색을 위한 배열
    static int[] dist;
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(br.readLine());
        list = new ArrayList[v + 1];
        dist = new int[v + 1];

        // 최초 값은 INF로 채운다.
        Arrays.fill(dist, INF);

        for(int i = 1; i <= v; i++) list[i] = new ArrayList<>();

        for(int i = 0 ; i < e; i++) {

            st = new StringTokenizer(br.readLine());
            // u에서 v로 가는 가중치 w인 간선
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            list[u].add(new Node(v, w));
        }

        // 다익스트라 알고리즘 시행
        dijkstra(k);

        for(int i = 1; i <= v; i++){

            // 가중치가 INF면 INF 출력 (경로가 존재하지 않는다)
            if(dist[i] == INF) sb.append("INF\n");
            else sb.append(dist[i]).append("\n");
        }

        System.out.println(sb);
        br.close();
    }

    // 다익스트라 알고리즘
    private static void dijkstra(int start) {

        // 우선순위 큐
        PriorityQueue<Node> queue = new PriorityQueue<>();

        // 방문 여부 확인
        boolean[] check = new boolean[v + 1];

        // 우선순위 큐에 시작 정점 add
        queue.add(new Node(start, 0));

        // 시작 정점 방문 확인
        dist[start] = 0;

        // 큐가 빌 때 까지
        while(!queue.isEmpty()) {

            // 현재 노드 poll 이후
            Node curNode = queue.poll();

            // 간선의 정점 기록
            int cur = curNode.end;

            // 간선을 방문했다면 continue
            if(check[cur]) continue;

            // 방문하지 않았다면 true로 방문 체크.
            check[cur] = true;

            for(Node node : list[cur]) {

                // 시작 정점에서 현재 정점까지의 가중치가 현재 정점보다 작을 때만 갱신한다. (INF 처리)
                if(dist[node.end] > dist[cur] + node.weight) {

                    // 현재 정점을 갱신한 뒤
                    dist[node.end] = dist[cur] + node.weight;

                    // 우선순위 큐를 갱신한다.
                    queue.add(new Node(node.end, dist[node.end]));
                }
            }
        }
    }
}

