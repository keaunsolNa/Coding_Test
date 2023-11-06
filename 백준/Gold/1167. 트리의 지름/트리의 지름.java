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
		
		int V = Integer.parseInt(br.readLine());
		list = new ArrayList[V + 1];
		
		for(int i = 0; i <= V; i++ ) 
			list[i] = new ArrayList<>();
		
		for(int i = 0; i < V - 1; i++) {

			String[] node = br.readLine().split(" ");
			
			int parent = Integer.parseInt(node[0]);
			
			for(int j = 1; j < node.length; j++) {
				
				if(node[j].equals("-1")) break;
				
				int child = Integer.parseInt(node[j]);
				int depth = Integer.parseInt(node[++j]);
				
				list[parent].add(new Tree(child, depth));
				list[child].add(new Tree(parent, depth));
				
			}
			
		}
		
		visited = new boolean[V + 1];
		visited[1] = true;
		dfs(1, 0);
		
		visited = new boolean[V + 1];
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