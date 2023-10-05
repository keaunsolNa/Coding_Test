import java.io.*;
import java.util.StringTokenizer;

public class Main {

	private static int[] arr, tree;
	private static int n;

	public static void main(String[] args) throws IOException{
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n + 1];
		tree = new int[4 * n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr[0] = Integer.MAX_VALUE;
        
		for(int i = 1; i <= n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		init(1, n, 1);
        
		StringBuilder sb = new StringBuilder();
		int m = Integer.parseInt(br.readLine());
        
		for(int i = 0; i < m; i++) {
            
			st = new StringTokenizer(br.readLine());
			int op = Integer.parseInt(st.nextToken());
			
			if(op == 1) {
                
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				arr[a] = b;
				update(1, n, 1, a);
                
			} else sb.append(tree[1] + "\n");
		}
		
		System.out.println(sb.toString());
		
	}

	
	private static int init(int s, int e, int node) {
        
		if(s == e) return tree[node] = s;
		
		int mid = (s + e) / 2;
		int left = init(s, mid, node * 2);
		int right =  init(mid + 1, e, node * 2 + 1);
        
		return tree[node] =  getIndex(left, right); 
        
	}
	
	private static int update(int s, int e, int node, int idx) {
        
		if(s > idx || e < idx ) return tree[node];
		if(s == e)  return tree[node] = idx;
		
		int mid = (s + e) / 2;
		int left = update(s, mid, node * 2, idx);
		int right =  update(mid + 1, e, node * 2 + 1, idx);
		return tree[node] = getIndex(left, right);
	}
	
	private static int getIndex(int left, int right) {
		if(arr[left] == arr[right]) return getMin(left, right);
		else if(arr[left] < arr[right]) return left;
		else return right;
	}
	
	private static int getMin(int left, int right) {
		if(left < right) return left;
		else return right;
	}
	
}