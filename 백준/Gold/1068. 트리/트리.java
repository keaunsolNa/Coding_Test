import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	private static int[] parent;
	private static int n;
	private static int count;
	private static boolean[] visited;
   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		
		n = Integer.parseInt(br.readLine());
        parent = new int[n];
        visited = new boolean[n];
        int root = 0;
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            parent[i] = Integer.parseInt(st.nextToken());        
            if(parent[i] == -1) root = i;
        }

        int remove = Integer.parseInt(br.readLine());
        
        deleteNode(remove);
        countLeaf(root);
        
        System.out.println(count);
	}
	
	private static void deleteNode(int d) {
        parent[d] = -2; 
        for(int i = 0; i < n; i++) {
            if(parent[i] == d) {
                deleteNode(i);
            }
        }
    }
    
    private static void countLeaf(int s) {
        boolean isLeaf = true;
        visited[s] = true;
        if(parent[s] != -2) {
            for(int i = 0; i < n; i++) {
                if(parent[i] == s && visited[i] == false) {
                    countLeaf(i);
                    isLeaf = false;
                }
            }
            if(isLeaf) count++;
        }
    }
}