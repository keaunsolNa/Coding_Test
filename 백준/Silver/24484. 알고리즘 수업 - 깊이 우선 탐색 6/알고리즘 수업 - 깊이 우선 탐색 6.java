import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	private static int N;
	private static int M;
    private static int cnt;
    private static boolean visited[];
	private static List<Integer> []graph3;
	private static long[] order;
	private static long[] depth5;

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int r =Integer.parseInt(st.nextToken());
        
        graph3 = new ArrayList[N+1];
		for(int i = 1; i <= N; i++) graph3[i] = new ArrayList<>();

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph3[u].add(v);
            graph3[v].add(u);
        }
        
		for(int i = 1; i <= N; i++) Collections.sort(graph3[i], Collections.reverseOrder());
		boolean[] visited = new boolean[N + 1];
		visited[r] = true;
		
		order = new long[N + 1];
		cnt = 1;
		order[r] = cnt;
		depth5 = new long[N + 1];
		for(int i = 1; i <= N; i++) depth5[i] = -1;
		depth5[r] = 0;
		dfs4(r, visited, 1);
		
		long sum = 0;
		for(int i = 1; i <= N; i++) {
			sum += order[i] * depth5[i];
		}
		System.out.println(sum);
		
	}

    public static void dfs4(int x, boolean []visited, int dep) {
		if(graph3[x].size() == 0) return;
		
		for(int i : graph3[x]) {
			if(!visited[i]) {
				visited[i] = true;
				cnt++;
				order[i] = cnt;
				depth5[i] = dep;
				dfs4(i, visited, dep+1);
			}
		}
    }
}
