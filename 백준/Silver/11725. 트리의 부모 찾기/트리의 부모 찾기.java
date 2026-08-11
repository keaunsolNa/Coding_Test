import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	private static int n;
	private static boolean[] visited;

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
		for(int i = 0; i < n; i++) tree.add(new ArrayList<>());

		for(int i = 0; i < n - 1; i++) {
			
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1;
			int b = Integer.parseInt(st.nextToken()) - 1;
			tree.get(a).add(b);
			tree.get(b).add(a);
		}

		boolean[] visited = new boolean[n]; 
		int[] pNode = new int[n]; 

		Queue<Integer> queue = new LinkedList<>();
		queue.add(0);
		visited[0] = true;
		while (!queue.isEmpty()) {
			int v = queue.poll();
			for (int node : tree.get(v))
				if (!visited[node]) {
					visited[node] = true;
					queue.add(node);
					pNode[node] = v; 
				}
		}

		for(int i = 1; i < n; i++) System.out.println(pNode[i] + 1);
		
	}
}
