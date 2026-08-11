import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	private static List<Integer>[] BT;
	private static boolean[] visited;
	private static int res = -1;

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		BT = new ArrayList[n + 1];
		visited = new boolean[n + 1];
		for(int i = 1; i <= n; i++) BT[i] = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		
		int p1 = Integer.parseInt(st.nextToken());
		int p2 = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < m; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int prev = Integer.parseInt(st.nextToken());
			int next = Integer.parseInt(st.nextToken());
			
			BT[prev].add(next);
			BT[next].add(prev);
			
		}

		dfs(p1, p2, 0);
		
		System.out.println(res);
	}

	private static void dfs(int start, int end, int cnt) {
		
		if(start == end) {
			res = cnt;
			return; 
		}
		
		visited[start] = true;
		for(int i = 0; i < BT[start].size(); i++) { 
			
			int next = BT[start].get(i);
			if(!visited[next]) dfs(next, end, cnt + 1);
			
		}
		
	}
}
