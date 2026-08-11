import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int cnt;
    private static int[] visted;
    private static ArrayList<ArrayList<Integer>> graph2 = new ArrayList<>();
    private static int N;
	private static int M;

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		visted = new int[N + 1];
        for(int i = 0; i <= N; i++) graph2.add(new ArrayList<>());
        
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            graph2.get(A).add(B);
            graph2.get(B).add(A);
        }
        
        for(int i = 1; i <= N; i++) Collections.sort(graph2.get(i), Collections.reverseOrder());

        bfs(R);

        for(int i = 1; i <= N; i++) System.out.println(visted[i]);
	}

	private static void bfs(int start) {
		
        Queue<Integer> q = new LinkedList<>();
        int cnt = 1;

        q.offer(start);
        visted[start] = cnt++;

        while(!q.isEmpty()){
            int a = q.poll();

            for(int i = 0; i < graph2.get(a).size(); i++){
                int nextV = graph2.get(a).get(i);

                if(visted[nextV] != 0) continue;

                q.offer(nextV);
                visted[nextV] = cnt++;
            }
        }
    }
}
