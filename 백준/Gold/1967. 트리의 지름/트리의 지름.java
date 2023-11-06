import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

 	
    public static class Tree {
		
        int idx, depth;
        
        public Tree(int idx, int depth) {
        	this.idx = idx;
        	this.depth = depth;
        }
        
    }
	
	private static List<Tree> list[];
	private static boolean visited[];
	private static int max = 0;
	private static int maxIdx = 0;   
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		list = new ArrayList[N + 1];
		
		for(int i = 0; i <= N; i++ ) 
			list[i] = new ArrayList<>();
		
		for(int i = 0; i < N - 1; i++) {

			st = new StringTokenizer(br.readLine());
			int parent = Integer.parseInt(st.nextToken());
			int child = Integer.parseInt(st.nextToken());
			int depth = Integer.parseInt(st.nextToken());
			
			list[parent].add(new Tree(child, depth));
			list[child].add(new Tree(parent, depth));
		}
		
		visited = new boolean[N + 1];
		visited[1] = true;
		dfs(1, 0);
		
		visited = new boolean[N + 1];
		visited[maxIdx] = true;
		dfs(maxIdx, 0);
		System.out.println(max);
	}

	public static void dfs(int idx, int depth) {
		
		if(max < depth) {
			max = depth;
			maxIdx = idx;
		}
		
		for(Tree a : list[idx]) {
			if(!visited[a.idx]) {
				visited[a.idx] = true;
				dfs(a.idx, depth + a.depth);
			}
		}
	}
}